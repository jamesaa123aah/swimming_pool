package com.swimming.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class JtableA  {


	
	public JPanel getTable() {
	
		
		/*
		 * 定义表格的列名数组
		 */
		
		String [] columnNames= {"姓名","余","一健考勤","1","2","3","4","5",
				"6","7","8","9","10","11","12","13","14","15","16","17",
				"18","19","20","21","22","23","24","25","26","27","28","29",
				"30","31"};
		
//		定义表格数据数组
		String [][] tableValues = {{"姓名","余次数","一健考勤","1","2","3","4","5",
			"6","7","8","9","10","11","12","13","14","15","16","17",
			"18","19","20","21","22","23","24","25","26","27","28","29",
			"30","31"},{"姓名","余次数","一健考勤","1","2","3","4","5",
				"6","7","8","9","10","11","12   ","13","14","15","16","17",
				"18","19","20","21","22","23","24","25","26","27","28","29",
				"30","31"}};
		
//		把列名和数据加入
		JTable table = new JTable(tableValues, columnNames);
		
		int columncount = table.getColumnCount();

		        for (int i = 0; i < columncount; i++) {

		          table.getColumnModel().getColumn(i).setPreferredWidth(33);

		        }
		        table.getColumnModel().getColumn(2).setPreferredWidth(60);
		        table.getColumnModel().getColumn(1).setPreferredWidth(60);

		

		
		//JScrollPane scrollPane = new JScrollPane(table);
		
		
		JPanel jPanel = new JPanel();
		jPanel.add(table);	
		
		return jPanel;
		
	}
}
