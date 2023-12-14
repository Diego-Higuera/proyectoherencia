package escribirdatos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarDatos {

    public static void guardarArchivoCsv(String cadena) {

        File f;
        FileWriter fw;
        BufferedWriter bw;

        try {
            f = new File("data/informe.csv");
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            bw.write(cadena); //Grabar una cadena
            bw.flush();
            System.out.println("Grabacion correcta");

        } catch (IOException e) {
            System.out.println("Error de escritura");
        }

    }

    }

