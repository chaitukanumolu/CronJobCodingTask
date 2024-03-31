package org.example.expression;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.util.CronExpression;

public class Constant extends CronExpression {
    String constant;
    TemporalEnum temporalEnum;
    @Override
    public String expand() {
        return appendTimeUnit(temporalEnum,constant);
    }

    public Constant(TemporalEnum temporalEnum, String constant){
        this.constant = constant;
        this.temporalEnum = temporalEnum;
    }
}
