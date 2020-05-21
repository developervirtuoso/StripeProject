package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stripe.model.Charge;

/**
 * Servlet implementation class charge
 */
@WebServlet("/charge")
public class charge extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public charge() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StripeService stripeService=new StripeService();
		String token = request.getParameter("stripeToken");
	        Double amount = Double.parseDouble(request.getParameter("amount"));
	        Charge charge= stripeService.chargeNewCard(token, amount);
	        out.println("token = "+token);
	        out.println("amount = "+amount);
	        out.println("getApplication = "+charge.getApplication());
	        out.println("getId = "+charge.getId());
	        out.println("getAuthorizationCode = "+charge.getAuthorizationCode());
	        out.println("getBalanceTransaction = "+charge.getBalanceTransaction());
	        out.println("getCurrency = "+charge.getCurrency());
	        out.println("getStatus = "+charge.getStatus());
	        out.println("getCustomer = "+charge.getCustomer());
	        out.println("getPaymentMethod = "+charge.getPaymentMethod());
	        out.println("getReceiptEmail = "+charge.getReceiptEmail());
	        out.println("getReview = "+charge.getReview());
	        out.println("getStatementDescriptor = "+charge.getStatementDescriptor());
	        out.println("getReceiptEmail = "+charge.getReceiptEmail());

	}

}
