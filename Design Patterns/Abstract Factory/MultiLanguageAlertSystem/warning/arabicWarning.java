package MultiLanguageAlertSystem.warning;

public class arabicWarning implements warningMessage {
    @Override
    public void createWarning() {
        System.out.println("هذا تحذير باللغة العربية!");
    }
    
}
