import com.example.crudapplication.CustomerDAO;
import com.example.crudapplication.CustomerDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerDAOTest {

    @Test
    void createCustomerRecord_AccountNumberTest() {
        CustomerDAO dao = new CustomerDAO();
        CustomerDTO customer = new CustomerDTO("1234", "Fred");
        assertEquals("1234", dao.createCustomerRecord(customer).get("account_number"), "Account number check");
    }

    @Test
    void createCustomerRecord_CustomerNameTest() {
        CustomerDAO dao = new CustomerDAO();
        CustomerDTO customer = new CustomerDTO("1234", "Fred");
    }
}
