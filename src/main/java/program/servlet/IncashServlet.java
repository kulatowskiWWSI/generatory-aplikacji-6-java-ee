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

@WebServlet(name = "IncashServlet", urlPatterns = { "/incash"})
public class IncashServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int input10 = Integer.parseInt(request.getParameter("input10"));
            int input20 = Integer.parseInt(request.getParameter("input20"));
            int input50 = Integer.parseInt(request.getParameter("input50"));
            int input100 = Integer.parseInt(request.getParameter("input100"));
            int input200 = Integer.parseInt(request.getParameter("input200"));
            int input500 = Integer.parseInt(request.getParameter("input500"));

            BankAccount bankAccount = BankAccountService.load("bankAccount.txt");
            bankAccount.setBalance(bankAccount.getBalance() + input10 * 10);
            bankAccount.setBalance(bankAccount.getBalance() + input20 * 20);
            bankAccount.setBalance(bankAccount.getBalance() + input50 * 50);
            bankAccount.setBalance(bankAccount.getBalance() + input100 * 100);
            bankAccount.setBalance(bankAccount.getBalance() + input200 * 200);
            bankAccount.setBalance(bankAccount.getBalance() + input500 * 500);

            BankAccountService.save(bankAccount, "bankAccount.txt");
        }catch (Exception e){}

        response.sendRedirect("/app/logged");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
