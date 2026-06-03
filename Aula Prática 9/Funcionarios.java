import java.util.ArrayList;
import java.util.Scanner;

public class Funcionarios {
    Scanner teclado = new Scanner(System.in);
    
    public static ArrayList <Funcionarios> funcionarios = new ArrayList <> ();
    
    private String nome;
    private String cpf;
    private double salario;
    private String dataNascimento;

    public Funcionarios(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void addGerente() {
        
    }

    public void addAtendente() {
        
    }

}
