import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BankOptPanel extends JPanel {

	public BankOptPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.showPanel("creat");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(85, 55, 169, 40);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Accounts");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.showPanel("view");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(85, 112, 169, 40);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Deposit");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String accno=JOptionPane.showInputDialog("Enter account number:");
				String damount=JOptionPane.showInputDialog("Enter amount to deposit:");
				int depo=Integer.parseInt(damount);
			}
		});
		btnNewButton_2.setBounds(85, 170, 169, 40);
		add(btnNewButton_2);
		
		JButton btnViewAccount = new JButton("Withdraw");
		btnViewAccount.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String accno=JOptionPane.showInputDialog("Enter account number:");
				String wamount=JOptionPane.showInputDialog("Enter amount to withdraw:");
				int wthd=Integer.parseInt(wamount);
			}
		});
		btnViewAccount.setBounds(85, 232, 169, 40);
		add(btnViewAccount);
		
		JButton btnExit = new JButton("Delete Account");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String delaccno=JOptionPane.showInputDialog("Enter account number to be deleted:");
				int delacc=Integer.parseInt(delaccno);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(85, 293, 169, 40);
		add(btnExit);
		
		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit_1.setBounds(85, 351, 169, 40);
		add(btnExit_1);

	}

}
