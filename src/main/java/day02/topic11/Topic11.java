package day02.topic11;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作业11: I/O + 集合 + 对象 练习题
 *
 * 文件: 位置随意,数据格式: id, name, age, score, address
 *
 * 读取出数据之后,放到对象中User
 *
 * 在将User放入集合中
 *
 * 集合中的User,按照address,age,分组,且每个组内的分数还要排序
 *
 * - 如: 北京,男 ; 上海,女
 *
 * @author haoc
 */
public class Topic11 {
    /**
     *  1.读取文件
     *  2.对数据解析
     *  3.入库
     */

    public static void main(String[] args) throws IOException {
        // 1.读文件
        List<String> result = readFile("E:\\codingFiles\\homework\\src\\main\\java\\day02\\topic11\\case");

        // 2.解析数据
        List<User> users= parse(result);

        // 2.1 group分组
        Map<String, List<User>> groupResult = groupByName(users);

        // 2.2打印分组结果
        printGroupResult(groupResult);

        // 2.3排序sort
        Map<String, List<User>> newGroupResult = sort(groupResult);
        System.out.println("排序后");
        printGroupResult(newGroupResult);

        // 3.入库
        Integer efffectRows = insertDB(users);
        System.out.println("影响行数" + efffectRows);

    }


    /**
     * 2.1 group分组
     * @param users
     * @return
     */
    private static Map<String, List<User>> groupByName(List<User> users){
        Map<String, List<User>> result = new HashMap<>();

        for (User user: users){
            String userAddress = user.getAddress();
            if (result.containsKey(userAddress)){
                result.get(userAddress).add(user);
            }else {
                ArrayList<User> userList = new ArrayList<>();
                userList.add(user);
                result.put(userAddress, userList);
            }
        }

        return result;

    }

    /**
     *  2.2打印分组结果
     * @param groupResult
     */
    private static void printGroupResult(Map<String, List<User>> groupResult){
        for (Map.Entry<String, List<User>> entry: groupResult.entrySet()){
            String groupName = entry.getKey();
            List<User> users = entry.getValue();
            System.out.println(groupName);
            for (User user : users) {
                System.out.println("\t" + user);
            }

            System.out.println("\n===========================\n");
        }
    }

    /**
     * // 2.3排序sort
     * @param groupResult
     * @return
     */
    private static Map<String, List<User>> sort(Map<String, List<User>> groupResult){
        Map<String, List<User>> result = new HashMap<>();

        for (Map.Entry<String, List<User>> entry : groupResult.entrySet()) {
            String groupName = entry.getKey();
            // 原始的user 列表
            List<User> users = entry.getValue();

            // 排序后的user 列表
            List<User> sortedUsers = sortUser(users);
            result.put(groupName, sortedUsers);

        }

        return result;
    }

    /**
     * 2.3排序sort-实际的排序方法
     * @param users
     * @return
     */
    private static List<User>  sortUser(List<User> users){
        for (int i = 0; i < users.size(); i++) {
            for (int j = 0; j < i; j++) {
                User u1 = users.get(i);
                User u2 = users.get(j);
                if (u1.getGender() > u2.getGender()){
                    users.set(i,u2);
                    users.set(j,u1);
                }
            }
        }

        return users;

    }

    /**
     * 1.读文件
     * @param path
     * @return
     * @throws IOException
     */
    private static List<String> readFile(String path) throws IOException {
        List<String> result = new ArrayList<>();
        File file = new File(path);

        /**
         * 简洁写法
         */
        try(BufferedReader reader = new BufferedReader(new FileReader((file)))){
            String val =null;
            while ((val = reader.readLine()) != null){
                result.add(val);
            }
            return result;
        }catch (Exception ex){
            System.out.println("为啥出错：");
            throw new IllegalStateException(ex);
        }

        /**
         * 最原始写法
         */
    //    try {
    //        reader = new BufferedReader(new FileReader(file));
    //        String val = null;
    //        while ((val = reader.readLine()) != null){
    //            result.add(val);
    //        }return result;
    //    }catch (Exception ex){
    //        throw new IllegalStateException(ex);
    //    }finally {
    //        if (null != reader){
    //            try {
    //                reader.close();
    //            }catch (IOException e){
    //                e.printStackTrace();
    //            }
    //        }
    //    }

    }

    /**
     * 2.解析数据
     * @param resultData
     * @return
     */
    private static List<User> parse(List<String> resultData){
        List<User> users = new ArrayList<>();

        for (String data: resultData){
            String[] splitArr = data.split(",");
            Integer id = Integer.parseInt(splitArr[0]);
            String name = splitArr[1];
            Integer age = Integer.parseInt(splitArr[2]);
            Integer score = Integer.parseInt(splitArr[3]);
            String address = splitArr[4];

            User user = new User(id, name,age,score, address);
            users.add(user);
        }

        return users;
    }

    /**
     * 3.入库
     */
    private static Integer insertDB(List<User> users){
        return -1;
    }


}
