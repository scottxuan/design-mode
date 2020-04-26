package com.scottxuan.behavior.command;

/**
 * @author : zhaoxuan
 */
public class Command1 implements Command {
    private Executor executor;

    public Command1(Executor executor) {
        this.executor = executor;
    }

    @Override
    public void executor() {
        System.out.println("执行:Command1");
    }
}
