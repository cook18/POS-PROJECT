package application;

import java.text.NumberFormat;
import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class POS_Controller {
		
	NumberFormat numberFormat = NumberFormat.getInstance(Locale.CANADA);
	private boolean start = true;
	private int textFieldNumberValue = 0;
	

	@FXML
	private TextField outputPrice;
	@FXML
	private TextField totalQuantity;
	@FXML
	private TextField discount;
	@FXML
	private TextField totalAmount;
	@FXML
	private TextField changes;
	@FXML
	private void clearButton(ActionEvent event) {
		if (start) {
			outputPrice.setText("0");
		}
		textFieldNumberValue = 0;
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
		textFieldNumberValue = Integer.parseInt("" + textFieldNumberValue + ((Button)event.getSource()).getText());
		String formattedValue ="$" + numberFormat.format(textFieldNumberValue);
		outputPrice.setText(formattedValue);
	}
}