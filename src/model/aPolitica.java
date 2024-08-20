package model;

public class aPolitica {
    private int id_poli;
    private String nombre;

    // Constructor
    public aPolitica(int id_poli, String nombre) {
        this.id_poli = id_poli;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getId_poli() {
        return id_poli;
    }

    public void setId_poli(int id_poli) {
        this.id_poli = id_poli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
