package com.medicalstore;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    MedicineStore medicineStore = new MedicineStore();
    public static Scanner scanner = new Scanner(System.in);

    public void print(ArrayList medicineList) {
        for (Object medicine : medicineList) {
            System.out.println(medicine);
        }
    }

    public int showMainMenu() {
        System.out.println("Menu for medical store");
        System.out.println("Choose an appropriate option ");
        System.out.println("Select:\n" + "1.Add Medicine\n" + "2.Remove Medicine\n" + "3.Print Medicine\n"
                + "4.Update Medicine\n" + "5.Exit\n");
        int option = scanner.nextInt();
        return option;
    }

    public String  selectMedicine() {
        System.out.println("Enter name of medicine to remove: ");
        String nameOfMedicine = scanner.nextLine();
        return nameOfMedicine;
    }
}
