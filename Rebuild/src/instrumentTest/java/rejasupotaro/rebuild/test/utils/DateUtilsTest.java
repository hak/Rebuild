package rejasupotaro.rebuild.test.utils;

import android.test.AndroidTestCase;

import rejasupotaro.rebuild.utils.DateUtils;

public class DateUtilsTest extends AndroidTestCase {

    public void testFormatCurrentTime() {
        {
            int currentTime = 1000;
            assertEquals("00:01", DateUtils.formatCurrentTime(currentTime));
        }
        {
            int currentTime = 10000;
            assertEquals("00:10", DateUtils.formatCurrentTime(currentTime));
        }
        {
            int currentTime = 100000;
            assertEquals("01:40", DateUtils.formatCurrentTime(currentTime));
        }
    }

    public void testFormatPubDate() {
        {
            String source = "Thu, 31 Oct 2013 00:00:00 -0700";
            assertEquals("Oct 31\n2013", DateUtils.formatPubDate(source));
        }
        {
            String source = "Tue, 11 Jun 2013 00:00:00 -0700";
            assertEquals("Jun 11\n2013", DateUtils.formatPubDate(source));
        }
        {
            String source = "Wed, 13 Mar 2013 00:00:00 -0700";
            assertEquals("Mar 13\n2013", DateUtils.formatPubDate(source));
        }
    }
}
