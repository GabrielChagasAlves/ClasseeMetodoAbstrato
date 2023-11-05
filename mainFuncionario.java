
package SegundoSemestre;

import java.util.ArrayList;
import java.util.Scanner;

public class mainFuncionario {
    public static void main(String[] args) {
        int opt;
        int optFunc;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarioHorista funcHor;
        FuncionarioMensalista fucMens;
        Scanner sc =new Scanner(System.in);
        
        do {
            System.out.println("\n1- Cadastrar Funcionarios\n2- Mostar Funcionarios\n3- Sair");
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("Qual funcionario deseja?: \n1- Funcionario Horista \n2- Funcionario Mensalista");
                    optFunc = sc.nextInt();
                    if (optFunc == 1 ) {
                        funcHor = new funcionarioHorista();
                        System.out.println("Numero do Cracha: \n");
                        funcHor.setNumeroCracha(sc.nextInt());
                        
                        
                        System.out.println("Nome: \n");
                        funcHor.setNome(sc.next());
                        
                        System.out.println("Setor: \n");
                        funcHor.setSetor(sc.next());
                        
                        System.out.println("Funcao: \n");
                        funcHor.setFuncao(sc.next());
                        
                        System.out.println("Quantidade de Horas: \n");
                        funcHor.setQtdeHoras(sc.nextInt());
                        
                        System.out.println("Valor das Horas: \n");
                        funcHor.setValorHora(sc.nextDouble());
                        Funcionario.add(funcHor);
                        opt = 0;
                    }else if (optFunc == 2 ) {
                        fucMens = new FuncionarioMensalista();
                        System.out.println("Numero do Cracha: \n");
                        fucMens.setNumeroCracha(sc.nextInt());
                        
                        System.out.println("Nome: \n");
                        fucMens.setNome(sc.next());
                        
                        System.out.println("Setor: \n");
                        fucMens.setSetor(sc.next());
                        
                        System.out.println("Funcao: \n");
                        fucMens.setFuncao(sc.next());
                        
                        System.out.println("Salario: \n");
                        fucMens.setSalario(sc.nextDouble());
                        
                        System.out.println("Desconto: \n");
                        fucMens.setDesconto(sc.nextDouble());
                        
                        Funcionario.add(FuncionarioMensalista);
                        opt = 0               
                    }
                }
                case 2 -> {
                    for (Funcionario funcs: Funcionario) {
                        System.out.println(funcs.toString());
                    }
                }
            }
        }while (opt != 3);
    
      }
}
