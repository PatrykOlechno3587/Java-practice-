package zajavka.Package3;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String> commandLine = List.of(
                "CEO: ADD INVOICE(19.20)",
                "CEO: ADD INVOICE(21.20)",
                "CEO: ADD INVOICE(31.40)",
                "CEO: ADD INVOICE(120.99)",

                "ACCOUNTANT: PROCESS INVOICE",
                "ACCOUNTANT:  PROCESS INVOICE",
                "ACCOUNTANT:  PROCESS INVOICE"
        );

            InvoiceStack invoiceStack = new InvoiceStack();

        for (String command : commandLine) {
            invoiceStack.processInput(command);

        }
    }


}
