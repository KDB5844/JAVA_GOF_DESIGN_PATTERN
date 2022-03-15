package me.whiteship.designpatterns.singleton;

import java.io.Serializable;
import java.util.Set;

public class Settings implements Serializable {

    // private로 new 생성자 막기
    private Settings(){};

    /**
     * synchronized 키워드 사용
     * 대신 동기화 메커니즘으로 인해 약간의 성능저하 발생 -> 메서드 사용 중일 시 Lock
     */
    /*
    private static Settings instance;

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }*/



    /**
     * 이른 초기화 방법(eager initialization) 사용
     * 미리 초기화를 하여 동일한 instance return
     */
    /*

    private static final Settings INSTANCE = new Settings();

    public static Settings getInstance() {
        return INSTANCE;
    }
     */

    /**
     * double checked locking 사용하기
     * instance를 필요한 시점에 만들 수 있음.
     * instance가 없을 때 여러 thread가 동시에 if문을 통과 할 때만 synchronized
     */

    /*
    private static volatile Settings instance;  //volatile keyword 사용해야 함.

    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
     */

    /**
     * static inner 클래스 사용
     */
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    //역직렬화 대응 방안
    protected Object readResolve() {
        return getInstance();
    }

}