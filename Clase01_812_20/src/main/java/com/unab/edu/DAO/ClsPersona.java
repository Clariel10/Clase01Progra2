/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexionmysql.ConexionBD;
import com.unab.edu.Entidades.Persona;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ClsPersona {
    
    ConexionBD classconectar = new ConexionBD();
    Connection conectar = classconectar.RetornarConexion();
    
   public ArrayList <Persona> MostrarPersona(){
        ArrayList <Persona> Personas = new ArrayList<>();
        
        try {
           
            CallableStatement Statement = conectar.prepareCall("call SP_S_Persona");
            ResultSet resultadoDeConsulta = Statement.executeQuery();
            while (resultadoDeConsulta.next()){
                
            Persona persona = new Persona();
            persona.setIdPersona(resultadoDeConsulta.getInt("IdPersona"));
            persona.setNombre(resultadoDeConsulta.getString("Nombre"));
            persona.setApellido(resultadoDeConsulta.getString("Apellido"));
            persona.setEdad(resultadoDeConsulta.getInt("Edad"));
            persona.setSexo(resultadoDeConsulta.getString("Sexo"));
            Personas.add(persona);
                    
            }
        
            
       } catch (Exception e) {
           
            System.out.println("");
       }
        
        return Personas;
    }
   
   
   public void AgregarPersonas(Persona per)
   {
       try {
           
           CallableStatement Statement = conectar.prepareCall("call SP_I_Persona(?,?,?,?)");
           Statement.setString("PNombre", per.getNombre());
           Statement.setString("PApellido", per.getApellido());
           Statement.setInt("PEdad", per.getEdad());
           Statement.setString("PSexo", per.getSexo());
           Statement.execute();
           JOptionPane.showMessageDialog(null, "PERSONA GUARDADO");
            conectar .close();
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
       }
        
   
   }
   
    public void BorrarPersonas(Persona per) {
        try {

            CallableStatement Statement = conectar.prepareCall("call SP_D_Persona(?)");
            Statement.setInt("PIdPersona", per.getIdPersona());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "PERSONA BORRADA");
             conectar .close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ActualizarPersonas(Persona Persona) {
        
         try {
           
           CallableStatement Statement = conectar.prepareCall("call SP_U_Persona(?,?,?,?,?)");
            Statement.setInt("PIdPersona", Persona.getIdPersona());
           Statement.setString("PNombre", Persona.getNombre());
           Statement.setString("PApellido", Persona.getApellido());
           Statement.setInt("PEdad", Persona.getEdad());
           Statement.setString("PSexo", Persona.getSexo());
           Statement.execute();
           JOptionPane.showMessageDialog(null, "PERSONA ACTUALIZADA");
            conectar .close();
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
       }
    
    }
   
   
   
    
    }
