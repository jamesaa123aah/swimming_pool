package com.swimming.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.swimming.ui.menu.management.ClassManagement;
import com.swimming.ui.menu.management.CoachManagement;
import com.swimming.ui.menu.management.MoneyManagement;
import com.swimming.ui.menu.management.StudentManagement;

public  class MenuA {


//		�˵���
		JMenuBar jMenuBar = new JMenuBar();		
		
//		�˵�
		JMenu jMenu1 = new JMenu("�ļ�");
		JMenu jMenu2 = new JMenu("����");
				
//		�˵���(1)
		JMenuItem jMenuItem1 = new JMenuItem("�ָ�");
		JMenuItem jMenuItem22 = new JMenuItem("����");
		JMenuItem jMenuItem2 = new JMenuItem("����");
		JMenuItem jMenuItem3 = new JMenuItem("�鿴��־");
		JMenuItem jMenuItem33 = new JMenuItem("�˳�");
		
//		�˵���(2)
		JMenuItem jMenuItem4 = new JMenuItem("ѧԱ����");
		JMenuItem jMenuItem5 = new JMenuItem("�༶����");
		JMenuItem jMenuItem6 = new JMenuItem("����Ա����");
		JMenuItem jMenuItem7 = new JMenuItem("�ɷѹ���");
		

		
		public  MenuA() {
			// TODO Auto-generated constructor stub
			
//		  ���˵�������Ӳ˵�
		  jMenuBar.add(jMenu1);
		  jMenuBar.add(jMenu2);
		  
//		  �ڣ�1�����˵���˵�������	  
		  jMenu1.add(jMenuItem1);
		  jMenu1.add(jMenuItem22);
		  jMenu1.add(jMenuItem2);
		  jMenu1.add(jMenuItem3);
		  jMenu1.add(jMenuItem33);
          
//		  �ڣ�2�����˵���˵�������	  
		  jMenu2.add(jMenuItem4);
		  jMenu2.add(jMenuItem5);
		  jMenu2.add(jMenuItem6);
		  jMenu2.add(jMenuItem7);
		  
		  
		  
//		  �˵�����Ӧ�¼�
		  jMenuItem1.addActionListener(null);
		  jMenuItem2.addActionListener(null);
		  jMenuItem3.addActionListener(null);	
          
//		  �˳�
		  jMenuItem33.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, "�˳�");
				System.exit(0);
			}
		});
		  
//		  ѧԱ����˵���Ӧ
		  jMenuItem4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentManagement studentManagement =new StudentManagement();
			    studentManagement.setModal(true);
			    studentManagement.setVisible(true);
			}
		});
		  
		  
		  
//		  �༶����˵���Ӧ
		  jMenuItem5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ClassManagement classManagement = new ClassManagement();
				classManagement.setModal(true);
				classManagement.setVisible(true);
			}
		});
		  
		  
		  
//		  ��������˵���Ӧ
		  jMenuItem6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CoachManagement coachManagement = new CoachManagement();
				coachManagement.setModal(true);
				coachManagement.setVisible(true);
			}
		});
		  
		  
		  
//		  �ɷѹ���˵���Ӧ
		  jMenuItem7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MoneyManagement moneyManagement = new MoneyManagement();
				moneyManagement.setModal(true);
				moneyManagement.setVisible(true);
			}
		});
		 
	
	
		}
}
