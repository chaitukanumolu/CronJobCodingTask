package org.example.expression.factory;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.*;
import org.example.expression.util.CronExpression;

public class ExpressionFactory {

    public static CronExpression getCronExpression(TemporalEnum temporalEnum, String cronExpression){
        if(cronExpression.contains(",")){
            return new SpecificList(temporalEnum, cronExpression);
        }else if(cronExpression.contains("-")){
            return new Range(temporalEnum, cronExpression);
        }else if(cronExpression.equals("*")){
            return new AllTimeUnits(temporalEnum);
        }else if(cronExpression.contains("/")){
            return new Interval(temporalEnum, cronExpression);
        }else {
            try{
                Integer.parseInt(cronExpression);
                return new Constant(temporalEnum, cronExpression);
            }catch (NumberFormatException exception){
                exception.printStackTrace();
                throw exception;
            }
        }
    }
}
