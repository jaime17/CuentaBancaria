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
public class Dog extends Animal{
    private int legs;
    private int teeth;
    private String color;
    private String race;
    
    public Dog (String name, int legs, int teeth, String color, String race) {
        super ("Sexual", name, 2 , 1);
        this.legs = legs;
        this.teeth = teeth;
        this.color = color;
        this.race = race;
    }
    @Override
    public void Eat (){
        chew();
        super.Eat ();
    }
    public void chew (){
        System.out.println("");
    } 
}
