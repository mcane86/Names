package io.michaelcane;

import java.util.Scanner;

public class Sandbox {

    System.out.println( "What's your name?" );

    Scanner hello = new Scanner(System.in);

    String answer = hello.next();
    if( answer == "Alice" || answer == "Bob" ) {
        System.out.println( "Hello " + answer + "!" );
    } else {
        System.out.println( "Hello person I don't know" );
    }

}
