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
	
	
//	����ģ�����ҵ������б�
	JComboBox jComboBox1 = new JComboBox();
	
//	����ģ�����Ұ�ť
    JButton jButton_Name_finding = new JButton("��������");	
    
//	��ݺ��·ݵ�label
	JLabel jLabel1 = new JLabel("���:");
	JLabel jLabel2 = new JLabel("�·�:");

//	��ݺ��·�������
	 JComboBox jComboBox2 = new JComboBox(get_year());
	 JComboBox jComboBox3 = new JComboBox(get_month());

//  ��ǰʱ���Label	 
	 JLabel jLabel3 = new JLabel("��ǰʱ��:");
     NowTime nowTime = new NowTime();
     JTextField jTextField_now_time =  nowTime.get_time();
	 

		
//		��ť
	 JButton jButton1 = new JButton("һ������");
	 JButton jButton2 = new JButton("©��");
	 JButton jButton3 = new JButton("ͳ��");
		
		
//	 ����ѡ��
	    JLabel jLabel4 = new JLabel("����ʽ��");
		JRadioButton jRadioButton1 = new JRadioButton("��ƴ������");
		JRadioButton jRadioButton2 = new JRadioButton("���������");
		ButtonGroup buttonGroup = new ButtonGroup();
		
     
	 
	 
	 /*
	  * �����
	  * ���췽��
	  */
public JPanel getJPanel() {
	// TODO Auto-generated constructor stub
		
	
//	ģ�������м��������ڲ���
	jComboBox1.addItem("����");
	jComboBox1.addItem("����");
	jComboBox1.addItem("������");
	
	
//	����м���ģ�����ҵ�������
	jPanel.add(jComboBox1);
//	����м���ģ�����Ұ�ť
	jPanel.add(jButton_Name_finding);
	jPanel.add(new JLabel("                  "));
	
	
	
//	���������������ʽ
	buttonGroup.add(jRadioButton1);
	buttonGroup.add(jRadioButton2);
	jPanel.add(jLabel4);
	jPanel.add(jRadioButton1);
	jPanel.add(jRadioButton2);

	
	
	//	����һ����ѯ��©�򿨰�ť
	jPanel.add(new JLabel("             "));
	jPanel.add(jButton1);
	jPanel.add(jButton2);
	jPanel.add(jButton3);


	
//	����м��������������·�������
	jPanel.add(new JLabel("            "));
	jPanel.add(jLabel1);
	jPanel.add(jComboBox2);
	jPanel.add(jLabel2);
	jPanel.add(jComboBox3);

	
	
//����м��뵱ǰʱ��
	jPanel.add(new JLabel("                 "));
	jPanel.add(jLabel3);
	jPanel.add(jTextField_now_time);
	

	
	
	return jPanel;
}


/*
 *   �����������·ݵĴ���
 *   ����һ����ݺ��·�����
 *   ���ظ��ϱߵ�combox
 */

private String[] get_year() {
	// TODO Auto-generated method stub
	String[] arry = new String[201];
    for (int i = 2015; i < 2201; i++) {
        arry[i-2015] = i+"��";
    }
    return arry;
}

private String[] get_month() {
	// TODO Auto-generated method stub
	String[] arry = new String[12];
    for (int i = 1; i < 13; i++) {
        arry[i-1] = i+"��";
    }
    return arry;
}

}
