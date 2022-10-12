import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppInitializer {
    public static void main(String[] args) {
        Configuration configuration =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Customer.class)
                        .addAnnotatedClass(Account.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
    }
}
