/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Senai
 */
public class ProfessorDAO {
    
    public boolean logar (String cpf, String senha){
        
        boolean very = false;
        
        try{
          Connection conexao = Conexao.conectar();
          
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM PROFESSOR WHERE CPF = ? AND SENHA = ?");
            
            stmt.setString(1, cpf);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
               very = true;
                
            }
           
            
            
        } catch(SQLException e){
            
            e.printStackTrace();
        }
        
        
        
                
                
                
        
       return very; 
    }
    
}
