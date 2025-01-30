import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExpenseTrackerApp {
    public static void main(String[] args) {


        // Configurar los parámetros de conexión

        String url = "jdbc:h2:~/test"; // URL de conexión a la base de datos H2

        String username = "sa"; // Nombre de usuario de la base de datos

        String password = ""; // Contraseña de la base de datos


        try {

            // Establecer la conexión

            Connection connection = DriverManager.getConnection(url, username, password);


            // Realizar operaciones en la base de datos
            Statement statement = connection.createStatement();

            String createTableQuery = "CREATE TABLE IF NOT EXISTS usuarios (id INT PRIMARY KEY, nombre VARCHAR(50))";

            statement.executeUpdate(createTableQuery);

            // Insertar registros

            String insertQuery = "INSERT INTO usuarios VALUES (1, 'John Doe'), (2, 'Jane Smith')";

            statement.executeUpdate(insertQuery);

            // Cerrar la conexión

            statement.close();

            connection.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}