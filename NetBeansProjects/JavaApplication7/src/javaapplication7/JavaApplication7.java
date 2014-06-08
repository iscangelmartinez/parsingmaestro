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
public class JavaApplication7 {
    private ArrayList<Integer> cadena;
    private Integer next;
    /**
     * @param args the command line argumentsRecursive descendent algorithm
     */
    public JavaApplication7(ArrayList<Integer> cadena)
    {
        this.cadena=cadena;
        this.next=0;
    }
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
    public ArrayList<Integer> getcadena()
    {
        return this.cadena;
    }
    public void setCadena(ArrayList<Integer> cadena)
    {
        this.cadena=cadena;
    }
    public Integer getNext()
    {
        return this.next;
    }
    public void setNext(Integer next)
    {
        this.next=next;
    }
    
    
    public Boolean E1()
    {
        return T();
    }
    public Boolean E2()
    {
        return T() && term(TOKEN.TOKEN_PLUS)&&E();
    }
        public Boolean E()
        {
            Integer save=next;
            next=save;
            Boolean e1=E1();
            next=save;
            Boolean e2=E2();
            return e1||e2;
            //return ((save=next)
        }
        public Boolean T1()
        {
            return term(TOKEN.TOKEN_INT);
        }
        public Boolean T2()
        {
            return term(TOKEN.TOKEN_INT)&&term(TOKEN.TOKEN_TIMES)&&T();
        }////////
        public Boolean T3()
        {
            return term(TOKEN.TOKEN_PARIZQ)&&E()&&term(TOKEN.TOKEN_PARDER);
        }
        
        public Boolean T()
        {
            Integer save=next;
            next=save;
            Boolean t1=T1();
            next=save;
            Boolean t2=T2();
            next=save;
            Boolean t3=T3();
            return t1||t2||t3;
        }
    public Boolean term(Integer tk)
    {
       // boolean t=this.cadena.get(this.next)==tk;
       // this.next++;
       // return t;
       boolean t=false;
if(this.next<this.cadena.size())
{
t=this.cadena.get(this.next)==tk;
    }
this.next++;
return t;
}
    
}