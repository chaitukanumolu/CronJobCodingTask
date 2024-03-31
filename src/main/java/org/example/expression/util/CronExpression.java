package org.example.expression.util;

import org.example.arguments.Argument;
import org.example.arguments.temporal.TemporalEnum.TemporalCommonName;
import org.example.arguments.temporal.TemporalEnum.TemporalEnum;

public abstract class CronExpression implements Argument {
    public static final String BLANK = "                                            ";

    public String appendTimeUnit(TemporalEnum temporalEnum, String expression){
        return getExpression(TemporalCommonName.map.get(temporalEnum)) + expression;
    }

    private String getExpression(String timeUnitName){
        //return (timeUnitName+blank).substring(0, blank.length()-timeUnitName.length());
        return (timeUnitName+BLANK).substring(0, BLANK.length());
    }
}
