package com.swimming.ui.login_register;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.swimming.ui.UiMain;

public class LoginUI extends JDialog{

	Container container = getContentPane();

//	�û����������
	JLabel jLabel1 = new JLabel("�û�����");
	JTextField jTextField1 = new JTextField(15);
	JLabel jLabel2 = new JLabel("��    �룺");
	JTextField jTextField2 = new JTextField(15);
	
//	��ť	
	JButton jButton1 = new JButton("��¼");

	
	public LoginUI() {
		// TODO Auto-generated constructor stub
		
//		������������
	    container.add(jLabel1);	   
	    container.add(jTextField1);
	    container.add(jLabel2);
	    container.add(jTextField2);
		container.add(jButton1);
		
		
//		��½��ť�����¼�
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new UiMain();
				dispose();//����������,�ͷ��ڴ���Դ
						
			}
		});
		
		
		setDefaultCloseOperation(2);
		setTitle("��¼");
        setLayout(new FlowLayout(1,5,30));// ���ò�����ʽ����
		setVisible(true);
		setSize(300,240);
		setLocationRelativeTo(null);// ���ھ���
	}
}
