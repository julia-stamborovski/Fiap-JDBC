package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDataBase {

	private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String user = "RM93518";
    private static String password = "190304";
	
    public static Connection conectar() {
    	 Connection conexao = null;
    	 
    	 try { 
    		 Class.forName("oracle.jdbc.driver.OracleDriver");
    		 conexao = DriverManager.getConnection(url, user, password);

    		 System.out.println("Conectado a base.");    		
    		 
		} catch (Exception e) {
			System.out.println("Erro ao conectar a base.");
			e.printStackTrace();
		}
    	
    	return conexao;
    }
}
