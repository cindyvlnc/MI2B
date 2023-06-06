/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.DosenData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.DosenModel;

/**
 *
 * @author ASUS
 */
public class SearchDosenController implements ActionListener{
    private JTextField searchData = new JTextField();
    private DefaultTableModel model;
    
    public SearchDosenController(JTextField searchData, DefaultTableModel model){
        this.searchData = searchData;
        this.model = model;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String searchDataString = this.searchData.getText();
        if (searchDataString.trim().equals("*")){
            model.setDataVector
            (DosenData.data, DosenData.TABLE_HEADER);
            return;
        }
        Object[][] newData = new Object[DosenData.data.length][];
        int index = 0;
        for (Object[] obj : DosenData.data){
            if (String.valueOf(obj[1]).toUpperCase().
            contains(searchDataString.toUpperCase().trim()) ){
                newData[index++]=obj;       
            }
            model.setDataVector(newData, DosenData.TABLE_HEADER);
        }
    }
    
}
