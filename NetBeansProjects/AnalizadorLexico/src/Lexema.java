import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import java.util.regex.MatchResult.*;
import javax.swing.*;
/**
 *
 * @author Equipo Muckisoft: Angel Martínez, Manuel Hoin, Miguel Pasos
 */
public class Lexema {
   public static Codigo cod;
   private static boolean aceptado=false;
  public static String tokenin="";
  public static Hashtable tabla=new Hashtable();
  Scanner ruta;
  public static int identificador=0;
    public static String extraerlexema()
    {
        
        try {
              aceptado=false;
              String lexemaactual=""; 
              String lexemaaceptado="";
              tokenin="";
              String lexemacompleto="";
               do
               {
                   lexemaactual+=String.valueOf(cod.caracterActual()).toLowerCase();
                   lexemaactual.trim();
                    if(lexemaactual.equals(String.valueOf((char)-1)))
               {
                   aceptado=true;
                   lexemaaceptado="";
                   tokenin="";
               }
                    else
                    {
                   switch(lexemaactual)
                   {
                       case ".>": 
                           lexemaaceptado=lexemaactual; 
                           tokenin=String.valueOf(TOKENS.TOKEN_AND);
                           cod.nextChar(); break;
                           case "<.": 
                           lexemaaceptado=lexemaactual; 
                           tokenin=String.valueOf(TOKENS.TOKEN_OR);
                           cod.nextChar(); break;
                               case "..": 
                           lexemaaceptado=lexemaactual; 
                           tokenin=String.valueOf(TOKENS.TOKEN_XOR);
                           cod.nextChar(); break;
                       case "class": 
                           lexemaaceptado=lexemaactual; 
                           tokenin=String.valueOf(TOKENS.TOKEN_CLASS);
                           cod.nextChar(); break;
                       case "extends": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_EXTENDS);
                           cod.nextChar(); break;
                       case "case":
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_CASE);
                           cod.nextChar(); break;
                       case "def": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_DEF); 
                           cod.nextChar(); break;
                       case "else": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_ELSE); 
                           cod.nextChar(); break;
                       case "false": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_BOOLEAN); 
                           cod.nextChar(); break;
                       case "if": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_IF); 
                           cod.nextChar(); break;
                       case "match": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_MATCH);
                           cod.nextChar(); break;
                       case "native": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_NATIVE); 
                           cod.nextChar(); break;
                       case "new": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_NEW);
                           cod.nextChar(); break;
                       case "null": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_NULL);
                           cod.nextChar(); break;
                       case "override": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_OVERRIDE); 
                           cod.nextChar(); break;
                       case "super": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_SUPER); 
                           cod.nextChar(); break;
                       case "this": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_THIS); //lexemaactual=""
                           cod.nextChar(); break;
                       case "true": 
                           //TOKEN_TRUE");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_BOOLEAN); //lexemaactual=""
                           cod.nextChar(); break;
                       case "var": 
                           //TOKEN_VAR");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_VAR); //lexemaactual=""
                           cod.nextChar(); break;
                       case "while": 
                           //TOKEN_WHILE");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_WHILE); //lexemaactual=""
                           cod.nextChar(); break;
                       case "abstract": 
                           //TOKEN_ABSTRACT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_ABSTRACT); //lexemaactual=""
                           cod.nextChar(); break;
                       case "catch": 
                           //TOKEN_CATCH");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_CATCH); //lexemaactual=""
                           cod.nextChar(); break;
                       case "do": 
                           //TOKEN_DO");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_DO); //lexemaactual=""
                           cod.nextChar(); break;
                       case "final": 
                           //TOKEN_FINAL");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_FINAL); //lexemaactual=""
                           cod.nextChar(); break;
                       case "for": 
                           //TOKEN_FOR");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_FOR); //lexemaactual=""
                           cod.nextChar(); break;
                       case "finally": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_FINALLY); //lexemaactual=""
                           cod.nextChar(); break;
                       case "/*": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_INICIOCOMENTARIO); //lexemaactual=""
                           cod.nextChar(); break;
                       case "String": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_STRING); //lexemaactual=""
                           cod.nextChar(); break;
                       case "Boolean": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_BOOLEAN); //lexemaactual=""
                           cod.nextChar(); break;
                       case "Unit": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_UNIT); //lexemaactual=""
                           cod.nextChar(); break;
                       case "Null": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_TIPONULL); //lexemaactual=""
                           cod.nextChar(); break;
                       case "&|": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_XOR); //lexemaactual=""
                           cod.nextChar(); break;
                           
                       case "*/": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_FINCOMENTARIO); //lexemaactual=""
                           cod.nextChar(); break;
                           case "Int": 
                           //TOKEN_FINALLY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_INTEGER); //lexemaactual=""
                           cod.nextChar(); break;
                               
                       case "forSome": 
                           //TOKEN_FORSOME");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_FORSOME); //lexemaactual=""
                           cod.nextChar(); break;
                       case "implicit": 
                           //TOKEN_IMPLICIT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_IMPLICIT); //lexemaactual=""
                           cod.nextChar(); break;
                       case "import": 
                           //TOKEN_IMPORT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_IMPORT); //lexemaactual=""
                           cod.nextChar(); break;
                        case "\"": 
                           //TOKEN_IMPORT");
                           //lexemaactual="";
                           
                           //String precioso="";
                           /* int lineaparseo=cod.numeroLinea;
                           do
                           {
                               //if(cod.peekChar()!='\t'||cod.peekChar()!='\n')
                               //{
                                   cod.nextChar();
                               lexemaactual+=String.valueOf(cod.caracterActual());
                               
                               //}
                               //else
                               //{
                                 //  System.out.println("mierda");
                               //}
                               
                              /* if(cod.numeroLinea!=lineaparseo)
                               {
                                   break;
                               }*/
                              // precioso=String.valueOf(lexemaactual.charAt(lexemaactual.length()));
                         //  }while (lexemaactual.endsWith("\"")!=true||cod.caracterActual()=='\t'||cod.caracterActual()=='\n'||cod.caracterActual()=='\r'||cod.caracterActual()==' ');
                           //lexemaactual="\""+lexemaactual;
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_COMILLA); //lexemaactual=""
                           cod.nextChar(); break;
                       case "[": 
                           //TOKEN_IMPORT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_CORCHETEABIERTO); //lexemaactual=""
                           cod.nextChar(); break;
                           
                       case "]": 
                           //TOKEN_IMPORT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_CORCHETECERRADO); //lexemaactual=""
                           cod.nextChar(); break;
                       case "lazy":
                           
                           //TOKEN_LAZY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_LAZY); //lexemaactual=""
                           cod.nextChar(); break;
                       case "object": 
                           //TOKEN_OBJECT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_OBJECT); //lexemaactual=""
                           cod.nextChar(); break;
                       case "package": 
                           //TOKEN_PACKAGE");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_PACKAGE); //lexemaactual=""
                           cod.nextChar(); break;
                       case "public": 
                           //TOKEN_PUBLIC");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_PUBLIC); //lexemaactual=""
                           cod.nextChar(); break;
                       case "{": 
                           //TOKEN_IMPORT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_LLAVEABIERTA); //lexemaactual=""
                           cod.nextChar(); break;
                       case "}": 
                           //TOKEN_IMPORT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_LLAVECERRADA); //lexemaactual=""
                           cod.nextChar(); break;
                       case "private": 
                           //TOKEN_PRIVATE");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_PRIVATE); //lexemaactual=""
                           cod.nextChar(); break;
                       case "protected": 
                           //TOKEN_PROTECTED");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_PROTECTED); //lexemaactual=""
                           cod.nextChar(); break;
                       case "requires": 
                           //TOKEN_REQUIRES");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_REQUIRES); //lexemaactual=""
                           cod.nextChar(); break;
                       case "return": 
                           //TOKEN_RETURN");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_RETURN); //lexemaactual=""
                           cod.nextChar(); break;
                       case "sealed": 
                           //TOKEN_SEALED");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_SEALED); //lexemaactual=""
                           cod.nextChar(); break;
                       case "throw": 
                           //TOKEN_THROW");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_THROW); //lexemaactual=""
                           cod.nextChar(); break;
                       case "trait": 
                           //TOKEN_TRAIT");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_TRAIT); //lexemaactual=""
                           cod.nextChar(); break;
                       case "try": 
                           //TOKEN_TRY");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_TRY); //lexemaactual=""
                           cod.nextChar(); break;
                       case "type": 
                           //TOKEN_TYPE");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_TYPE); //lexemaactual=""
                           cod.nextChar(); break;
                       case "val": 
                           //TOKEN_VAL");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_VAL); //lexemaactual=""
                           cod.nextChar(); break;
                       case "with": 
                           //TOKEN_WITH");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_WITH); //lexemaactual=""
                           cod.nextChar(); break;
                       case "+": 
                           //TOKEN_SUMA");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_SUMA); //lexemaactual=""
                           cod.nextChar(); break;
                       case "-": 
                           //TOKEN_RESTA");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_RESTA); //lexemaactual=""
                           cod.nextChar(); break;
                       case "*": 
                           //TOKEN_MULTIPLICADOR");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_MULTIPLICADOR); //lexemaactual=""
                           cod.nextChar(); break;
                       case "/": 
                           //TOKEN_DIVISION");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_DIVISION); //lexemaactual=""
                           cod.nextChar(); break;
                       /*case ">": 
                           //TOKEN_MAYOR");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_MAYOR); //lexemaactual=""
                           
                           cod.nextChar(); break;*/
                       case "<": 
                           //TOKEN_MENOR");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_MENOR); //lexemaactual=""
                           cod.nextChar(); break;
                       case "=": 
                           //TOKEN_ASI]GNACION");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_ASIGNACION); //lexemaactual=""
                           
                           cod.nextChar(); break;
                       /*case ">=": 
                           //TOKEN_MAYOROIGUAL");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_MAYORIGUAL); //lexemaactual=""
                          
                           cod.nextChar(); break;*/
                       case "<=": 
                           //TOKEN_MENOROIGUAL");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_MENORIGUAL); //lexemaactual=""
                           cod.nextChar(); break;
                       case "==": 
                           //TOKEN_COMPARACION");
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_COMPARACION); //lexemaactual=""
                           cod.nextChar(); break;
                       case "!": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_DIFERENCIA); 
                           cod.nextChar(); break;
                       case "(": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_PARENTESISABIERTO);
                           cod.nextChar(); break;
                       case ".": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_PUNTO);
                           cod.nextChar(); break;
                       case ";": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_PUNTOYCOMA); 
                           cod.nextChar(); break;
                       case ",": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_COMA);
                           cod.nextChar(); break;
                       case ")": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_PARENTESISCERRADO);
                           cod.nextChar(); break;
                       case ":": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_DOSPUNTOS); 
                           cod.nextChar(); break;
                       case "=>":
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_FLAG);
                           cod.nextChar(); break;
                       case "\\": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_BARRAINVERTIDA);
                           cod.nextChar(); break;
                       case "//": 
                           lexemaaceptado=lexemaactual;
                           tokenin=String.valueOf(TOKENS.TOKEN_COMENTARIOSENCILLO);
                           cod.numeroLinea++;
                           cod.nextChar(); break;
                       
                       case "\t": 
                           lexemaactual=""; 
                           cod.nextChar(); break;
                       case " ":
                           lexemaactual="";
                           cod.nextChar(); break;
                       case "\n":
                           lexemaactual="";
                           cod.nextChar(); break;
                       default : 
                           
                    
                           
                          
                           Pattern patron=Pattern.compile("\\p{Alpha}(\\w*)");
                           Matcher m=patron.matcher(lexemaactual);
                           if(m.matches())
                           {
                               lexemaaceptado=lexemaactual;
                               tokenin=String.valueOf(TOKENS.TOKEN_ID);
                               cod.nextChar(); break;
                           }
                           else
                           {
                               patron=Pattern.compile("(\\-?)(\\p{Digit})+");
                               m=patron.matcher(lexemaactual);
                            if(m.matches())
                            {
                                lexemaaceptado=lexemaactual;
                                tokenin=String.valueOf(TOKENS.TOKEN_NUMERO);
                                cod.nextChar(); break;
                            }
                            else
                            { 
                                aceptado=true;
                            }                 
                 }
                            break;
                   }
                    }
                    
                   
               } while(!aceptado);
               if(lexemaaceptado=="")
               {
                   lexemaaceptado=lexemaactual;
                   tokenin=String.valueOf(TOKENS.TOKEN_ERROR);
                   cod.nextChar();
               }
            lexemacompleto=(String.valueOf("lexema: "+tokenin+"---"+lexemaaceptado+"  Número de linea:  "+cod.numeroLinea+"  Posición: "+String.valueOf((cod.posicionActual-lexemaaceptado.length())+1)));
           return lexemacompleto;
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public void desplegar()
    {
        try
        {
            char EOFilo = (char) 0;
            System.out.println("Ingrese la ruta de la ubicación del archivo a compilar");
            ruta = new Scanner(System.in);
            String path = ruta.next();
            cod = new Codigo(new BufferedReader(new FileReader(path)));
            ArrayList listillab = new ArrayList();
            String chupitos = "";
            String checo = "";
            int cont = 0;
       do
       {
        checo=extraerlexema();
       
       if(cod.caracterActual()==(char)-1)
       {
           System.out.println("END OF FILE");
           cod.close();
       }
       else
       {
           System.out.println(checo); cont++;
       }
       }
       while(cod.caracterActual()!=(char)-1);
       System.out.println("El número de tokens encontrados fue de: "+String.valueOf(cont));   
        }
        catch(Exception excepciongrave)
        {
            excepciongrave.printStackTrace();
        }
    }
    
   
}
