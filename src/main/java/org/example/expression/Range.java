package org.example.expression;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.util.CronExpression;

import java.util.StringTokenizer;

public class Range extends CronExpression {
    private String range;
    private TemporalEnum temporalEnum;
    public Range(TemporalEnum temporalEnum, String range){
        this.temporalEnum = temporalEnum;
        this.range = range;
    }

    @Override
    public String expand() {
        StringBuffer rangebuffer = new StringBuffer();
        StringTokenizer tokenizer = new StringTokenizer(range, "-");

        int start = Integer.parseInt(tokenizer.nextToken());
        int end = Integer.parseInt(tokenizer.nextToken());

        for(int i=start; i<=end; i++){
            rangebuffer.append(i);
            rangebuffer.append("\t");
        }

        return appendTimeUnit(temporalEnum, rangebuffer.toString());
    }
}
