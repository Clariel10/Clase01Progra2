/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexionmysql.ConexionBD;
import com.unab.edu.Entidades.Estudiante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ClsEstudiante {
    
    
     ConexionBD classconectar = new ConexionBD();
    Connection conectar = classconectar.RetornarConexion();
    
   public boolean LoguinEstudiante(String Usuario, String PASS){
        ArrayList <Estudiante> ListaUsuarioPass = new ArrayList<>();
        
        try {
           
            CallableStatement Statement = conectar.prepareCall("call SP_S_LOGUINESTUDIANTE(?,?)");
            Statement.setString("pusuario", Usuario);
            Statement.setString("ppass", PASS);
            ResultSet resultadoDeConsulta = Statement.executeQuery();
            while (resultadoDeConsulta.next()){
                
                Estudiante es = new Estudiante();
                
                es.setUSU(resultadoDeConsulta.getString("USU"));
                es.setPASS(resultadoDeConsulta.getString("PASS"));
                ListaUsuarioPass.add(es);
                
            } 
            
            String UsuarioBD = null;
            String ContraBD = null;
                for(var iterador : ListaUsuarioPass){
                    
                UsuarioBD = iterador.getUSU();
                ContraBD = iterador.getPASS();
                                    
            }
                
                if (UsuarioBD.equals(Usuario) && ContraBD.equals(PASS)){
                    return true;
                }
                conectar.close();
           
       } catch (Exception e) {
           
            System.out.println("Error" + e);
       }
        
         return false;
        
    }
   
    public ArrayList <Estudiante> MostrarEstudiante(){
        ArrayList <Estudiante> Estudiantes = new ArrayList<>();
        
        try {
           
            CallableStatement Statement = conectar.prepareCall("call SP_S_Estudiante");
            ResultSet resultadoDeConsulta = Statement.executeQuery();
            while (resultadoDeConsulta.next()){
                
            Estudiante estudiante = new Estudiante();
            estudiante.setId(resultadoDeConsulta.getInt("idestudiante"));
            estudiante.setMatricula(resultadoDeConsulta.getInt("matricula"));
            estudiante.setIdPersona(resultadoDeConsulta.getInt("idPersona"));
            estudiante.setUSU(resultadoDeConsulta.getString("USU"));
            estudiante.setPASS(resultadoDeConsulta.getString("PASS"));            
            Estudiantes.add(estudiante);
                    
            }
        
            
       } catch (Exception e) {
           
            System.out.println("");
       }
        
        return Estudiantes;
    }
    


 public void AgregarEstudiante(Estudiante est)
   {
       try {
           
           CallableStatement Statement = conectar.prepareCall("call SP_I_Estudiante(?,?,?,?)");
           Statement.setInt("pmatricula", est.getMatricula());
           Statement.setInt("pidPersona", est.getIdPersona());
           Statement.setString("pUSU", est.getUSU());
           Statement.setString("pPass", est.getPASS());
           Statement.setString("PNIE", est.getNIE());
          
           Statement.execute();
           JOptionPane.showMessageDialog(null, "ESTUDIANTE GUARDADO");
            conectar .close();
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
       }
        
   
   }
   
    public void BorrarEstudiante(Estudiante est) {
        try {

            CallableStatement Statement = conectar.prepareCall("call SP_D_Estudiante(?)");
            Statement.setInt("PIdPersona", est.getIdPersona());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "ESTUDIANTE BORRADO");
             conectar .close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ActualizarEstudiante(Estudiante est) {

        try {

            CallableStatement Statement = conectar.prepareCall("call SP_U_Estudiante(?,?,?,?,?)");
            Statement.setInt("PIdEstudiante", est.getId());
            Statement.setInt("pmatricula", est.getMatricula());
            Statement.setInt("pidPersona", est.getIdPersona());
            Statement.setString("pUSU", est.getUSU());
            Statement.setString("pPass", est.getPASS());
            Statement.setString("PNIE", est.getNIE());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "ESTUDIANTE ACTUALIZADO");
            conectar.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }
}
   
