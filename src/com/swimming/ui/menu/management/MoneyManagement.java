package com.swimming.ui.menu.management;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MoneyManagement extends JDialog{

	JLabel jLabel_name = new JLabel("������");
	JLabel jLabel_id = new JLabel("ѧ�ţ�");
	JLabel jLabel_class = new JLabel("�༶��");
	JLabel jLabel_money = new JLabel("���(RMB):");
	JLabel jLabel_times = new JLabel("������");
	
//	combobox����
	String arry_name[]={"������","��������","����"};
	String arry_id[]={"000001","000345"};
	String arry_class[]={"���ɽ�����","��һɽ������","���ĺ�������"};
	String arry_times[]={"1","2","3","4","5"};
	
	
	JComboBox jComboBox_name = new JComboBox<>(arry_name);
	JComboBox jComboBox_id = new JComboBox<>(arry_id);
	JComboBox jComboBox_class = new JComboBox<>(arry_class);
	JTextField jTextField_money = new JTextField(10);
	JComboBox jComboBox_times = new JComboBox<>(arry_times);
	
	
	JButton jButton_confirm = new JButton("ȷ�Ͻɷ�");
	
	public MoneyManagement() {
		// TODO Auto-generated constructor stub
		
//		������������
		jLabel_name.setSize(40, 30);
		jLabel_name.setLocation(5, 5);
		add(jLabel_name);
		jComboBox_name.setSize(100, 20);
		jComboBox_name.setLocation(45, 10);
		add(jComboBox_name);
	
		
		
//		����ѧ��ֲ��
		jLabel_id.setSize(40,30);
		jLabel_id.setLocation(180, 5);
		add(jLabel_id);
		jComboBox_id.setSize(100, 20);
		jComboBox_id.setLocation(220, 10);
		add(jComboBox_id);
		
//		���Ӱ༶����
		jLabel_class.setSize(40, 30);
		jLabel_class.setLocation(5, 50);
		add(jLabel_class);
		jComboBox_class.setSize(100, 20);
		jComboBox_class.setLocation(45, 50);
		add(jComboBox_class);
		
//		�ɷѶ���(RMB)
		jLabel_money.setSize(75, 30);
		jLabel_money.setLocation(5, 95);
		add(jLabel_money);
		jTextField_money.setSize(60, 20);
		jTextField_money.setLocation(80, 100);
		add(jTextField_money);
		
//		��Ӧ�����ۺ϶��ٴ�
		jLabel_times.setSize(40, 30);
		jLabel_times.setLocation(180, 95);
		add(jLabel_times);
		jComboBox_times.setSize(100, 20);
		jComboBox_times.setLocation(220, 100);
		add(jComboBox_times);
		
//		ȷ�ϽɷѰ�ť
		jButton_confirm.setSize(100, 30);
		jButton_confirm.setLocation(150, 180);
		add(jButton_confirm);
		
		setDefaultCloseOperation(2);
		setTitle("�ɷѹ���");		
        //setLayout(new FlowLayout(1,5,30));// ���ò�����ʽ����
		setLayout(null);
	    setModal(true);
		setSize(400,300);		
		setLocationRelativeTo(null);// ���ھ���

	}
}
