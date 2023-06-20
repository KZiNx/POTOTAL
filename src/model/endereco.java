package model;
public class endereco {

    private String local;
	public endereco setEndereco;

    /**
     * 
     * @param local (String)
     */
    public void setEndereco(String local) {
        if (local.matches("[A-Z a-z 0-9]*") && local.length() >= 5) {
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

	public void setEndereco(endereco endereco) {
		// TODO Auto-generated method stub
		
	}
}