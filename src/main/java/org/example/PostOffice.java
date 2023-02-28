package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostOffice {

    private List<Letters> lettersList = new ArrayList<>();
    private List<Boxes> boxesList = new ArrayList<>();
    private List<Packages> packagesList = new ArrayList<>();

    public void listAllItemsByDate(LocalDate localDate){
        for (Letters letter : lettersList) {
            if (letter.getPostedDate().equals(localDate))
                System.out.println(letter.toString());
        }
    }
}
