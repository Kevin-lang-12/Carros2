package Data;

import Conexao_Principal.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MotoDAO {
    private Conexao conexao;  
    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public MotoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public Moto getMotoNome(String produtoescolhido) {
        String sql = "SELECT * FROM motosv WHERE produto LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produtoescolhido);
            ResultSet rs = stmt.executeQuery();
            Moto moto = new Moto();
            rs.next();
            moto.setProduto(rs.getString("produto"));
            return moto;
//tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }    
}