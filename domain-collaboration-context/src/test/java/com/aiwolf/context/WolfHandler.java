package com.aiwolf.context;

public class WolfHandler extends PersonHandler{
    @Override
    public void handle(int stage, int days) {
        if (stage == GameDemo.THE_DAY) {
            System.out.println("发言OR投票");
        }
    }
}
