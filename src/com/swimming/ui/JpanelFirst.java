package com.swimming.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.lang.reflect.Array;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JpanelFirst {
    
	JPanel jPanel = new JPanel(new FlowLayout(0, 10, 5));
	
	
//	姓名模糊查找的下拉列表
	JComboBox jComboBox1 = new JComboBox();
	
//	姓名模糊查找按钮
    JButton jButton_Name_finding = new JButton("姓名查找");	
    
//	年份和月份的label
	JLabel jLabel1 = new JLabel("年份:");
	JLabel jLabel2 = new JLabel("月份:");

//	年份和月份下拉框
	 JComboBox jComboBox2 = new JComboBox(get_year());
	 JComboBox jComboBox3 = new JComboBox(get_month());

//  当前时间的Label	 
	 JLabel jLabel3 = new JLabel("当前时间:");
     NowTime nowTime = new NowTime();
     JTextField jTextField_now_time =  nowTime.get_time();
	 

		
//		按钮
	 JButton jButton1 = new JButton("一健考勤");
	 JButton jButton2 = new JButton("漏打卡");
	 JButton jButton3 = new JButton("统计");
		
		
//	 排序选择
	    JLabel jLabel4 = new JLabel("排序方式：");
		JRadioButton jRadioButton1 = new JRadioButton("按拼音排序");
		JRadioButton jRadioButton2 = new JRadioButton("按最近排序");
		ButtonGroup buttonGroup = new ButtonGroup();
		
     
	 
	 
	 /*
	  * 本类的
	  * 构造方法
	  */
public JPanel getJPanel() {
	// TODO Auto-generated constructor stub
		
	
//	模糊查找中加内容用于测试
	jComboBox1.addItem("张三");
	jComboBox1.addItem("李四");
	jComboBox1.addItem("王麻子");
	
	
//	面板中加入模糊查找的下拉框
	jPanel.add(jComboBox1);
//	面板中加入模糊查找按钮
	jPanel.add(jButton_Name_finding);
	jPanel.add(new JLabel("                  "));
	
	
	
//	向面板中增加排序方式
	buttonGroup.add(jRadioButton1);
	buttonGroup.add(jRadioButton2);
	jPanel.add(jLabel4);
	jPanel.add(jRadioButton1);
	jPanel.add(jRadioButton2);

	
	
	//	加入一键查询和漏打卡按钮
	jPanel.add(new JLabel("             "));
	jPanel.add(jButton1);
	jPanel.add(jButton2);
	jPanel.add(jButton3);


	
//	面板中加入年份下拉框和月份下拉框
	jPanel.add(new JLabel("            "));
	jPanel.add(jLabel1);
	jPanel.add(jComboBox2);
	jPanel.add(jLabel2);
	jPanel.add(jComboBox3);

	
	
//面板中加入当前时间
	jPanel.add(new JLabel("                 "));
	jPanel.add(jLabel3);
	jPanel.add(jTextField_now_time);
	

	
	
	return jPanel;
}


/*
 *   年份下拉框和月份的创建
 *   返回一个年份和月份数组
 *   返回给上边的combox
 */

private String[] get_year() {
	// TODO Auto-generated method stub
	String[] arry = new String[201];
    for (int i = 2015; i < 2201; i++) {
        arry[i-2015] = i+"年";
    }
    return arry;
}

private String[] get_month() {
	// TODO Auto-generated method stub
	String[] arry = new String[12];
    for (int i = 1; i < 13; i++) {
        arry[i-1] = i+"月";
    }
    return arry;
}

}
