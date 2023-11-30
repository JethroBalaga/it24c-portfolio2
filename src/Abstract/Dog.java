/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author PC
 */
public  class Dog extends Pet {
    

    String name;

    Dog(String name) {
        this.name = name;
    }

   
    public void Color() {
        System.out.println(name + " is a black Dog");
    }
}
