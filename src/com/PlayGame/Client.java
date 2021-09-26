package com.PlayGame;

public class Client {
    public static void main(String[] args) {
        Game game1 = new CS();
        Game game2 = new DNF();
        Game game3 = new LOL();
        Player p = new Player();
        p.happy(game1);
        p.happy(game3);
        p.happy(game2);
    }
}
