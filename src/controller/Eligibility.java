package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/eligiblemain"})
public class Eligibility<EligibilityCheck> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String points=request.getParameter("points");
	
	//progression 7
	
	EligibilityCheck sc =new EligibilityCheck();
    boolean spaceEligible= sc.checkQuizAnswer(points);
   System.out.println(spaceEligible);
	
	if(false)
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/success.html");
		rd.forward(request, response);	
	}
	else
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
		rd.forward(request, response);
		
	}

}
}
