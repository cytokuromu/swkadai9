package model;

import java.util.List;
import dao.MembersDAO;

public class GetMemberListLogic {
	 public List<Member> execute() {
	        MembersDAO dao = new MembersDAO();
	        List<Member> memberList = dao.findAll();
	        return memberList;
	    }
}
