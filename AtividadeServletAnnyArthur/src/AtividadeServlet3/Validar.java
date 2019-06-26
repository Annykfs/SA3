package AtividadeServlet3;

public class Validar {
	
	public String validarSenha ( String senha) {
		
		
		
		if(senha.matches("\\d+")) {
			
			return senha; //se for apenas numeros, retorna o valor dos numeros em string ainda.
			
		} else {
			
			return null; //se houver letas, retorna um valor null.
			
		}
	
		

	}
	
	public Integer senhaInteiro (String senha) {
		
		int pswInt = Integer.parseInt(senha);
		
		return pswInt;
		
	}
	
	public String validaEmail (String email) {
		
		if (email.indexOf(".com") > 0 && email.indexOf("@") > 0){
			return email;
			} else {
			return null;
			}
	}
	
}
