package com.swimming.ui.menu.management;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class StudentManagement extends JDialog {

	JButton jButton1 = new JButton("����ѧԱ");
	JButton jButton2 = new JButton("ɾ��ѧԱ");
	JButton jButton3 = new JButton("�޸�ѧԱ��Ϣ");
	JButton jButton4 = new JButton("�鿴ѧԱ��Ϣ");
	
	
	
	public StudentManagement() {
		
		// TODO Auto-generated constructor stub
		
		add(jButton1);
		add(jButton3);
		add(jButton2);	
		add(jButton4);
		
//		����ѧ����ť
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				StudentManagementIncrease studentManagementIncrease = new StudentManagementIncrease();
				studentManagementIncrease.setVisible(true);
				dispose();
				
			}
		});
		
		
//		ɾ��ѧԱ��ť
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentManagementDelete studentManagementDelete = new StudentManagementDelete();
				studentManagementDelete.setVisible(true);
				dispose();
			}
		});
		
		
		
//		�鿴ѧ����Ϣ
		jButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				StudentManagementInfoLook studentManagementInfoLook = new StudentManagementInfoLook();
				studentManagementInfoLook.setVisible(true);
				dispose();
			}
		});
		
		
//		�޸�ѧԱ��Ϣ
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				StudentManagementInfochange studentManagementInfochange=new StudentManagementInfochange();
				studentManagementInfochange.setVisible(true);
				dispose();
			}
		});
		
//		���ô���
		setDefaultCloseOperation(2);
		setTitle("ѧԱ����");		
        setLayout(new FlowLayout(1,20,30));// ���ò�����ʽ����
	    setModal(true);
		setSize(300,200);		
		setLocationRelativeTo(null);// ���ھ���
	}
}
