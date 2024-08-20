import controller.ProvinciaController;
import controller.aPoliticaController;
import controller.nAcademicaController;
import controller.oSexualController;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static <PersonaController> void main(String[] args) {
        String csvFilePath = "ruta/a/tu/archivo.csv"; // Cambia esto a la ruta de tu archivo CSV



        // Conectar a la base de datos y realizar inserciones
        try (Connection connection = DatabaseConnection.getConection()) {
            // Inicializar los controladores
            ProvinciaController provinciaController = new ProvinciaController(connection);
            oSexualController oSexualController = new oSexualController(connection);
            aPoliticaController aPoliticaController = new aPoliticaController(connection);
            nAcademicaController nAcademicaController = new nAcademicaController(connection);

            // Aquí deberías llamar a métodos de los controladores para insertar los datos leídos del CSV
            // Por ejemplo:
            // personaController.addPersona(100740950, "Eneida", "Bolaños", "Iglesias", 'F', 'U', Date.valueOf("1974-05-18"), 1, 1, 1, 1, 213238);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
