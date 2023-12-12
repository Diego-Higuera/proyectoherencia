package modelo;

public class conserje extends trabajador {

    private double sueldo;

    public conserje() {
    }

    public conserje(int idTrabajador, String Nombre, String Apellido, int Antiguedad, int HorasTrabajadas) {
        super(idTrabajador, Nombre, Apellido, Antiguedad, HorasTrabajadas);
    }

    public double sueldo() {
        this.sueldo = this.getHorasTrabajadas() * 20;
        return this.sueldo;
    }
}
