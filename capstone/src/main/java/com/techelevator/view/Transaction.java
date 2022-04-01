package com.techelevator.view;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private List<Food> itemSelected = new ArrayList<>();

    public void addItem(Food item) {
        itemSelected.add(item);
    }



}
