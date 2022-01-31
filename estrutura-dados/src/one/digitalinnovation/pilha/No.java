package one.digitalinnovation.pilha;

public class No {

    private int dado;
    private No proxNo;

    public No(int dado) {
        this.dado = dado;
    }

    public No() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProxNo() {
        return proxNo;
    }

    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
