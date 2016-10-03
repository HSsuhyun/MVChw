package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		      String id = request.getParameter("id");
		      String password = request.getParameter("password");
		      
		      //Perform business logic. Return a bean as a result.

		      CustomerService service = (CustomerService)CustomerService.getInstance();
		      Customer customer = service.login(id,password);
		      //Customer customer = service.findCustomer(id);

		      
		      String page = null;
		      
		      if(customer == null){
		         request.setAttribute("badID", id);
		         page = "/view/loginfail.jsp";
		      }
		      else {
		         if(password.equals(customer.getPassword())){
		            request.setAttribute("userID", customer);
		            page = "/view/loginsuccess.jsp";
		         }
		         else{
		            request.setAttribute("wrong password", id);
		            page= "/view/loginfail.jsp";
		         }
		      }
		      
		      RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		      dispatcher.forward(request, response);   

	}

}
