package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static jm.task.core.jdbc.util.Util.connection;
import static jm.task.core.jdbc.util.Util.getConnection;

public class UserDaoJDBCImpl {
    Statement statement = connection.createStatement();
    public UserDaoJDBCImpl() throws SQLException {


    }



    public void createUsersTable() throws SQLException {
        statement.executeUpdate("CREATE TABLE Users (" +
                "id int auto_increment PRIMARY KEY" +
                "name varchar(10) not null," +
                "lastName varchar(10) not null," +
                "age varchar(10) not null," +
                ")");
    }

    //    public void dropUsersTable() {
//
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//
//    }
//
//    public void removeUserById(long id) {
//
//    }
//
//    public List<User> getAllUsers() throws SQLException {
//        List<User> list = new ArrayList<>();
//        connection = getConnection();
//        statement = connection.createStatement();
//        ResultSet resultSet = statement.getResultSet();
//        while (resultSet.next()) {
//            list.add(new User(resultSet.getString("name"),
//                    resultSet.getString("lastname"),
//                    (byte) resultSet.getInt("age"));
//        }
//        return null;
//    }
//
//    public void cleanUsersTable() {
//
//    }
}
