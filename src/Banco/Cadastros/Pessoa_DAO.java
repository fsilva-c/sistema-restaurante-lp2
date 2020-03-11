/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Pessoa_DAO {
    private Connection con;
    
    //construtor
    public Pessoa_DAO(){
        this.con = new Conectar().conectar();
    }
    
    public boolean Inserir(Client c0){
        
       String sql = "INSERT INTO sql10326340.CLIENTE(cpf, nome, email, senha)VALUES(?, ?, ?, MD5(?))"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, c0.getCpf());
            stmt.setString(2, c0.getName());        
            stmt.setString(3, c0.getEmail());
            stmt.setString(4, c0.getPswd());
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            con.close();
            return true;
            
        }catch (SQLException u) {        
            throw new RuntimeException(u);        
        } 
    }
    
    public Client Buscar_pCpf(String cpf){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Client c1 = new Client();
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.CLIENTE WHERE cpf = ?");  
            stmt.setString(1,cpf);
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            if(rs.next()){
                check = true;
                c1.setCpf(rs.getString("cpf"));
                c1.setName(rs.getString("nome"));
                c1.setEmail(rs.getString("email"));
            }
           
            con.close();
            stmt.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        if(check)
            return c1;
        else
            return null;
    }
    
    @SuppressWarnings("empty-statement")
    public List<Client> CarregarDados(Client c1){
        List<Client> clientes = new ArrayList<>();
        String sql;
        String campo;
        
        if(c1.getCpf().equals("")){
            sql = "SELECT cpf, nome, email FROM sql10326340.CLIENTE WHERE nome LIKE ?";
            campo = c1.getName();
        }
        else{
            sql = "SELECT cpf, nome, email FROM sql10326340.CLIENTE WHERE cpf LIKE ?";
            campo = c1.getCpf();
        }
        
        try {
            
            try(PreparedStatement stmt = con.prepareStatement(sql)){
                stmt.setString(1, "%" + campo + "%");
                
                ResultSet rs = stmt.executeQuery(stmt.toString().replaceAll("com.mysql.cj.jdbc.ClientPreparedStatement: ", "")); //Metodo responsavel por consultas ao banco
                
                while (rs.next()){
                    Client cliente = new Client();
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setName(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                
                    clientes.add(cliente);
                }
            
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);   
        }
        
        
        return clientes;
    }
    
    public boolean Atualizar(Client c1){
        PreparedStatement stmt = null;
        
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("UPDATE sql10326340.CLIENTE SET nome = ?,email = ? WHERE cpf = ?");
            stmt.setString(1,c1.getName());
            stmt.setString(2,c1.getEmail());
            stmt.setString(3, c1.getCpf());
            
            //Execução da SQL
            stmt.executeUpdate();
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public boolean Alterar_Senha(Client c1){
        PreparedStatement stmt = null;
        this.con = new Conectar().conectar();
        
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("UPDATE sql10326340.CLIENTE SET senha = MD5(?) WHERE cpf = ?");
            stmt.setString(1,c1.getPswd());
            stmt.setString(2, c1.getCpf());
            
            //Execução da SQL
            stmt.executeUpdate();
 
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public Client Login(Client c1){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.CLIENTE WHERE cpf = ? and senha = MD5(?)");  
            stmt.setString(1,c1.getCpf());
            stmt.setString(2,c1.getPswd());
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            if(rs.next()){
                check = true;
                c1.setName(rs.getString("nome"));
            }
           
            con.close();
            stmt.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        if(check)
            return c1;
        else
            return null;
    }
}

