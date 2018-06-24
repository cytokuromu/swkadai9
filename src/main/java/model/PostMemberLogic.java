package model;

import dao.MembersDAO;

public class PostMemberLogic {
	public void execute(Member member) {
        MembersDAO dao = new MembersDAO();
        dao.create(member);
    }
}
