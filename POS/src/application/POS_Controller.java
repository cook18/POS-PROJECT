package application;

import java.text.NumberFormat;
import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class POS_Controller {
		
	NumberFormat numberFormat = NumberFormat.getInstance(Locale.CANADA);
	private boolean start = true;
	
	@FXML
	private Text outputPrice;
	@FXML
	private void clearButton(ActionEvent event) {
		if (start) {
			outputPrice.setText("0");
		}
		outputPrice.setText("");
	}
	@FXML
	private void confirmButton(ActionEvent event) {
	}
	@FXML
	private void numberPad(ActionEvent event) {
		if (start) {
			outputPrice.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		outputPrice.setText(outputPrice.getText() + value);
	}
}