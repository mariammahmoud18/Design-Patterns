package MultiLanguageAlertSystem.factory;

import MultiLanguageAlertSystem.error.errorMessage;
import MultiLanguageAlertSystem.error.spanishError;
import MultiLanguageAlertSystem.warning.spanishWarning;
import MultiLanguageAlertSystem.warning.warningMessage;

public class spanishMessageFactory extends messageFactory {
    @Override
    public errorMessage createError() {
        return new spanishError();
    }

    @Override
    public warningMessage createWarning() {
        return new spanishWarning();
    }
    
}
