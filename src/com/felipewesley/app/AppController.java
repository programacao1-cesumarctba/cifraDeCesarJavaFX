package com.felipewesley.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField; 

public class AppController extends CifraDeCesar {
	
	@FXML
	public TextField texto; 
	
	@FXML
	public TextField valorGiro; 
	
	@FXML
	public Button btnCifrar;
	
	@FXML
	public Button btnDecifrar;
	
	@FXML
	public TextArea txtResult; 
	
	@FXML
	public void onBtnClickEncrpytText() {
		 // lblResult.setText(super.cifrar());
		if(valorGiro.getText().isEmpty()) {
			super.setGiro(0);
		} else {
			super.setGiro(Integer.parseInt(valorGiro.getText()));
		}
		if(!texto.getText().isEmpty()) {
			super.setStr(texto.getText());
			texto.setText("");
			txtResult.setText(super.cifrar()); 
		} else {
			txtResult.setText("Impossível cifrar texto vazio."); 
		}
	
	}
	
	@FXML
	public void onBtnClickDecrpytText() {
		// lblResult.setText(super.decifrar());
		if(valorGiro.getText().isEmpty()) {
			super.setGiro(1);
		} else {
			super.setGiro(Integer.parseInt(valorGiro.getText()));
		}
		if(!texto.getText().isEmpty()) {
			super.setStr(texto.getText());
			texto.setText("");
			txtResult.setText(super.decifrar()); 
		} else {
			txtResult.setText("Impossível decifrar texto vazio."); 
		}
		//txtResult.setText(super.decifrar()); 
	}
	
}
