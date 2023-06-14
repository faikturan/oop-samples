package org.example.sample1;


import org.example.sample1.service.AuthenticationService;

public class Main {

    private static final AuthenticationService authenticationService = new AuthenticationService();

    public static void main(String[] args) {

        test("a@a.com", "1234", true );
        test("b@b.com", "1234", true );
        test("c@c.com", "1234", false );
        test("d@d.com", "1234", false );

    }

    public static void test(String email, String password, boolean expected) {

        boolean actual = authenticationService.login(email, password);


        if (expected == actual) {
            System.out.println("Test passed for email: " + email + " and password :" + password);
        } else {
            System.out.println("Expected to receive " + expected + " but was " + actual + ".");
            System.out.println("Email : " + email + " , " + " password : " + password);
        }


    }
}