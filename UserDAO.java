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
import jdbc.user.User;

public class UserDAO {
  public static List<User> getAllUsers() throws SQLException {
    Connection connection = DatabaseConnector.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users");
    ResultSet resultSet = preparedStatement.executeQuery();

    List<User> users = new ArrayList<>();
    while (resultSet.next()) {
      
      user.setId(resultSet.getInt("id"));
      user.setUsername(resultSet.getString("username"));
      user.setPassword(resultSet.getString("password"));
      user.setEmail(resultSet.getString("email"));
      
    }

    return users;
  }

  public static User getUserByUsernameAndPassword(String username, String password) throws SQLException {
    Connection connection = DatabaseConnector.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
    preparedStatement.setString(1, username);
    preparedStatement.setString(2, password);
    ResultSet resultSet = preparedStatement.executeQuery();

    User user = null;
    if (resultSet.next()) {
      user.setId(resultSet.getInt("id"));
      user.setUsername(resultSet.getString("username"));
      user.setPassword(resultSet.getString("password"));
      user.setEmail(resultSet.getString("email"));
    }

    return user;
  }
}

  // getters and setters


