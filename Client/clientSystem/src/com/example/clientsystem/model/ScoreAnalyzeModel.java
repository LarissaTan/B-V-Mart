package com.example.clientsystem.model;
import java.util.Vector;


public class ScoreAnalyzeModel{

    private Vector<String> columnNames = null;    //列名
    private Vector<Vector<String>> rowData = null;    //行数据


    public ScoreAnalyzeModel(String major_Name, String grade, String classe) {

        columnNames = new Vector<String>();
        rowData = new Vector<Vector<String>>();


    }
}

