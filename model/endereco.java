

public class endereco {

    private String local;

    /**
     * 
     * @param local (String)
     */
    public void setEndereco(String local) {
        if (local.matches("[A-Za-z0-9]*") && local.length() >= 5) {
            this.local = local;
        } else {
            System.out.println("local invalido");
        }
    }

    /**
     * 
     * @return (String)
     */
    public String getEndereco() {
        return local;
    }

    /**
     * 
     * @param local (String)
     */
    public endereco(String local) {
        setEndereco(local);
    }
}