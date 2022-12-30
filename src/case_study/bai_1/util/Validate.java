package case_study.bai_1.util;

public class Validate {
    public static final String REGEX_SERVICE_CODE_VILLA = "^SVVL-[0-9]{4}$";
    public static final String REGEX_SERVICE_CODE_ROOM = "^SVR0-[0-9]{4}$";
    public static final String REGEX_SERVICE_NAME = "^[A-Z][a-z1-9]+$";
    public static final String REGEX_SERVICE_USABLE_AREA = "^([3-9][0-9]+|[1-9][0-9]{2,})[.][0-9]+$";
    public static final String REGEX_SERVICE_SWIMMING_POOL_AREA = "^([3-9][0-9]+|[1-9][0-9]{2,})[.][0-9]+$";
    public static final String REGEX_SERVICE_RENTAL_COSTS = "^[1-9][0-9]*$";
    public static final String REGEX_SERVICE_MAX_NUMBER_OF_PEOPLE = "^1?[0-9]$";
    public static final String REGEX_SERVICE_NUMBER_OF_FLOORS = "^[1-9][0-9]*$";
    public static final String REGEX_SERVICE_RENTAL_TYPES = "^(Date|Month|Year)$";
    public static final String REGEX_SERVICE_ROOM_STANDARD= "^(Standard|Superior|Deluxe|Suite)$";

}
