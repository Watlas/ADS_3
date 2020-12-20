package br.com.torrentz.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static Connection conn = null;
    private static Conexao conexao = null;

    private Conexao() throws Exception {
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://srv-ubuntu:5432/db-torrentz";
        String user = "postgres";
        String password = "root";
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
    }

    public static Connection getConexao() throws Exception {
        try {
            if (conexao == null) {
                conexao = new Conexao();
            }
            return conn;
        } catch (Exception e) {
            throw e;
        }
    }
}
