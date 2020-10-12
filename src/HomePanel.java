import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Scanner;

public class HomePanel extends JPanel {
	private JTextField username;
	private JPasswordField password;
	private Scanner f;
	private String a, b;

	public HomePanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Bank management system");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(143, 11, 307, 53);
		add(lblNewLabel);

		JLabel lblAdministration = new JLabel("Administration");
		lblAdministration.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAdministration.setBounds(209, 73, 175, 29);
		add(lblAdministration);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserName.setBounds(72, 152, 86, 29);
		add(lblUserName);

		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.BOLD, 12));
		username.setBounds(191, 157, 168, 20);
		add(username);
		username.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(72, 220, 70, 14);
		add(lblPassword);

		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.BOLD, 12));
		password.setBounds(191, 218, 168, 20);
		add(password);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					f = new Scanner(new File("User.txt"));

				} catch (Exception e) {
					System.out.println("No file found.");
				}
				while (f.hasNext()) {
					a = f.next();
					b = f.next();
					//System.out.printf("%s %s", a, b);
				}

				if (username.getText().equals(a) && new String(password.getPassword()).equals(b)) {
					JOptionPane.showMessageDialog(null, "Correct username & password");
					MainFrame.showPanel("opt");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect");
					username.setText(null);
					password.setText(null);
				}
				 f.close();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.setBounds(361, 300, 89, 23);
		add(btnLogin);

	}
}
