import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppInitializer {
    public static void main(String[] args) {
        CustomerName name1 = new CustomerName("Nimal","Bandara");
        Customer c1= new Customer(1,name1,"colombo",20000);
        Account account = new Account(1,"Checking");

        Configuration configuration =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Customer.class)
                        .addAnnotatedClass(Account.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //session.save(c1);
        session.save(account);
        transaction.commit();
    }
}
