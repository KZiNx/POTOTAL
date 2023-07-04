package testando;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class TelaProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txPreco;
	private JTextField txCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProduto frame = new TelaProduto();
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
	public TelaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_4);

		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbNome = new JLabel("Nome:");
		lbNome.setForeground(new Color(255, 255, 255));
		lbNome.setBounds(50, 27, 46, 14);
		contentPane.add(lbNome);

		txNome = new JTextField();
		txNome.setBounds(90, 24, 86, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		// Cria um objeto JButton
		JButton btSalvar = new JButton("Salvar");
		// Cria um evento ActionListener
		btSalvar.addActionListener(new ActionListener() {
			// Método actionPerfomed
			public void actionPerformed(ActionEvent e) {
				// Ações:
				String nome = txNome.getText();
				String preco = txPreco.getText();
				String Categoria = txCategoria.getText();
				// associação entre classes Produto -> TelaProduto
				
                Produto p = new Produto();
                p.setNome(txNome.getText());
  
                p.setPreco(txPreco.getText());
              
                p.setCategoria(txCategoria.getText());


				JOptionPane.showMessageDialog(null,
						"Produto" + " Cadastrado: " + nome + "\n de Preço :" + preco + "\n da Categoria " + Categoria);
			}
		});
		btSalvar.setBounds(245, 72, 89, 23);
		contentPane.add(btSalvar);

		JLabel lbPreco = new JLabel("Preço:");
		lbPreco.setForeground(new Color(255, 255, 255));
		lbPreco.setBounds(50, 52, 46, 14);
		contentPane.add(lbPreco);

		txPreco = new JTextField();
		txPreco.setBounds(90, 49, 86, 20);
		contentPane.add(txPreco);
		txPreco.setColumns(10);

		JLabel lbCat = new JLabel("Categoria:");
		lbCat.setForeground(new Color(255, 255, 255));
		lbCat.setBackground(new Color(255, 255, 255));
		lbCat.setBounds(31, 76, 86, 14);
		contentPane.add(lbCat);

		txCategoria = new JTextField();
		txCategoria.setBounds(90, 77, 86, 20);
		contentPane.add(txCategoria);
		txCategoria.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kevin_antunes\\Downloads\\download.jfif"));
		lblNewLabel.setBounds(60, 101, 251, 127);
		contentPane.add(lblNewLabel);
	}
}
