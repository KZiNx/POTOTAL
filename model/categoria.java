package model;
public class categoria {

    private String categorias;

    public void setcategorias(String categorias){
        if (categorias.matches("*") ) {
            this.categorias = categorias;
        } else {
            System.out.println("categorias invalido");
        }
    }
 
    public String getcategorias(){
        return categorias;
    }
  
    public categoria(String categorias){
        setcategorias(categorias);
    }
}