package cr.ac.ucenfotec.tarea2asociacion.bl.entidades;

public class Computadora {

    private String nombre;
    private String marca;
    private Empleado responsable;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    public Computadora(String nombre, String marca, Empleado responsable) {
        this.nombre = nombre;
        this.marca = marca;
        this.responsable = responsable;
    }

    public Computadora() {
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", responsable=" + responsable +
                '}';
    }
}
