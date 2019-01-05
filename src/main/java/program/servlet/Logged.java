package program.servlet;

import program.model.BankAccount;
import program.model.Customer;
import program.service.BankAccountService;
import program.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoggedServlet", urlPatterns = { "/logged"})
public class Logged extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customer customer = CustomerService.load("customer.txt");
        BankAccount bankAccount = BankAccountService.load("bankAccount.txt");

        request.setAttribute("customer",customer);
        request.setAttribute("bankAccount",bankAccount);

        request.getRequestDispatcher("/logged.jsp").
                forward(request,response);
    }
}
