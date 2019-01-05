package program.servlet;

import program.model.BankAccount;
import program.service.BankAccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = { "/login"})
public class Login extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int pin = Integer.parseInt(request.getParameter("pin"));

            if (BankAccountService.isPinMatched(pin)) {
                response.sendRedirect("/app/logged");
            }else{
                request.getRequestDispatcher("/login.jsp").
                        forward(request, response);
            }

        }catch (Exception e){
            request.getRequestDispatcher("/login.jsp").
                    forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       /* Customer customer = new Customer(1, "Kamil Ulatowski");
        CustomerService.save(customer, "customer.txt");*/

       // BankAccount bankAccount = new BankAccount(1, 1, 1000000, "PLN", 1234);
       // BankAccountService.save(bankAccount, "bankAccount.txt");

        request.setAttribute("END","ending");

        request.getRequestDispatcher("/login.jsp").
                forward(request,response);
    }
}
