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


//		菜单栏
		JMenuBar jMenuBar = new JMenuBar();		
		
//		菜单
		JMenu jMenu1 = new JMenu("文件");
		JMenu jMenu2 = new JMenu("管理");
				
//		菜单项(1)
		JMenuItem jMenuItem1 = new JMenuItem("恢复");
		JMenuItem jMenuItem22 = new JMenuItem("导入");
		JMenuItem jMenuItem2 = new JMenuItem("导出");
		JMenuItem jMenuItem3 = new JMenuItem("查看日志");
		JMenuItem jMenuItem33 = new JMenuItem("退出");
		
//		菜单项(2)
		JMenuItem jMenuItem4 = new JMenuItem("学员管理");
		JMenuItem jMenuItem5 = new JMenuItem("班级管理");
		JMenuItem jMenuItem6 = new JMenuItem("教练员管理");
		JMenuItem jMenuItem7 = new JMenuItem("缴费管理");
		

		
		public  MenuA() {
			// TODO Auto-generated constructor stub
			
//		  往菜单栏里添加菜单
		  jMenuBar.add(jMenu1);
		  jMenuBar.add(jMenu2);
		  
//		  第（1）个菜单里菜单项的添加	  
		  jMenu1.add(jMenuItem1);
		  jMenu1.add(jMenuItem22);
		  jMenu1.add(jMenuItem2);
		  jMenu1.add(jMenuItem3);
		  jMenu1.add(jMenuItem33);
          
//		  第（2）个菜单里菜单项的添加	  
		  jMenu2.add(jMenuItem4);
		  jMenu2.add(jMenuItem5);
		  jMenu2.add(jMenuItem6);
		  jMenu2.add(jMenuItem7);
		  
		  
		  
//		  菜单项响应事件
		  jMenuItem1.addActionListener(null);
		  jMenuItem2.addActionListener(null);
		  jMenuItem3.addActionListener(null);	
          
//		  退出
		  jMenuItem33.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, "退出");
				System.exit(0);
			}
		});
		  
//		  学员管理菜单响应
		  jMenuItem4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentManagement studentManagement =new StudentManagement();
			    studentManagement.setModal(true);
			    studentManagement.setVisible(true);
			}
		});
		  
		  
		  
//		  班级管理菜单响应
		  jMenuItem5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ClassManagement classManagement = new ClassManagement();
				classManagement.setModal(true);
				classManagement.setVisible(true);
			}
		});
		  
		  
		  
//		  教练管理菜单响应
		  jMenuItem6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CoachManagement coachManagement = new CoachManagement();
				coachManagement.setModal(true);
				coachManagement.setVisible(true);
			}
		});
		  
		  
		  
//		  缴费管理菜单响应
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
