package AtividadeServlet3;

public class Autenticar {
	
	
	public String autentique (String email, String senha) {
		
		
		String emailAnny = "anny@gmail.com";
		String emailArthur = "arthur@gmail.com";
		String emailProfessor = "professor@gmail.com";
		
		String msgaut;
		
		if (email.equals(emailAnny) && senha.equals("123")) {
			
			msgaut = "AUTENTICADO!";
			
		} else if(email.equals(emailArthur) && senha.equals("123")) {
			
			msgaut = "AUTENTICADO!";
			
		} else if(email.equals(emailProfessor) && senha.equals("123")) {
			
			msgaut = "AUTENTICADO!";
			
		} else {
			
			msgaut = null;

		}
		
		
		return msgaut;
	}

}
