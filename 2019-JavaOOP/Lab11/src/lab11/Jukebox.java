/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.*;
import java.io.*;
public class Jukebox {//그리고 결과창에서 2 Heads는 무엇을 의미하나요?->정렬되는 순서(숫자->abc...)
    ArrayList<String> songList=new ArrayList<String>(); //여기에 static을 썼더니 오류창이 뜨지 않는데 왜 써야 하는지 궁금합니다->여기도 static 안써도됨. main안에서 쓰면 에러. 전역으로 구현해야함
    HashMap<String,String> hashtable=new HashMap<String,String>();
    LinkedList<String> stack=new LinkedList<String>();
    LinkedList<String> queue=new LinkedList<String>();
    public static void main(String[] args) {
        Jukebox obj=new Jukebox();
        obj.go(); //여기는 static이어서 obj.go()로 구현해야함
        
        obj.hashrun();
        obj.stackrun();
        obj.queuerun();
    }
    void go(){//static 쓰지 않아도 됨
        getSongs();
        //System.out.println(songList); //정렬되지 않은 노래 제목 리스트 출력
        Collections.sort(songList);
        int num=songList.size();
        System.out.println(songList);//2 Heads 뒤에 정렬된 노래 제목 출력
        for(int i=0;i<num;i++){
            String str=songList.get(i);
            System.out.println(str);
        }
    }
    void getSongs(){//static 쓰지 않아도 됨
        try{
            File file=new File("C:\\Users\\성혜린\\Documents\\NetBeansProjects\\Lab11\\src\\lab11\\Starbucks_Music.txt");
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String line=null;
            while((line=reader.readLine())!=null){
                addSong(line);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    void addSong(String s){//static 쓰지 않아도 됨
        String[] tokens=s.split("\"");
        songList.add(tokens[1]); //따옴표 안에 있는게 노래제목
        System.out.println(tokens[2]+","+tokens[1]);
        
        hashtable.put(tokens[1],tokens[2]);
        stack.addLast(tokens[0]);
        queue.offer(tokens[0]);
        
    }
    void hashrun(){
        System.out.println(hashtable.keySet());
        for(String str:hashtable.keySet()){
            System.out.println("Key:"+str+",Musician:"+hashtable.get(str));
        }
    }
    void stackrun(){
        while(!stack.isEmpty()){
            System.out.println("stack: "+stack.removeLast());
        }
    }
    void queuerun(){
        while(!queue.isEmpty()){
            System.out.println("queue: "+queue.poll());
        }
    }
}
