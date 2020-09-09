/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Entidades;

import lombok.*;

/**
 *
 * @author DELL
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class Estudiante extends Persona {
    
    private int Id;
    private int matricula;
    private String USU;
    private String PASS;
    private String NIE;
            
    
    
}
