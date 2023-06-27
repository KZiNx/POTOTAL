import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNj;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
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
	public tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("texto foda");
		menuBar.add(mnNewMenu);
		
		JLabel lblNewLabel_2 = new JLabel("texto mais foda ainda");
		mnNewMenu.add(lblNewLabel_2);
		
		JMenu mnNewMenu_1 = new JMenu("novo menu");
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 51, 51));
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(73, 89, 45, 13);
		contentPane.add(lblNewLabel);
		
		txtNj = new JTextField();
		txtNj.setBounds(139, 86, 96, 19);
		contentPane.add(txtNj);
		txtNj.setColumns(10);
		
		lblNewLabel_1 = new JLabel("senha");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(73, 122, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 119, 96, 19);
		contentPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("op\u00E7\u00E3o");
		comboBox.setBounds(280, 85, 73, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Bot\u00E3o top");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(309, 210, 85, 21);
		contentPane.add(btnNewButton);
	}
}
