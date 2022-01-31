package one.digitalinnovation.pilha;

public class Main {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);

        pilha.push(no1);
        pilha.push(no2);
        pilha.push(no3);
        pilha.push(no4);
        pilha.push(no5);
        pilha.push(no6);

        System.out.println(pilha);

        System.out.println(pilha.pop());

        System.out.println(pilha);

    }

}
