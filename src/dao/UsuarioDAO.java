package dao;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
//import java.util.ArrayList;
//import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    String tametirando;
    private Connection connection;
    Long id;
    String login;
    String senha;
    String nome;
    String cpf;
    String email;
    String telefone;
    public String oxe = "mano vai pra merda";
    public UsuarioDAO(){
        String oxe;
//        Connection con = ConnectionFactory.getConnection();
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(login,senha,nome,cpf,email,telefone) VALUES(?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getNome());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getEmail());
            stmt.setString(6, usuario.getTelefone());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 

/*    public boolean exportName(String nome) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = connection.prepareStatement("SELECT * FROM usuario WHERE nome = ?");
            stmt.setString(1, nome);

            rs = stmt.executeQuery();
            this.nome = nome;
            if (rs.next()) {
            nome = rs.getString("nome");
            System.out.println(nome);
            check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);
        }

        return check;

    } */
   
    
    public boolean checkLogin(String login, String senha) {

//        Connection con = ConnectionFactory.getConnection();
//        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String oi;
        boolean check = false;

        try {

            stmt = connection.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                oi = rs.getString("nome");
                oxe = oi;
                check = true;
            }
            else {
                System.out.println("Erro ao catar essa bagaça");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);
        }
        
        return check;

    }

   
    public class Function{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetopizza","root","");
           ps = con.prepareStatement("select * from users where id = ?");
           ps.setString(1,s);
           rs = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
       }
    
}
}