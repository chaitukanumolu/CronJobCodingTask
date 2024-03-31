package org.example.expression;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.pair.TimeStartEndPairMap;
import org.example.expression.pair.TimeUnitStartEndPair;
import org.example.expression.util.CronExpression;

public class AllTimeUnits extends CronExpression {
    private TemporalEnum temporalEnum;
    public AllTimeUnits(TemporalEnum temporalEnum){
        this.temporalEnum = temporalEnum;
    }
    @Override
    public String expand() {
        StringBuffer stringBuffer = new StringBuffer();

        TimeUnitStartEndPair timeUnitStartEndPair = TimeStartEndPairMap.getRange(temporalEnum);

        int start = timeUnitStartEndPair.getStart();
        int end = timeUnitStartEndPair.getEnd();

        for(int i=start; i<=end; i++){
            stringBuffer.append(i);
            stringBuffer.append("\t");
        }

        return appendTimeUnit(temporalEnum, stringBuffer.toString());
    }
}
