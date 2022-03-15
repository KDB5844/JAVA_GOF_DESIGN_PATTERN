package me.whiteship.designpatterns.singleton;

/**
 * enum을 사용하면 간단하게 thread safe하게 작성 가능
 * 리플랙션과 역직렬화도 자동으로 막아져있음.
 * enum은 기본적으로 Serializable 상속 받고 있음
 */
public enum SettingsEnum {

    INSTANCE;

}
