package mypack.msg.sender.decrator;

import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang.Validate;

//import javax.naming.NamingException;
//
//import com.oocl.ivo.frm.webservice.executor.LDAPUserManager;

public class DateUtils {
    public static final String PARAM_DISPLAY_DATEFORMAT = "dd-MMM-yyyy";

    public static final String PARAM_DISPLAY_DATETIMEFORMAT = "dd-MMM-yyyy hh:mm aa";

    /**
     * Caches for the DateFormatters.
     * 
     * @author LVBI Created on 2008/8/6
     */
    private static SoftReference simpleFormatter = null;

    /*
     * C# cannot accept null date. As negotiated, use 1-1-1 to represent null
     * and transfer between server and client
     */
 
    private static Date clientNullDate = DateUtils.createDate(1, 1, 1);

    public static SimpleDateFormat sf = null;

    static {
        try {
            sf = new SimpleDateFormat("d-MMM-yyyy kk.mm");
        } catch (Exception e) {
            sf = new SimpleDateFormat();
        }
    }

    public static final int NO_CHANGE = -1;

    public static Date getFormattedDate(String pattern, String val) {
        if ("".equals(val) || val == null) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(val, pos);
    }

    /**
     * US formatted date.
     * 
     * @author LVBI
     * @version 1.0, Aug 6, 2008
     * @param date
     * @param locale
     * @param pattern
     * @return String
     * @exception
     */
    public static String showFormatedDate(Date date, Locale locale, String pattern) {
        String ret = "";
        DateFormat formatter = null;
        if (simpleFormatter != null) {
            formatter = (DateFormat) simpleFormatter.get();
        }
        if (formatter == null) {
            /* No cache yet, or cached formatter GC'd */
            formatter = new SimpleDateFormat(pattern, locale);
            simpleFormatter = new SoftReference(formatter);
        }
        synchronized (formatter) {
            formatter.setTimeZone(TimeZone.getDefault());
            ret = formatter.format(date);
        }
        return ret;
    }

    // Usage DateHelper.showFormatedDate ( PARAM_DISPLAY_DATEFORMAT , new Date
    // () ) );
    public static String showFormatedDate(String pattern, Date date) {
        String dateString = "";
        if (null != date) {
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            dateString = formatter.format(date);
        }
        return dateString;
    }

    // Usage return day different in double for date1 and date2
    public static double diffDates(Date date1, Date date2) {
        long t1 = date1.getTime();
        long t2 = date2.getTime();
        return (double) (t2 - t1) / 86400000;
    }

    public static Date roundToHour(Date date) {
        // msec in hour
        if (date == null) {
            return null;
        }
        long dateLong = (long) (date.getTime() / 3600000L);
        return new Date(dateLong * 3600000L);
    }

    public static Date roundToLaterHour(Date date) {
        // msec in hour
        long dateLong = date.getTime();
        if (dateLong % 3600000L == 0) {
            return new Date(dateLong);
        } else {
            return new Date((dateLong / 3600000L + 1) * 3600000L);
        }
    }

    public static Date addHours(Date date, int hour) {
        // msec in hour
        long dateLong = date.getTime() + (long) hour * 3600000L;
        return new Date(dateLong);
    }

    public static Date addDays(Date date, int day) {
        return addHours(date, day * 24);
    }

