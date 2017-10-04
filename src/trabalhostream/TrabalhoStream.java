package trabalhostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TrabalhoStream {

    public static void main(String[] args) throws Exception{
        
        Calculo calc = new Calculo();
        
        InputStream is = new FileInputStream("10MB.txt"); //url.openStream(); //System.in;//
        OutputStream os = new FileOutputStream("Backup2" + System.currentTimeMillis() + ".txt");
        
        
        // Os testes foram feitos em diferentes execuções, mas aqui é onde é chamado o FIleStream
        System.out.println("Tempo decorrido FileStream: " + calc.calcular(is, os));
        
        is = new BufferedInputStream(is);
        os = new BufferedOutputStream(os);

        // Aqui é onde chama o BufferedStream
        System.out.println("Tempo decorrido Buffered: " + calc.calcular(is, os));
        
        
        
        os.close();
        is.close();
    }
    
    
}
