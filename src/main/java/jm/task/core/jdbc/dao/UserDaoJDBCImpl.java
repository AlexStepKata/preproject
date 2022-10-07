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


    public void createUsersTable() {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE Users (" +
                    "id int auto_increment PRIMARY KEY" +
                    "name varchar(10) not null," +
                    "lastName varchar(10) not null," +
                    "age varchar(10) not null," +
                    ")");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//        public void dropUsersTable () {
//
//        }

//    public void saveUser(String name, String lastName, byte age) {
//            try (Statement statement = connection.createStatement()){
//            statement.executeUpdate("INSERT INTO Users (name, lastName, age) \n" +
//                    " VALUES (3, 'Head First Java', 'Kathy Sieara');");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    //    public void removeUserById(long id) {
//
//    }
//
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        ResultSet resultSet;
            try (Statement statement = connection.createStatement()) {
                resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    list.add(new User(
                            resultSet.getString("name"),
                            resultSet.getString("lastname"),
                            (byte) resultSet.getInt("age")));
                }

            }   catch (SQLException e) {
                throw new RuntimeException(e);
            }
        return list;
    }

//
//    public void cleanUsersTable() {
//
//    }
}

