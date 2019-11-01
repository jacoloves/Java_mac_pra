package model;

public class musicLogic {
	public void execute(MusicChoice mc) {
		int price = mc.getPrice();
		// 税込10%を求める
		double taxPrice = price + (price * 0.1);

		mc.setAfterPrice(taxPrice);
	}
}
