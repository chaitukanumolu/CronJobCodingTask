package org.example.expression;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.pair.TimeStartEndPairMap;
import org.example.expression.util.CronExpression;

import java.util.StringTokenizer;

public class Interval extends CronExpression {
    TemporalEnum temporalEnum;
    String expression;
    public Interval(TemporalEnum temporalEnum, String expression){
        this.temporalEnum = temporalEnum;
        this.expression = expression;
    }
    @Override
    public String expand() {
        StringTokenizer stringTokenizer = new StringTokenizer(expression, "/");
        String offset = stringTokenizer.nextToken();
        int interval = Integer.parseInt(stringTokenizer.nextToken());

        int start = -1;
        if(offset.equals("*")){
            start = TimeStartEndPairMap.getRange(temporalEnum).getStart();
        }else{
            start = Integer.parseInt(offset);
        }

        int end = TimeStartEndPairMap.getRange(temporalEnum).getEnd();

        int value = start;

        StringBuffer range = new StringBuffer();

        while(value<=end){
            range.append(value);
            range.append("\t");

            value += interval;
        }

        return appendTimeUnit(temporalEnum, range.toString());
    }
}
