App.Java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World! \n");

        //Cria objeto Professor
        Professor professor = new Professor("Leandro", "132.142.455-55", 1200, "leandro@ufrpe.br", "4444-2222", "Java" );

        //Imprime as caracteristicas do professor
        System.out.println("Informações do professor: ");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Cpf: " + professor.getCpf());
        System.out.println("Salario: " + professor.getSalario());
        System.out.println("Email: " + professor.getEmail());
        System.out.println("Telefone: " + professor.getTelefone());
        System.out.println("Especializacao: " + professor.getEspecializacao());
    }
    
}

Professor.Java
public class Professor {

    //Atributos
    private String nome;
    private String cpf;
    private double salario;
    private String email;
    private String telefone;
    private String especializacao;

    //Construtor
    public Professor(String nome, String cpf, double salario, String email, String telefone, String especializacao){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.email = email;
        this.telefone = telefone;
        this.especializacao = especializacao;
    }

    //Metódos







    //get e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", email=" + email + ", telefone="
                + telefone + ", especializacao=" + especializacao + "]";
    }
    
}

Aluno.Java

public class Aluno {
    
}
