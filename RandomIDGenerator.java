package idgen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

public class RandomIDGenerator {
	


	public static void main(String[] args) {
		
		JFrame f= new JFrame("Random ID Generator");
		JButton orderID= new JButton("Genrate Order ID");
		JButton billID= new JButton("Genrate Bill ID");
		JTextField orderLabel= new JTextField("Order ID ");
		JTextField billLabel= new JTextField("Bill ID");
				
		orderID.setBounds(130,200,200,30);
		orderLabel.setBounds(150,200,200,30);
		orderID.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String num;
				String id="SYS";
				Random rand= new Random();
				num=String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9));
				orderLabel.setText(id+num);
			}
		});
		
		
		billID.setBounds(240,200,200,30);
		billLabel.setBounds(260,200,200,30);
		billID.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String num;
				Random rand= new Random();
				num=String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9))+String.valueOf(rand.nextInt(9));
				billLabel.setText(num);
			}
		});
		
	    f.add(orderID);
	    f.add(orderLabel);
	  
	    f.add(billID);
	    f.add(billLabel);
	    	    
	    f.setSize(300,100);
	    f.setLayout(new FlowLayout(FlowLayout.LEFT));
	    f.setVisible(true);
	    	
	}

	


}
