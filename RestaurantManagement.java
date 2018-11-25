import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RestaurantManagement extends JFrame {

	private JPanel contentPane;
	private JTextField cbt;
	private JTextField cbqt;
	private JTextField bbt;
	private JTextField cd;
	private JTextField cm;
	private JTextField cdl;
	private JTextField cin;
	private JTextField cout;
	private JTextField sbt;
	private JTextField taxf;
	private JTextField tot;
	JTextArea RtextArea ;

	JCheckBox chckbxChikenBurger;
	JCheckBox chckbxChikenBurgerBbq;
	JCheckBox chckbxBeefBurger;
	JCheckBox chckbxHomeDelivery;
	JCheckBox chckbxTax ;
	JComboBox DrinkscomboBox , CurrencycomboBox;;
	 
	double[] result = new double[5];
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantManagement frame = new RestaurantManagement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void currencyConvert()
	{
		float taka = Float.parseFloat(cin.getText());
		if(CurrencycomboBox.getSelectedItem().equals("US Dollar"))
		{
			cout.setText("BDT "+ taka * 84.46);
		}
		if(CurrencycomboBox.getSelectedItem().equals("Euro"))
		{
			cout.setText("BDT "+ taka * 97.82);
		}
		if(CurrencycomboBox.getSelectedItem().equals("Pound"))
		{
			cout.setText("BDT "+ taka * 109.81);
		}
		
	}

	private void drinkcal()
	{
		if (DrinkscomboBox.getSelectedItem().equals("Coca Cola"))
		{
			cd.setText(""+18);
		}
		if (DrinkscomboBox.getSelectedItem().equals("Sprite"))
		{
			cd.setText(""+25);
		}
		if (DrinkscomboBox.getSelectedItem().equals("Cold Coffe"))
		{
			cd.setText(""+110);
		}
		if (DrinkscomboBox.getSelectedItem().equals("Coffe"))
		{
			cd.setText(""+90);
		}
		if (DrinkscomboBox.getSelectedItem().equals("Tea"))
		{
			cd.setText(""+60);
		}
		if (DrinkscomboBox.getSelectedItem().equals("Cold Tea"))
		{
			cd.setText(""+65);
		}
		
	}
	
	private void totals()
	{
		double a = Double.parseDouble(cm.getText());
		double b = Double.parseDouble(cdl.getText());
		double c = Double.parseDouble(cd.getText());
		double d = Double.parseDouble(taxf.getText());
		
		double subt = a+b+c;
		
		sbt.setText(""+subt);
		
		double ftotal = a+b+c+d;
		tot.setText(""+ftotal);
		
		
	}
	
	private void recipt()
	{
		RtextArea.append("  Hungry ManResturant !!\n\n "+"Sub Total: \t"+sbt.getText()+"\n Tax: \t"+taxf.getText()+
				"\n------------------------"+"\nTotal Amaount: \t"+tot.getText()+"");
	}
	
	
	private void print()
	{
		try
		{
			boolean complete = RtextArea.print();
			if(complete)
			{
				JOptionPane.showMessageDialog(null, "Printing Done .... ", null, JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Error Occured .... ", null, JOptionPane.ERROR_MESSAGE);
			}
			
		}catch(PrinterException e)
		{
 			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public RestaurantManagement() {
		setTitle("Restaurant Management System ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to HungryMan Restaurant !!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(170, 11, 288, 28);
		contentPane.add(lblNewLabel);
		
		chckbxChikenBurger = new JCheckBox("Fried Rice");
		chckbxChikenBurger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double q = Double.parseDouble(cbt.getText());
				double sum = Double.parseDouble(cm.getText());
				
				if (chckbxChikenBurger.isSelected())
				{
					result[0] = (120*q)+sum;
					String meal = String.format("%.2f", result[0]);
					cm.setText(meal);
				}
			}
		});
		chckbxChikenBurger.setBounds(32, 80, 97, 23);
		contentPane.add(chckbxChikenBurger);
		
		chckbxChikenBurgerBbq = new JCheckBox("Naga Burger");
		chckbxChikenBurgerBbq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double q = Double.parseDouble(cbqt.getText());
				double sum = Double.parseDouble(cm.getText());
				
				if (chckbxChikenBurgerBbq.isSelected())
				{
					result[1] = (170*q)+sum;
					String meal = String.format("%.2f", result[1]);
					cm.setText(meal);
				}
			}
		});
		chckbxChikenBurgerBbq.setBounds(32, 106, 115, 23);
		contentPane.add(chckbxChikenBurgerBbq);
		
		chckbxBeefBurger = new JCheckBox("Sandwich");
		chckbxBeefBurger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double q = Double.parseDouble(bbt.getText());
				double sum = Double.parseDouble(cm.getText());
				
				if (chckbxBeefBurger.isSelected())
				{
					result[2] = (80*q)+sum;
					String meal = String.format("%.2f", result[2]);
					cm.setText(meal);
				}
			}
		});
		chckbxBeefBurger.setBounds(32, 132, 97, 23);
		contentPane.add(chckbxBeefBurger);
		
		cbt = new JTextField();
		cbt.setText("0");
		cbt.setBounds(163, 81, 86, 20);
		contentPane.add(cbt);
		cbt.setColumns(10);
		
		cbqt = new JTextField();
		cbqt.setText("0");
		cbqt.setBounds(163, 107, 86, 20);
		contentPane.add(cbqt);
		cbqt.setColumns(10);
		
		bbt = new JTextField();
		bbt.setText("0");
		bbt.setBounds(163, 133, 86, 20);
		contentPane.add(bbt);
		bbt.setColumns(10);
		
		DrinkscomboBox = new JComboBox();
		DrinkscomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drinkcal();
			}
		});
		DrinkscomboBox.setModel(new DefaultComboBoxModel(new String[] {"--", "Coca Cola", "Sprite", "Coffe", "Cold Coffe", "Tea", "Cold Tea"}));
		DrinkscomboBox.setBounds(133, 173, 115, 20);
		contentPane.add(DrinkscomboBox);
		
		JLabel lblDrinks = new JLabel("Drinks Item");
		lblDrinks.setForeground(Color.RED);
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDrinks.setBounds(32, 175, 97, 14);
		contentPane.add(lblDrinks);
		
		JLabel lblCostOfDrinks = new JLabel("Cost Of Drinks");
		lblCostOfDrinks.setBounds(32, 266, 86, 14);
		contentPane.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost Of Meal");
		lblCostOfMeal.setBounds(32, 302, 79, 14);
		contentPane.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost Of Delivery ");
		lblCostOfDelivery.setBounds(32, 336, 97, 14);
		contentPane.add(lblCostOfDelivery);
		
		chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cdl.setText("" + 50);
			}
		});
		chckbxHomeDelivery.setBounds(163, 211, 110, 23);
		contentPane.add(chckbxHomeDelivery);
		
		chckbxTax = new JCheckBox("Tax");
		chckbxTax.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double tax;
				double a = Double.parseDouble(cm.getText());
				double b = Double.parseDouble(cdl.getText());
				double c = Double.parseDouble(cd.getText());
				
				tax = (a+b+c) * 0.15;
				taxf.setText(String.format("%.2f", tax));
			}
		});
		chckbxTax.setBounds(50, 211, 97, 23);
		contentPane.add(chckbxTax);
		
		cd = new JTextField();
		cd.setText("0");
		cd.setEditable(false);
		cd.setBounds(163, 263, 86, 20);
		contentPane.add(cd);
		cd.setColumns(10);
		
		cm = new JTextField();
		cm.setText("0");
		cm.setEditable(false);
		cm.setBounds(163, 299, 86, 20);
		contentPane.add(cm);
		cm.setColumns(10);
		
		cdl = new JTextField();
		cdl.setText("0");
		cdl.setEditable(false);
		cdl.setBounds(163, 333, 86, 20);
		contentPane.add(cdl);
		cdl.setColumns(10);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBackground(Color.GREEN);
		horizontalBox.setBounds(10, 71, 274, 172);
		contentPane.add(horizontalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBounds(10, 254, 274, 116);
		contentPane.add(horizontalBox_1);
		
		CurrencycomboBox = new JComboBox();
		CurrencycomboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		CurrencycomboBox.setModel(new DefaultComboBoxModel(new String[] {"US Dollar", "Euro", "Pound"}));
		CurrencycomboBox.setBounds(312, 81, 115, 20);
		contentPane.add(CurrencycomboBox);
		
		cin = new JTextField();
		cin.setText("0");
		cin.setBounds(312, 117, 115, 20);
		contentPane.add(cin);
		cin.setColumns(10);
		
		cout = new JTextField();
		cout.setText("0");
		cout.setEditable(false);
		cout.setBounds(312, 156, 115, 20);
		contentPane.add(cout);
		cout.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currencyConvert();
			}
		});
		btnConvert.setBounds(335, 199, 79, 23);
		contentPane.add(btnConvert);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setBounds(294, 71, 158, 172);
		contentPane.add(horizontalBox_2);
		
		JLabel lblSubTotal = new JLabel("Sub Total:");
		lblSubTotal.setBounds(294, 266, 62, 14);
		contentPane.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setBounds(294, 302, 46, 14);
		contentPane.add(lblTax);
		
		sbt = new JTextField();
		sbt.setText("0");
		sbt.setEditable(false);
		sbt.setBounds(366, 263, 72, 20);
		contentPane.add(sbt);
		sbt.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(294, 336, 46, 14);
		contentPane.add(lblTotal);
		
		taxf = new JTextField();
		taxf.setText("0");
		taxf.setEditable(false);
		taxf.setBounds(366, 299, 72, 20);
		contentPane.add(taxf);
		taxf.setColumns(10);
		
		tot = new JTextField();
		tot.setText("0");
		tot.setEditable(false);
		tot.setBounds(366, 333, 72, 20);
		contentPane.add(tot);
		tot.setColumns(10);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setBounds(284, 254, 168, 116);
		contentPane.add(horizontalBox_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(484, 71, 238, 299);
		contentPane.add(tabbedPane);
		
		JPanel Reciptpanel = new JPanel();
		tabbedPane.addTab("Receipt ", null, Reciptpanel, null);
		Reciptpanel.setLayout(null);
		
		RtextArea = new JTextArea();
		RtextArea.setBounds(10, 0, 223, 271);
		Reciptpanel.add(RtextArea);
		
		JPanel Calpanel = new JPanel();
		tabbedPane.addTab("Calculator", null, Calpanel, null);
		Calpanel.setLayout(null);
		
		JTextArea CalArea = new JTextArea();
		CalArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Calculator cal = new Calculator();
				cal.main(null);
			}
		});
		CalArea.setToolTipText("Press Here For The Calculator");
		CalArea.setEnabled(false);
		CalArea.setBounds(10, 0, 213, 260);
		Calpanel.add(CalArea);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				totals();
			}
		});
		btnTotal.setBounds(22, 392, 89, 23);
		contentPane.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt ");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recipt();
			}
		});
		btnReceipt.setBounds(121, 392, 89, 23);
		contentPane.add(btnReceipt);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print();
			}
		});
		btnPrint.setBounds(220, 392, 89, 23);
		contentPane.add(btnPrint);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxChikenBurger.setSelected(false);
				chckbxChikenBurgerBbq.setSelected(false);
				chckbxBeefBurger.setSelected(false);
				chckbxHomeDelivery.setSelected(false);
				chckbxTax.setSelected(false);
				
				
			 cbt.setText("0");
		     cbqt.setText("0");
			 bbt.setText("0");
			 cd.setText("0");
			 cm.setText("0");
			 cdl.setText("0");
			 cin.setText(null); 
			 cout.setText(null); 
			 sbt.setText("0");
			 taxf.setText("0");
			 tot.setText("0");
			 DrinkscomboBox.getModel().setSelectedItem("--");
			 CurrencycomboBox.getModel().setSelectedItem("--");
			 RtextArea.setText(null);
				
				
			}
		});
		btnReset.setBounds(325, 392, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(427, 392, 89, 23);
		contentPane.add(btnExit);
	}
}
