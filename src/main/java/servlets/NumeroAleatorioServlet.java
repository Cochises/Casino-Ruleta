package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NumeroAleatorioServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    /* Método para manejar solicitudes HTTP GET */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        procesarPeticion(request, response);
    }

    /* Método para manejar solicitudes HTTP POST */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        procesarPeticion(request, response);
    }

    /* Procesa la solicitud y genera un número aleatorio como respuesta */
    private void procesarPeticion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        /* Configura el tipo de contenido de la respuesta como "text/plain" */
        response.setContentType("text/plain");

        /* Obtiene un objeto PrintWriter para escribir en la respuesta */
        PrintWriter escritor = response.getWriter();

        /* Genera un número aleatorio entre 0 (inclusive) y 37 (exclusivo) */
        final int numeroAleatorio = (int) (Math.random() * 37);

        /* Imprime el número aleatorio en la respuesta */
        escritor.print(numeroAleatorio);
    }
}
