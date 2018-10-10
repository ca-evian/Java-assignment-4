package test;

import java.util.*;

 class run {
    public static void main(String[] args){
        int usersNumber = 0;
        String a="";
        String b="";
        String c="";
        String d="";
        int host_choose = 0;
        System.out.println("输入用户的数量 ");
        Scanner input=new Scanner(System.in);
        usersNumber = input.nextInt();
        user total[] = new user[usersNumber];
        host re_host =new host();
        for(int i = 1; i <= usersNumber; ++i ){
          System.out.println("请输入第"+i+"位用户输入点播信息");
          System.out.println("输入歌曲名称: ");
          a = input.nextLine();
          System.out.println("输入歌曲作者: ");
          b = input.nextLine();
          System.out.println("输入歌曲时长: ");
          c = input.nextLine();
          System.out.println("输入点播人姓名: ");
          d = input.nextLine();
          total[i-1] = new user(d,a,b,c);
          re_host.addSong(total[i-1]);
        }

        System.out.println("输入1循环播放，输入2主持人选歌播放: ");
        host_choose = input.nextInt();
        if(host_choose==1)
            re_host.randomDisplay();
        else
        {
            System.out.println("主持人输入要点播的歌曲编号: ");
            host_choose = input.nextInt();
            re_host.choose(host_choose);
        }
    }
}