    public static Date addMonths(Date date, int month) {
        if (date == null) {
            return date;
        }

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    public static Date getDateInGMT() {
        return new Date(createDateToMinute().getTime() - java.util.TimeZone.getDefault().getRawOffset());
    }

    public static Date getDateAccurateInGMT() {
        return new Date(createDateToSecond().getTime() - java.util.TimeZone.getDefault().getRawOffset());
    }

    public static Date getDateInGMT(Date date) {
        return new Date(date.getTime() - java.util.TimeZone.getDefault().getRawOffset());
    }

    public static Date trimSeconds(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date createDateToMilliSecond() {
        Calendar cal = Calendar.getInstance();
        return cal.getTime();
    }

    public static Date createDateToSecond() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date createDateToMinute() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date createDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date createNow() {
        Calendar cal = Calendar.getInstance();
        return cal.getTime();
    }

    public static Date createDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date createDate(int year, int month, int day, int hour, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date createDate(String year, String month, String day) {
        return createDate(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
    }

    public static Date getDateInLocal(Date gmtDate) {
        return new Date(gmtDate.getTime() + java.util.TimeZone.getDefault().getRawOffset());
    }

    public static String getSQLDateString(Date date) {
        return "to_date('" + showFormatedDate("yyyy/MM/dd HH:mm:ss", date) + "','YYYY/MM/DD HH24:MI:SS')";
    }

    public static String getSQLDateStringWithoutTime(Date date) {
        return "to_date('" + showFormatedDate("yyyy/MM/dd", date) + "','YYYY/MM/DD')";
    }

    public static int getYear(Date aDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        return c.get(Calendar.YEAR);
    }

    public static int getMonth(Date aDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        return c.get(Calendar.MONTH);
    }

    public static int getDay(Date aDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        return c.get(Calendar.DAY_OF_WEEK);
    }

    public static int getDate(Date aDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    public static int getHour(Date aDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        return c.get(Calendar.HOUR_OF_DAY);
    }

    public static int getMinute(Date aDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        return c.get(Calendar.MINUTE);
    }

    public static int getSecond(Date aDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        return c.get(Calendar.SECOND);
    }

    public static void setYear(Date aDate, int year) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        c.set(Calendar.YEAR, year);
        aDate.setTime(c.getTime().getTime());
    }

    public static void setMonth(Date aDate, int month) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        c.set(Calendar.MONTH, month);
        aDate.setTime(c.getTime().getTime());
    }

    public static void setDay(Date aDate, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        c.set(Calendar.DAY_OF_WEEK, dayOfMonth);
        aDate.setTime(c.getTime().getTime());
    }

    public static void setDate(Date aDate, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        aDate.setTime(c.getTime().getTime());
    }

    public static void setHour(Date aDate, int hour24) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        c.set(Calendar.HOUR_OF_DAY, hour24);
        aDate.setTime(c.getTime().getTime());
    }

    public static void setMinute(Date aDate, int minute) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        c.set(Calendar.MINUTE, minute);
        aDate.setTime(c.getTime().getTime());
    }

    public static void setSecond(Date aDate, int second) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        c.set(Calendar.SECOND, second);
        aDate.setTime(c.getTime().getTime());
    }

