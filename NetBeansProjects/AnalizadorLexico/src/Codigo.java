/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  Equipo Muckisoft: Angel Martínez, Manuel Hoin, Miguel Pasos
 */
import java.awt.Robot;
import java.io.*;

public class Codigo {
    public BufferedReader lol;
    String numlinea,posicion,contador;
    
    public static final char EOL = '\n'; 
    public static final char EOF = (char)-1;
    private BufferedReader lector;
    private String linea; 
    public int numeroLinea;
    public int posicionActual; 
    Robot robot;
    public Codigo(BufferedReader lector)
    {
       this.lector=lector;
       this.numeroLinea= 0;         
       this.posicionActual= -2; 
    }
    
    public char caracterActual() throws Exception
    {
          if (posicionActual == -2) 
          {             
              readLine();             
              return nextChar();         
          }         
          else if (linea == null) 
          {
              
              return EOF;
          }
          else if ((posicionActual == - 1) || (posicionActual == linea.length())) 
          {             
              return EOL;         
          }
          else if (posicionActual > linea.length())
          { 
              readLine();            
              return nextChar();         
          }  
          else 
          {             
              return linea.charAt(posicionActual);  
          }     
    }
     public char nextChar() throws Exception     
     {         
         ++posicionActual;
         return caracterActual(); 
     }
      public char peekChar() throws Exception
      {
          caracterActual();
          if (linea == null) 
          { 
              return EOF;
          }
          int nextPos = posicionActual + 1;
          return nextPos < linea.length() ? linea.charAt(nextPos) : EOL;    
      }
       private void readLine() throws IOException  
       {         
           linea= lector.readLine();
           posicionActual = -1;
           if (linea != null)
           {
               ++numeroLinea;
           }     
       }
       
        public void close() throws Exception
        {  
            if (lector != null) 
            {
                try {
                    lector.close();
                    }
                catch (IOException ex) 
                {
                    ex.printStackTrace();
                    throw ex;
                }         
            }     
        } 
    
    
    
    public void obtenercodigo(int linea,int posi,int conta) throws FileNotFoundException, IOException
    {
       FileReader kio=new FileReader("prueba.txt");
       
       BufferedReader auxiliar=new BufferedReader(kio);
      // int cocin=auxiliar.readLine();
       int conti=0;
       while (auxiliar.readLine()!=null)
       {
        conti++;
       }
       auxiliar.close();
       //conti: "+conti);
       //EOF: "+EOF+EOL);
    }
    
    
}
