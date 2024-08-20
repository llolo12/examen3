package model;

public class nAcademica {
    private int id_acad;
    private String descripcion;

    // Constructor
    public nAcademica(int id_acad, String descripcion) {
        this.id_acad = id_acad;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId_acad() {
        return id_acad;
    }

    public void setId_acad(int id_acad) {
        this.id_acad = id_acad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
