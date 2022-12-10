package Tim;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums =new ArrayList<Album>();
        Album album = new Album("Stormbringer","Deep purple");
        album.addSong("Stormbringer",5.4);
        album.addSong("Stormbringer",7.4);
        album.addSong("Love me like you to ",1.4);
        album.addSong("Hate u",11.4);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("for those about to rock",5.64);
        album.addSong("I put the fingers on U",6.64);
        album.addSong("lets go ",7.64);
        album.addSong("for  rock",8.64);
        albums.add(album);

        LinkedList<Song> playList =new LinkedList<Song>();
        albums.get(0).addTOPlayList("You can do right",playList);
        albums.get(0).addTOPlayList("Holy man",playList);
        albums.get(0).addTOPlayList("You can do it ",playList);//Does not exist
        albums.get(0).addTOPlayList(3,playList);
        albums.get(1).addTOPlayList(1,playList);
        albums.get(1).addTOPlayList(2,playList);
        albums.get(1).addTOPlayList(14,playList);//Does not exist
        play(playList);

    }
    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No song in playlist");
        }else{
            System.out.println("Now playing "+listIterator.next().toString());
        }

    }
}
