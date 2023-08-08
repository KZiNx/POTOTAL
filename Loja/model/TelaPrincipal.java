package model;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

public class TelaPrincipal extends JFrame {

    private JPanel contentPane;
    public JButton btnCadastroLogin;
    public JButton btnClienteLogado;
    private ArrayList<Cliente> clientesCadastrados;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaPrincipal frame = new TelaPrincipal(new ArrayList<Cliente>());
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaPrincipal(ArrayList<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(202, 202, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextArea txtrKevinStore = new JTextArea();
        txtrKevinStore.setFont(new Font("OCR A Extended", Font.BOLD, 15));
        txtrKevinStore.setBackground(new Color(202, 202, 255));
        txtrKevinStore.setText("Kevin's Store");
        txtrKevinStore.setBounds(156, 32, 138, 31);
        contentPane.add(txtrKevinStore);

        btnCadastroLogin = new JButton("Cadastro/Login");
        btnCadastroLogin.setBounds(143, 117, 150, 23);
        contentPane.add(btnCadastroLogin);

        btnClienteLogado = new JButton("Cliente Logado");
        btnClienteLogado.setBounds(143, 151, 150, 23);
        contentPane.add(btnClienteLogado);

        btnCadastroLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastroLogin telaCadastroLogin = new TelaCadastroLogin();
                telaCadastroLogin.setVisible(true);
            }
        });

        btnClienteLogado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaClienteLogado telaClienteLogado = new TelaClienteLogado(clientesCadastrados.get(0), null); // Substitua o "null" pelo objeto Produto
                telaClienteLogado.setVisible(true);
            }
        });
    }
}
