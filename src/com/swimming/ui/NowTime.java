package com.swimming.ui;

import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener;   
import java.text.SimpleDateFormat;   
import java.util.Date;   
  
import javax.swing.JTextField;   
import javax.swing.Timer;   
import javax.swing.JFrame;   

public class NowTime 
{
	public JTextField time = new JTextField(11);
	//��� ��ʾʱ���JTextField
	
	public NowTime() {
		// TODO Auto-generated constructor stub
		  setTimer(time);  
	}
	
    //����Timer 1000msʵ��һ�ζ��� ʵ����һ���߳�   
   public void setTimer(JTextField time){   
        final JTextField varTime = time;   
        Timer timeAction = new Timer(1000, new ActionListener() {          
  
            public void actionPerformed(ActionEvent e) {       
                long timemillis = System.currentTimeMillis();   
                //ת��������ʾ��ʽ   
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
                varTime.setText(df.format(new Date(timemillis)));   
            }      
        });            
        timeAction.start();        
    }   
  
  public JTextField get_time() {
	
	  return time;
}
 
}