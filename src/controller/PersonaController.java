package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaController {

    private Connection connection;

    public PersonaController(Connection connection) {
        this.connection = connection;
    }

    public void addPersona(int cedula, String nombre, String apellido1, String apellido2, char sexo, char eCivil, java.sql.Date nacido, int idProvincia, int idSexual, int idPoli, int idAcad, int salario) throws SQLException {
        String sql = "INSERT INTO Persona (Cedula, Nombre, Apell1, Apell2, Sexo, eCivil, Nacido, Id_prov, Id_sexual, Id_poli, Id_acad, Salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, cedula);
            statement.setString(2, nombre);
            statement.setString(3, apellido1);
            statement.setString(4, apellido2);
            statement.setString(5, String.valueOf(sexo));
            statement.setString(6, String.valueOf(eCivil));
            statement.setDate(7, nacido);
            statement.setInt(8, idProvincia);
            statement.setInt(9, idSexual);
            statement.setInt(10, idPoli);
            statement.setInt(11, idAcad);
            statement.setInt(12, salario);
            statement.executeUpdate();
        }
    }
}
