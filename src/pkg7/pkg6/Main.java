/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg6;

/**
 *
 * @author ipgonzalez2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws java.lang.Exception {
        try{
        
        Diccionario<String,String> d=new Diccionario<>();
           Par<String,String> p1=new Par<>("pelota","balon"); 
           Par<String,String> p2=new Par<>("ojo","vista"); 
            d.put(p1);
            d.put(p2);
           // d.put(p1);
            System.out.println(d);
            System.out.println(d.get("ojo"));
            
            
            
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
