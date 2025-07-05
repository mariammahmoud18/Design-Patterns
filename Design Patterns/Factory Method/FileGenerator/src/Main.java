import factory.CSVReportFactory;
import factory.reportsFactory;

public class Main {
    public static void main(String[] args) {
        reportsFactory reportsFactory = new CSVReportFactory();
        reportsFactory.createReport().generateReport();
    }
}