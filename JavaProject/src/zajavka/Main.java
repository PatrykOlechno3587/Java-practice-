package zajavka;


import java.util.Scanner;

public class Main {

        private static final int number = generateValue();

        public static void main(String[] args) {
            gameLogic();
        }

        private static int generateValue() {
            return (int) (Math.random() * 100);
        }

        private static int checkShoot(int shoot) {
            if (shoot == number) {
                return 0;
            } else if (shoot > number) {
                return 1;
            } else
                return -1;
        }

        private static int giveAShoot() {
            Scanner scan = new Scanner(System.in);
            while (true) {
                try {
                    return Integer.parseInt(scan.nextLine());
                } catch (Exception e) {
                    System.out.println("Enter a valid number");
                }
            }
        }

        private static void gameLogic() {
            System.out.println("Guess the number! from 0 to 100");
            while (true) {
                int check = checkShoot(giveAShoot());
                switch (check) {
                    case 0 -> {
                        System.out.println("Congratulations !!");
                        System.out.println("You guessed the number");
                        return;
                    }
                    case -1 -> System.out.println("the number you are looking for is bigger");
                    case 1 -> System.out.println("The number you are looking for is smaller");
                }
            }
        }
    }



