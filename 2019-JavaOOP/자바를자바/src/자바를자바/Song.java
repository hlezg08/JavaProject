/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 자바를자바;

/**
 *
 * @author 성혜린
 */
class Song {
    String title,artist,album,composer;
    int year,track;
    Song(){
    }
    Song(String title,String artist,String album,String composer,int year,int track){
        this.title=title;
        this.artist=artist;
        this.album=album;
        this.composer=composer;
        this.year=year;
        this.track=track;
    }
    void show(){
        System.out.println("노래 제목:"+title);
        System.out.println("가수:"+artist);
        System.out.println("앨범 제목:"+album);
        System.out.println("작곡가:"+composer);
        System.out.println("발표 연도:"+year);
        System.out.println("트랙번호:"+track);
    }
}
