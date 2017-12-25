package InstituicaoPACK;

/**
 *
 * @author Eddie
 */
public class Aluno {
    
    String nome;
    int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    
    public void mostrarAluno() {
        System.out.println("Aluno: "+ nome + " Matricula: " + matricula);
    }

   
    
}
