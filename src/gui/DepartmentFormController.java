package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable {

	
	private Department entityDepartment;
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	public void setDepartmentEntity(Department entitydepartment) {
		this.entityDepartment = entitydepartment;
	}
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("onBTSaveAction");
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("onBtCancelAction");
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
	
	public void updateFormData() {
		if (entityDepartment == null) {
			throw new IllegalStateException("Entity is Null");
		}
		txtId.setText(String.valueOf(entityDepartment.getId()));//converte o inteiro para String
		txtName.setText(String.valueOf(entityDepartment.getName()));
	}

}
