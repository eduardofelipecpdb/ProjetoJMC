package classes;

public class User {
	
	private String email;
	private String senha;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}	
	public int validarLogin(String email, String senha) {
		if(this.email.equals(email) && this.senha.equals(senha)) {
			return 1;
		} else {
			return 0;
		}
	}

}
