package 기타;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime {

    public static String getTodayDate(){
        // 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
        LocalDateTime now = LocalDateTime.now();

        // 현재 날짜 구하기(seoul)
        ZoneId zid = ZoneId.of("Asia/Seoul");
        LocalDate Now = LocalDate.now(zid);

        // 결과 출력

        String year = Integer.toString(Now.getYear());
        String month = Integer.toString(Now.getMonthValue());
        String day = Integer.toString(Now.getDayOfMonth());

        month = changeMonthFormat(month);

        System.out.println("getTimeForWeatherApi/getTodayDate" + year.concat(month).concat(day));
        String date = day.concat(year.concat(month));


        return date;
    }

    private static String changeMonthFormat(String month) {
        if (month.length() == 1){
            month = "0".concat(month);
        }
        return month;
    }


    public static void main(String[] args) {
        getTodayDate();
    }
}
