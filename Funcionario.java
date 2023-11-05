package SegundoSemestre;


public abstract class Funcionario {
    
    private int numeroCracha;
    private String nome;
    private String setor;
    private String funcao;

    public Funcionario() {
    }

    public Funcionario(int numeroCracha, String nome, String setor, String funcao) {
        this.numeroCracha = numeroCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }
public abstract double calcularSalario();


    
    
}
