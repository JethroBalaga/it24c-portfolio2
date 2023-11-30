/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author PC
 */
class jethro implements kondisyon {
    String name;
    
    jethro(String name){
        this.name = name;
    }
    public void gibuhat(){
        System.out.println(name + " masugo");
    }
    public void wala(){
        System.out.println(name +" pero dapat naay suhol");
    }
}
