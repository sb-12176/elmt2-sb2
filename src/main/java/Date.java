import java.lang.Math;
/**
 * This class provides various static methods that calculate various quantities
 * related to dates, including the day of week a date fall on.
 * @author
 * @version
 */
public class Date {
    /**
     * Returns true if the year is a leap year; otherwise false
     * @param year the year
     * @return true if the year is a leap year; otherwise false.
     */
    public static boolean isLeapYear(int year){
        double yearDividedBy4 = (double)(year/4.0);
        boolean isYearDivisibleBy4 = (yearDividedBy4 % 1) == 0.0;

        double yearDividedBy100 = (double)(year/100.0);
        boolean isYearDivisibleBy100 = (yearDividedBy100 % 1) == 0.0;

        double yearDividedBy400 = (double)(year/400.0);
        boolean isYearDivisibleBy400 = (yearDividedBy400 % 1) == 0.0;

        if (isYearDivisibleBy4 == true){
            if (isYearDivisibleBy400 == true){
                return true;
            }if (isYearDivisibleBy100 == true){
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the name of the day given by dayValue
     * @param dayValue Numerical value of the day in the range 0 to 6, inclusively
     * @return the name of the day given by dayValue
     */
    public static String getNameOfDay(int dayValue){
        dayValue = (dayValue%7+7)%7;

        if (dayValue == 0){
            return "Sunday";
        }if (dayValue == 1){
            return "Monday";
        }if (dayValue == 2){
            return "Tuesday";
        }if (dayValue == 3){
            return "Wednesday";
        }if (dayValue == 4){
            return "Thursday";
        }if (dayValue == 5){
            return "Friday";
        }if (dayValue == 6){
            return "Saturday";
        }
        return null;
    }

    /**\
     * Returns the numeric value of the month.
     *   1 - January
     *   2 - February
     *   ...
     *   12 - December
     * @param name name of the month
     * @return the numeric value of the month.
     */
    public static int getMonthNumber(String name){

        if ("january".equalsIgnoreCase(name)){
            return 1;
        }if ("february".equalsIgnoreCase(name)){
            return 2;
        }if ("march".equalsIgnoreCase(name)){
            return 3;
        }if ("april".equalsIgnoreCase(name)){
            return 4;
        }if ("may".equalsIgnoreCase(name)){
            return 5;
        }if ("june".equalsIgnoreCase(name)){
            return 6;
        }if ("july".equalsIgnoreCase(name)){
            return 7;
        }if ("august".equalsIgnoreCase(name)){
            return 8;
        }if ("september".equalsIgnoreCase(name)){
            return 9;
        }if ("october".equalsIgnoreCase(name)){
            return 10;
        }if ("november".equalsIgnoreCase(name)){
            return 11;
        }if ("december".equalsIgnoreCase(name)){
            return 12;
        }else{
            return -1;
        }
    }

    /**
     * Returns the name of the month given the numeric value provided by month
     *      1 - January
     *      2 - February
     *      ...
     *      12 - December
     * @param month Numeric value of the month.  Should be 1 to 12, inclusively
     * @return the name of the month given the numeric value provided by month
     */
    public static String getMonthName(int month){
        switch (month){
        case 1:{
            return "January";
        }
        case 2:{
            return "February";
        }
        case 3:{
            return "March";
        }
        case 4:{
            return "April";
        }
        case 5:{
            return "May";
        }
        case 6:{
            return "June";
        }
        case 7:{
            return "July";
        }
        case 8: {
            return "August";
        }
        case 9:{
            return "September";
        }
        case 10:{
            return "October";
        }
        case 11:{
            return "November";
        }
        case 12:{
            return "December";
        }
        }
        return "";
    }

    /**
     * Returns the number of days in the month given by the parameter month
     * @param month the numeric value of the month
     * @param year year
     * @return the number of days in the month given by the parameter month
     */
    public static int getDaysInMonth(int month, int year){
        if (getMonthName(month) == "February"){
            if (isLeapYear(year) == true){
                return 29;
            }else{
                return 28;
            }}
        if (getMonthName(month) == "January"){
            return 31;
        }if (getMonthName(month) == "March"){
            return 31;
        }if (getMonthName(month) == "April"){
            return 30;
        }if (getMonthName(month) == "May"){
            return 31;
        }if (getMonthName(month) == "June"){
            return 30;
        }if (getMonthName(month) == "July"){
            return 31;
        }if (getMonthName(month) == "August"){
            return 31;
        }if (getMonthName(month) == "September"){
            return 30;
        }if (getMonthName(month) == "October"){
            return 31;
        }if (getMonthName(month) == "November"){
            return 30;
        }if (getMonthName(month) == "December"){
            return 31;
        }
    return -1;
    }

    /**
     * Returns the number of days in the month given by the parameter month
     * @param month the name of the month
     * @param year year
     * @return the number of days in the month
     */
    public static int getDaysInMonth(String month, int year){
        switch(getMonthNumber(month)){
            case 1:{
                return 31;
            }
            case 2:{
                if (isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            }
            case 3:{
                return 31;
            }
            case 4:{
                return 30;
            }
            case 5:{
                return 31;
            }
            case 6:{
                return 30;
            }
            case 7:{
                return 31;
            }
            case 8:{
                return 31;
            }
            case 9:{
                return 30;
            }
            case 10:{
                return 31;
            }
            case 11:{
                return 30;
            }
            case 12:{
                return 31;
            }

        }

        /*if ("February".equalsIgnoreCase(month)){
            if (isLeapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }

        if (month == "January"){
            return 31;
        }if (month == "March"){
            return 31;
        }if (month == "April"){
            return 30;
        }if (month == "May"){
            return 31;
        }if (month == "June"){
            return 30;
        }if (month == "July"){
            return 31;
        }if (month == "August"){
            return 31;
        }if (month == "September"){
            return 30;
        }if (month == "October"){
            return 31;
        }if (month == "November"){
            return 30;
        }if (month == "December"){
            return 31;
        }
        */

        return -1;
    }

    /**
     * Returns the offset in days for the month relative to January
     * @param month numeric value of the month
     * @param year year
     * @return the offset in days for the month relative to January
     */
    public static int getMonthOffset(int month, int year){
        if (isLeapYear(year)){
            if (getMonthName(month) == "January"){
                return 0;
            }if (getMonthName(month) == "February"){
                return 3;
            }if (getMonthName(month) == "March"){
                return 4;
            }if (getMonthName(month) == "April"){
                return 0;
            }if (getMonthName(month) == "May"){
                return 2;
            }if (getMonthName(month) == "June"){
                return 5;
            }if (getMonthName(month) == "July"){
                return 0;
            }if (getMonthName(month) == "August"){
                return 3;
            }if (getMonthName(month) == "September"){
                return 6;
            }if (getMonthName(month) == "October"){
                return 1;
            }if (getMonthName(month) == "November"){
                return 4;
            }if (getMonthName(month) == "December"){
                return 6;
            }
        }else{
            if (getMonthName(month) == "January"){
                return 0;
            }if (getMonthName(month) == "February"){
                return 3;
            }if (getMonthName(month) == "March"){
                return 3;
            }if (getMonthName(month) == "April"){
                return 6;
            }if (getMonthName(month) == "May"){
                return 1;
            }if (getMonthName(month) == "June"){
                return 4;
            }if (getMonthName(month) == "July"){
                return 6;
            }if (getMonthName(month) == "August"){
                return 2;
            }if (getMonthName(month) == "September"){
                return 5;
            }if (getMonthName(month) == "October"){
                return 0;
            }if (getMonthName(month) == "November"){
                return 3;
            }if (getMonthName(month) == "December"){
                return 5;
            }
        }
        return -1;
    }

    /**
     * Returns the day of the week that the date falls on
     * @param month numeric value of the month
     * @param dayOfMonth day of the month
     * @param year year
     * @return the day of the week that the date falls on
     */
    public static int dayOfWeek(int month, int dayOfMonth, int year){
        double dayOfTheWeekOnJanFirst = (year + Math.floor( (year-1)/4 ) - Math.floor( (year-1)/100 ) + Math.floor( (year-1)/400 ) )%7;
        double offSet = getMonthOffset(month, year);
        if (offSet == -1 || month == 2 && dayOfMonth > 29){
            return -1;
        }else{
            double dayOfTheWeekOnFirstOfMonth = dayOfTheWeekOnJanFirst + offSet;
            return (int)((dayOfTheWeekOnFirstOfMonth+dayOfMonth-1)%7);
        }
    }

    /**
     * Returns the day of the week that the date falls on
     * @param month name of the month
     * @param dayOfMonth day of the month
     * @param year year
     * @return the day of the week that the date falls on
     */
    public static int dayOfWeek(String month, int dayOfMonth, int year){
        //int monthNum = getMonthNumber(month);
        return dayOfWeek(getMonthNumber(month), dayOfMonth, year);


        /*double dayOfTheWeekOnJanFirst = (year + Math.floor( (year-1)/4 ) - Math.floor( (year-1)/100 ) + Math.floor( (year-1)/400 ) )%7;
        double offSet = getMonthOffset(getMonthNumber(month), year);
        if (offSet == -1 || month == "February" && dayOfMonth > 29){
            return -1;
        }else{
            double dayOfTheWeekOnFirstOfMonth = dayOfTheWeekOnJanFirst + offSet;
            return (int)((dayOfTheWeekOnFirstOfMonth+dayOfMonth-1)%7);
        }*/


    }
}
