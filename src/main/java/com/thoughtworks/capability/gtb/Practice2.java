package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    List<Integer> weekend = new ArrayList<>();
    weekend.add(5);
    weekend.add(6);
    weekend.add(7);
    int dayOfWeek = date.getDayOfWeek().getValue();
    int distanceOfMonday = 1;
    if (weekend.contains(dayOfWeek)) {
      distanceOfMonday = 3 - weekend.indexOf(dayOfWeek);
    }
    return date.plusDays(distanceOfMonday);
  }
}
