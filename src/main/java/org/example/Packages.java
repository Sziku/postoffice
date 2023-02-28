package org.example;

import org.example.exceptions.BoxInWrongPackage;
import org.example.exceptions.NotEnoughBoxesForPackage;
import org.example.exceptions.PackageIsToHeavy;

import java.time.LocalDate;
import java.util.List;

public class Packages extends PostOfficeItems {
    private final int MAX_ALLOWED_WEIGHT = 5;
    private List<Boxes> boxesList;

    public Packages(List<Boxes> boxesList) throws NotEnoughBoxesForPackage,BoxInWrongPackage, PackageIsToHeavy {
        super(boxesList.get(0).getAddress(), boxesList.get(0).getSenderName(), boxesList.get(0).getPostedDate());

        if (boxesList.size() < 2) {
            throw new NotEnoughBoxesForPackage("Package need at least 2 boxes");
        }
        if (checkBoxes()) {
            throw new BoxInWrongPackage("Boxes are not the same");
        }
        if (totalWeightOfBoxes()) {
            throw new PackageIsToHeavy("Package is too heavy");
        }

        this.boxesList = boxesList;
        setPrice(calcualtePrice());
    }

    private boolean checkBoxes() {
        for (int i = 1; i < boxesList.size(); i++) {
            if (!boxesList.get(0).getSenderName().equals(boxesList.get(i).getSenderName())) {
                return true;
            }
            if (!boxesList.get(0).getAddress().equals(boxesList.get(i).getAddress())) {
                return true;
            }
            if (!boxesList.get(0).getPostedDate().equals(boxesList.get(i).getPostedDate())) {
                return true;
            }

        }
        return false;
    }

    private boolean totalWeightOfBoxes() {
        double totalWeight = 0;
        for (Boxes box : boxesList) {
            totalWeight += box.getWeight();
        }

        return totalWeight > MAX_ALLOWED_WEIGHT;
    }

    private double calcualtePrice() {
        double totalPrice = 0;
        for (Boxes box : boxesList) {
            totalPrice += box.getPrice() * 0.9;
        }
        return totalPrice;
    }

    public void addBox(Boxes box) {
        try {
            boxesList.add(box);
            if (checkBoxes()) {
                throw new BoxInWrongPackage("Boxes are not the same");
            }
            if (totalWeightOfBoxes()) {
                throw new PackageIsToHeavy("Package is too heavy");
            }
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }
}
