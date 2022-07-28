package models;

import entities.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoModel {

    public Connection connect(String url) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    public void create(Produto p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Iniciando a transação");
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            System.out.println("Produto criado com sucesso !!!");
        } catch (Exception e) {
            em.close();
            System.err.println("Erro ao criar o produto !!!" + e.getMessage());
        } finally {
            em.close();
            System.out.println("Finalizando a transação");
        }
    }

    public void update(Produto p) {
       // String url = "database_admin.db";



        //String sql = "UPDATE cliente SET name=?, idade=? WHERE id=?";

        //try (Connection conn = this.connect(url); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //pstmt.setString(1, name);
            //pstmt.setInt(2, idade);
            //pstmt.setInt(3, id);
            //pstmt.executeUpdate();
       // } catch (SQLException e) {
            //System.out.println(e.getMessage());
        //}
    }

    public void delete(Produto p) {
        //TODO
    }

    public Produto findById(Produto p) {
        //TODO
        return null;
    }

    public List<Produto> findAll() {

        List<Produto> produtos = new ArrayList<Produto>();
        //TODO
        return produtos;
    }

}