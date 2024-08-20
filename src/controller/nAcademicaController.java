package controller;

import model.nAcademica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class nAcademicaController {
    private Connection connection;

    public nAcademicaController(Connection connection) {
        this.connection = connection;
    }

    public void addNAcademica(nAcademica nAcademica) throws SQLException {
        String sql = "INSERT INTO nAcademica (Descripcion) VALUES (?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, nAcademica.getDescripcion());
            ps.executeUpdate();
        } catch (SQLException e) {
            // Registra el error si es necesario
            throw new SQLException("Error al insertar en nAcademica: " + e.getMessage(), e);
        }
    }
}
