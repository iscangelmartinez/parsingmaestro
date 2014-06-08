/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  Equipo Muckisoft: Angel Martínez, Manuel Hoin, Miguel Pasos
 */
public enum TOKENS {
    //Keywords
  /*  
    
    //Operadores
    Token_Plus,Token_Minus,Token_Div,Token_Multiplicador,Token_ArrowRigth*/
    
    /*KEYWORDS*/
    TOKEN_CLASS,      //1
    TOKEN_EXTENDS,    //2
    TOKEN_CASE,       //3
    TOKEN_DEF,        //4
    TOKEN_ELSE,       //5
    TOKEN_FALSE,      //6
    TOKEN_IF,         //7
    TOKEN_MATCH,      //8
    TOKEN_NATIVE,     //9
    TOKEN_NEW,        //10
    TOKEN_NULL,       //11
    TOKEN_OVERRIDE,   //12
    TOKEN_SUPER,      //13
    TOKEN_THIS,       //14
    TOKEN_TRUE,
    TOKEN_VAR,
    TOKEN_WHILE,    //17
    /*EXTENDED COOL*/
    TOKEN_ABSTRACT,
    TOKEN_CATCH,
    TOKEN_DO,
    TOKEN_FINAL,
    TOKEN_FOR,
    TOKEN_FINALLY,
    TOKEN_FORSOME,
    TOKEN_IMPLICIT,
    TOKEN_IMPORT,
    TOKEN_LAZY,
    TOKEN_OBJECT,
    TOKEN_PACKAGE,
    TOKEN_PUBLIC,
    TOKEN_PRIVATE,
    TOKEN_PROTECTED,
    TOKEN_REQUIRES,
    TOKEN_RETURN,
    TOKEN_SEALED,
    TOKEN_THROW,
    TOKEN_TRAIT,
    TOKEN_TRY,
    TOKEN_TYPE,
    TOKEN_VAL,
    TOKEN_WITH,
    TOKEN_YIELD,
    //42
    /*OPERADORES MATEMATICOS*/
    TOKEN_SUMA,
    TOKEN_RESTA,
    TOKEN_MULTIPLICADOR,
    TOKEN_DIVISION,//46
    /*OPERADORES RELACIONALES*/
    TOKEN_MAYOR,
    TOKEN_MENOR,
    TOKEN_MAYORIGUAL,
    TOKEN_MENORIGUAL,
    TOKEN_COMPARACION,
    TOKEN_DIFERENCIA,
    TOKEN_ASIGNACION, //53
    /*SIMBOLOS*/
    TOKEN_PUNTO,
    TOKEN_PUNTOYCOMA,
    TOKEN_COMA,
    TOKEN_LLAVEABIERTA,
    TOKEN_LLAVECERRADA,
    TOKEN_PARENTESISABIERTO,
    TOKEN_PARENTESISCERRADO,
    TOKEN_DOSPUNTOS,
    TOKEN_FLAG,//=>
    TOKEN_BARRAINVERTIDA, //63
    /*TIPOS*/
    TOKEN_BOOLEAN,
    TOKEN_INTEGER,
    TOKEN_ID,
    TOKEN_CADENA,
    TOKEN_NUMERO,
    TOKEN_STRING,
    TOKEN_UNIT,
    TOKEN_TIPONULL, //71
    
    //tengo que checar
    
    TOKEN_COMILLA,
    TOKEN_CORCHETEABIERTO,
    TOKEN_CORCHETECERRADO,
    TOKEN_INICIOCOMENTARIO,
    TOKEN_COMENTARIOSENCILLO,
    TOKEN_FINCOMENTARIO, //77
    /*OPERADORES LÓGICOS*/
    TOKEN_AND, 
    TOKEN_OR,
    TOKEN_XOR, //81
    /*ERROR*/
    TOKEN_ERROR
    //82
}
