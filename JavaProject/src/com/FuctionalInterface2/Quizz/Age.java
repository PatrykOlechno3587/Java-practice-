package com.FuctionalInterface2.Quizz;

public class Age {



    public static void main(String[] args) {
        AgeValidator ageValidator = a  -> true;





    }

    public void buyStuff(int age) {

        AgeValidator validator = new AgeValidator() {
            @Override
            public boolean validateAge(Integer age) {
                return age >= 21;
            }
        };

        boolean validated = validator.validateAge(23);
    }
}