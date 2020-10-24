package cr.ac.ucenfotec.tarea2asociacion.bl.entidades;

public class Empleado {

    private String nombre;
    private String cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Empleado(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
