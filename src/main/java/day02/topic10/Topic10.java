package day02.topic10;

import java.util.*;
import day01.topic1.Div;

/**
 * 作业10: 集合作业(需要提前学习下 List,Map等基本用法)
 *
 * - 定义一个对象,User,属性有 name,age,score,gender
 *
 * - 使用集合ArrayList,来装一批User, 数据可以随意
 *
 * - 要求1: 遍历集合,打印所有内部数据
 *
 * - 要求2: 按照年纪(age)进行分组,比如23岁,有3个人, 24岁有5个人,
 *
 * - 要求3: 按照分数(score)范围分组, 比如 60-70, 有一组人, 70-80有一组人
 *
 * - 要求4: 基于分数排序, 由高到低
 *
 * - 要求5: 基于性别分组,求男同学的平均分,求女同学的平均分
 *
 * @author haoc
 */
public class Topic10 {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alex",21,98,"男"));
        users.add(new User("Bob",21,61,"男"));
        users.add(new User("Anni",22,85,"女"));
        users.add(new User("Yang",19,100,"男"));
        users.add(new User("Mary",20,78,"女"));

        printList(users);

        groupByage(users);

        groupByScore(users);

        sortByScore(users);

        System.out.println("=========排序后==============");
        printList(users);

        averageOfMaleAndFemale(users);

    }

    /**
     * 遍历集合,打印所有内部数据
     * @param lists
     */
    private static void printList(ArrayList<User> lists){
        for(User list: lists){
            System.out.println(list.toString());
        }
    }

    /**
     * 按照年纪(age)进行分组,比如23岁,有3个人, 24岁有5个人
     * @param users
     */
    private static void groupByage(ArrayList<User> users){
        HashMap<Integer, List<User>> ageGroups = new HashMap<>();
        for (User user: users){
            int age = user.getAge();
            // 这里可以抽象出来, 供公共调用
            if (!ageGroups.containsKey(age)){
                ArrayList<User> newList = new ArrayList<>();
                newList.add(user);
                ageGroups.put(age,newList);
            }else {
                List<User> originList = ageGroups.get(age);
                originList.add(user);
                ageGroups.put(age,originList);
            }
        }

        pringMap(ageGroups);

    }

    /**
     * 要求3: 按照分数(score)范围分组, 比如 60-70, 有一组人, 70-80有一组人
     * 代码演示的是60-70组，90-100组
     * @param users
     */
    private static void groupByScore(ArrayList<User> users){
        HashMap<String, List<User>> scoreGroup = new HashMap<>();
        for (User user: users){
            int score = user.getScore();
            String range = dealScoreRange(score);
            if (!scoreGroup.containsKey(range)){
                ArrayList<User> nList = new ArrayList<>();
                nList.add(user);
                scoreGroup.put(range,nList);
            }else {
                List<User> oList = scoreGroup.get(range);
                oList.add(user);
                scoreGroup.put(range,oList);}

        }

        pringMap(scoreGroup);

    }

    /**
     * 要求4: 基于分数排序, 由高到低
     * @param users
     */
    private static void sortByScore(ArrayList<User> users){
        for (int i = 0; i < users.size() - 1; i++) {
            for (int j = 0; j < users.size() - 1 - i; j++) {
                User u1 = users.get(j);
                User u2 = users.get(j + 1);
                if (u1.getScore() > u2.getScore()){
                    users.set(j, u2);
                    users.set(j + 1, u1);
                }
            }
        }
    }

    /**
     * 要求5: 基于性别分组,求男同学的平均分,求女同学的平均分
     * @param users
     */
    private static void averageOfMaleAndFemale(ArrayList<User> users){

        HashMap<String, List<User>> genderGroups = new HashMap<>();
        for (User user: users){
            String gender = user.getGender();
            if (!genderGroups.containsKey(gender)){
                ArrayList<User> newList = new ArrayList<>();
                newList.add(user);
                genderGroups.put(gender,newList);
            }else {
                List<User> originList = genderGroups.get(gender);
                originList.add(user);
                genderGroups.put(gender,originList);
            }
        }

        pringMap(genderGroups);

        String femaleScore = null;
        String maleScore = null;
        for (Map.Entry<String,List<User>> entry: genderGroups.entrySet()){
            int tempScore = 0;
            int count = entry.getValue().size();
            for (User user: entry.getValue()){
                tempScore += user.getScore();
            }
            if ("男".equals(entry.getKey())){
                maleScore = Div.div(tempScore, count,1);
            }else if ("女".equals(entry.getKey())){
                femaleScore = Div.div(tempScore,count,1);
            }
        }

        System.out.println("female: " + femaleScore + " male: " + maleScore);
    }


    /**
     * 处理分数范围
     * @param score
     * @return
     */
    private static String dealScoreRange(int score){
        String ten = "10";
        String twenty = "20";
        String thirty = "30";
        String forty = "40";
        String fifty = "50";
        String sixty = "60";
        String seventy = "70";
        String eighty = "80";
        String ninety = "90";

        if((0 <= score) && (score <= 10)){ return ten;}
        else if((11 <= score) && (score <= 20)){ return twenty;}
        else if((21 <= score) && (score <= 30)){ return thirty;}
        else if((31 <= score) && (score <= 40)){ return forty;}
        else if((41 <= score) && (score <= 50)){ return fifty;}
        else if((51 <= score) && (score <= 60)){ return sixty;}
        else if((61 <= score) && (score <= 70)){ return seventy;}
        else if((71 <= score) && (score <= 80)){ return eighty;}
        else if((81 <= score) && (score <= 90)){ return ninety;}
        else {return ten;}
    }

    private static <K,V> void pringMap(Map<K,V> maps){
        for (Map.Entry<K,V> map: maps.entrySet()){
            System.out.println("key: "+ map.getKey() + "  value: " + map.getValue());
        }
    }




}
