package dao;


//import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import model.Login;
import model.Member;

public class MembersDAO {
	//private final String DRIVER_NAME = "org.apache.derby.jdbc.ClientDriver";
    //private final String JDBC_URL = "jdbc:derby://localhost:1527/db0104";
    //private final String DB_USER = "db";
    //private final String DB_PASS = "db";
    String[] name=new String[1000];
	String[] id=new String[1000];
	String[] phone=new String[1000];
	String[] mail=new String[1000];
	String[] address=new String[1000];
	String[] pass=new String[1000];
	int idx=0;
	int allidx=0;

	public Member findByLogin(Login login) {
        //Connection conn = null;
        Member member = null;
        id[0]="1111";
	name[0]="umeko";
	phone[0]="000000";
	mail[0]="00000000";
	address[0]="00000000";
	pass[0]="00000000";
	System.out.println(id[1]);

        	for(int i=0;i<=allidx;i++){
            	if(login.getId().equals(id[i])){
                    System.out.println("A");
            		idx=i;
                        if(login.getPass().equals(pass[idx])){
                member = new Member(name[idx], phone[idx], mail[idx], id[idx], pass[idx], address[idx]);
                return member;
            }else return null;
            	}
            }
return null;
    }

    public List<Member> findAll() {
        //Connection conn = null;
        List<Member> memberList = new ArrayList<Member>();       
        for(int i=0;i<=allidx;i++){
            String nameset = name[i];
                String Idset = id[i];
                String phoneset = phone[i];
                String mailset = mail[i];
                String passset = pass[i];
                String addressset = address[i];
                Member review = new Member(nameset, Idset, phoneset, mailset, passset, addressset);
                memberList.add(review);
        }
        return memberList;
    }

    public boolean create(Member member) {
        if(member.getName()!=null && member.getId()!=null && member.getPhone()!=null && 
        		member.getMail()!=null && member.getPass()!=null && member.getAddress()!=null){
        	allidx++;
        	idx=allidx;
        	name[idx]=member.getName();
        	id[idx]=member.getId();
        	phone[idx]=member.getPhone();
        	mail[idx]=member.getMail();
        	pass[idx]=member.getPass();
        	address[idx]=member.getAddress();
                System.out.println("A "+idx);
        	return true;
        }else return false;
    }

}
