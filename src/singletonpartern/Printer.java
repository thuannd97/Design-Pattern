/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpartern;

/**
 *
 * @author thuannd
 */
public class Printer {
    private static Printer instance;
    
    public synchronized static Printer newInstance(){
        if(instance == null){
            instance = new Printer();
        }
        return instance;
    }
    
    public void connect(){
        System.out.println("Ban da ket noi vs may in.");
    }
}
