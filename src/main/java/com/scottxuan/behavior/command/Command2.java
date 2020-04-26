package com.scottxuan.behavior.command;

/**
 * @author : zhaoxuan
 */
public class Command2 implements Command {
    private Executor executor;

    public Command2(Executor executor) {
        this.executor = executor;
    }

    @Override
    public void executor() {
        System.out.println("执行:Command2");
    }
}
