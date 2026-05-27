import com.example.crudapplication.Customer;
import com.example.crudapplication.CustomerBroker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerBrokerTest {

    @Test
    void createCustomerRecord_AccountNumberTest() {
        CustomerBroker broker = new CustomerBroker();
        Customer customer = new Customer();
        customer.setAccountNumber("1234");
        customer.setName("Fred");
        assertEquals("1234", broker.createCustomerDTO(customer).getAccountNumber(), "Account number check");
    }

    @Test
    void createCustomerRecord_CustomerNameTest() {
        CustomerBroker broker = new CustomerBroker();
        Customer customer = new Customer();
        customer.setAccountNumber("1234");
        customer.setName("Fred");
        assertEquals("Fred", broker.createCustomerDTO(customer).getFullName(), "Customer name check");
    }
}
