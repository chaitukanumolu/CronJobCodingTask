package org.example.arguments.program;

import org.example.arguments.Argument;

import static org.example.expression.util.CronExpression.BLANK;

public class Program implements Argument {
    private String programCommand;
    @Override
    public String expand() {
        //return programCommand;
        return ("command"+BLANK).substring(0, BLANK.length())+programCommand;
    }

    public Program(String programCommand){
        this.programCommand = programCommand;
    }
}
