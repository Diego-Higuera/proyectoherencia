package leerdatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.conserje;
import modelo.funcionario;
import modelo.trabajador;

public class ObtenerDatos {

    //devuelve coleccion de objetos tipo trabajador
    public static List<trabajador> LeerArchivoCsv() {
        List<trabajador> trabajadores_al = new ArrayList<>();

        File f;
        FileReader fr;
        BufferedReader br;
        String fila = ""; //Guardar las filas leidas del archivo
        String[] parte;
        try {
            f = new File("data/Trabajador.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            

            while ((fila = br.readLine()) != null) {
                //System.out.println(fila);
                parte = fila.split(";");
                if (parte[parte.length - 1].equalsIgnoreCase("Conserje")) {
                    conserje c = new conserje(Integer.parseInt(parte[0]), parte[1], parte[2], Integer.parseInt(parte[3]), Integer.parseInt(parte[4]));
                    trabajadores_al.add(c);
                    //System.out.println(c);
                }else{
                    funcionario fu = new funcionario(Integer.parseInt(parte[0]), parte[1], parte[2], Integer.parseInt(parte[3]), Integer.parseInt(parte[4]));
                    trabajadores_al.add(fu);
                    //System.out.println(fu);
                }

            }
        } catch (IOException e) {
            System.out.println("Error de lectura");
            
            trabajadores_al = null;
        }
        return trabajadores_al;

    }
}
