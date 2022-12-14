package zajavka.Package3;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Deque;

public class InvoiceStack {

    private Integer counter = 1;

    private Deque<Invoice> invoiceStack = new ArrayDeque<>();

    void processInput(String command) {
        if (command.contains("CEO")) {
            processCEOInput(command);


        } else if (command.contains("ACCOUNTANT")) {
            processAccountantInput(command);

        } else {
            System.out.println("O co ci chodzi?");
        }
    }

    void processCEOInput(String command) {
        BigDecimal amount = new BigDecimal(command.substring(command.indexOf("("), command.indexOf(")")));
        Integer year = 2003;
        String id = counter + "/" + year;
        Invoice invoice = new Invoice(id, amount);
        invoiceStack.push(invoice);
    }

    private void processAccountantInput(String command) {

    }
}
