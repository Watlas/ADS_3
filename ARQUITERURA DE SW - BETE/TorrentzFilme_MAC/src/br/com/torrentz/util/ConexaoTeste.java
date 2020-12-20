package br.com.torrentz.util;

import java.sql.Connection;

public class ConexaoTeste {

    public static void main(String[] args) throws Exception {

        Connection c1;
        Connection c2;
        Connection c3;
        
        c1 = Conexao.getConexao();
        c2 = Conexao.getConexao();
        c3 = Conexao.getConexao();
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
