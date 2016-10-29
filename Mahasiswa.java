/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfx;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
/**
 *
 * @author Thoby Gabriel
 */
public class Mahasiswa {
    private final StringProperty nama;
    private final DoubleProperty ipk;
    private final BooleanProperty isBeasiswa;

    public Mahasiswa(String nama, Double ipk, Boolean isBeasiswa) {
        this.nama = new SimpleStringProperty (nama);
        this.ipk = new SimpleDoubleProperty (ipk);
        this.isBeasiswa = new SimpleBooleanProperty (isBeasiswa);
    }

    public String getNama() {
        return nama.get();
    }
    
    public void setNama (String nama){
        this.nama.set(nama);
    } 

    public double getIpk() {
        return ipk.get();
    }
    
    public void setIpk (double ipk){
        this.ipk.set(ipk);
    }
    
    public boolean isBeasiswa (){
        return this.isBeasiswa.get();
    }
    
    public void setIsBeasiswa (boolean beasiswa){
        this.isBeasiswa.set(beasiswa);
    }
    
    public StringProperty namaProperty(){
        return nama;
    }
    
    public DoubleProperty ipkProperty(){
        return ipk;
    }
    
    public BooleanProperty isBeasiswaProperty (){
        return isBeasiswa;
    }
}
