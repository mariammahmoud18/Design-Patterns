package MultiLanguageAlertSystem.error;

public class spanishError implements errorMessage {
    @Override
    public void createError() {
        System.out.println("¡Este es un error en español!");
    }
    
}
