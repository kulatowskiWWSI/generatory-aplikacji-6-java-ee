package program.servlet;

import program.model.BankAccount;
import program.service.BankAccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OutcashServlet", urlPatterns = { "/outcash"})
public class OutcashServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int output10 = Integer.parseInt(request.getParameter("output10"));
            int output20 = Integer.parseInt(request.getParameter("output20"));
            int output50 = Integer.parseInt(request.getParameter("output50"));
            int output100 = Integer.parseInt(request.getParameter("output100"));
            int output200 = Integer.parseInt(request.getParameter("output200"));
            int output500 = Integer.parseInt(request.getParameter("output500"));

            int sum = output10*10+output20*20+output50*50+output100*100+output200*200+output500*500;

            BankAccount bankAccount = BankAccountService.load("bankAccount.txt");

            if(sum<=bankAccount.getBalance()) bankAccount.setBalance(bankAccount.getBalance()-sum);

            BankAccountService.save(bankAccount, "bankAccount.txt");
        }catch (Exception e){}

        response.sendRedirect("/app/logged");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
