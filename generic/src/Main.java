public class Main {
    public static void main(String[] args) {


        Baseballplayer baseballplayer = new Baseballplayer("chetan",34);
        Footballplayer footballplayer = new Footballplayer("shubham",3);
        Soccerplayer soccerplayer = new Soccerplayer("rahul",32);

        Team<Baseballplayer> membersofbase = new Team<>("Great Mumbai");
        membersofbase.addPlayer(baseballplayer);
        System.out.println(membersofbase);

    }
}
