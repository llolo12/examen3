import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Datos de conexión
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=tu_base_de_datos"; // Reemplaza 'tu_base_de_datos' con tu base de datos
    private static final String USER = "tu_usuario"; // Reemplaza con tu usuario
    private static final String PASSWORD = "tu_contraseña"; // Reemplaza con tu contraseña

    // Cargar el driver
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static Connection getConection() {
        return null;
    }
}
