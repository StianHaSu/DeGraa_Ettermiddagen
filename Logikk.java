import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Logikk {

    File fil = new File("KonkurranseGraa.txt");

    public void skrivTilFil(String teksten){
        FileWriter skriver = null;
        try{
            skriver = new FileWriter(fil, true);
            skriver.write(teksten+"\n");
        
            skriver.close();
        } catch (IOException ioe){
            System.out.println(ioe);
        }
    }

    
}    
