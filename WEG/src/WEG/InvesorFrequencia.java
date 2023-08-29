package WEG;

public class InvesorFrequencia extends ProdutoWEG {

    private double capacidadeFrequencia;
    private int numeroFases;

    /**
     * Construtor da classe InversorFrequencia.
     * 
     * @param codigo             O código do inversor de frequência.
     * @param tipo               O tipo do inversor de frequência.
     * @param preco              O preço do inversor de frequência.
     * @param potencia           A potência do inversor de frequência.
     * @param tensao             A tensão do inversor de frequência.
     * @param capacidade         A capacidade do inversor de frequência.
     * @param capacidadeFrequencia A capacidade de frequência do inversor de frequência.
     * @param numeroFases        O número de fases do inversor de frequência.
     */
    public InvesorFrequencia(String codigo, String tipo, double preco, int potencia, int tensao, double capacidade,
            double capacidadeFrequencia, int numeroFases) {
        super(codigo, tipo, preco, potencia, tensao, capacidade);
        this.capacidadeFrequencia = capacidadeFrequencia;
        this.numeroFases = numeroFases;
    }

    /**
     * Retorna a capacidade de frequência do inversor de frequência.
     * 
     * @return A capacidade de frequência do inversor de frequência.
     */
    public double getCapacidadeFrequencia() {
        return capacidadeFrequencia;
    }

    /**
     * Define a capacidade de frequência do inversor de frequência.
     * 
     * @param capacidadeFrequencia A nova capacidade de frequência do inversor de frequência.
     */
    public void setCapacidadeFrequencia(double capacidadeFrequencia) {
        this.capacidadeFrequencia = capacidadeFrequencia;
    }

    /**
     * Retorna o número de fases do inversor de frequência.
     * 
     * @return O número de fases do inversor de frequência.
     */
    public int getNumeroFases() {
        return numeroFases;
    }

    /**
     * Define o número de fases do inversor de frequência.
     * 
     * @param numeroFases O novo número de fases do inversor de frequência.
     */
    public void setNumeroFases(int numeroFases) {
        this.numeroFases = numeroFases;
    }

    /**
     * Método principal da classe InversorFrequencia (exemplo de uso).
     * 
     * @param args Os argumentos de linha de comando (não utilizados aqui).
     */
    public static void main(String[] args) {

        InvesorFrequencia inversor = new InvesorFrequencia("#789", "Inversor", 799.99, 300, 220, 200, 50.0, 3);

        System.out.println("Código: " + inversor.getCodigo());
        System.out.println("Tipo: " + inversor.getTipo());
        System.out.println("Preço: " + inversor.getPreco());
        System.out.println("Potência: " + inversor.getPotencia());
        System.out.println("Tensão: " + inversor.getTensao());
        System.out.println("Capacidade: " + inversor.getCapacidade());
        System.out.println("Capacidade de Frequência: " + inversor.getCapacidadeFrequencia());
        System.out.println("Número de Fases: " + inversor.getNumeroFases());
    }
}
