package com.example.OOP_LAB_Project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Electricity_Billing_System {

	private JFrame frame;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtUnit;
	private JTextField txtOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electricity_Billing_System window = new Electricity_Billing_System();
					window.frame.setVisible(true);
					window.frame.setAlwaysOnTop(true);
					window.frame.toFront();
					window.frame.requestFocus();
					window.frame.setAlwaysOnTop(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Electricity_Billing_System() {
		initialize();
	}
	
	
	String cID,cName;
	double charge,grandTotal;
	double count;
	
	public void print() {
		String cID= txtID.getText();
		String cName=txtName.getText();
		String unit=txtUnit.getText();
		
	/*	txtOutput.setText("\n");
		txtOutput.setText("Electricity Billing System"+"\n");
		txtOutput.setText("\n");
		txtOutput.setText("Customer ID : ="+cID+"\n");
		txtOutput.setText("Customer Name : ="+cName+"\n");
		txtOutput.setText("Unit : ="+unit+"\n");
		txtOutput.setText("Amount : ="+ grandTotal +"\n");
		txtOutput.setText("Thank you for using our service"+"\n"); */
		
		txtOutput.setText(cName+", your bill is: "+grandTotal+"\n"); 
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial Narrow", Font.BOLD, 23));
		frame.setBounds(100, 100, 827, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 436, 1);
		frame.getContentPane().add(layeredPane);
		
		JLabel lblElectricity = new JLabel("Electricity Billing System");
		lblElectricity.setFont(new Font("Cambria", Font.BOLD, 40));
		lblElectricity.setBounds(161, 32, 614, 51);
		frame.getContentPane().add(lblElectricity);
		
		JLabel lblID = new JLabel("Customer ID:");
		lblID.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblID.setBounds(72, 148, 148, 30);
		frame.getContentPane().add(lblID);
		
		JLabel lblName = new JLabel("Customer Name:");
		lblName.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblName.setBounds(72, 223, 177, 30);
		frame.getContentPane().add(lblName);
		
		JLabel lblUnit = new JLabel("Unit :");
		lblUnit.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblUnit.setBounds(72, 303, 125, 30);
		frame.getContentPane().add(lblUnit);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Arial Narrow", Font.PLAIN, 25));
		txtID.setBounds(254, 148, 134, 30);
		frame.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Arial Narrow", Font.PLAIN, 25));
		txtName.setBounds(254, 223, 134, 30);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtUnit = new JTextField();
		txtUnit.setFont(new Font("Arial Narrow", Font.PLAIN, 25));
		txtUnit.setBounds(254, 303, 134, 30);
		frame.getContentPane().add(txtUnit);
		txtUnit.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cID=txtID.getText();				
				count=Integer.parseInt(txtUnit.getText());
				
				if(count<500) {
					charge=4.50;
				}
				else if (count<500 && count<10000) {
					charge=7.50;
				}
				grandTotal= charge *count;
				
				print();
			}
		});
		btnOk.setBackground(new Color(250, 250, 210));
		btnOk.setForeground(new Color(0, 0, 0));
		btnOk.setFont(new Font("Cambria", Font.PLAIN, 25));
		btnOk.setBounds(161, 389, 125, 51);
		frame.getContentPane().add(btnOk);
		
		txtOutput = new JTextField();
		txtOutput.setHorizontalAlignment(SwingConstants.CENTER);
		txtOutput.setFont(new Font("Arial Narrow", Font.BOLD, 30));
		txtOutput.setBounds(449, 148, 338, 199);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//txtName.setText("");
				txtID.setText("");
				txtName.setText("");
				txtUnit.setText("");
				txtOutput.setText("");
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 25));
		btnNewButton.setBounds(564, 389, 115, 51);
		frame.getContentPane().add(btnNewButton);
	}
}
