package com.example.clientsystem.model;

import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public abstract class ScoreModel extends AbstractTableModel {
    private Vector<String> columnNames = null;    //����
    private Vector<Vector<String>> rowData = null;    //������


    public ScoreModel(String sql, String major_Name, String grade, JDialog jd) {

        if (getRowCount() != 0) {
            JOptionPane.showMessageDialog(jd, "һ����" + getRowCount() + "����¼��");
            return;
        } else {
            JOptionPane.showMessageDialog(jd, "û���κμ�¼��");
            return;
        }
    }


}
