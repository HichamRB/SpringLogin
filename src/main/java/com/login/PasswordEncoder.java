package com.login;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Scanner;

public class PasswordEncoder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String encoded = new BCryptPasswordEncoder().encode(sc.nextLine());
        System.out.println(encoded);
    }
}
