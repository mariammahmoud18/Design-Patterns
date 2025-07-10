package MultiLanguageAlertSystem.warning;

public class spanishWarning implements warningMessage {
    @Override
    public void createWarning() {
        System.out.println("¡Esta es una advertencia en español!");
    }
    
}
