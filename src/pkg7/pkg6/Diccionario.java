/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg6;

import java.util.ArrayList;

/**
 *
 * @author ipgonzalez2
 */
public class Diccionario<K,V>{
    private ArrayList<Par> diccionario;
    
    
    public Diccionario(){
        diccionario=new ArrayList<>();
    }

   public Object get(K k){
       Object o=new Object();
       for(int i=0;i<diccionario.size();i++){
           if(diccionario.get(i).getT()== k){
               o=diccionario.get(i).getS();
           }
       }
       return o;
   }
   public void put(Par p)throws Exception{
       
      for(int i=0;i<diccionario.size();i++){
          if(diccionario.get(i)==p){
              throw new Exception("Error");
          }
      }
      diccionario.add(p);
            
        
           
       
       
   }
   public void clear(K k){
       for(int i=0;i<diccionario.size();i++){
           if(diccionario.get(i).getT()==k){
               diccionario.remove(i);
           }
       }
   }
   public boolean isEmpty(){
       boolean si;
       if(diccionario.size()==0){
           si=true;
       }
       else{
           si=false;
       }
       return si;
   }
   

    @Override
    public String toString() {
        StringBuilder toret=new StringBuilder();
        for(int i=0;i<diccionario.size();i++){
            toret.append((i+1)).append(".").append(diccionario.get(i)).append("\n");      
        }
        return toret.toString();
    }
   
    
    
}
