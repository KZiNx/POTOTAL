package model;

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JOptionPane;

public class TelaLogin extends JFrame {

    private JPanel contentPane;
    public JTextField tfNome;
    public JTextField tfSenha;
    public JButton btnLogar;
    private JTextArea txtrKdkd;
    private JTextArea txtrLogin;
    private ArrayList<Cliente> clientesCadastrados;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaLogin frame = new TelaLogin(new ArrayList<Cliente>());
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaLogin(ArrayList<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(202, 202, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Nome:");
        lblNewLabel.setBounds(125, 83, 46, 14);
        contentPane.add(lblNewLabel);

        tfNome = new JTextField();
        tfNome.setBounds(166, 80, 115, 20);
        contentPane.add(tfNome);
        tfNome.setColumns(10);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(125, 125, 46, 14);
        contentPane.add(lblSenha);

        tfSenha = new JTextField();
        tfSenha.setColumns(10);
        tfSenha.setBounds(166, 122, 115, 20);
        contentPane.add(tfSenha);

        btnLogar = new JButton("Logar");
        btnLogar.setBackground(new Color(128, 128, 255));
        btnLogar.setBounds(165, 153, 89, 23);
        contentPane.add(btnLogar);

        txtrKdkd = new JTextArea();
        txtrKdkd.setText("Kevin's Store");
        txtrKdkd.setFont(new Font("OCR A Extended", Font.BOLD, 15));
        txtrKdkd.setBackground(new Color(202, 202, 255));
        txtrKdkd.setBounds(147, 25, 183, 31);
        contentPane.add(txtrKdkd);

        txtrLogin = new JTextArea();
        txtrLogin.setText("Login");
        txtrLogin.setFont(new Font("OCR A Extended", Font.BOLD, 12));
        txtrLogin.setBackground(new Color(202, 202, 255));
        txtrLogin.setBounds(181, 53, 183, 31);
        contentPane.add(txtrLogin);

        btnLogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente clienteLogado = verificarLoginUsuarios();
                if (clienteLogado != null) {
                    if (clienteLogado.getCadastrado()) {
                        TelaClienteLogado telaClienteLogado = new TelaClienteLogado(clienteLogado, null); // Substitua o "null" pelo objeto Produto
                        telaClienteLogado.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(contentPane, "Login inválido.");
                    }
                } else {
                    JOptionPane.showMessageDialog(contentPane, "Login inválido.");
                }
            }
        });
    }

    Cliente verificarLoginUsuarios() {
        String nome = tfNome.getText();
        String senha = tfSenha.getText();

        for (Cliente clienteValidar : clientesCadastrados) {
            if (clienteValidar.verificarLogin(nome, senha)) {
                return clienteValidar;
            }
        }

        return null;
    }
}
