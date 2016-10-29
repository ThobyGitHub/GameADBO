/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Thoby Gabriel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView <Mahasiswa> mahasiswaTable;
    
    @FXML
    private TextField namaTextField;
    
    @FXML
    private Slider ipkSlider;
    
    @FXML
    private Label ipkLabel;
    
    @FXML
    private CheckBox beasiswaCheckBox;
    
    @FXML
    private Button removeButton;
    
    @FXML
    private Button updateButton;
    
    @FXML
    private Button addButton;
    
    ObservableList <Mahasiswa> mahasiswaList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //TODO
        mahasiswaList = FXCollections.observableArrayList(
            new Mahasiswa ("Irvan", 3.7, true),
            new Mahasiswa ("Joshua", 3.8, false),
            new Mahasiswa ("Ocin", 3.9, true));
       mahasiswaTable.setItems(mahasiswaList);
        /**
       mahasiswaTable.getColumns().get(0).setCellValueFactory(new PropertyValueFactory("nama"));
        mahasiswaTable.getColumns().get(1).setCellValueFactory(new PropertyValueFactory("ipk"));
        mahasiswaTable.getColumns().get(2).setCellValueFactory(new PropertyValueFactory("isBeasiswa"));

        ipkSlider.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            ipkLabel.setText(String.format("%.2f", newValue));
        });
        
        mahasiswaTable.getSelectionModel().selectedIndexProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            Mahasiswa mahasiswa = mahasiswaList.get((int)newValue);
            namaTextField.setText(mahasiswa.getNama());
            ipkSlider.setValue(mahasiswa.getIpk());
            beasiswaCheckBox.setSelected(mahasiswa.isBeasiswa());
        });    
        */
       
    }    
    
     public void removeButtonClicked() {
        int selectedIndex = mahasiswaTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            mahasiswaList.remove(selectedIndex);
        }
    }
    
    public void addButtonClicked() {
        Mahasiswa mahasiswa = new Mahasiswa(namaTextField.getText(), ipkSlider.getValue() * 0.01, beasiswaCheckBox.isSelected());
        mahasiswaList.add(mahasiswa);
        System.out.println(mahasiswaList);
    }
    
    public void updateButtonClicked() {
        int selectedIndex = mahasiswaTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            Mahasiswa mahasiswa = mahasiswaList.get(selectedIndex);
            mahasiswa.setNama(namaTextField.getText());
            mahasiswa.setIpk(ipkSlider.getValue());
            mahasiswa.setIsBeasiswa(beasiswaCheckBox.isSelected());
        }        
    }
    
}
