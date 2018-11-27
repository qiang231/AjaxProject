package Generic;

import java.util.HashMap;
import java.util.List;

public class TestDAO {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.map = new HashMap<String, User>();

        dao.save("1000",new User(1,32,"梁朝伟"));
        dao.save("1001",new User(2,34,"刘德华"));
        dao.save("1002",new User(3,35,"周杰伦"));

        User u = dao.get("1001");
        System.out.println(u);

        dao.update("1002",new User(4,56,"汤唯"));

        dao.delete("1002");
        List<User> list = dao.list();
        System.out.println(list);
    }
}
