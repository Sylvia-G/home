package day00;//编程: 分组和遍历
//构造一个User对象, 属性有userName, age, school
//构造一个User列表, List<User>, User内容随意
//基于school分组, 即Map<String, List<User>>, 相同school放在一个List中
//然后遍历每个分组中的所有User
//要求: 考虑健壮性
//**    这道题不会   **//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            User user = new User("name" + i, i, "school" + i%3);
            users.add(user);
        }
        System.out.println(users.toString());
        System.out.println("lists is completed");

        Map<String, List<User>> maps = new HashMap<>();
        for(User user: users) {
            String school = user.getSchool();
            if (maps.containsKey(school)) {
                List<User> userlist = maps.get(school);
                userlist.add(user);
                maps.put(school, userlist);
            } else {
                List<User> userlist = new ArrayList<>();
                userlist.add(user);
                maps.put(school, userlist);
            }
        }

        for (Map.Entry<String, List<User>> entry: maps.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

    }
}
