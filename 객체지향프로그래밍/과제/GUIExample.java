import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class GUIExample extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	JTextArea ta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIExample frame = new GUIExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Enter Student ID");
		l1.setBackground(Color.ORANGE);
		l1.setBounds(14, 39, 143, 18);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Student Name");
		l2.setBounds(14, 69, 111, 18);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Student Address");
		l3.setBounds(14, 99, 111, 18);
		contentPane.add(l3);
		
		tf1 = new JTextField();
		tf1.setBackground(Color.PINK);
		tf1.setBounds(141, 36, 116, 24);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(139, 69, 116, 24);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(139, 96, 116, 24);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		JButton btnClear = new JButton("Display");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File file = new File("Data.txt");

			    Scanner input=null;
				try {
					input = new Scanner(file);
				} catch (FileNotFoundException ee) {
					ee.printStackTrace();
				}

			    while (input.hasNext()) {
			      int id = input.nextInt();
			      String name = input.next();
			      String address = input.next();
			      String dept = input.next();

			      ta.append(id + " " + name + " " + address + " " + dept + "\n");
			    }
			    input.close();
				
				
			}
		});
		btnClear.setBounds(149, 132, 105, 27);
		contentPane.add(btnClear);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ID = tf1.getText();
				String Name = tf2.getText();
				String address = tf3.getText();
				
				
				HUFSStudents std = new HUFSStudents();
				std.setID(Integer.parseInt(ID));
				std.setName(Name);
				std.setAddress(address);
				std.setDepartment("ICE");
				
				WriteStudentDataToFile(std);				
				
			}
		});
		btnAdd.setBounds(152, 171, 105, 27);
		contentPane.add(btnAdd);
		
		ta = new JTextArea();
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setBounds(51, 228, 425, 108);
		contentPane.add(ta);
		
		JButton btnsearch = new JButton("search");
		btnsearch.setBounds(322, 132, 105, 27);
		contentPane.add(btnsearch);
	}
	
	
	
	
private static void WriteStudentDataToFile(HUFSStudents stdTemp) {
		
		
		FileWriter file = null;		    
		PrintWriter output = null;
		try {
			file = new FileWriter("Data.txt", true);
			output = new PrintWriter(file);
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		output.print(stdTemp.getID());
		output.print(" ");
		output.print(stdTemp.getName());
		output.print(" ");
		output.print(stdTemp.getAddress());
		output.print(" ");
		output.println(stdTemp.getDepartment() + "\n");
		
		output.close();
	}
	
	
}
