package modelo;

public class trabajador {

    private int idTrabajador;
    private String Nombre;
    private String Apellido;
    private int Antiguedad;
    private int HorasTrabajadas;

    public trabajador() {

    }

    public trabajador(int idTrabajador, String Nombre, String Apellido, int Antiguedad, int HorasTrabajadas) {
        this.idTrabajador = idTrabajador;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Antiguedad = Antiguedad;
        this.HorasTrabajadas = HorasTrabajadas;

    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;

    }

    @Override
    public String toString() {
        return "trabajador{" + "idTrabajador=" + idTrabajador + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Antiguedad=" + Antiguedad + ", HorasTrabajadas=" + HorasTrabajadas + '}';
    }

    public double sueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
