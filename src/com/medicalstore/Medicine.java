package com.medicalstore;

public class Medicine {
    enum MedicineType {
        Ayurvedic, Homeopathic, Allopathic;
    }

    double priceOfMedicine;
    MedicineType type;
    String brandName;
    String name;

    public void setPriceOfMedicine(double priceOfMedicine) {
        this.priceOfMedicine = priceOfMedicine;
    }

    public void setType(MedicineType type) {
        this.type = type;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "priceOfMedicine=" + priceOfMedicine +
                ", type=" + type +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
