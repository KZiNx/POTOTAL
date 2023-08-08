package model;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.ArrayList;

public class TelaCadastroLogin extends JFrame {

    private JPanel contentPane;
    public JButton btnCadastro;
    public JButton btnLogin;
    private ArrayList<Cliente> clientesCadastrados = new ArrayList<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCadastroLogin frame = new TelaCadastroLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaCadastroLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(202, 202, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Selecione a opção");
        lblNewLabel.setBounds(171, 89, 150, 14);
        contentPane.add(lblNewLabel);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(77, 117, 89, 23);
        contentPane.add(btnLogin);

        btnCadastro = new JButton("Cadastro");
        btnCadastro.setBounds(264, 117, 89, 23);
        contentPane.add(btnCadastro);

        JTextArea txtrKdkd = new JTextArea();
        txtrKdkd.setText("Kevin's Store");
        txtrKdkd.setFont(new Font("OCR A Extended", Font.BOLD, 15));
        txtrKdkd.setBackground(new Color(202, 202, 255));
        txtrKdkd.setBounds(138, 32, 183, 31);
        contentPane.add(txtrKdkd);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaLogin telaLogin = new TelaLogin(clientesCadastrados);
                telaLogin.setVisible(true);
            }
        });

        btnCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastro telaCadastro = null;
				try {
					telaCadastro = new TelaCadastro(clientesCadastrados);
				} catch (ParseException e1) {
					
					e1.printStackTrace();
				}
                telaCadastro.setVisible(true);
            }
        });
    }
}
