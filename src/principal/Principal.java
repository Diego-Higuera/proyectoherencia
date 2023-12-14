package principal;

import java.util.List;
import leerdatos.ObtenerDatos;
import escribirdatos.GuardarDatos;
import escribirdatos.GuardarDatos2;
import modelo.conserje;
import modelo.funcionario;
import modelo.trabajador;

public class Principal {

    public static void main(String[] args) {

        conserje t1 = new conserje();
        t1.setIdTrabajador(1);
        t1.setNombre("Luis");
        t1.setApellido("Ruiz");
        t1.setAntiguedad(15);
        t1.setHorasTrabajadas(150);

        funcionario t2 = new funcionario(2, "Carla", "Roncal", 20, 160);

        System.out.println(t1);
        System.out.println("Sueldo t1: " + t1.sueldo());
        System.out.println(t2);
        System.out.println("Sueldo t2: " + t2.sueldo());
        
        List<trabajador> trabajadores_al = ObtenerDatos.LeerArchivoCsv();
        for(trabajador t: trabajadores_al)
            if(t instanceof conserje) {
                System.out.println(t.getNombre() + " " + t.getApellido() + " " + ((conserje ) t).sueldo());
                
                String cadenac = t.getNombre() + " " + t.getApellido() + ", ";
                GuardarDatos.guardarArchivoCsv(cadenac);
            }else {
                System.out.println(t.getNombre() + " " + t.getApellido() + " " + ((funcionario ) t).sueldo());
                String cadenaf = t.getNombre() + " " + t.getApellido() + ", ";
                GuardarDatos2.guardarArchivo2Csv(cadenaf);
                
                //guardar resultado en un archivo
               //String cadena = nombre+";"+apellido+";"+tipo+";"+maximo;
                //GuardarDatos.guardarArchivoCsv(cadena);
            }
    }

}
