package com.swimming.ui.menu.management;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;

public class ClassManagement extends JDialog {

	JButton jButton1 = new JButton("�����༶");
	JButton jButton2 = new JButton("ɾ���༶");
	JButton jButton3 = new JButton("�޸İ༶��Ϣ");
	JButton jButton4 = new JButton("�鿴�༶��Ϣ");
	
	
	
	public ClassManagement() {
		// TODO Auto-generated constructor stub
		
		add(jButton1);
		add(jButton3);
		add(jButton2);	
		add(jButton4);
		
		
//		����Dialog����
		setDefaultCloseOperation(2);
		setTitle("�༶����");		
        setLayout(new FlowLayout(1,20,30));// ���ò�����ʽ����
	    setModal(true);
		setSize(300,200);		
		setLocationRelativeTo(null);// ���ھ���
	}
}
