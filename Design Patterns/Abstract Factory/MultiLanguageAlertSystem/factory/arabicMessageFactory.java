package MultiLanguageAlertSystem.factory;

import MultiLanguageAlertSystem.error.arabicError;
import MultiLanguageAlertSystem.error.errorMessage;
import MultiLanguageAlertSystem.warning.arabicWarning;
import MultiLanguageAlertSystem.warning.warningMessage;

public class arabicMessageFactory extends messageFactory {
    @Override
    public errorMessage createError() {
        return new arabicError();
    }

    @Override
    public warningMessage createWarning() {
        return new arabicWarning();
    }
    
}
