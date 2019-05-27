package dairy;

public class Account {

	private String userId;
	private String password;

	public Account(String userID, String pass) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.userId = userID;
		this.password = pass;
	}


	public String getUserID() {
		return userId;
	}

	public String getPass() {
		return password;
	}
}
