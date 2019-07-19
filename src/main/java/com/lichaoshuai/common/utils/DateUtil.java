package com.lichaoshuai.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateUtil {

	/*
	 * 返回月末 方法2�?(5�?) 给一个时间对象，返回该时间所在月的最后日23�?59�?59秒，�?要�?�虑月大月小和二月特殊情况�??
	 * 例如�?个Date对象的�?�是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	 * 例如�?个Date对象的�?�是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 */
	public static Date getDateByFullMonth(Date src) {
		// 用传入的日期,初始化日历类. 然后让当前日期设置为下个月的月初,�?后在
		// 月初减去 1�?. 就能变成传入日期的月末了

		Calendar c = Calendar.getInstance();
		c.setTime(src);
		// 让当前月份加1
		c.add(Calendar.MONTH, 1);
		// 获取月初
		Date monthStart = getDateByInitMonth(c.getTime());
		// 用月初初始化日历�?
		c.setTime(monthStart);
		// 用月初时�? -1 �?
		c.add(Calendar.SECOND, -1);

		return c.getTime();

	}

	/*
	 * 返回月初 方法1�?(5�?) 给一个时间对象，返回该时间所在月�?1�?0�?0�?0秒�?�例如一个Date对象的�?�是2019-05-18 11:37:22
	 * 则返回的结果�?2019-05-01 00:00:00
	 * 
	 */
	public static Date getDateByInitMonth(Date src) {

		// 获取Calendar对象
		Calendar c = Calendar.getInstance();
		// 用传入的时间初始化日历对�?
		c.setTime(src);

		// 改变日期�? �?,�?,�?.�?

		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);

		return c.getTime();

	}

	/**
	 * 
	 * @Title: randomDate
	 * @Description: 返回在某个日期区间的随机日期
	 * @param startDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate) {
		// 用当前时间获取日历类
		Calendar c = Calendar.getInstance();
		// 当前时间的毫秒�??.. 即从1970到现在的毫米�?
		long endMillis = c.getTimeInMillis();
		// System.out.println("endMillis="+endMillis);

		// 用传入的日期初始化日历类Calendar

		c.setTime(startDate);
		// 获取�?始时间的毫米�?
		long startMillis = c.getTimeInMillis();
		// System.out.println("startMillis="+startMillis);

		long x = (long) (Math.random() * (endMillis - startMillis + 1)) + startMillis;
		// System.out.println("x="+x);

		// 用时间差创建日历�?
		c.setTimeInMillis(x);

		return c.getTime();
	}

}
