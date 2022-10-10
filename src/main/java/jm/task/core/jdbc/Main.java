package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import javax.swing.text.TableView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        UserServiceImpl userService  = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("sasha","a", Byte.parseByte("22"));
        userService.saveUser("masha","s", Byte.parseByte("12"));
        userService.saveUser("fara","d", Byte.parseByte("2"));
        userService.saveUser("hoty","f", Byte.parseByte("22"));


        List<User> list = userService.getAllUsers();
        for (User lis:list){
            System.out.println(lis);

        }
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
