package com.swimming.ui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeA  {

	/*
	 * ������
	 */
	
	public JPanel getTree() {
		// TODO Auto-generated constructor stub
	
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("�ְ����");
		//����һ���ӽڵ�
		DefaultMutableTreeNode nodeFirst = new DefaultMutableTreeNode("����ѧԱ",false);
		root.add(nodeFirst);
		//����һ���ӽڵ�
		DefaultMutableTreeNode nodeSecond = new DefaultMutableTreeNode("������",false);
		root.add(nodeSecond);
		
		root.add(new DefaultMutableTreeNode("���ϰ�"));
		
		JTree treeRoot = new JTree(root);
		
		JPanel jPanel = new JPanel();
		jPanel.add(treeRoot);
		return  jPanel;
	}
}
