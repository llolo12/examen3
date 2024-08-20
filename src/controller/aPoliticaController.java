package controller;

import model.aPolitica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class aPoliticaController {
    private Connection connection;

    public aPoliticaController(Connection connection) {
        this.connection = connection;
    }

    public void addAPolitica(aPolitica aPolitica) throws SQLException {
        String sql = "INSERT INTO aPolitica (Nombre) VALUES (?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, aPolitica.getNombre());
            ps.executeUpdate();
        }
    }
}
