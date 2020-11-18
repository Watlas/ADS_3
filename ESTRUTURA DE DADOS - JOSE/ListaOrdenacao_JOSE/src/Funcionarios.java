
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watla
 */
public class Funcionarios {

    private String nome;
    private int codigo;
    private double salario;

    Funcionarios(String str) {
        String[] vetor = str.split(";");
        nome = vetor[0];
        codigo = Integer.parseInt(vetor[1]);
        salario = Double.parseDouble(vetor[2]);
    }

    Funcionarios() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "" + nome + ";" + codigo + ";" + salario + ';';
    }

    //METODOS PARA GRAVExercicio3_Funcionarios 
    public void incluir(Funcionarios objeto) throws Exception {

        try {

            FileWriter fw = new FileWriter("Funcionarios.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(objeto.toString() + "\n");
            bw.close();

        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao recuperar este arquivo\n" + erro);

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

    public ArrayList<Funcionarios> ordenarNome() throws Exception {
        try {
            ArrayList<Funcionarios> lista = new ArrayList<Funcionarios>();
            FileReader fr = new FileReader("Funcionarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Funcionarios Objetocliente = new Funcionarios(linha);
                lista.add(Objetocliente);
            }
            //algoritmo de Ordenação
            for (int i = 0; i < lista.size(); i++) {
                for (int j = i; j < lista.size(); j++) {
                    if (lista.get(i).getNome().compareToIgnoreCase(lista.get(j).getNome()) >= 0) {
                        Funcionarios temp = lista.get(j);
                        lista.set(j, lista.get(i));
                        lista.set(i, temp);
                    }
                }
            }

            br.close();
            return lista;
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao recuperar este arquivo\n" + erro);

        }
    }

    public ArrayList<Funcionarios> recuperarPorSalario() throws Exception {
        try {
            ArrayList<Funcionarios> lista = new ArrayList<Funcionarios>();
            FileReader fr = new FileReader("Funcionarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Funcionarios Objetocliente = new Funcionarios(linha);
                lista.add(Objetocliente);
            }
            //algoritmo de OrdenExercicio3_Funcionarios
            for (int i = 0; i < lista.size(); i++) {
                for (int j = i; j < lista.size(); j++) {
                    if (lista.get(i).getSalario() > lista.get(j).getSalario()) {
                        Funcionarios temp = lista.get(j);
                        lista.set(j, lista.get(i));
                        lista.set(i, temp);
                    }
                }
            }
            br.close();
            return lista;
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao recuperar este arquivo\n" + erro);

        }
    }

    public ArrayList<Funcionarios> recuperarPorcodigo() throws Exception {
        try {
            ArrayList<Funcionarios> lista = new ArrayList<Funcionarios>();

            FileReader fr = new FileReader("Funcionarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Funcionarios Objetocliente = new Funcionarios(linha);
                lista.add(Objetocliente);

            }
            //algoritmo de Ordenação
            for (int i = 0; i < lista.size(); i++) {
                for (int j = i; j < lista.size(); j++) {
                    if (lista.get(i).getCodigo() < lista.get(j).getCodigo()) {
                        Funcionarios temp = lista.get(j);
                        lista.set(j, lista.get(i));
                        lista.set(i, temp);
                    }
                }
            }

            br.close();
            return lista;

        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao recuperar este arquivo\n" + erro);

        }

    }

}

