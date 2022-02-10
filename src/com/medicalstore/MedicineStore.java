package com.medicalstore;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicineStore {
    private ArrayList<Medicine> medicineList = new ArrayList();
//    Medicine medicine = new Medicine();

    // Adding Medicine
    public void add(Medicine medicine) {
        medicineList.add(medicine);
    }

    //Remove medicine
    public void remove(Medicine medicine) {
        medicineList.remove(medicine);
    }

    //Getter
    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }


    public Medicine getMedicine(String name) {
        for (Medicine medicine : medicineList) {
            name.equalsIgnoreCase(medicine.name);
        }
        return null;
    }

   /* //Update Medicine
    public Medicine updateMedicine(String medicine1) {
        for (Medicine medicine : medicineList) {
            if (medicine1.equalsIgnoreCase(medicine.name)) {
                int i = 0;
                while (i == 0) {
                    System.out.println("Select an appropriate option:");
                    System.out.println("What do you want to update\n" + "1.Update Name\n"
                            + "2.Update Brand Name\n" + "3.Price Of medicine\n"
                            + "4.Exit\n");
                    Scanner scanner = new Scanner(System.in);
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Enter the name of medicine to update it's name");
                            String updateName = scanner.nextLine();
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                             i = 1;
                            break;
                    }
                }
            }
        }
        return null;
    }*/
}
