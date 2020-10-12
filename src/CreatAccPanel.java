import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreatAccPanel extends JPanel {
	private JTextField accname;
	private JTextField accnmbr;
	private JTextField age;
	private JTextField address;
	private JTextField phonenmbr;
	private JTextField balance;

	public CreatAccPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel lblAccountName = new JLabel("Account name");
		lblAccountName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAccountName.setBounds(47, 36, 121, 23);
		add(lblAccountName);
		
		accname = new JTextField();
		accname.setBounds(232, 38, 186, 20);
		add(accname);
		accname.setColumns(10);
		
		JLabel lblAccountNumber = new JLabel("Account number");
		lblAccountNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAccountNumber.setBounds(47, 86, 121, 23);
		add(lblAccountNumber);
		
		accnmbr = new JTextField();
		accnmbr.setBounds(232, 88, 186, 20);
		add(accnmbr);
		accnmbr.setColumns(10);
		
		JLabel lblBirthday = new JLabel("Age");
		lblBirthday.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBirthday.setBounds(47, 130, 94, 23);
		add(lblBirthday);
		
		 age= new JTextField();
		age.setBounds(232, 132, 186, 20);
		add(age);
		age.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGender.setBounds(47, 174, 79, 23);
		add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		rdbtnMale.setBounds(232, 175, 68, 23);
		add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(350, 175, 68, 23);
		add(rdbtnFemale);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(47, 227, 79, 23);
		add(lblAddress);
		
		address = new JTextField();
		address.setBounds(232, 229, 186, 20);
		add(address);
		address.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhoneNumber.setBounds(48, 275, 93, 23);
		add(lblPhoneNumber);
		
		phonenmbr = new JTextField();
		phonenmbr.setBounds(232, 276, 186, 20);
		add(phonenmbr);
		phonenmbr.setColumns(10);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBalance.setBounds(47, 319, 79, 23);
		add(lblBalance);
		
		balance = new JTextField();
		balance.setBounds(232, 320, 186, 20);
		add(balance);
		balance.setColumns(10);
		
		JButton btnCreateNewAccount = new JButton("Create new account");
		btnCreateNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Saved");
				MainFrame.showPanel("opt");
				
			}
		});
		btnCreateNewAccount.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCreateNewAccount.setBounds(381, 367, 167, 31);
		add(btnCreateNewAccount);

	}
}
