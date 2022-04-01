package com.techelevator.view;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AuditLog {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    private String currentTimeFormatted = "";

    public void printToAuditLog(String message) {
        File newFile = new File("Audit.txt");
        PrintWriter writer = null;
        try {
            if (newFile.exists()) {
                writer = new PrintWriter(new FileOutputStream(newFile.getAbsoluteFile(), true));
            }
            else {
                writer = new PrintWriter(newFile.getAbsoluteFile());
            }
            writer.append(message);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file.");
        }
    }

    public void auditMoneyDeposit(LocalDateTime currentTime, BigDecimal amountToDeposit, BigDecimal currentBalance) {
        // local date time, money deposited, total balance
        currentTimeFormatted = currentTime.format(formatter);
        String moneyDeposited = currentTimeFormatted + " MONEY FED: $" + amountToDeposit + " $" + currentBalance + "\n";
        printToAuditLog(moneyDeposited);
    }

    public void auditItemPurchased(LocalDateTime currentTime, String food, String slot, BigDecimal oldBalance, BigDecimal newBalance) {
        currentTimeFormatted = currentTime.format(formatter);
        String itemPurchased = currentTimeFormatted + " " + food + " " + slot + " $" + oldBalance + " $" + newBalance + "\n";
        printToAuditLog(itemPurchased);
    }

    public void auditChangeGiven(LocalDateTime currentTime, BigDecimal change, BigDecimal newBalance) {
        currentTimeFormatted = currentTime.format(formatter);
        String changeGiven = currentTimeFormatted + " CHANGE GIVEN: $" + change + " $" + newBalance + "\n";
        printToAuditLog(changeGiven);
    }

}


