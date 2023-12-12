package modelo;

public class funcionario extends trabajador {

    private double sueldo;
public funcionario(){}
    public funcionario(int idTrabajador, String Nombre, String Apellido, int Antiguedad, int HorasTrabajadas) {
        super(idTrabajador, Nombre, Apellido, Antiguedad, HorasTrabajadas);
    }
    
    

    public double sueldo() {
        this.sueldo = this.getHorasTrabajadas() * 25;
        return this.sueldo;
    }
}
