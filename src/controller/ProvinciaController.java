package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProvinciaController {

    private Connection connection;

    public ProvinciaController(Connection connection) {
        this.connection = connection;
    }

    public void addProvincia(String nombre) throws SQLException {
        String sql = "INSERT INTO Provincia (Nombre) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.executeUpdate();
        }
    }
}
