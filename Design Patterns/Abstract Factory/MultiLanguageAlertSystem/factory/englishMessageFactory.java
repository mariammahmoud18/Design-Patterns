package MultiLanguageAlertSystem.factory;

import MultiLanguageAlertSystem.error.englishError;
import MultiLanguageAlertSystem.error.errorMessage;
import MultiLanguageAlertSystem.warning.englishWarning;
import MultiLanguageAlertSystem.warning.warningMessage;

public class englishMessageFactory extends messageFactory {
    @Override
    public errorMessage createError() {
        return new englishError();
    }

    @Override
    public warningMessage createWarning() {
        return new englishWarning();
    }
    
}
