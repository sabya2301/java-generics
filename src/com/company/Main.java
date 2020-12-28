package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer glee = new FootballPlayer("Glee");
        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");
        adelaideCrows.addPlayer(glee);
        adelaideCrows.addPlayer(joe);
        System.out.println("===================================\n");


        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer phil = new BaseballPlayer("Phil");
        BaseballPlayer jack = new BaseballPlayer("Jack");
        Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Baseball Team");
        Team<BaseballPlayer> baseballTeam2 = new Team<BaseballPlayer>("B-Team2");
        baseballTeam.addPlayer(pat);
        baseballTeam.addPlayer(phil);
        baseballTeam2.addPlayer(jack);
        baseballTeam.matchResult(baseballTeam2, 20, 20);
        League<Team<BaseballPlayer>> bLeague = new League<Team<BaseballPlayer>>("BaseBall League");
        bLeague.addTeam(baseballTeam);
        bLeague.addTeam(baseballTeam2);
        bLeague.showLeagueTable();
        System.out.println("===================================\n");


        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer cris = new SoccerPlayer("Cristiano");
        SoccerPlayer messi = new SoccerPlayer("Messi");
        SoccerPlayer lewa = new SoccerPlayer("Lewandowski");
        Team<SoccerPlayer> manUtd = new Team<SoccerPlayer>("Manchester United");
        Team<SoccerPlayer> barca = new Team<SoccerPlayer>("Barcaelona");
        Team<SoccerPlayer> bayern = new Team<SoccerPlayer>("Bayern Munich");
        manUtd.addPlayer(beckham);
        manUtd.addPlayer(cris);
        barca.addPlayer(messi);
        bayern.addPlayer(lewa);
        bayern.matchResult(barca, 8, 2);
        barca.matchResult(manUtd, 1, 2);
        bayern.matchResult(manUtd, 5, 1);


        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(manUtd.getName() + ": " + manUtd.ranking());
        System.out.println(barca.getName() + ": " + barca.ranking());
        System.out.println(bayern.getName() + ": " + bayern.ranking());
//        System.out.println(barca.getName() + " played " + barca.getPlayed() + " matches");
//        System.out.println(bayern.getName() + " played " + bayern.getPlayed() + " matches");

        System.out.println("===================================\n");
        League<Team<SoccerPlayer>> ucl = new League<Team<SoccerPlayer>>("UEFA Champions League");
        ucl.addTeam(manUtd);
        ucl.addTeam(barca);
        ucl.addTeam(bayern);
        ucl.showLeagueTable();



//        Team<String> tr = new Team<String>("Trial");
//        tr.addPlayer("Try");
//        System.out.println(adelaideCrows.numPlayers());
    }
}
