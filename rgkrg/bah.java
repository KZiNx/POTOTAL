package rgkrg;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class bah {
    public static void main(String[] args) {
        JLabel lbNome = new JLabel("Nome");
        JLabel lbPreco = new JLabel("preco");
        JLabel lbCategoria = new JLabel("Categoria");
        JLabel lbAvaliacao = new JLabel("Avaliacao");
        JTextField txNome = new JTextField();
        JTextField txPreco = new JTextField();
        JComboBox cbCategoria = new JComboBox();
        cbCategoria.addItem("Esportes");
        cbCategoria.addItem("Infantil");
        cbCategoria.addItem("Tecnologia");
        cbCategoria.addItem("Lazer");
        cbCategoria.addItem("Cozinha");

        Object[] componentes = {lbNome,txNome,lbPreco,txPreco,lbCategoria,cbCategoria, lbAvaliacao};
        JOptionPane.showMessageDialog(null, componentes,"cadastrar produto",JOptionPane.DEFAULT_OPTION);

        Produto p = new Produto();
        p.setNome(txNome.getText());
        p.setPreco(Double.parseDouble(txPreco.getText()));
        p.setCategoria(cbCategoria.getSelectedItem());

        listaProdutos.add(p);

        JList
        JTable
        for(int i-0 ; i < listaProdutos.size();i++){
            System.out.println("\nNome: "+listaProdutos.get(i).getNome()+"\nPreco: "+listaProdutos.get(i).getPreco());
        }

        
    }
    for(Produto p: listaProdutos){
        
    }

}
