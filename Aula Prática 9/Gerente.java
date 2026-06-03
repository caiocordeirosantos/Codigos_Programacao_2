public class Gerente extends Funcionarios{
    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
        }

        @Override
        public double getSalario() {
            return super.getSalario() + 2000;
        }

        
}
