/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

/**
 *
 * @author Alumno
 */
public class Animal {
    private String reproducutionMethod;
    private String name;
    private int eyes;
    private int brain;
    
    public Animal (String reproducutionMethod, String name, int eyes, int brain) {
        this.reproducutionMethod = reproducutionMethod;
        this.name = name;
        this.eyes = eyes;
        this.brain = brain;
    } 
    public void  Move () {
        System.out.println("");
    }
    
    
}
