package module.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Equipos implements Serializable {

    // Attributes
    @Serial
    private static final long serialVersionUID = 1L;

    String equipoID;
    String nombre;
    String descripcion;

    // Constructor
    public Equipos() {
        super();
    }
    public Equipos(String equipoID, String descripcion, String nombre) {
        super();

        this.equipoID = equipoID;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    // Getters & Setters
    public String getEquipoID() {
        return equipoID;
    }
    public void setEquipoID(String equipoID) {
        this.equipoID = equipoID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Equals & HashCode
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Equipos equipos)) return false;
        return Objects.equals(equipoID, equipos.equipoID);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(equipoID);
    }

    // toString
    @Override
    public String toString() {
        return "Equipos{" +
                "equipoID='" + equipoID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
