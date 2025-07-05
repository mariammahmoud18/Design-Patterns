package reports;

import java.io.File;
import java.io.IOException;

public class wordReport implements report{

    @Override
    public void generateReport() {
        File file = new File("example.docx");

        try {
            if (file.createNewFile()) {
                System.out.println("Word file created: " + file.getName());
            } else {
                System.out.println("Word file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
    
}
