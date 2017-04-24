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
public class Par<T,S> {
    private T t;
    private S s;
    
    public Par(T t,S s){
        this.t=t;
        this.s=s;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", getT(),getS());
    }
    
}
