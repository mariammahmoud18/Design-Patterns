package MultiLanguageAlertSystem.factory;

import MultiLanguageAlertSystem.error.errorMessage;
import MultiLanguageAlertSystem.warning.warningMessage;

public abstract class messageFactory {
    public abstract errorMessage createError();
    public abstract warningMessage createWarning();
}
