package com.swimming.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.nio.channels.NonWritableChannelException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTree;
/*
 * ����ϵͳ������Ui
 * ���ַ�Ϊ3�飬�ֱ�Ϊ��
 * �ϲ�����������
 */
import javax.swing.SpringLayout.Constraints;
import javax.swing.tree.DefaultMutableTreeNode;
public class UiMain extends JFrame{

	Container container = getContentPane();
	public UiMain() {
		// TODO Auto-generated constructor stub
		
		
		
		/*
		 * ����̶����Ĵ���
		 */
		JPanel jPanel1 = new JPanel(new FlowLayout());
		
//		���ڶ�������������
		TreeA treeA = new TreeA();
		JPanel jPanel2 = treeA.getTree();
		
		
//		�������ӵ����������
		JtableA jtableA = new JtableA();
		JPanel jPanel3 = jtableA.getTable();
		
		
		
		
		
		
		/*
		 * �ָ����Ĵ���
		 */
		
		//����һ����ֱ�ķָ����.
		final JSplitPane vSplitPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT);

		//�ָ����Ϸ��ĸ߶�Ϊ30����.
		vSplitPane.setDividerLocation(100);

		//����ָ������.
		vSplitPane.setDividerSize(10);

		//�ڵ����ָ���λ��ʱ�����ػ淽ʽΪ��������.
		vSplitPane.setContinuousLayout(true);
		
		container.add(vSplitPane,BorderLayout.CENTER);
		
		//���̶�������
		vSplitPane.setLeftComponent(jPanel1);
		
		
	

		//����һ��ˮƽ�ָ����.
		final JSplitPane hSplitPane=new JSplitPane();

		//�ָ������Ŀ��Ϊ150����.
		hSplitPane.setDividerLocation(150);

		
		
		//��ӹ̶����
		hSplitPane.setLeftComponent(jPanel2);
		hSplitPane.setRightComponent(jPanel3);
		
		//��ӵ�ָ������.
		vSplitPane.setRightComponent(hSplitPane);
		
		
		

		/*
		 * ���������������֡���С�����֡�
		 */
		
		setTitle("��Ӿ����ϵͳ");
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		
	}
}
