package model;
public class carrinho {

    private String compras;
/**
 * 
 * @param compras String
 */
    public void setcompras(String compras){
        if (compras.matches("[A-Za-z0-9]*") && compras.length() >= 0) {
            this.compras = compras;
        } else {
            System.out.println("compras invalido");
        }
    }
 
    public String getcompras(){
        return compras;
    }
  
    public carrinho(String compras){
        setcompras(compras);
    }
}