package me.whiteship.designpatterns._01_creational_patterns._02_factorymethod._01_before;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("whiteship", "subin@email.com");
        Ship blackShip = ShipFactory.orderShip("blackship", "subin@email.com");
        System.out.println(whiteShip);
        System.out.println(blackShip);
    }
}
