package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Journal {
    private List<String> students = new ArrayList<>();

    public boolean addStudent(String name) {
       // boolean firstNamePresent = false; //Csak az alsó részletes kódhoz kellene ez.
        //boolean lastNamePresent = false;
        String trimmedName = name.trim();
        int whiteSpaceIndex = trimmedName.indexOf(" ");

        if (whiteSpaceIndex > -1) {
            students.add(trimmedName);
            return true;
        } else {
            return false;
        }
//Alábbi kód arra, ha azt is vizsgálni akarjuk, hogy csak betűket használunk a neveknél.
//        char[] firstName = trimmedName.substring(0, whiteSpaceIndex).toCharArray();
//        for (int i = 0; i < firstName.length; i++) {
//            if (Character.isAlphabetic(firstName[i])) {
//                firstNamePresent = true;
//            }
//        }
//
//        char[] lastName = trimmedName.substring(whiteSpaceIndex + 1).toCharArray();
//        for (int i = 0; i < lastName.length; i++) {
//            if (Character.isAlphabetic(lastName[i])) {
//                lastNamePresent = true;
//            }
//        }
//
//        if (firstNamePresent && lastNamePresent) {
//            students.add(trimmedName);
//        }
//        return firstNamePresent && lastNamePresent;
    }

    public static void main(String[] args) {
        Journal journal = new Journal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add meg a teljes nevet:");
        String name = sc.nextLine();

        System.out.println(journal.addStudent(name) ? "Név rögzítve" : "A teljes neved meg kell adnod!");
        System.out.println(journal.students.toString());
    }
}
