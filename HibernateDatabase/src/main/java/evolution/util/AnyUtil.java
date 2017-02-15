package evolution.util;

public class AnyUtil {
	public static int randomInt() {
		return ((Long) Math.round(Math.random() * 10000)).intValue();
	}
}
