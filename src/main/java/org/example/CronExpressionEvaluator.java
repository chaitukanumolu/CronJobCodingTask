package org.example;

import org.example.arguments.Argument;
import org.example.arguments.program.Program;
import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.factory.ExpressionFactory;

import java.util.ArrayList;
import java.util.List;

public class CronExpressionEvaluator {
    public List<Argument> getExpressionArguments(List<String> expressions){
        List<Argument> arguments = new ArrayList<>();

        //Minutes
        arguments.add(ExpressionFactory.getCronExpression(TemporalEnum.MINUTE, expressions.get(0)));
        //Hour
        arguments.add(ExpressionFactory.getCronExpression(TemporalEnum.HOUR, expressions.get(1)));
        //Day of month
        arguments.add(ExpressionFactory.getCronExpression(TemporalEnum.DAY_OF_MONTH, expressions.get(2)));
        //Month
        arguments.add(ExpressionFactory.getCronExpression(TemporalEnum.MONTH, expressions.get(3)));
        //Day of week
        arguments.add(ExpressionFactory.getCronExpression(TemporalEnum.DAY_OF_WEEK, expressions.get(4)));
        //Program to execute
        StringBuffer programString = new StringBuffer();
        for(int i=5; i<expressions.size(); i++){
            programString.append(expressions.get(i));
            programString.append(" ");
        }
        arguments.add(new Program(programString.toString()));

        return arguments;
    }
}
