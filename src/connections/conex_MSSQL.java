package connections;

/* Call external libraries */
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

class conex_MSSQL {
    // Create the connection variables
    private static Connection conex = null;
    private static ResultSet rs = null;

    // Create the connection string
    private static String user = "sa";
    private static String pass;
    ;

    // Create the connection method
    public static Connection toConnect() throws SQLException {
        // Try to connect to the database
        try {
            DriverManager.registerDriver(new SQLServerDriver());
            conex = DriverManager.getConnection(user);
            if (conex != null) {
                conex.setAutoCommit(true);
                System.out.println("Connected to the database...!\n");
            }
        }catch (SQLException e){
            throw new SQLException("Error: " + e.getMessage());
        }
        return conex;
    }

    // Create the disconnection method
    public static void toDisConnect() throws SQLException{
        try {
            if (rs != null) {
                rs.close();
            }
            if (conex != null) {
                conex.close();
            }
            System.out.println("Disconnected from the database...!\n");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        conex_MSSQL.user = user;
    }

    public static void setPass(String pass) {
        conex_MSSQL.pass = pass;
    }

    static class config_DB {
        public static final String Server = "Orion";
        public static final String Port = "1433";  // or 3305 for MySQL
        public static final String DB = "db_ejemplo";
        public static final String MOTOR = "MSSQL"; // or "MySQL" for MySQL
    }

    private static class SQLServerDriver implements Driver {
        @Override
        public Connection connect(String url, Properties info) throws SQLException {
            return null;
        }

        @Override
        public boolean acceptsURL(String url) throws SQLException {
            return false;
        }

        @Override
        public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
            return new DriverPropertyInfo[0];
        }

        @Override
        public int getMajorVersion() {
            return 0;
        }

        @Override
        public int getMinorVersion() {
            return 0;
        }

        @Override
        public boolean jdbcCompliant() {
            return false;
        }

        @Override
        public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
        }
    }
}