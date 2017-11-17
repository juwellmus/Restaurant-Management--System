package Restaurant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;

public class Restaurants {

	private JFrame frame;
	private JTextField jtxtChickenBurger;
	private JTextField jtxtChickenBurgerMeal;
	private JTextField jtxtCheeseBurger;
	private JTextField jtxtQty;
	private JTextField jtxtConvert;

	
	
	double Nigerian_Naira = 302.96;
	double US_Dollar = 1.52;
	double Kenyan_Shilling = 156.21;
	double Brazilian_Real = 5.86;
	double Canadian_Dollar = 2.03;
	double Indian_Rupee = 100.68;
	double Philippine_Peso = 71.74;
	double Indonesian_Rupiah = 20746.75;
	protected JLabel jlblConvert;
	private JTextField jtxtConversion;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
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
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 93, 691, 238);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenBurger.setBounds(24, 24, 167, 29);
		panel.add(lblChickenBurger);
		
		JLabel label = new JLabel("Chicken Burger Meal");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(24, 64, 225, 29);
		panel.add(label);
		
		JLabel lblCheese = new JLabel("Cheese Burger");
		lblCheese.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCheese.setBounds(24, 104, 201, 29);
		panel.add(lblCheese);
		
		jtxtChickenBurger = new JTextField();
		jtxtChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtChickenBurger.setBounds(448, 29, 212, 29);
		panel.add(jtxtChickenBurger);
		jtxtChickenBurger.setColumns(10);
		
		jtxtChickenBurgerMeal = new JTextField();
		jtxtChickenBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtChickenBurgerMeal.setColumns(10);
		jtxtChickenBurgerMeal.setBounds(448, 69, 212, 29);
		panel.add(jtxtChickenBurgerMeal);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDrink.setBounds(24, 145, 96, 29);
		panel.add(lblDrink);
		
		JComboBox jCmbDrink = new JComboBox();
		jCmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice ", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		jCmbDrink.setBounds(24, 174, 134, 23);
		panel.add(jCmbDrink);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setBounds(23, 204, 134, 23);
		panel.add(chckbxHomeDelivery);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblQty.setBounds(448, 145, 96, 29);
		panel.add(lblQty);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setBounds(277, 204, 97, 23);
		panel.add(chckbxTax);
		
		jtxtCheeseBurger = new JTextField();
		jtxtCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtCheeseBurger.setColumns(10);
		jtxtCheeseBurger.setBounds(448, 109, 212, 29);
		panel.add(jtxtCheeseBurger);
		
		jtxtQty = new JTextField();
		jtxtQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(448, 181, 212, 29);
		panel.add(jtxtQty);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 144, 636, 2);
		panel.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(10, 342, 691, 155);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblOostOfDelivery = new JLabel("Cost of Delivery");
		lblOostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblOostOfDelivery.setBounds(20, 106, 201, 29);
		panel_2.add(lblOostOfDelivery);
		
		JLabel lblCostOfMeals = new JLabel("Cost of Meals");
		lblCostOfMeals.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfMeals.setBounds(22, 64, 225, 29);
		panel_2.add(lblCostOfMeals);
		
		JLabel jlblCostOfDrinks = new JLabel("Cost of Drinks");
		jlblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDrinks.setBounds(20, 24, 167, 29);
		panel_2.add(jlblCostOfDrinks);
		
		JLabel jlblCostOfDrink = new JLabel("");
		jlblCostOfDrink.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDrink.setBounds(467, 24, 201, 29);
		jlblCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(jlblCostOfDrink);
		
		JLabel jlblCostOfMeal = new JLabel("");
		jlblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfMeal.setBounds(467, 64, 201, 29);
		panel_2.add(jlblCostOfMeal);
		
		JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery.setBounds(467, 106, 201, 29);
		panel_2.add(jlblCostOfDelivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(711, 342, 631, 155);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(462, 24, 137, 29);
		panel_3.add(jlblTax);
		
		JLabel jlblSubTotal = new JLabel("");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblSubTotal.setBounds(462, 64, 137, 29);
		panel_3.add(jlblSubTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(462, 104, 137, 29);
		panel_3.add(jlblTotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBounds(21, 24, 102, 29);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSubTotal.setBounds(21, 64, 102, 29);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBounds(21, 104, 102, 29);
		panel_3.add(lblTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(711, 93, 631, 238);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One..", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "phillipine", "India"}));
		jcmbCurrency.setBounds(140, 63, 319, 23);
		panel_4.add(jcmbCurrency);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(198, 97, 212, 42);
		panel_4.add(jtxtConvert);
		
		JLabel jlblConvert = new JLabel("");
		jlblConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jlblConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblConvert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblConvert.setBounds(198, 150, 212, 29);
		panel_4.add(jlblConvert);
		
		JButton jBtnConvert = new JButton("Convert");
		jBtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double British_Pound = Double.parseDouble(jtxtConvert.getText());
				if(jcmbCurrency.getSelectedItem().equals("Nigeria"));
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Nigerian_Naira);
					jlblConvert.setText(cConvert1);
					
				}
				
				if(jcmbCurrency.getSelectedItem().equals("USA"));
				{
					String cConvert1 = String.format("$ %.2f", British_Pound * US_Dollar);
					jlblConvert.setText(cConvert1);
					
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Kenyan"));
				{
					String cConvert1 = String.format("KS %.2f", British_Pound * Kenyan_Shilling);
					jlblConvert.setText(cConvert1);
					
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Canada"));
				{
					String cConvert1 = String.format("C$ %.2f", British_Pound * Canadian_Dollar);
					jlblConvert.setText(cConvert1);
					
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Brazil"));
				{
					String cConvert1 = String.format("Bra %.2f", British_Pound * Brazilian_Real);
					jlblConvert.setText(cConvert1);
					
				}
				
				if(jcmbCurrency.getSelectedItem().equals("India"));
				{
					String cConvert1 = String.format("INR %.2f", British_Pound * Indian_Rupee);
					jlblConvert.setText(cConvert1);
					
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Philippine"));
				{
					String cConvert1 = String.format("PHP %.2f", British_Pound * Philippine_Peso);
					jlblConvert.setText(cConvert1);
					
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Indonesia"));
				{
					String cConvert1 = String.format("IDR %.2f", British_Pound * Indonesian_Rupiah);
					jlblConvert.setText(cConvert1);
					
				}
				
				
			}
		});
		jBtnConvert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBtnConvert.setBounds(173, 190, 103, 37);
		panel_4.add(jBtnConvert);
		
		JButton jBtnclose = new JButton("Close");
		jBtnclose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblConvert.setText(null);
				jtxtConvert.setText(null);
				jcmbCurrency.setSelectedItem("Choose One..");
			}
		});
		jBtnclose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBtnclose.setBounds(337, 190, 89, 37);
		panel_4.add(jBtnclose);
		
		JLabel lblNewLabel_1 = new JLabel("Currency Convert");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(212, 22, 178, 31);
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(10, 522, 1342, 117);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton jBtnTotal = new JButton("Total");
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChicBurger = Double.parseDouble(jtxtChickenBurger.getText());
				double iChicBurger = 2.39;
				double Burger;
				Burger = (ChicBurger * iChicBurger);
				String pMeal = String.format("%.2f", Burger);
				jlblCostOfMeal.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(jtxtChickenBurgerMeal.getText());
				double iChicBurgerMeal = 4.39;
				double BurgerMeal;
				BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal);
				String cbMeal = String.format("%.2f", BurgerMeal + Burger);
				jlblCostOfMeal.setText(cbMeal);
				
				double CheeseBurger = Double.parseDouble(jtxtCheeseBurger.getText());
				double iCheeseBurgerPrice = 3.39;
				double CheeseBurgerMeal;
				CheeseBurgerMeal = (CheeseBurger * iCheeseBurgerPrice);
				String Cheese = String.format("%.2f",CheeseBurgerMeal + BurgerMeal + Burger);
				jlblCostOfMeal.setText(Cheese);
				
				//-------------------Home Delivery-------------------------------
				
				double iDelivery = 3.39;
				if(chckbxHomeDelivery.isSelected()){
					
					String pDelivery = String.format("%.2f", iDelivery);
					jlblCostOfDelivery.setText(pDelivery);
				}
				
				else{
					
					jlblCostOfDelivery.setText("0");
					
				}
				
				//======================Drinks======================================
				
				
				double Drinks = Double.parseDouble(jtxtQty.getText());
				double Tea = 1.2 * Drinks;
				double Ice_Tea = 0.90 * Drinks;
				double Coffee =2.50 * Drinks;
				double Ice_Coffee = 1.10 * Drinks;
				double Cola = 2.10 * Drinks;
				double Coke = 1.60 * Drinks;
				double Orange = 1.70 * Drinks;
				double Apple_Juice = 1.99 * Drinks;
				
				if(jCmbDrink.getSelectedItem().equals("Apple Juice"));
				{
					String cApple_Juice = String.format("%.2f", Apple_Juice);
					jlblCostOfDrink.setText( cApple_Juice);
				}
				
				if(jCmbDrink.getSelectedItem().equals("Tea"));
				{
					String cTea = String.format("%.2f", Tea);
					jlblCostOfDrinks.setText(cTea);
				}
				
				if(jCmbDrink.getSelectedItem().equals("Ice Tea"));
				{
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					jlblCostOfDrinks.setText(cIce_Tea);
				}
				
				if(jCmbDrink.getSelectedItem().equals("Coke"));
				{
					String cCoke = String.format("%.2f", Coke);
					jlblCostOfDrinks.setText(cCoke);
				}
				
				if(jCmbDrink.getSelectedItem().equals("Cola"));
				{
					String cCola = String.format("%.2f", Cola);
					jlblCostOfDrinks.setText(cCola);
				}
				
				if(jCmbDrink.getSelectedItem().equals("Orange"));
				{
					String cOrange = String.format("%.2f", Orange);
					jlblCostOfDrinks.setText(cOrange);
				}
				
				if(jCmbDrink.getSelectedItem().equals("Coffee"));
				{
					String cCoffee = String.format("%.2f", Coffee);
					jlblCostOfDrinks.setText(cCoffee);
				}
				
				if(jCmbDrink.getSelectedItem().equals("Ice Coffee"));
				{
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					jlblCostOfDrinks.setText(cIce_Coffee);
				}
				
				if(jCmbDrink.getSelectedItem().equals("Select a Drink"));
				{
				jlblCostOfDrinks.setText("0");
				}
				
				//========================Tax Rate==========================
				
				double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
				double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
				double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3)/100;
				
				if(chckbxTax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					jlblTax.setText(iTotal);
				}
				
				//==========================Total================================
				
				double cTotal4 = Double.parseDouble(jlblTax.getText());
				
				double SubTotal = (cTotal1 + cTotal2 + cTotal3);
				String iSubTotal = String.format("%.2f", SubTotal);
				jlblSubTotal.setText(iSubTotal);
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String iTotal = String.format("%.2f", allTotal);
				jlblTotal.setText(iTotal);
				
				String iTaxTotal = String.format("%.2f", cTotal4);
				jlblTax.setText(iTaxTotal);
				
			}  
		});
		jBtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBtnTotal.setBounds(415, 52, 89, 23);
		panel_5.add(jBtnTotal);
		
		JButton jBtnReset = new JButton("Reset");
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				jlblCostOfDelivery.setText(null);
				jlblSubTotal.setText(null);
				jlblTotal.setText(null);
				jlblTax.setText(null);
				jlblConvert.setText(null);
				jlblCostOfDelivery.setText(null);
				jlblCostOfDrink.setText(null);
				jlblCostOfMeal.setText(null);
				jlblCostOfDelivery.setText(null);
				jlblCostOfDelivery.setText(null);
				jlblSubTotal.setText(null);
				jlblTotal.setText(null);
				jlblTax.setText(null);
				jtxtChickenBurger.setText(null);
				jtxtChickenBurgerMeal.setText(null);
				jtxtCheeseBurger.setText(null);
				jtxtQty.setText(null);
				jtxtConvert.setText(null);
				jCmbDrink.setSelectedItem("Select a Drink");
				jcmbCurrency.setSelectedItem("Choose One..");
				

				
				
			}
		});
		jBtnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBtnReset.setBounds(640, 52, 89, 23);
		panel_5.add(jBtnReset);
		
		JButton jBtnExist = new JButton("Exist");
		jBtnExist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jBtnExist.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBtnExist.setBounds(858, 52, 89, 23);
		panel_5.add(jBtnExist);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(254, 11, 894, 81);
		frame.getContentPane().add(lblNewLabel);
	}
}
