package com.scottxuan.behavior.command;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) {
        Command command = new Command1(new Executor1());
        command.executor();
    }
}
