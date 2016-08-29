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
	 * 建立树
	 */
	
	public JPanel getTree() {
		// TODO Auto-generated constructor stub
	
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("分班情况");
		//创建一级子节点
		DefaultMutableTreeNode nodeFirst = new DefaultMutableTreeNode("所有学员",false);
		root.add(nodeFirst);
		//创建一级子节点
		DefaultMutableTreeNode nodeSecond = new DefaultMutableTreeNode("恐龙班",false);
		root.add(nodeSecond);
		
		root.add(new DefaultMutableTreeNode("西瓜班"));
		
		JTree treeRoot = new JTree(root);
		
		JPanel jPanel = new JPanel();
		jPanel.add(treeRoot);
		return  jPanel;
	}
}
