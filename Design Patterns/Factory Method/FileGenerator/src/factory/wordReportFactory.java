package factory;

import reports.report;
import reports.wordReport;

public class wordReportFactory extends reportsFactory{

    @Override
    public report createReport() {
        report report = new wordReport();
        return report;
    }
    
}
