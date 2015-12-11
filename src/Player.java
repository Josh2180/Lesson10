
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Player implements Comparable {

    String name, team, position;
    double salary;
    int weight;

    public Player(String n, String t, String p, double s, int w) {
        name = n;
        team = t;
        position = p;
        salary = s;
        weight = w;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        String temp;
        temp = "Name: " + name;
        temp += "\n------------------------";
        temp += "\nTeam: " + team;
        temp += "\nSalary: $" + salary;
        temp += "\nWeight: " + weight + "lbs";
        temp += "\nPosition: " + position;
        return temp;
    }

    @Override
    public int compareTo(Object o) {
        try{
        return name.compareTo(((Player) o).getName());
        } catch(Exception e){}
        return team.compareTo(((Player) o).getTeam());
    }

}
