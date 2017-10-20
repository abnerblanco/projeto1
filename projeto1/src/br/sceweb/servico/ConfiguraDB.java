package br.sceweb.servico;

/**
 * Essa classe � respons�vel pela conex�o ao banco de dados, espera por entrada de v�riaveis
 * @author Lab103
 * @version 1
 */
public class ConfiguraDB {
	String url = "";
	String driver = "";
	String usuario = "";
	String senha = "";
	
	public ConfiguraDB(String url, String driver, String usuario, String senha) {
		this.url = url;
		this.driver = driver;
		this.usuario = usuario;
		this.senha = senha;
	}
	public String getUrl() {
		return url;
	}
	public String getDriver() {
		return driver;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	
	
}