package day00;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

class MyThread extends Thread {

    public void run(){
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        Random random = new Random();

        String s1 = "230_";
        String s2 = df.format(calendar.getTime());
        String s3 = "";
        String s4 = "";
        String ID = "";

        for (int i=0; i<10; i++){
            s3 += random.nextInt(10);
        }

        char ch = s3.charAt(s3.length()-1);
        if(ch%2 == 0){
            s4 += "2200";
        }else {
            s4 += "1100";
        }

        ID = s1 + s2 + s3 + s4;
        System.out.println("生成随机id: " + ID);
    }
}