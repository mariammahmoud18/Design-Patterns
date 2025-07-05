package reports;

import java.io.File;
import java.io.IOException;

public class excelReport implements report{

    @Override
    public void generateReport() {
        File file = new File("example.xlsx");

        try {
            if (file.createNewFile()) {
                System.out.println("Excel file created: " + file.getName());
            } else {
                System.out.println("Excel file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
    

