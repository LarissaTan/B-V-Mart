package com.example.clientsystem.model;
import java.util.Vector;


public class ScoreAnalyzeModel{

    private Vector<String> columnNames = null;    //����
    private Vector<Vector<String>> rowData = null;    //������


    public ScoreAnalyzeModel(String major_Name, String grade, String classe) {

        columnNames = new Vector<String>();
        rowData = new Vector<Vector<String>>();


    }
}

