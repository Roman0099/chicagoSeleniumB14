package seleniumintro;

import com.github.javafaker.Faker;

public class JavaFackerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String fullname = faker.name().fullName();
        String firstName = faker.name().firstName();
        System.out.println("Full Name: " + fullname);
        System.out.println("First Name: " + firstName);

    }
}

