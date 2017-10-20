package br.sceweb.servico;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

/**
 * Essa classe realiza conexões com o banco de dados, com variáveis de valores estáticos
 * @author Lab103
 * @version 1
 */

public class FabricaDeConexoes {

	String url = "jdbc:mysql://localhost/sceweb";
	String driver = "com.mysql.jdbc.Driver";
	String usuario = "root";
	String senha = "alunofatec";

	public FabricaDeConexoes(ConfiguraDB configura) {
		this.url = configura.getUrl();
		this.driver = configura.getDriver();
		this.usuario = configura.getUsuario();
		this.senha = configura.getSenha();
	}

	public FabricaDeConexoes() {

	}

	public Connection getConnection() {
		try {
			Class.forName(driver);
			return (Connection) DriverManager.getConnection(url, usuario, senha);
		} catch (CommunicationsException e) {
			throw new RuntimeException(e);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
			
		}
	}
}
