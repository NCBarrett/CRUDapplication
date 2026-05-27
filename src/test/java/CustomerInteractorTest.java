import com.example.crudapplication.CustomerInteractor;
import com.example.crudapplication.CustomerModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerInteractorTest {

    @Test
    void createCustomer_NameTest() {
        CustomerModel model = new CustomerModel();
        CustomerInteractor interactor = new CustomerInteractor(model);
        model.setCustomerName("Fred");
        model.setAccountNumber("ABCDE");
        assertEquals("Fred", interactor.createCustomerFromModel().getName(), "Check customer name");
    }

    @Test
    void createCustomer_AccountTest() {
        CustomerModel model = new CustomerModel();
        CustomerInteractor interactor = new CustomerInteractor(model);
        model.setCustomerName("Fred");
        model.setAccountNumber("ABCDE");
        assertEquals("ABCDE", interactor.createCustomerFromModel().getAccountNumber(), "Check customer name");
    }
}
