package model;

public class oSexual {
    private int id_sexual;
    private String descripcion;

    // Constructor
    public oSexual(int id_sexual, String descripcion) {
        this.id_sexual = id_sexual;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId_sexual() {
        return id_sexual;
    }

    public void setId_sexual(int id_sexual) {
        this.id_sexual = id_sexual;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
