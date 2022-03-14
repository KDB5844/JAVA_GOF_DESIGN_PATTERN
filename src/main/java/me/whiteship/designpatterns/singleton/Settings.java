package me.whiteship.designpatterns.singleton;

public class Settings {

    private static Settings instance;
    //new 생성자 못하게 막기 위함
    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }

}
