package com.swimming.ui;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
public class UiMain extends JFrame{

	Container container = getContentPane();
	public UiMain() {
		// TODO Auto-generated constructor stub
		
		
		
		/*
		 * ��������Ҫ��Ϊ�ĸ�����
		 * ��һ���֣�
		 * �˵�
		 * �����������ֱַ����������
		 * ����̶����Ĵ���
		 */
		
//		�����������ò˵���
		MenuA menuA = new MenuA();
		this.setJMenuBar(menuA.jMenuBar);

		
		
//		���ص�һ����嵽������
		JpanelFirst jpanelFirst = new JpanelFirst();
		JPanel jPanel1 = jpanelFirst.getJPanel();
				
//		���صڶ�����嵽������
		JPanelSecond jPanelSecond= new JPanelSecond();
		JPanel jPanel2 = jPanelSecond.getJPanelSecond();
				
//		���ص�������嵽������
		JPanleThird jPanleThird = new JPanleThird();
		JPanel jPanel3 = jPanleThird.getJpanelThird();
		
				
		
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
		
	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
	}
}
