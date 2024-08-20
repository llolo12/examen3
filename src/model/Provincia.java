package model;

public class Provincia {
    private int id_prov;
    private String nombre;

    // Constructor
    public Provincia(int id_prov, String nombre) {
        this.id_prov = id_prov;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
