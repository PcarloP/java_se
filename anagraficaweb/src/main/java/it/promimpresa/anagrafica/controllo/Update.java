package it.promimpresa.anagrafica.controllo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;

import it.promimpresa.anagrafica.modello.Persona;
import it.promimpresa.anagrafica.persistenza.DAOException;
import it.promimpresa.anagrafica.persistenza.persistenza.impl.PersonaDAOImpl;

/**
 * Servlet implementation class Update
 */
@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static PersonaDAOImpl personaDAO = new PersonaDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idParam = request.getParameter("id");
		 try {
	            if (idParam == null) {
	                // Nessun ID: mostra l'elenco delle persone da modificare
	                List<Persona> persone = personaDAO.findAll();
	                request.setAttribute("persone", persone);
	                request.getRequestDispatcher("/updatesetter.jsp").forward(request, response);
	            } else {
	                // Con ID: carica la persona specifica e mostra la pagina con form di modifica
	                int id = Integer.parseInt(idParam);
	                Persona persona = personaDAO.findById(id);
	                
	                if (persona != null) {
	                    request.setAttribute("persone", personaDAO.findAll()); // per mostrare sempre la lista
	                    request.setAttribute("persona", persona);
	                    request.getRequestDispatcher("/updatesetter.jsp").forward(request, response);
	                } else {
	                    request.setAttribute("messaggio", "Persona con ID " + id + " non trovata.");
	                    request.setAttribute("persone", personaDAO.findAll());
	                    request.getRequestDispatcher("/updatesetter.jsp").forward(request, response);
	                }
	            }
	        } catch (DAOException | NumberFormatException e) {
	            request.setAttribute("messaggio", "Errore durante il caricamento dei dati.");
	            request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
	        }
		}
	    
		
	
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 try {
	            String idParam = request.getParameter("id");
	            String nome = request.getParameter("nome");
	            String cognome = request.getParameter("cognome");
	            String cf = request.getParameter("cf");
	            String dataNascitaParam = request.getParameter("dataNascita");

	            if (idParam == null || idParam.isEmpty()) {
	                request.setAttribute("messaggio", "ID persona mancante per l'aggiornamento.");
	                doGet(request, response);
	                return;
	            }

	            int id = Integer.parseInt(idParam);
	            Persona persona = personaDAO.findById(id);

	            if (persona == null) {
	                request.setAttribute("messaggio", "Persona con ID " + id + " non trovata.");
	                doGet(request, response);
	                return;
	            }

	            // Aggiorna i dati
	            persona.setNome(nome);
	            persona.setCognome(cognome);
	            persona.setCF(cf);

	            if (dataNascitaParam != null && !dataNascitaParam.isEmpty()) {
	                try {
	                    LocalDate dataNascita = LocalDate.parse(dataNascitaParam);
	                    persona.setDataNascita(dataNascita.atStartOfDay());
	                } catch (DateTimeParseException e) {
	                    request.setAttribute("messaggio", "Data di nascita non valida, ignorata.");
	                }
	            } else {
	                persona.setDataNascita(null);
	            }

	            // Aggiorna nel DB
	            personaDAO.update(persona);

	            request.setAttribute("messaggio", "Persona aggiornata con successo!");
	        } catch (DAOException | NumberFormatException e) {
	            request.setAttribute("messaggio", "Errore durante l'aggiornamento.");
	        }

	        // Dopo l’aggiornamento ricarica la lista senza form di modifica
	        try {
	            List<Persona> persone = personaDAO.findAll();
	            request.setAttribute("persone", persone);
	        } catch (DAOException e) {
	            request.setAttribute("messaggio", "Errore nel caricamento della lista dopo aggiornamento.");
	        }
	        request.getRequestDispatcher("/updatesetter.jsp").forward(request, response);
	    }
}
