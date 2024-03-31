package org.example.expression.pair;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.example.expression.pair.TimeUnitStartEndPair;

import java.util.HashMap;
import java.util.Map;

public class TimeStartEndPairMap {
    private static Map<TemporalEnum, TimeUnitStartEndPair> temporalEnumStringMap = new HashMap<>();
    static {
        temporalEnumStringMap.put(TemporalEnum.DAY_OF_MONTH, new TimeUnitStartEndPair(1, 30));
        temporalEnumStringMap.put(TemporalEnum.MONTH, new TimeUnitStartEndPair(1,12));
        temporalEnumStringMap.put(TemporalEnum.DAY_OF_WEEK, new TimeUnitStartEndPair(1, 7));
        temporalEnumStringMap.put(TemporalEnum.HOUR, new TimeUnitStartEndPair(0, 23));
        temporalEnumStringMap.put(TemporalEnum.MINUTE, new TimeUnitStartEndPair(0, 59));temporalEnumStringMap.put(TemporalEnum.SECOND, new TimeUnitStartEndPair(0, 59));
    }

    public static TimeUnitStartEndPair getRange(TemporalEnum temporalEnum){
        return temporalEnumStringMap.get(temporalEnum);
    }
}
