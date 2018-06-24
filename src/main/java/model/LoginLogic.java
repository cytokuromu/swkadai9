package model;

import dao.MembersDAO;

public class LoginLogic {
	public boolean execute(Login login) {
        MembersDAO dao = new MembersDAO();
        Member account = dao.findByLogin(login);
        return account != null;
    }
}
