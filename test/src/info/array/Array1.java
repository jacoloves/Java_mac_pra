package info.array;

public class Array1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name[] = new String[3];
		double height[] = new double[3];

		name[0] = "山田";
		name[1] = "田中";
		name[2] = "鈴木";
		height[0] = 170.2;
		height[1] = 183.2;
		height[2] = 175.7;

		for (int i = 0; i < 3; i++) {
			System.out.println(name[i] + ":" + height[i] + "cm");
		}
	}

}
