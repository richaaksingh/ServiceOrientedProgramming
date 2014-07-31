
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edu;
import service.*;
/**
 *
 * @author Binit
 */
public class Hello {
    
    public static void main(String args[]){
        
        Periodictable table = new Periodictable();
        String atoms = table.getPeriodictableSoap().getAtomicWeight("Carbon");
        System.out.println("" + atoms);
    }
}
