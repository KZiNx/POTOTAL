package model;
public class carrinho {

    private String compras;
/**
 * 
 * @param compras (String)
 */
    public void setCompras(String compras){
        if (compras.matches("[A-Za-z0-9]*") && compras.length() >= 0) {
            this.compras = compras;
        } else {
            System.out.println("compras invalido");
        }
    }
 /**
  * 
  * @return (String)
  */
    public String getCompras(){
        return compras;
    }
  /**
   * 
   * @param compras (String)
   */
    public carrinho(String compras){
        setCompras(compras);
    }
}