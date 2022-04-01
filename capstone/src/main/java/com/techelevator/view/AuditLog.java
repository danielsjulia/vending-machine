package com.techelevator.view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class AuditLog {

    public static void main(String[] args) throws IOException {
        File newFile = new File("audit.txt");
        String message = "Appreciate\nElevate\nParticipate";
        PrintWriter writer = null;
        // Instantiate the writer object with append functionality.
        if (newFile.exists()) {
            writer = new PrintWriter(new FileOutputStream(newFile.getAbsoluteFile(), true));
        }
        // Instantiate the writer object without append functionality.
        else {
            writer = new PrintWriter(newFile.getAbsoluteFile());
        }
        writer.append(message);
        writer.flush();
        writer.close();
    }
}

}
