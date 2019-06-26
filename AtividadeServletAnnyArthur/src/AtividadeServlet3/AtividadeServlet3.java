package AtividadeServlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AtividadeServlet3")

//Anny Klarice Fernandes Souza 20161094010037

//Arthur Liberato 

public class AtividadeServlet3 extends HttpServlet {

	private static final long serialVersionUID = -7541052782498916945L;


	public AtividadeServlet3() {
        super();
        
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		
		out.print("Não é possível fazer autenticação via GET!");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Autenticar autenticar = new Autenticar();
		Validar validar = new Validar();
		
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		String senhaValidada = validar.validarSenha(senha);
		String emailValidado = validar.validaEmail(email);
		
		if (senhaValidada == null || emailValidado == null ) {
			
			response.sendRedirect("inputInvalido.html");
			
		} else {
			
			String autenticadoPE = autenticar.autentique(emailValidado, senhaValidada);
			
			if(autenticadoPE != null) {
				
				out.print("AUTENTICADO!");
				
			} else {
				
				response.sendRedirect("naoAutenticado.html");
				
			}
					
		}
		
		
	}

}
