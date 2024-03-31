package org.example.expression;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.util.CronExpression;

import java.util.StringTokenizer;

public class SpecificList extends CronExpression {
    public static final String COMMA_DELIMITER = ",";
    public static final String TAB = "\t";
    String specificTimeUnits;
    TemporalEnum temporalEnum;
    public SpecificList(TemporalEnum temporalEnum, String specificTimeUnits){
        this.temporalEnum = temporalEnum;
        this.specificTimeUnits = specificTimeUnits;
    }
    @Override
    public String expand() {
        StringTokenizer stringTokenizer = new StringTokenizer(specificTimeUnits, COMMA_DELIMITER);
        StringBuilder specificTimeUnitExpression = new StringBuilder();

        while(stringTokenizer.hasMoreTokens()){
            specificTimeUnitExpression.append(stringTokenizer.nextToken());
            specificTimeUnitExpression.append(TAB);
        }

        return appendTimeUnit(temporalEnum, specificTimeUnitExpression.toString());
    }
}
