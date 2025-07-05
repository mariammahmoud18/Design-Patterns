package reports;

import java.io.File;
import java.io.IOException;

public class PDFReport implements report{

    @Override
    public void generateReport() {
        File file = new File("example.pdf");

        try {
            if (file.createNewFile()) {
                System.out.println("PDF file created: " + file.getName());
            } else {
                System.out.println("PDF file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
    
    
}
