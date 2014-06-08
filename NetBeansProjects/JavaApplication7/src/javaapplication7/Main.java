/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author IngenieroAngel
 */
public class Main {
    
    public static void main(String args[])
    {
        ArrayList<Integer> cadena=new ArrayList<Integer>();
        cadena.add(TOKEN.TOKEN_INT);
        cadena.add(TOKEN.TOKEN_PLUS);
        cadena.add(TOKEN.TOKEN_INT);
        
        JavaApplication7 lol=new JavaApplication7(cadena);
        Boolean e=lol.E();
        if(e&&lol.getNext()==cadena.size())
        {
            System.out.println("Aceptado");
        }
        else
        {
            System.out.println("No aceptado");
        }
        
    }
}
