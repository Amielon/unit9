package unit9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ami
 */
public class CadenasAlumno {

    /**
     * @param args the command line arguments
     */
    
    public boolean sonIguales(String cadena1, String cadena2)
    {
        if ( cadena1 == cadena2)
            return true;
        else
            return false;
    }
    public boolean EsMayor(String cadena1 ,String cadena2)
    {
       if (cadena1.length()>cadena2.length())
            return true;
        else
            return false;
    }
    public boolean EsMenor(String cadena1 ,String cadena2)
    {
       if (cadena1.length()<cadena2.length())
            return true;
        else
            return false; 
    }
    public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
    {
        char [] caracteres = new char[cadena1.length()];
        String cadena1minuscula ="";
        
        for (int c = 0; c < cadena1.length(); c++)
        {
            caracteres[c] = cadena1.charAt(c);
            caracteres[c] = Character.toLowerCase(caracteres[c]);
        }
        
        for (int c = 0; c < cadena1.length(); c++)
        {
            cadena1minuscula += caracteres[c];
        }
        
        char [] caracteres2 = new char[cadena2.length()];
        String cadena2minuscula ="";
        
        for (int c = 0; c < cadena2.length(); c++)
        {
            caracteres2[c] = cadena2.charAt(c);
            caracteres2[c] = Character.toLowerCase(caracteres2[c]);
        }
        
        for (int c = 0; c < cadena1.length(); c++)
        {
            cadena2minuscula += caracteres2[c];
        }
        if ( cadena1minuscula == cadena2minuscula)
        {
            return true;
        }
        else
            return false;
    }
    
    public String reemplazaTodos(String cadena, char regla, char cambio)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        for (int c = 0; c < cadena.length(); c++)
        {
            if (caracteres[c] == regla)
            {
                caracteres[c]=cambio;
            }
        }
        String cadenacambiada ="";
        
        for (int c = 0; c < cadena.length(); c++)
        {
            cadenacambiada += caracteres[c];
        }
        return cadenacambiada;
    }
    
    public String reemplazaPrimero(String cadena, char regla, char cambio)
    {
        char [] caracteres = new char[cadena.length()];
        boolean salida = false;
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        int contador = 0;
        do
        {
            if (caracteres[contador] == regla)
            {
                caracteres[contador] = cambio;
                salida = true;
            }
            if (contador == cadena.length())
            {
                salida = true;
            }
            contador++;
        }while(!salida);
        
        String cadenacambiada ="";
        
        for (int c = 0; c < cadena.length(); c++)
        {
            cadenacambiada += caracteres[c];
        }
        return cadenacambiada;
    }
    
    public void muestraSplitLimite(String cadena, char regla, int limite)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < limite; c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        
        for (int c = 0; c < limite; c++)
        {
            if (caracteres[c] == regla)
            {
                caracteres[c]= regla;
            }
        }
        for (int c = 0; c < limite; c++)
        {
            System.out.print(caracteres[c]);
        }
    }
    public void muestraSplit(String cadena, char regla)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        for (int c = 0; c < cadena.length(); c++)
        {
            if (caracteres[c] == regla)
            {
                caracteres[c] = ' ';
            }
        }
        for (int c = 0; c < cadena.length(); c++)
        {
            System.out.print(caracteres[c]);
        }
    }
    public String quitaEspacios(String cadena)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        for (int c = 0; c < cadena.length(); c++)
        {
            if (caracteres[c] == ' ')
            {
                caracteres[c] = '/';
            }
        }
        String stringsinespacios ="";
        
        for (int c = 0; c < cadena.length(); c++)
        {
            stringsinespacios += caracteres[c];
        }
        return stringsinespacios;
    }
    public String convertirMayusculas(String cadena)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
            caracteres[c] = Character.toUpperCase(caracteres[c]);
        }
        String conversion ="";
        
        for (int c = 0; c < cadena.length(); c++)
        {
            conversion += caracteres[c];
        }
        return conversion;
    }
    
    public String convertirMinusculas(String cadena)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
            caracteres[c] = Character.toLowerCase(caracteres[c]);
        }
        String conversion ="";
        
        for (int c = 0; c < cadena.length(); c++)
        {
            conversion += caracteres[c];
        }
        return conversion;
    }
    public long longitudCadena(String cadena)
    {
        return cadena.length();
    }
    
    public boolean empiezaCon(String cadena, char prefijo)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        
        if ( caracteres[0] == prefijo)
        {
            return true;
        }
        else
            return false;
    }
    public boolean acabaEn(String cadena, char sufijo)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        
        if ( caracteres[cadena.length()] == sufijo)
        {
            return true;
        }
        else
            return false;
    }
    public long posicionPrimeraCadena(String cadena, char letra)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        
        if ( caracteres[0] == letra)
        {
            return 1;
        }
        else
            return -1;
    }
    public String extraerSubstring(String cadena, int posicionInicio)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        String misubstring ="";
        
        for (int c = 0; c < posicionInicio; c++)
        {
            misubstring += caracteres[c];
        }
        return misubstring;
    }
    public String extraerSubstring(String cadena, int posicionInicio, int
    posicionFinal)
    {
        char [] caracteres = new char[cadena.length()];
        
        for (int c = 0; c < cadena.length(); c++)
        {
            caracteres[c] = cadena.charAt(c);
        }
        String misubstring ="";
        
        for (int c = posicionInicio; c < posicionFinal; c++)
        {
            misubstring += caracteres[c];
        }
        return misubstring;
    }
    
    public String concatenaCadenas(String cadena1, String cadena2)
    {
        cadena1 = cadena1 + cadena2;
        return cadena1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
