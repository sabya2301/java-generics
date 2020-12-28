package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    private int tied = 0;

//    private ArrayList<T> members = new ArrayList<Player>();
    private ArrayList<T> members = new ArrayList<T>();
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(this.members.isEmpty()){
            System.out.println(this.getName() + " does not have any players. Add some players");
            return;
        }
        if(opponent.members.isEmpty()) {
            System.out.println(opponent.getName() + " does not have any players. Add some players");
            return;
        }
        String message;
        if(ourScore > theirScore) {
            this.won++;
            opponent.lost++;
            System.out.println(this.getName() + " beat " + opponent.getName() + " by " + ourScore + "-" + theirScore);
        } else if(ourScore < theirScore){
            lost++;
            opponent.won++;
            System.out.println(opponent.getName() + " beat " + this.getName() + " by " + ourScore + "-" + theirScore);
        }
        else{
            tied++;
            opponent.tied++;
            System.out.println(this.getName() + " drew " + opponent.getName() + " by " + ourScore + "-" + theirScore);
        }
        this.played++;
        opponent.played++;
    }

    public int compareTo(Team<T> team){
        if(this.ranking() > team.ranking())
            return -1;
        else if(this.ranking() < team.ranking())
            return 1;
        else
            return 0;
    }

    public int ranking() {
        return (won * 2) + tied;
    }

//    @Override
//    public int compareTo(Team o) {
//        return 0;
//    }
}
