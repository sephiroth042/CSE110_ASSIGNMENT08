// CSE 110     : 74845 / ONLINE
// Assignment  : 08
// Author      : MORRIS, CHRIS 1223564576
// Description : Volleyball

public class Player{
    private String name;
    private double attackStat, blockStat;

    Player(String playerName, double playerAttackStat, double playerBlockStat){
        this.name = playerName;
        this.attackStat = playerAttackStat;
        this.blockStat = playerBlockStat;
    }

    public String getName(){
        return this.name;
    }

    public double getAttackStat(){
        return this.attackStat;
    }

    public void setAttackStat(double newAttackStat){
        this.attackStat = newAttackStat;
    }

    public double getBlockStat(){
        return this.blockStat;
    }

    public void setBlockStat(double newBlockStat){
        this.blockStat = newBlockStat;
    }

    public void printPlayerInfo(){
        System.out.println(String.format("s% (attack = %d, block = %d)", this.name, this.attackStat, this.blockStat));
    }
}