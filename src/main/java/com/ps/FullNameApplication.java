package com.ps;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        System.out.print("First Name: ");
        String fName = scanner.nextLine().trim() + " ";

        System.out.print("Middle Name: ");
        String mName = scanner.nextLine().trim();
        String displayMName = "";
        if(!mName.equals("")){
            displayMName = mName.substring(0, 1) + ". ";
        }

        System.out.print("Last Name: ");
        String lName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();
        String displaySuffix = "";
        if(!suffix.equals("")) {
            displaySuffix = ", " + suffix;
        }

        System.out.printf("Full name: %s%s%s%s", fName, displayMName, lName, displaySuffix);
    }
}