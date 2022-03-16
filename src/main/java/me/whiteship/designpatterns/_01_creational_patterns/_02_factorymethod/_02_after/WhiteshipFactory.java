package me.whiteship.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public class WhiteshipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new Whiteship();
    }

}
