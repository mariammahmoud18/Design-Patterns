package factory;

import reports.CSVReport;
import reports.report;

public class CSVReportFactory extends reportsFactory {

    @Override
    public report createReport() {
        report report = new CSVReport();
        return report;
    }
    
}
