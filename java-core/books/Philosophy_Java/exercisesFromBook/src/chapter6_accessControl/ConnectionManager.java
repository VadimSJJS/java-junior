package chapter6_accessControl;

class Connection {
    private static int counter = 0;
    private int id;

    private Connection() {
        id = counter++;
    }

    // Фабричный метод для ConnectionManager
    public static Connection createConnection() {
        return new Connection();
    }
}

public class ConnectionManager {
    private static final int MAX_CONNECTIONS = 5;
    private static int createdCount = 0;

    public static Connection getConnection() {
        if (createdCount < MAX_CONNECTIONS) {
            createdCount++;
            return Connection.createConnection(); // Используем фабричный метод
        }
        return null;
    }
}