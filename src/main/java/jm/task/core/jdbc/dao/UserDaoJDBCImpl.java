package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.util.List;


public class UserDaoJDBCImpl implements UserDao {

    public static final String CREATE_USER_TABLE = "CREATE TABLE IF NOT EXISTS User ( " +
            "id BIGINT PRIMARY KEY AUTO_INCREMENT, " +
            "name VARCHAR(30), " +
            "last_name VARCHAR(30), " +
            "age TINYINT UNSIGNED )";;
    static final String DROP_USER_TABLE = "DROP TABLE IF EXISTS User";
    static final String ADD_NEW_USER = "INSERT INTO user(name, last_name, age) VALUES (?, ?, ?)";
    static final String REMOVE_USER_BY_ID = "DELETE FROM user WHERE id = ?";
    static final String GET_ALL_USERS = "SELECT * FROM user";
    static final String CLEAN_USERS_TABLE = "DELETE FROM user";
    private Connection connection = Util.getConnection();

    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Users (" +
//                    "id int auto_increment PRIMARY KEY," +
//                    "name varchar(10) not null," +
//                    "lastName varchar(10) not null," +
//                    "age int(10) not null" +
//                    ")");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void dropUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("DROP TABLE IF EXISTS Users");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        try (PreparedStatement pstm = connection.prepareStatement("INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)")) {
//            pstm.setString(1, name);
//            pstm.setString(2, lastName);
//            pstm.setByte(3, age);
//            pstm.executeUpdate();
//            System.out.printf("User с именем – %s добавлен в базу данных\n",name);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void removeUserById(long id) {

//        try (PreparedStatement pstm = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
//            pstm.setLong(1, id);
//            pstm.executeUpdate();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }


    public List<User> getAllUsers() {
//        List<User> list = new ArrayList<>();
//        ResultSet resultSet;
//        try (Statement statement = connection.createStatement()) {
//            resultSet = statement.executeQuery("SELECT name, lastname, age FROM users");
//            while (resultSet.next()) {
//                list.add(new User(resultSet.getString("name"),
//                        resultSet.getString("lastname"),
//                        resultSet.getByte("age")));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
        return null;
    }


    public void cleanUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("TRUNCATE TABLE users");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }


}

