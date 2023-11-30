/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author PC
 */
 class arky implements kondisyon{
    String name;
    
    arky(String name){
        this.name = name;
    }
    public void gibuhat(){
        System.out.println(name + " masugo");
    }
    public void wala(){
        System.out.println(name +" ok rag walay suhol");
    }
}

