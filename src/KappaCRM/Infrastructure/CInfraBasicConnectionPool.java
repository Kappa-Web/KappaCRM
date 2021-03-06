package KappaCRM.Infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import KappaCRM.Interface.IConnectionPool;

public class CInfraBasicConnectionPool implements IConnectionPool {

    private static final int MAX_POOL_SIZE = 15;
	private static final int MAX_TIMEOUT = 2;

	private CInfraBasicConnectionPool(String url, String user, String password, List<Connection> pool) {
		this.url = url;
		this.user = user;
		this.password = password;
		this.connectionPool = pool;
	}

	private String url;
    private String user;
    private String password;
    private List<Connection> connectionPool;
    private List<Connection> usedConnections = new ArrayList<>();
    private static int INITIAL_POOL_SIZE = 10;
    
    public static CInfraBasicConnectionPool create(
      String url, String user, 
      String password) throws SQLException {
 
        List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            pool.add(createConnection(url, user, password));
        }
        return new CInfraBasicConnectionPool(url, user, password, pool);
    }
    
    // standard constructors
    
    @Override
    public Connection getConnection() throws SQLException {
        if (connectionPool.isEmpty()) {
            if (usedConnections.size() < MAX_POOL_SIZE) {
                connectionPool.add(createConnection(url, user, password));
            } else {
                throw new RuntimeException(
                  "Maximum pool size reached, no available connections!");
            }
        }

        Connection connection = connectionPool
          .remove(connectionPool.size() - 1);

        if(!connection.isValid(MAX_TIMEOUT)){
            connection = createConnection(url, user, password);
        }

        usedConnections.add(connection);
        return connection;
    }
    
    @Override
    public boolean releaseConnection(Connection connection) {
        connectionPool.add(connection);
        return usedConnections.remove(connection);
    }
    
    private static Connection createConnection(
      String url, String user, String password) 
      throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    public void shutdown() throws SQLException {
        usedConnections.forEach(this::releaseConnection);
        for (Connection c : connectionPool) {
            c.close();
        }
        connectionPool.clear();
    }
    
    public int getSize() {
        return connectionPool.size() + usedConnections.size();
    }

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return url;
	}

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

}
