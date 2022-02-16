package com.medicalstore;

import static com.medicalstore.UserInterface.scanner;

public class Main {

    public void handleUserSelection(int option) {
        MedicineStore medicineStore = new MedicineStore();
        UserInterface userInterface = new UserInterface();

        switch (option) {
            case 1:
                Main main = new Main();
                main.addMedicine();
                break;
            case 2:
                String name = userInterface.selectMedicine();
                Medicine medicine = medicineStore.getMedicine(name);
                medicineStore.remove(medicine);
                break;
            case 3:
                userInterface.print(medicineStore.getMedicineList());
                break;
            case 4:
                   /* String nameOfMedicine = userInterface.selectMedicine();
                    Medicine medicine1 = medicineStore.getMedicine(nameOfMedicine);
                    medicineStore.updateMedicine(String.valueOf(medicine1));*/
                updateMedicine();
                break;
            case 5:

                break;
            default:
                System.out.println("Medicine is not in list!");
        }
    }

    public static void main(String[] args) {
/*
        MedicineStore medicineStore = new MedicineStore();
        Vicks vicks = new Vicks();
        vicks.priceOfMedicine = 50;
        Chawayanprash chawayanprash = new Chawayanprash();
        chawayanprash.priceOfMedicine = 90;
        BTrim bTrim = new BTrim();
        bTrim.priceOfMedicine = 25.6;
        Crocin crocin = new Crocin();
        crocin.priceOfMedicine = 35.2;
        Azithromycin azithromycin = new Azithromycin();
        azithromycin.priceOfMedicine = 77;

        medicineStore.add(azithromycin);
        medicineStore.add(bTrim);
        medicineStore.add(crocin);
        medicineStore.add(vicks);
        medicineStore.add(chawayanprash);

        UserInterface userInterface = new UserInterface();
        userInterface.print(medicineStore.getMedicineList());
        System.out.println("After removing medicine azithromycin");
        System.out.println(" ");
        medicineStore.remove(azithromycin);
        userInterface.print(medicineStore.getMedicineList());
 */
        UserInterface userInterface = new UserInterface();
        Main main = new Main();
        int option = 0;
        while (option != 5) {
            option = userInterface.showMainMenu();
            main.handleUserSelection(option);
        }
    }

    public void addMedicine() {
        MedicineStore medicineStore = new MedicineStore();
        Vicks vicks = new Vicks();
        vicks.priceOfMedicine = 50;
        Chawayanprash chawayanprash = new Chawayanprash();
        chawayanprash.priceOfMedicine = 90;
        BTrim bTrim = new BTrim();
        bTrim.priceOfMedicine = 25.6;
        Crocin crocin = new Crocin();
        crocin.priceOfMedicine = 35.2;
        Azithromycin azithromycin = new Azithromycin();
        azithromycin.priceOfMedicine = 77;

        medicineStore.add(azithromycin);
        medicineStore.add(bTrim);
        medicineStore.add(crocin);
        medicineStore.add(vicks);
        medicineStore.add(chawayanprash);
        UserInterface userInterface = new UserInterface();
        userInterface.print(medicineStore.getMedicineList());
    }

    public void updateMedicine() {
        UserInterface userInterface = new UserInterface();
        String medicineName = userInterface.selectMedicine();
        MedicineStore medicineStore = new MedicineStore();
        Medicine medicineForUpdate = medicineStore.getMedicine(medicineName);
        System.out.println(medicineForUpdate);

        int updateChoice = userInterface.showMainMenu();

        switch (updateChoice) {
            case 1:
                System.out.println("Current Name is : " + medicineForUpdate.name + ". Enter your new name :");
                String newName = scanner.next();
                medicineForUpdate.name = newName;
                break;
            case 2:
                System.out.println("Current Brand Name is : " + medicineForUpdate.brandName + ". Enter your new Brandname :");
                medicineForUpdate.brandName = scanner.next();
                break;
            case 3:
                System.out.println("Current Type is : " + medicineForUpdate.type + ". Enter your new Type :");
//			medicineForUpdate.type = scanner.next();
                break;
            case 4:
                System.out.println("Current price is : " + medicineForUpdate.type + ". Enter your new price :");
                medicineForUpdate.priceOfMedicine = scanner.nextInt();
                break;
            case 5:
                break;
        }
    }
}
