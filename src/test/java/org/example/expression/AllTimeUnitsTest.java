package org.example.expression;

import org.example.arguments.temporal.TemporalEnum.TemporalEnum;
import org.junit.Assert;
import org.junit.Test;

public class AllTimeUnitsTest {

    @Test
    public void testMinuteTemporalUnit(){
        AllTimeUnits allTimeUnits = new AllTimeUnits(TemporalEnum.MINUTE);
        String exp = allTimeUnits.expand();

        Assert.assertTrue(exp.contains("minute"));
    }

    @Test
    public void testHourTemporalUnit(){
        AllTimeUnits allTimeUnits = new AllTimeUnits(TemporalEnum.HOUR);
        String exp = allTimeUnits.expand();

        Assert.assertTrue(exp.contains("hour"));
    }

    @Test
    public void testDoWTemporalUnit(){
        AllTimeUnits allTimeUnits = new AllTimeUnits(TemporalEnum.DAY_OF_WEEK);
        String exp = allTimeUnits.expand();

        Assert.assertTrue(exp.contains("day of week"));
    }

    @Test
    public void testDoMTemporalUnit(){
        AllTimeUnits allTimeUnits = new AllTimeUnits(TemporalEnum.DAY_OF_MONTH);
        String exp = allTimeUnits.expand();

        Assert.assertTrue(exp.contains("day of month"));
    }

    @Test
    public void testMonthTemporalUnit(){
        AllTimeUnits allTimeUnits = new AllTimeUnits(TemporalEnum.MONTH);
        String exp = allTimeUnits.expand();

        Assert.assertTrue(exp.contains("month"));
    }
}
