package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<S extends Team> {
    private String name;
    private ArrayList<S> league = new ArrayList<S>();

    public String getName() {
        return name;
    }

    public League(String name) {

        this.name = name;
    }

    public boolean addTeam(S team){
        if(this.league.contains(team)){
            System.out.println(team.getName() +" is already present in " + this.getName());
            return false;
        } else{
            this.league.add(team);
            System.out.println(team.getName() + " has been added to " + this.getName());
            return true;
        }
    }

    public void showLeagueTable(){
//        System.out.println();
        Collections.sort(league);
        for(S s: league){
            System.out.println(s.getName() + ": Played-" + s.getPlayed() + " , Won-" + s.getWon()  + " , Lost-" + s.getLost()
                              + " , Points-" + s.ranking()
            );
        }
    }

}
