package program.service;

import program.model.Customer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomerService {



    public static void save(Customer obj, String filePath)
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

    public static Customer load(String filePath)
    {
        try {
            FileInputStream p2 = new
                    FileInputStream(filePath);
            ObjectInputStream s = new
                    ObjectInputStream(p2);

            Customer obj = (Customer) s.readObject();

            return obj;
        }catch (Exception e)
        {
            return null;
        }
    }

}
