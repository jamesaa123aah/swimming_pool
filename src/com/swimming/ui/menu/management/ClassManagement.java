package com.swimming.ui.menu.management;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;

public class ClassManagement extends JDialog {

	JButton jButton1 = new JButton("新增班级");
	JButton jButton2 = new JButton("删除班级");
	JButton jButton3 = new JButton("修改班级信息");
	JButton jButton4 = new JButton("查看班级信息");
	
	
	
	public ClassManagement() {
		// TODO Auto-generated constructor stub
		
		add(jButton1);
		add(jButton3);
		add(jButton2);	
		add(jButton4);
		
		
//		设置Dialog布局
		setDefaultCloseOperation(2);
		setTitle("班级管理");		
        setLayout(new FlowLayout(1,20,30));// 设置布局流式布局
	    setModal(true);
		setSize(300,200);		
		setLocationRelativeTo(null);// 窗口居中
	}
}
