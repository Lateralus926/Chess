
package chess;

import java.util.ArrayList;

public class Player {
    
    private static boolean blitzMode; //NEW True if blitz mode is selected
    public static enum Team {
        WHITE, BLACK
    };
    private Team team; //What team the player is on
    private double blitzClock; //NEW Holds time remaining on clock for each player if blitzMode is true
    private String name; //NEW Everything pertaing to name
    private static ArrayList<Player> players = new ArrayList<Player>(); //NEW Holds all the players
    
    public static void setBlitz(boolean _blitzMode) {
        blitzMode = _blitzMode;
    }
    public static void Create(Team _team,String _name,double _blitzClock) { //NEW Creates a new player and adds it to the players ArrayList
        Player ptr = new Player(_team,_name,_blitzClock);
        players.add(ptr);
    }
    Player (Team _team,String _name,double _blitzClock) {
        team = _team;
        name = _name;
        blitzClock = _blitzClock;  
    }
    public Team getTeam() {
        return(team);
    }
    public String getName() { //NEW
        return(name);
    }
}
