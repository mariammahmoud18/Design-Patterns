package factory;

import reports.excelReport;
import reports.report;

public class excelReportFactory extends reportsFactory{

    @Override
    public report createReport() {
        report report = new excelReport();
        return report;
    }
    
}
