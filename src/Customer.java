import javax.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long customerId;
    private CustomerName name;
    private String address;
    private double salary;

    @OneToOne()
    private Account account;

    public Customer() {
    }

    public Customer(long customerId, CustomerName name, String address, double salary) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public CustomerName getName() {
        return name;
    }

    public void setName(CustomerName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
