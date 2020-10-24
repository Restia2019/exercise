public class This {
	String name; // 姓名
	float hp; // 血量
	float armor; // 护甲
	int moveSpeed; // 移动速度

	public void setName1(String heroName) {
		name = heroName;
	}


	public void setName2(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		This h = new This();
		
		h.setName1("死歌1");
		System.out.println(h.name);

		h.setName2("死歌2");
		System.out.println(h.name);
	}
}
