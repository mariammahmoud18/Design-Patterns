package MultiLanguageAlertSystem.error;

public class arabicError implements errorMessage {
    @Override
    public void createError() {
        System.out.println("هذا خطأ باللغة العربية!");
    }
    
}