    // return a Date with only the year, month & day retained (i.e. the time
    // part is truncated)
    public static Date trimTime(Date aDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    public static Date alterDate(Date aDate, int year, int month, int date, int hour, int minute, int second,
            int milliSecond) {
        Calendar c = Calendar.getInstance();
        c.setTime(aDate);
        if (year != NO_CHANGE) {
            c.set(Calendar.YEAR, year);
        }
        if (month != NO_CHANGE) {
            c.set(Calendar.MONTH, month);
        }
        if (date != NO_CHANGE) {
            c.set(Calendar.DAY_OF_MONTH, date);
        }
        if (hour != NO_CHANGE) {
            c.set(Calendar.HOUR_OF_DAY, hour);
        }
        if (minute != NO_CHANGE) {
            c.set(Calendar.MINUTE, minute);
        }
        if (second != NO_CHANGE) {
            c.set(Calendar.SECOND, second);
        }
        if (milliSecond != NO_CHANGE) {
            c.set(Calendar.MILLISECOND, milliSecond);
        }
        return c.getTime();
    }

    public static String formatDateToString(Date date) {
        return formatDateToString(date, PARAM_DISPLAY_DATEFORMAT);
    }

    public static String formatDateToString(Date date, String format) {
        String result = null;
        SimpleDateFormat stdFormat = new SimpleDateFormat(format);
        if (date == null) {
            result = "";
        } else {
            result = stdFormat.format(date);
        }
        return result;
    }

    // input date+time and pattern only for Date portion
    public static Date getFormattedDatetime(String pattern, String val) {
        StringBuffer strSB = new StringBuffer();
        strSB.append(pattern);
        // if not set time portion format
        if (pattern.indexOf('h') == -1 && pattern.indexOf('H') == -1) {
            strSB.append(" ").append("hh:mm a");
        }
        String datetimePattern = strSB.toString();
        return getFormattedDate(datetimePattern, val);
    }

    // input date+time and pattern only for Date portion
    public static String showFormatedDatetime(String pattern, Date datetime) {
        StringBuffer strSB = new StringBuffer();
        strSB.append(pattern);
        // if not set time portion format
        if (pattern.indexOf('h') == -1 && pattern.indexOf('H') == -1) {
            strSB.append(" ").append("hh:mm a");
        }
        String datetimePattern = strSB.toString();
        return showFormatedDate(datetimePattern, datetime);
    }

    // input date+time and default pattern only for Date portion
    public static String formatDateTimeToString(Date datetime) {
        StringBuffer strSB = new StringBuffer();
        strSB.append(PARAM_DISPLAY_DATEFORMAT);
        strSB.append(" ").append("hh:mm a");
        String datetimePattern = strSB.toString();
        return formatDateToString(datetime, datetimePattern);
    }

    // trim the Date info and leave the Time info
    public static Date trimDate(Date date) {
        Calendar cal = convertToCalendar(date);
        cal.clear(Calendar.YEAR);
        cal.clear(Calendar.MONTH);
        cal.clear(Calendar.DATE);

        return cal.getTime();
    }

    // convert the Date to Calendar object
    public static Calendar convertToCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    /**
     * convert date to string in format d-MMM-yyyy kk.mm e.g. 3-Jul-2006 11.00
     * 
     * @param date
     * @return
     */
    public synchronized static String getDateStrForFileName(Date date) {
        return sf.format(date);
    }

    /**
     * convert date to be transferred from client to server call this method
     * before getting date from client
     * 
     * @param date
     * @author JINKI
     * @return converted date for server side use
     */
    public static Date convertDateFromClient(Date date) {

        // return (date == clientNullDate) ? null : date;
        /*
         * Modified by Joann Due to different TimeZone in Client, default value
         * for C# DateTime is not always 01-Jan-0001
         */
        Date result = date;
        if (result != null) {
            if (getYear(result) <= 2) {
                result = null;
            }
        }
        return result;

    }

    /**
     * convert date to be transferred from server to client call this method
     * before transferring date to client
     * 
     * @param date
     * @author JINKI
     * @return converted date for client side use
     */
    public static Date convertDateForClient(Date date) {
        return (null == date) ? clientNullDate : date;
    }

    private static final String DATE_TIME_PATTERN_FULL = "yyyy-MM-dd HH:mm:ss SSS";

    /**
     * convert date across timezone
     * 
     * @param date
     *            the <code>Date</code> in current timezone
     * @param zone
     *            the <code>TimeZone</code> which date is supposed to be
     *            converted into
     * @author JINKI
     * @return date in specified timezone
     */
    public static Date convertDateAcrossTimezone(Date date, TimeZone zone) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_PATTERN_FULL);
            sdf.setTimeZone(zone);
            String convertedDateString = sdf.format(date);
            sdf.setTimeZone(TimeZone.getDefault());
            return sdf.parse(convertedDateString);
        } catch (ParseException pe) {
            throw new RuntimeException(pe);
        }
    }

    /**
     * get first day of month
     * 
     * @param date
     * @author JINKI
     * @return first day of month specified by the date
     */
    public static Date getFirstDayOfMonth(Date date) {
        return createDate(getYear(date), getMonth(date) + 1, 1);
    }

    /**
     * get last day of month
     * 
     * @param date
     * @author JINKI
     * @return last day of month specified by the date
     */
    public static Date getLastDayOfMonth(Date date) {
        if (Calendar.UNDECIMBER == getMonth(date)) {
            return addDays(createDate(getYear(date) + 1, getMonth(date) + 1, 1), -1);
        } else {
            return addDays(createDate(getYear(date), getMonth(date) + 2, 1), -1);
        }
    }

    public static Date getLastDayOfMonthWithTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.roll(Calendar.DAY_OF_MONTH, -1);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static void main(String[] args) {
        // Date date = createDate(1001, 1, 5);
        // System.out.println(getFirstDayOfMonth(date));
        // System.out.println(getLastDayOfMonth(date));
    }

    public static String formatDateByLocale(Date date, String formatStr, String localeStr) {
        if (date == null) {
            return "";
        }
        Locale locale = new Locale(localeStr);
        DateFormat dateFormat = new SimpleDateFormat(formatStr, locale);
        return dateFormat.format(date);
    }

    final static BigDecimal NEG_TWELVE = new BigDecimal("-12");

    final static BigDecimal POS_FOURTEEN = new BigDecimal("14");

    static final String GMT = "GMT";

    public static final String formatTimeZone(BigDecimal offset) {
        Validate.notNull(offset);
        if (NEG_TWELVE.compareTo(offset) > 0 || POS_FOURTEEN.compareTo(offset) < 0) {
            throw new IllegalArgumentException(MessageFormat.format("{0} Exceed GMT Limit", offset));
        }
        BigDecimal abs = offset.abs();
        BigDecimal parta = abs.setScale(0, BigDecimal.ROUND_FLOOR);
        BigDecimal partb = abs.subtract(parta).multiply(new BigDecimal("60")).setScale(0, BigDecimal.ROUND_HALF_UP);
        return GMT + (offset.signum() < 0 ? "-" : "+")
                + (parta.compareTo(BigDecimal.TEN) > 0 ? parta : "0" + parta)
                + (partb.compareTo(BigDecimal.TEN) > 0 ? partb : "0" + partb);
    }

    static final int HOUR = 3600000;

    public static final String formatTimeZone(int rawOffset) {
        // Valid Offset is at least a quarter
        int abs = rawOffset * 4 / HOUR;
        Validate.isTrue(abs * HOUR / 4 == rawOffset);
        BigDecimal div = new BigDecimal(rawOffset);
        div = div.setScale(2);
        return formatTimeZone(div.divide(new BigDecimal(HOUR), BigDecimal.ROUND_HALF_DOWN));
    }
}