package program.service;

import program.model.BankAccount;
import program.model.Customer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BankAccountService {

    public static boolean isPinMatched(Integer pin)
    {
        BankAccount bankAccount = load("BankAccount.txt");

        if(pin == bankAccount.getPin()) return true;
        return false;
    }


    public static void save(BankAccount obj, String filePath)
    {
        try {
            FileOutputStream p1 = new
                    FileOutputStream(filePath);
            ObjectOutputStream s = new
                    ObjectOutputStream(p1);

            s.writeObject(obj);

            s.close();
        }catch (Exception e){
            System.err.println(e);
        }

    }

    public static BankAccount load(String filePath)
    {
        try {
            FileInputStream p2 = new
                    FileInputStream(filePath);
            ObjectInputStream s = new
                    ObjectInputStream(p2);

            BankAccount obj = (BankAccount) s.readObject();

            return obj;
        }catch (Exception e)
        {
            return null;
        }
    }

}
