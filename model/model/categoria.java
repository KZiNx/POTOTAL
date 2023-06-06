package model;
public class categoria {

    private String categorias;
/**
 * 
 * @param categorias (String)
 */
    public void setCategorias(String categorias){
        if (categorias.matches("Brinquedos*") && (categorias.matches("Domesticos*") && (categorias.matches("Tecnologia*") && (categorias.matches("Moveis*")))))  {
            this.categorias = categorias;
        } else {
            System.out.println("categoria invalida/nao encontrada");
        }
    }
 /**
  * 
  * @return (String)
  */
    public String getCategorias(){
        return categorias;
    }
  /**
   * 
   * @param categorias (String)
   */
    public categoria(String categorias){
        setCategorias(categorias);
    }
}