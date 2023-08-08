package model;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame {

    private JPanel contentPane;
    private JTextField tfNome;
    private JTextField tfEmail;
    private JTextField tfDataDeNascimento;
    private JTextField tfSenha;
    private JTextField tfConfirmarSenha;
    private JTextField tfCPF;

    public JButton btnCadastrar;
    private JFormattedTextField tfTelefone;
    private ArrayList<Cliente> clientesCadastrados;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCadastro frame = new TelaCadastro(new ArrayList<>());
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaCadastro(ArrayList<Cliente> clientesCadastrados) throws ParseException {
        this.clientesCadastrados = clientesCadastrados;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(202, 202, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Nome:");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBounds(10, 69, 46, 14);
        contentPane.add(lblNewLabel);

        tfNome = new JTextField();
        tfNome.setBounds(57, 66, 86, 20);
        contentPane.add(tfNome);
        tfNome.setColumns(10);

        tfEmail = new JTextField();
        tfEmail.setBounds(57, 128, 86, 20);
        contentPane.add(tfEmail);
        tfEmail.setColumns(10);

        tfDataDeNascimento = new JTextField();
        tfDataDeNascimento.setBounds(108, 155, 86, 20);
        contentPane.add(tfDataDeNascimento);
        tfDataDeNascimento.setColumns(10);

        tfSenha = new JTextField();
        tfSenha.setBounds(99, 180, 86, 20);
        contentPane.add(tfSenha);
        tfSenha.setColumns(10);

        tfConfirmarSenha = new JTextField();
        tfConfirmarSenha.setColumns(10);
        tfConfirmarSenha.setBounds(99, 204, 86, 20);
        contentPane.add(tfConfirmarSenha);

        tfCPF = new JTextField();
        tfCPF.setColumns(10);
        tfCPF.setBounds(99, 235, 86, 20);
        contentPane.add(tfCPF);

        MaskFormatter mascaraTelefone = new MaskFormatter("'(##')' #####'-####");
        tfTelefone = new JFormattedTextField(mascaraTelefone);
        tfTelefone.setBounds(87, 97, 98, 23);
        contentPane.add(tfTelefone);

        JTextArea txtr = new JTextArea();
        txtr.setBackground(new Color(202, 202, 255));
        txtr.setFont(new Font("OCR A Extended", Font.BOLD, 15));
        txtr.setText("Kevin's Store");
        txtr.setBounds(145, 28, 183, 31);
        contentPane.add(txtr);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente clienteCadastrado = cadastrar();
                if (clienteCadastrado != null && clienteCadastrado.getCadastrado()) {
                    JOptionPane.showMessageDialog(contentPane, "Cadastro realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(contentPane, "Erro no cadastro.");
                }
            }
        });
        btnCadastrar.setBounds(279, 237, 89, 23);
        contentPane.add(btnCadastrar);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setForeground(Color.BLACK);
        lblTelefone.setBounds(10, 98, 67, 14);
        contentPane.add(lblTelefone);
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setForeground(Color.BLACK);
        lblEmail.setBounds(10, 131, 46, 14);
        contentPane.add(lblEmail);
        
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setForeground(Color.BLACK);
        lblSenha.setBounds(57, 155, 46, 14);
        contentPane.add(lblSenha);
        
        JLabel lblConfirmeASenha = new JLabel("Confirme a senha:");
        lblConfirmeASenha.setForeground(Color.BLACK);
        lblConfirmeASenha.setBounds(10, 183, 93, 14);
        contentPane.add(lblConfirmeASenha);
        
        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setForeground(Color.BLACK);
        lblCPF.setBounds(43, 207, 46, 14);
        contentPane.add(lblCPF);
        
        JLabel lblDataNascimento = new JLabel("Data nascimento:");
        lblDataNascimento.setForeground(Color.BLACK);
        lblDataNascimento.setBounds(0, 235, 89, 20);
        contentPane.add(lblDataNascimento);
    }

    private Cliente cadastrar() {
        String nome = tfNome.getText();
        String telefone = tfTelefone.getText();
        String email = tfEmail.getText();
        String senha = tfSenha.getText();
        String confSenha = tfConfirmarSenha.getText();
        String cpf = tfCPF.getText();
        String dataNascimento = tfDataDeNascimento.getText();

        Cliente cliente = new Cliente(nome, cpf, dataNascimento, email, nome, senha);

        String callback = validarCadastro(nome, telefone, email, senha, confSenha, cpf, dataNascimento);

        if (callback.equals("cadastrado")) {
            cliente.adicionarTelefone(telefone);
            cliente.setCadastrado(true);
            cliente.criarCarrinho();
        } else {
            JOptionPane.showMessageDialog(btnCadastrar, callback);
        }

        return cliente;
    }

    private String validarCadastro(String nome, String telefone, String email, String senha, String confSenha, String cpf, String dataNascimento) {
        Cliente clienteAux = new Cliente(nome, cpf, dataNascimento, email, nome, senha);

        if (nome.isEmpty() || !nome.matches("[A-Za-z]+")) {
            return "Nome inválido";
        }

        if (telefone.isEmpty() || !telefone.matches("'\\d{2}' '\\d{5}'-\\d{4}")) {
            return "Telefone inválido!";
        }

        if (email.isEmpty() || !email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")) {
            return "Email inválido";
        }

        if (!senha.equals(confSenha)) {
            return "As senhas não coincidem";
        }

        if (senha.isEmpty() || !senha.equals("123")) {
            return "Senha inválida";
        }

        if (cpf.isEmpty() || !cpf.matches("[0-9]{11}")) {
            return "CPF inválido";
        }

        if (dataNascimento.isEmpty() || !dataNascimento.matches("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$")) {
            return "Data de nascimento inválida";
        }

        return "cadastrado";
    }
}
