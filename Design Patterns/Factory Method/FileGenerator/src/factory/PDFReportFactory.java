package factory;

import reports.PDFReport;
import reports.report;

public class PDFReportFactory extends reportsFactory {

    @Override
    public report createReport() {
        report report = new PDFReport();
        return report;
    }
    
}
