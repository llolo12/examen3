package model;

import java.sql.Date;

public class Persona {
    private int id_perso;
    private String nombre;
    private String apell1;
    private String apell2;
    private char sexo;
    private char eCivil;
    private Date nacido;
    private int id_prov;
    private int id_sexual;
    private int id_poli;
    private int id_acad;
    private int salario;

    // Constructor
    public Persona(String nombre, String apell1, String apell2, char sexo, char eCivil, Date nacido,
                   int id_prov, int id_sexual, int id_poli, int id_acad, int salario) {
        this.nombre = nombre;
        this.apell1 = apell1;
        this.apell2 = apell2;
        this.sexo = sexo;
        this.eCivil = eCivil;
        this.nacido = nacido;
        this.id_prov = id_prov;
        this.id_sexual = id_sexual;
        this.id_poli = id_poli;
        this.id_acad = id_acad;
        this.salario = salario;
    }

    // Getters y Setters
    public int getId_perso() {
        return id_perso;
    }

    public void setId_perso(int id_perso) {
        this.id_perso = id_perso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApell1() {
        return apell1;
    }

    public void setApell1(String apell1) {
        this.apell1 = apell1;
    }

    public String getApell2() {
        return apell2;
    }

    public void setApell2(String apell2) {
        this.apell2 = apell2;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getECivil() {
        return eCivil;
    }

    public void setECivil(char eCivil) {
        this.eCivil = eCivil;
    }

    public Date getNacido() {
        return nacido;
    }

    public void setNacido(Date nacido) {
        this.nacido = nacido;
    }

    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    public int getId_sexual() {
        return id_sexual;
    }

    public void setId_sexual(int id_sexual) {
        this.id_sexual = id_sexual;
    }

    public int getId_poli() {
        return id_poli;
    }

    public void setId_poli(int id_poli) {
        this.id_poli = id_poli;
    }

    public int getId_acad() {
        return id_acad;
    }

    public void setId_acad(int id_acad) {
        this.id_acad = id_acad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
