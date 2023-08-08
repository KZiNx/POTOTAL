package model;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaProduto extends JFrame {

    private JPanel contentPane;
    private Cliente cliente;
    private Produto produto;

    public TelaProduto(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(202, 202, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblBemVindo = new JLabel("Bem-vindo, " + cliente.getNome());
        lblBemVindo.setBounds(10, 40, 414, 14);
        contentPane.add(lblBemVindo);

        JLabel lblProduto = new JLabel("Produto selecionado: " + produto.getNomePro());
        lblProduto.setBounds(10, 65, 414, 14);
        contentPane.add(lblProduto);

        JButton btnAdicionarAoCarrinho = new JButton("Adicionar ao Carrinho");
        btnAdicionarAoCarrinho.setBounds(138, 112, 158, 23);
        contentPane.add(btnAdicionarAoCarrinho);

        JButton btnVerCarrinho = new JButton("Ver Carrinho");
        btnVerCarrinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirCarrinho();
            }
        });
        btnVerCarrinho.setBounds(138, 146, 158, 23);
        contentPane.add(btnVerCarrinho);

        btnAdicionarAoCarrinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarAoCarrinho();
            }
        });
    }

    private void adicionarAoCarrinho() {
        cliente.getCarrinho().adicionarItem(produto);
        JOptionPane.showMessageDialog(contentPane, "Produto adicionado ao carrinho!");
    }

    private void exibirCarrinho() {
        Carrinho carrinho = cliente.getCarrinho();
        String mensagem = "Carrinho de " + cliente.getNome() + ":\n";

        for (ItemCarrinho item : carrinho.getItens()) {
            mensagem += item.getProduto().getNomePro() + " - R$" + item.getProduto().getPreco() + "\n";
        }

        JOptionPane.showMessageDialog(contentPane, mensagem);
    }
}
