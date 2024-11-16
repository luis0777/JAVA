import java.util.ArrayList;

class Aluno{
    String nome;
    double nota;
    Aluno(){}
    Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString(){
        return nome + ": " + nota;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno("Luis", 10.0));
        alunos.add(new Aluno("Joice", 4.5));
        alunos.add(new Aluno("Felipe", 9.5));
        alunos.add(new Aluno("Carla", 4.5));

        for(Aluno a : alunos){
            System.out.println(a);
        }
    }
}
