public class Aluno {
    public String nome;
    public void inserirNome(String nome){
        this.nome = nome;
    }
    public String recuperarNome(){
        return nome;
    }
    public static void main(String[] args){
        Aluno a = new Aluno();
        a.inserirNome("Arthur");
        System.out.printf("O nome do aluno é: %s", a.recuperarNome());
    }
}
