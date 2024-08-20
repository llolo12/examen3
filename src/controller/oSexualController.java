package controller;

import model.oSexual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class oSexualController {
    private Connection connection;

    public oSexualController(Connection connection) {
        this.connection = connection;
    }

    public void addOSexual(oSexual oSexual) throws SQLException {
        String sql = "INSERT INTO oSexual (Descripcion) VALUES (?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, oSexual.getDescripcion());
            ps.executeUpdate();
        }
    }
}
