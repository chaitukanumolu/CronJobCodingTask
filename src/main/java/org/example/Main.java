package org.example;

import org.example.arguments.Argument;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws Exception {
        if(args.length < 6){
            throw new Exception("Cron scheduler needs atleast 6 arguments");
        }

        List<String> argStrs = new ArrayList<>();

        for(String arg: args){
            argStrs.add(arg);
        }

        CronExpressionEvaluator cronExpressionEvaluator = new CronExpressionEvaluator();
        List<Argument> arguments = cronExpressionEvaluator.getExpressionArguments(argStrs);

        arguments.stream().forEach(argument -> {
            System.out.println(argument.expand());
        });
    }
}