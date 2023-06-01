package com.example.clientsystem.model;


import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

//rowData用来存放行数据
//columnNames存放列名
public abstract class StudentModel extends AbstractTableModel {
    private Vector<String> columnNames = null;    //列名
    private Vector<Vector<String>> rowData = null;    //行数据


    public StudentModel(String sql, JDialog jd) {

        if (getRowCount() != 0) {
            JOptionPane.showMessageDialog(jd, "一共有" + getRowCount() + "条记录！");
            return;
        } else {
            JOptionPane.showMessageDialog(jd, "没有任何记录！");
            return;
        }
    }

}
