package org.example.arguments.temporal.TemporalEnum;

import java.util.HashMap;
import java.util.Map;

public class TemporalCommonName {
    public static final Map<TemporalEnum, String> map = new HashMap();
    static{
        map.put(TemporalEnum.MINUTE, "minute");
        map.put(TemporalEnum.HOUR, "hour");
        map.put(TemporalEnum.DAY_OF_MONTH, "day of month");
        map.put(TemporalEnum.MONTH, "month");
        map.put(TemporalEnum.DAY_OF_WEEK, "day of week");
    }
}
