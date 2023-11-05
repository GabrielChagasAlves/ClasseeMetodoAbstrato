
package SegundoSemestre;

public class FuncionarioMensalista extends Funcionario{
    double salario;
    double desconto;
    
    public FuncionarioMensalista() {
    }
        public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario, double desconto) {
          super(numeroCracha, nome, setor, funcao);
            salario = salario;
            desconto = desconto;
        }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularSalario() {
        return salario - desconto;
    }
    @Override
    public String toString() {
        return "\nFuncionarioMensalista{" +
                "\nnumeroCracha=" + getNumeroCracha()+
                ", \nnome='" + getNome()+
                ", \nsetor='" + getSetor()+
                ", \nfuncao='" +getFuncao()+
                ", \nSalario=" + salario +
                ", \nDesconto=" + desconto +
                ", \nCalculoSalario=" + calcularSalario()+
                "\n}";
    }
        
    }

