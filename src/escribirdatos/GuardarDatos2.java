package escribirdatos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarDatos2 {

    public static void guardarArchivo2Csv(String cadena) {

        File f;
        FileWriter fw;
        BufferedWriter bw;

        try {
            f = new File("data/Datos2.csv");
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

