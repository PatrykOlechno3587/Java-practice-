package zajavka.Package3;

import java.math.BigDecimal;

public class Invoice {

//    CEO: ADD INVOICE(19.20)
//    CEO: ADD INVOICE(31.40)
//    CEO: ADD INVOICE(120.99)
//    CEO: ADD INVOICE(21.20)
//    ACCOUNTANT: PROCESS INVOICE
//    ACCOUNTANT: PROCESS INVOICE
//    ACCOUNTANT: PROCESS INVOICE

    private final String id;
    private final BigDecimal amount;

    public Invoice(String id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }
}
