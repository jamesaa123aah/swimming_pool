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
 * 考勤系统主界面Ui
 * 布局分为3块，分别为：
 * 上部、中左、中右
 */
import javax.swing.SpringLayout.Constraints;
import javax.swing.tree.DefaultMutableTreeNode;
public class UiMain extends JFrame{

	Container container = getContentPane();
	public UiMain() {
		// TODO Auto-generated constructor stub
		
		
		
		/*
		 * 三块固定面板的创建
		 */
		JPanel jPanel1 = new JPanel(new FlowLayout());
		
//		往第二个面板里添加树
		TreeA treeA = new TreeA();
		JPanel jPanel2 = treeA.getTree();
		
		
//		将表格添加到第三个面板
		JtableA jtableA = new JtableA();
		JPanel jPanel3 = jtableA.getTable();
		
		
		
		
		
		
		/*
		 * 分割面板的创建
		 */
		
		//创建一个垂直的分割面板.
		final JSplitPane vSplitPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT);

		//分割条上方的高度为30像素.
		vSplitPane.setDividerLocation(100);

		//定义分割条宽度.
		vSplitPane.setDividerSize(10);

		//在调整分割条位置时面板的重绘方式为连续绘制.
		vSplitPane.setContinuousLayout(true);
		
		container.add(vSplitPane,BorderLayout.CENTER);
		
		//将固定面板添加
		vSplitPane.setLeftComponent(jPanel1);
		
		
	

		//创建一个水平分割面板.
		final JSplitPane hSplitPane=new JSplitPane();

		//分隔条左侧的宽度为150像素.
		hSplitPane.setDividerLocation(150);

		
		
		//添加固定面板
		hSplitPane.setLeftComponent(jPanel2);
		hSplitPane.setRightComponent(jPanel3);
		
		//添加到指定区域.
		vSplitPane.setRightComponent(hSplitPane);
		
		
		

		/*
		 * 设置主容器的名字、大小，布局。
		 */
		
		setTitle("游泳考勤系统");
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		
	}
}
