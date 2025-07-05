package reports;

import java.io.File;
import java.io.IOException;


public class CSVReport implements report{

    @Override
    public void generateReport() {
        File file = new File("example.csv");

        try {
            if (file.createNewFile()) {
                System.out.println("CSV file created: " + file.getName());
            } else {
                System.out.println("CSV file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
    
}
