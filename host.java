package test;
import java.util.*;

public class host {
    private int number;
    public List<song> allSongs;
    host(){
        number = 0;
        allSongs = new ArrayList<>();
    }

    public void addSong(user add){
        allSongs.add(add.order);
        number++;
    }

    public void randomDisplay(){
        Random random=new Random();
        int code=random.nextInt(this.number);
        song now=allSongs.get(code);
        System.out.println("现在播放："+now.name +" 作者："+now.author+" 时长："+ now.duration);
    }

    public void choose(int choosed){
        song choosen = allSongs.get(choosed);
        System.out.println("现在播放："+choosen.name +" 作者："+choosen.author+" 时长："+ choosen.duration);
    }
}

