/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

/**
 *
 * @author mochs
 */
   import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.product.Product;

public class ProductDAO {
  public static List<Product> getAllProducts() throws SQLException {
    Connection connection = DatabaseConnector.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products");
    ResultSet resultSet = preparedStatement.executeQuery();

    List<Product> products = new ArrayList<>();
    while (resultSet.next()) {
      product.setId(resultSet.getInt("id"));
      product.setName(resultSet.getString("name"));
      product.setPrice(resultSet.getDouble("price"));
      product.setDescription(resultSet.getString("description"));
      product.setImage(resultSet.getBytes("image"));
    }

    return products;
  }

  public static Product getProductById(int id) throws SQLException {
    Connection connection = DatabaseConnector.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE id = ?");
    preparedStatement.setInt(1, id);
    ResultSet resultSet = preparedStatement.executeQuery();

    if (resultSet.next; 
