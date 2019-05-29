package DTO;

import DAO.LoginDAO;
import dairy.Account;
import dairy.Login;

public class LoginDto {
	public boolean execute(Login login) {
		LoginDAO dao = new LoginDAO();
		Account account = dao.findByLogin(login);
		
		return account != null;

	}
}
