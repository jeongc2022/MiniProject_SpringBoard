package static2;

import java.text.SimpleDateFormat;
import java.util.Date;

class Util{
	public static String getCurrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
}
public class Sample4 {

	public static void main(String[] args) {
		System.out.println(Util.getCurrentDate("yyyMMdd"));	// 오늘 날짜 출력

	}

}
