package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
//    private final SessionFactory sessionFactory = Util.getConnection();

    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = null;
//        try {
//            transaction = session.beginTransaction();
//            session.createSQLQuery("CREATE TABLE IF NOT EXISTS test.MyTable" +
//                    " (id mediumint not null auto_increment, name VARCHAR(50), " +
//                    "lastname VARCHAR(50), " +
//                    "age tinyint, " +
//                    "PRIMARY KEY (id))").executeUpdate();
//            transaction.commit();
//            System.out.println("Таблица создана");
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null)
//                session.close();
//        }
    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
