

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textDisplay;
	double fnum;
	double snum;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 260, 385);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(0, 0, 244, 42);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		     String n = textDisplay.getText()+btn7.getText();
		     textDisplay.setText(n);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(6, 89, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn8.getText();
			     textDisplay.setText(n);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(66, 89, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn9.getText();
			     textDisplay.setText(n);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(126, 89, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "+";
			}
		});
		btnplus.setBounds(186, 89, 50, 50);
		frame.getContentPane().add(btnplus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn4.getText();
			     textDisplay.setText(n);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(6, 150, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn5.getText();
			     textDisplay.setText(n);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(66, 150, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn6.getText();
			     textDisplay.setText(n);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(126, 150, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnmi = new JButton("-");
		btnmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "-";
			}
		});
		btnmi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmi.setBounds(184, 150, 50, 50);
		frame.getContentPane().add(btnmi);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn1.getText();
			     textDisplay.setText(n);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(6, 209, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn2.getText();
			     textDisplay.setText(n);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(66, 211, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn3.getText();
			     textDisplay.setText(n);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(126, 211, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnmal = new JButton("*");
		btnmal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "*";
			}
		});
		btnmal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmal.setBounds(184, 211, 50, 50);
		frame.getContentPane().add(btnmal);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String n = textDisplay.getText()+btn0.getText();
			     textDisplay.setText(n);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(6, 272, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndot.setBounds(66, 272, 50, 50);
		frame.getContentPane().add(btndot);
		
		JButton btnplusmi = new JButton("\u00B1");
		btnplusmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = ops * (-1);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		btnplusmi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnplusmi.setBounds(126, 272, 50, 50);
		frame.getContentPane().add(btnplusmi);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndiv.setBounds(186, 272, 50, 50);
		frame.getContentPane().add(btndiv);
		
		JButton btnback = new JButton("<");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(textDisplay.getText().length() > 0)
				{
					StringBuilder strb = new StringBuilder(textDisplay.getText());
					strb.deleteCharAt(textDisplay.getText().length() - 1);
					back = strb.toString();
					textDisplay.setText(back);
				}
			}
		});
		btnback.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnback.setBounds(10, 47, 46, 31);
		frame.getContentPane().add(btnback);
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(null);
			}
		});
		btnc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnc.setBounds(66, 47, 50, 31);
		frame.getContentPane().add(btnc);
		
		JButton btnmodu = new JButton("%");
		btnmodu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "%";
			}
		});
		btnmodu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnmodu.setBounds(126, 47, 50, 31);
		frame.getContentPane().add(btnmodu);
		
		JButton btnequ = new JButton("=");
		btnequ.setBackground(Color.RED);
		btnequ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				snum = Double.parseDouble(textDisplay.getText());
				if(operation == "+")
				{
					result = fnum+snum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operation == "-")
				{
					result = fnum-snum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operation == "*")
				{
					result = fnum*snum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operation == "/")
				{
					result = fnum/snum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operation == "%")
				{
					result = fnum%snum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
			}
		});
		btnequ.setForeground(Color.BLACK);
		btnequ.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnequ.setBounds(186, 47, 46, 31);
		frame.getContentPane().add(btnequ);
		
	
		
	}
}
