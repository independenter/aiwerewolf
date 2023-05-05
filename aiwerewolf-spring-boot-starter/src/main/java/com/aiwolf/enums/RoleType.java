package com.aiwolf.enums;

public enum RoleType {

    WOLF("狼"),
    GOD("上帝"),
    PROPHET("预言家"),
    WITCH("女巫"),
    HUNTER("猎人"),
    COMMONER("平民"),
    IDIOCY("白痴"),
    ;
    private String name;

    private RoleType(String name) {
        this.name = name;
    }
}
