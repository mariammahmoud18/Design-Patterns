package MultiLanguageAlertSystem.error;

public class englishError implements errorMessage {
    @Override
    public void createError() {
        System.out.println("This is an English error!");
    }
    
}
