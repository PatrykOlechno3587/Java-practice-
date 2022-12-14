package com.FuctionalInterface2.Quizz;


import java.util.function.Function;

public class QuizMethodReferenceQuestions {

    public static void main(String[] args) {



        Function<Book, String> bookFunction1 = a -> stringProvider(a);
        String applyResult = bookFunction1.apply(new Book("Titanic"));

        System.out.println(applyResult);

    }

    private static Book bookProvider(String name) {

        return new Book(name);
    }

    private static String stringProvider(Book book){
        return book.getName();
    }


    static class Book {

        private String name;

        public Book(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
