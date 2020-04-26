package com.scottxuan.behavior.command;

/**
 * @author : zhaoxuan
 */
public class Test {
    public static void main(String[] args) {
        Command command = new Command1(new Executor1());
        command.executor();
        Command2 command2 = new Command2(new Executor2());
        command2.executor();
    }
}
