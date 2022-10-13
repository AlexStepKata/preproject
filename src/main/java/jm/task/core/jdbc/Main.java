package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        UserServiceImpl userService  = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("sasha","a", Byte.parseByte("22"));
        userService.saveUser("masha","s", Byte.parseByte("12"));
        userService.saveUser("fara","d", Byte.parseByte("2"));
        userService.saveUser("hoty","f", Byte.parseByte("22"));



        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
