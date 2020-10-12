import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private static JPanel contentPane;
	private static CardLayout cardLayout;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 470);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		cardLayout=new CardLayout();
		contentPane.setLayout(cardLayout);
		HomePanel homePanel=new HomePanel();
		contentPane.add(homePanel,"home");
		BankOptPanel bankOptPanel=new BankOptPanel();
		contentPane.add(bankOptPanel,"opt");
		CreatAccPanel creatAccPanel=new CreatAccPanel();
		contentPane.add(creatAccPanel,"creat");
		ViewAccountPanel viewAccountPanel=new ViewAccountPanel();
		contentPane.add(viewAccountPanel,"view");
		
//		cardLayout.show(contentPane, "home");
		showPanel("home");
	}

	public static void showPanel(String name){
		cardLayout.show(contentPane, name);
	}
}
