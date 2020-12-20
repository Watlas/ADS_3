package br.com.torrentz.dal;

import br.com.torrentz.util.Conexao;
import br.com.torrentz.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContratoDal {

    private Connection conexao;

    public ContratoDal() throws Exception {
        conexao = Conexao.getConexao();
    }

    public void create(Contrato obj) {
        String sql
                = "INSERT INTO contratos(con_fim, con_inicio, con_status, "
                + "con_usu_iden, con_pla_iden) "
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Atributos simples
            ps.setObject(1, obj.getFim());
            ps.setObject(2, obj.getInicio());
            ps.setObject(3, obj.getStatus());

            //Atributos por composição
            ps.setInt(4, obj.getUsuario().getIden());
            ps.setInt(5, obj.getPlano().getIden());

            // Execute PS
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Contrato> read(int con_usu_iden) {
        List<Contrato> array = new ArrayList<>();
        String sql
                = "SELECT * "
                + "FROM contratos "
                + "WHERE con_usu_iden=?";

        try {

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, con_usu_iden);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Contrato obj = new Contrato();

                //Atributos simples
                obj.setIden(rs.getInt("con_iden"));
                obj.setFim(rs.getDate("con_fim"));
                obj.setInicio(rs.getDate("con_inicio"));
                obj.setStatus(rs.getString("con_status"));

                //Atributos por composição
                UsuarioDal usuDal = new UsuarioDal();
                Usuario usu = usuDal.readToID(rs.getInt("con_usu_iden"));
                obj.setUsuario(usu);

                PlanoDal plaDal = new PlanoDal();
                Plano pla = plaDal.readToID(rs.getInt("con_pla_iden"));
                obj.setPlano(pla);

                //Add obj in array
                array.add(obj);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return array;

    }

    public Contrato readToID(int iden) {

        Contrato obj = new Contrato();

        String sql
                = "SELECT * "
                + "FROM contratos "
                + "WHERE con_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, iden);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                //Atributos simples
                obj.setIden(rs.getInt("con_iden"));
                obj.setFim(rs.getDate("con_fim"));
                obj.setInicio(rs.getDate("con_inicio"));
                obj.setStatus(rs.getString("con_status"));

                //Atributos por composição
                UsuarioDal usuDal = new UsuarioDal();
                Usuario usu = usuDal.readToID(rs.getInt("con_usu_iden"));
                obj.setUsuario(usu);

                PlanoDal plaDal = new PlanoDal();
                Plano pla = plaDal.readToID(rs.getInt("con_pla_iden"));
                obj.setPlano(pla);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return obj;
    }

    public void update(Contrato obj) {

        String sql
                = "UPDATE contratos "
                + "SET con_fim=?, con_inicio=?, con_status=?, "
                + "con_usu_iden=?, con_pla_iden=? "
                + "WHERE con_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Atributos simples
            ps.setObject(1, obj.getFim());
            ps.setObject(2, obj.getInicio());
            ps.setObject(3, obj.getStatus());

            //Atributos por composição
            ps.setInt(4, obj.getUsuario().getIden());
            ps.setInt(5, obj.getPlano().getIden());

            //id objeto parametro parâmetro WHERE
            ps.setInt(6, obj.getIden());

            // Execute PS
            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public void delete(int iden) {

        String sql
                = "DELETE FROM contratos "
                + "WHERE con_iden=?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            // Parametro iden
            ps.setInt(1, iden);

            // Execute PS
            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
