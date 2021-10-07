import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


// CSE 110     : 74845 / ONLINE
// Assignment  : 08
// Author      : MORRIS, CHRIS 1223564576
// Description : Volleyball

public class Roster{

    private ArrayList<Player> players = new ArrayList<Player>();
    String line = "";
    String fileName = "";//might need to add a filepath here, so the user input is added to a filepath
  

    public Roster(){
        ArrayList<Player> defaultPlayers = new ArrayList<Player>();
        players = defaultPlayers;
    }

    public Roster(String fileName){
        ArrayList<Player> rosterPlayers = new ArrayList<>();
        String[] playerInfo = null;
        try {
            Scanner dataReader = new Scanner (new File(fileName));
            while(dataReader.hasNextLine())
                playerInfo = dataReader.nextLine().split(" ");
                String part1 = playerInfo[0] + " " + playerInfo[1];
                String part2 = playerInfo[2];
                String part3 = playerInfo[3];

                Player newPlayer = new Player(part1, Double.parseDouble(part2), Double.parseDouble(part3));
                rosterPlayers.add(newPlayer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.players = rosterPlayers;
    }

    public void addPlayer(String playerName, double playerAttackStat, double playerBlockStat){
        Player newPlayer = new Player(playerName, playerAttackStat, playerBlockStat); 
        players.add(newPlayer);
    }

    public int countPlayers(){
        return players.size();
    }

    public Player getPlayerByName(String playerName){
        Player namedPlayer = null;

        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getName() == playerName){
                namedPlayer = players.get(i);
            }
            else{
                namedPlayer = null;
            }
         }
         return namedPlayer;
    }

    public void getTopAttackers(){
        //print two player objects (in descending order) with best attack stats
    }

    public void getTopBlockers(){
        //print two player objects (in descending order) with best block stats
    }

    public void printAllPlayers(){
        //call print player info for each arrayList object
        for(int i = 0; i < players.size(); i++){
            players.get(i).printPlayerInfo();
        }
    }
}