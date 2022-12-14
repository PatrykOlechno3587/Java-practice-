package zajavka.InterfacePROJECT;

public class Main {

    public static void main(String[] args) {

        Workable lambda = (someString, someOtherString2) -> System.out.println(someString.length()
                        + someOtherString2.length());
      lambda.countChars("Apartament", "PortnaStatki");
    }

    }


