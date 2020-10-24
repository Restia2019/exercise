import java.util.Scanner;

public class Geshihuashuchu {

	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
        System.out.println("请输入地名： ");
        String diming = stdin.next();
        System.out.println("请输入公司名称：");
        String gongshi = stdin.next();
        System.out.println("请输入老板名称：");
        String laoban = stdin.next();
        System.out.println("请输入金额： ");
        double jine = stdin.nextDouble();
        System.out.println("请输入产品： ");
        String chanpin = stdin.next();
        System.out.println("请输入价格计量单位： ");
        String danwei = stdin.next();
        String format = "%s最大%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%.1f个亿，带着他的小姨子跑了！我们没办法，拿着%s抵工资！原价都是一%s多、二%s多、三%s多的%s,现在全部只卖二十块，统统二十块！%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(format, diming,gongshi,laoban,jine,chanpin,danwei,danwei,danwei,chanpin,laoban);
	}

}
