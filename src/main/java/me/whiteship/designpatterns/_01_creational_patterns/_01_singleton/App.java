package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings settings = Settings.getInstance();

        //Singleton을 깨트리는 방법

        //1. 리플렉션 사용 (대응 방안 없음)
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();

        System.out.println(settings == settings1);

        //2. 직렬화 & 역직렬화 사용 (대응 방안 존재 readResolve)
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        Settings settings2 = null;

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings) in.readObject();
        }

        System.out.println(settings == settings2);

        SettingsEnum settingsEnum = SettingsEnum.INSTANCE;
        SettingsEnum settingsEnum1 = SettingsEnum.INSTANCE;
        System.out.println(settingsEnum == settingsEnum1);
    }
}
