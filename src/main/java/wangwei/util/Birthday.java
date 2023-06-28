package wangwei.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Birthday {
    public static int calculateAge(String birthday) {
        LocalDate birthDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthDate.getYear();

        // 如果当前月份小于生日的月份，或者当前月份等于生日的月份但日期小于生日的日期，则年龄减一
        if (currentDate.getMonthValue() < birthDate.getMonthValue()
                || (currentDate.getMonthValue() == birthDate.getMonthValue()
                && currentDate.getDayOfMonth() < birthDate.getDayOfMonth())) {
            age--;
        }

        return age;
    }

    public static String calculateZodiac(String birthday) {
        LocalDate birthDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int year = birthDate.getYear();

        // 根据出生年份计算生肖
        String[] zodiacs = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊","猴", "鸡", "狗", "猪"};
        int index = (year - 1900) % 12;
        if (index < 0) {
            index += 12;
        }
        return zodiacs[index];
    }



    public static String calculateConstellation(String birthday) {
        LocalDate birthDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();

        // 根据出生月份和日期计算星座
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "水瓶座";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "双鱼座";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "白羊座";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "金牛座";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            return "双子座";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            return "巨蟹座";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "狮子座";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "处女座";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 23)) {
            return "天秤座";
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 22)) {
            return "天蝎座";
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) {
            return "射手座";
        } else {
            return "摩羯座";
        }
    }
}
