package one.digitalinnovation.pilha;

public class Pilha {

    private No noTopo;

    public Pilha(){
        this.noTopo = null;
    }


    public void push(No novoNo){
        No noAux = noTopo;
        noTopo = novoNo;
        noTopo.setProxNo(noAux);

    }

    public No pop(){

        if(!isEmpty()){
            No noPoped = noTopo;
            noTopo = noTopo.getProxNo();
            return noPoped;
        }

        return null;
    }

    public No top(){
        return noTopo;
    }

    public boolean isEmpty(){
        return noTopo == null;
    }


    @Override
    public String toString() {

        String stringRetorno = "----------\n  PILHA\n----------\n";

        No noAux = noTopo;

        while(true){
            if(noAux != null){
                stringRetorno += noAux.toString() + "\n";
                noAux = noAux.getProxNo();
            } else {
                break;
            }
        }

        return stringRetorno;
    }
}
