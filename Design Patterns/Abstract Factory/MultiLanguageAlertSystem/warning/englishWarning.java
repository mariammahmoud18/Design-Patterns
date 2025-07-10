package MultiLanguageAlertSystem.warning;

public class englishWarning implements warningMessage {
    @Override
    public void createWarning() {
        System.out.println("This is an English warning!");
    }
    
}
