import factory.CSVReportFactory;
import factory.PDFReportFactory;
import factory.excelReportFactory;
import factory.reportsFactory;
import factory.wordReportFactory;
import reports.report;

public class Main {
    public static void main(String[] args) {
        createFactory("PDF");
    }

    public static void createFactory(String fileType){
        reportsFactory reportsFactory = null;
        switch (fileType) {
            case "CSV":
                reportsFactory = new CSVReportFactory();
                break;
            case "PDF":
                reportsFactory = new PDFReportFactory();
                break;
            case "excel":
                reportsFactory = new excelReportFactory();
                break;
            case "word":
                reportsFactory = new wordReportFactory();
                break;
            default:
                break;
        }
        report report = reportsFactory.createReport();
        report.generateReport();
    }
}