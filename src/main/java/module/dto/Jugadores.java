package module.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Jugadores implements Serializable {

    // Attributes
    @Serial
    private static final long serialVersionUID = 1L;

    String jugadorID;
    String nombre;
    String descripcion;

    // Constructor
    public Jugadores() {
        super();
    }
    public Jugadores(String jugadorID, String descripcion, String nombre) {
        super();

        this.jugadorID = jugadorID;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    // Getters & Setters
    public String getJugadorID() {
        return jugadorID;
    }
    public void setJugadorID(String jugadorID) {
        this.jugadorID = jugadorID;
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
        if (!(o instanceof Jugadores jugadores)) return false;
        return Objects.equals(jugadorID, jugadores.jugadorID);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(jugadorID);
    }

    // toString
    @Override
    public String toString() {
        return "Jugadores{" +
                "jugadorID='" + jugadorID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
