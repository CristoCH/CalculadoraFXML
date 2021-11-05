package dad.calculadorafxml;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
    private StringProperty operaText = new SimpleStringProperty();

    public String getOperaText() {
        return operaText.get();
    }

    public StringProperty operaTextProperty() {
        return operaText;
    }

    public void setOperaText(String operaText) {
        this.operaText.set(operaText);
    }
}
