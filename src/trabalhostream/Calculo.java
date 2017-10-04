package trabalhostream;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class Calculo {
    
    long calcular (InputStream is, OutputStream os) throws Exception{
        
        int byteLido;
        
        long tempoInicial = System.currentTimeMillis();
        
        do{
            byteLido = is.read();
            if(byteLido >= 0){
            
                os.write(byteLido);
            
            }
            
        }while (byteLido != -1);
        
        long tempoFinal = System.currentTimeMillis();
        
        long tempoDecorrido = tempoFinal - tempoInicial;
        
        return tempoDecorrido;
    }
    
}
