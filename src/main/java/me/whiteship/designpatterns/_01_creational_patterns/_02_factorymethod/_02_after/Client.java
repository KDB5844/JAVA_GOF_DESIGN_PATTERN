package me.whiteship.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = new WhiteshipFactory().orderShip("Whiteship", "subin@mail.com");
        Ship blackShip = new BlackshipFactory().orderShip("Blackship", "subinmail.com");
        System.out.println(whiteShip);
        System.out.println(blackShip);
    }
}
