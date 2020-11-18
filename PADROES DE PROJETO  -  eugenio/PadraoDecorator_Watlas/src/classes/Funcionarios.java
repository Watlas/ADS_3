/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author watla
 */
public class Funcionarios {

    String nome;
    int idade;
    double salario =2000;
    double salarioComajuste;

    public Funcionarios() {
    }

    public Funcionarios(String str) {
        String[] vetor = str.split(";");
        nome = vetor[0];
        idade = Integer.parseInt(vetor[1]);
        salario = Double.parseDouble(vetor[2]);
        salarioComajuste = Double.parseDouble(vetor[3]);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

 
    double ajuste() {
        return salario;

    }

    public double getSalarioComajuste() {
        return salarioComajuste;
    }

    public void setSalarioComajuste(double salarioComajuste) {
        this.salarioComajuste = salarioComajuste;
    }
    


    public void incluirFuncionario(Funcionarios objeto) throws Exception {
        try {

            FileWriter fw = new FileWriter("Funcionarios.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(objeto.toString()  + "\n");
            bw.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar" + erro.getMessage());
        }
    }

    public ArrayList<Funcionarios> recuperar() throws Exception {
        try {
            ArrayList<Funcionarios> listaCliente = new ArrayList<Funcionarios>();
            FileReader fr = new FileReader("Funcionarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Funcionarios Objetocliente = new Funcionarios(linha);
                listaCliente.add(Objetocliente);
            }
            br.close();
            return listaCliente;

        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao recuperar este arquivo\n" + erro);

        }

    }

    public void alterarFun(Funcionarios objetoNovo) throws Exception {
        try {
            ArrayList<Funcionarios> listaEditora = recuperar();

            FileWriter fw = new FileWriter("Funcionarios.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int pos = 0; pos < listaEditora.size(); pos++) {
                Funcionarios aux = listaEditora.get(pos);

                if (aux.getNome()== objetoNovo.getNome()) {
                    bw.write(objetoNovo.toString() + "\n");
                } else {
                    bw.write(aux.toString() + "\n");
                }
            }
            bw.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na alteração!" + erro.getMessage());
        }
    }
        @Override
    public String toString() {
        return nome + ";" + idade + ";" + salario + ";" + salarioComajuste+";";
    }


}
