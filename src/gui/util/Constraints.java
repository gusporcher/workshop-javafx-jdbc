package gui.util;

import javafx.scene.control.TextField;

public class Constraints {
	
	public static void setTextFielInteger(TextField textField) {
		textField.textProperty().addListener((obs, oldvalue, newvalues)-> {
			if(newvalues !=null && newvalues.matches("\\d*")) {
				textField.setText(oldvalue);
			}
		});
	}
}
