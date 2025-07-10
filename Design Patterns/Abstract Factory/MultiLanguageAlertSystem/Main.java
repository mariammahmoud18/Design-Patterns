package MultiLanguageAlertSystem;

import MultiLanguageAlertSystem.factory.arabicMessageFactory;
import MultiLanguageAlertSystem.factory.englishMessageFactory;
import MultiLanguageAlertSystem.factory.messageFactory;
import MultiLanguageAlertSystem.factory.spanishMessageFactory;

public class Main {
    public static void main(String[] args) {
        createFactory("arabic");
    }

    private static void createFactory(String string) {
        messageFactory factory;

        switch (string.toLowerCase()) {
            case "arabic":
                factory = new arabicMessageFactory();
                break;
            case "english":
                factory = new englishMessageFactory();
                break;
            case "spanish":
                factory = new spanishMessageFactory();
                break;
            default:
                throw new IllegalArgumentException("Unsupported language: " + string);
        }

        factory.createError().createError();
        factory.createWarning().createWarning();        
    }
}