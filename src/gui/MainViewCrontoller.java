package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewCrontoller implements Initializable{
	
	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepertamento;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("Menu Vendedor Acionado");
	}
	
	@FXML
	public void onMenuItemDepartamentoAction() {
		System.out.println("Menu Departamento Acionado");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("Menu About Acionado");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
