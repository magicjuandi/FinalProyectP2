package co.edu.cue.CinemaGarcia.domain.enums;

import java.util.Arrays;
import java.util.List;

public enum Schedule {
    A("1pm"),B("3pm"),C("5pm"),D("7pm"),E("9pm");
    private final String value;

    Schedule(String value) {
        this.value = value;
    }
    public static Schedule parse(String valueParse) {
        return Arrays.stream(Schedule.values()).filter(e->e.value.equalsIgnoreCase(valueParse)).findAny().orElseThrow();
    }
    public static List<String> getValues(){
        return Arrays.stream(Schedule.values()).map(e->e.value).toList();
    }
}
