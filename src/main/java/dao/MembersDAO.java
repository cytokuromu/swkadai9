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
	List<String> name=new ArrayList<String>();
	List<String> id=new ArrayList<String>();
	List<String> phone=new ArrayList<String>();
	List<String> mail=new ArrayList<String>();
	List<String> address=new ArrayList<String>();
	List<String> pass=new ArrayList<String>();
    /*String[] name=new String[1000];
	String[] id=new String[1000];
	String[] phone=new String[1000];
	String[] mail=new String[1000];
	String[] address=new String[1000];
	String[] pass=new String[1000];*/
	
	int idx=0;
	int allidx=0;

	public Member findByLogin(Login login) {
        //Connection conn = null;
        Member member = null;
        /*id[0]="1111";
	name[0]="umeko";
	phone[0]="000000";
	mail[0]="00000000";
	address[0]="00000000";
	pass[0]="00000000";*/
        id.add("1111");
        name.add("umeko");
        phone.add("000");
        mail.add("00");
        address.add("Aa");
        pass.add("0000");
	//System.out.println(id[1]);
       /* System.out.println("A:"+allidx);
    	System.out.println(id.get(allidx));
    	System.out.println(name.get(allidx));
    	System.out.println(phone.get(allidx));
    	System.out.println(mail.get(allidx));
    	System.out.println(address.get(allidx));
    	System.out.println(pass.get(allidx));
*/
        	for(int i=0;i<=allidx;i++){
            	if(login.getId().equals(id.get(i))){
                    System.out.println("A");
                    idx=i;
                        if(login.getPass().equals(pass.get(idx))){
                member = new Member(name.get(idx), phone.get(idx), mail.get(idx), id.get(idx), pass.get(idx), address.get(idx));
                return member;
            }else return null;
            	}
            }
return null;
    }

    public List<Member> findAll() {
        //Connection conn = null;
        List<Member> memberList = new ArrayList<Member>();       
        /*for(int i=0;i<=allidx;i++){
            String nameset = name[i];
                String Idset = id[i];
                String phoneset = phone[i];
                String mailset = mail[i];
                String passset = pass[i];
                String addressset = address[i];
                Member review = new Member(nameset, Idset, phoneset, mailset, passset, addressset);
                memberList.add(review);
        }*/
        return memberList;
    }

    public boolean create(Member member) {
        if(member.getName()!=null && member.getId()!=null && member.getPhone()!=null && 
        		member.getMail()!=null && member.getPass()!=null && member.getAddress()!=null){
        	/*allidx++;
        	idx=allidx;
        	name[idx]=member.getName();
        	id[idx]=member.getId();
        	phone[idx]=member.getPhone();
        	mail[idx]=member.getMail();
        	pass[idx]=member.getPass();
        	address[idx]=member.getAddress();
                System.out.println("A "+idx);*/
        	
        	id.add(member.getId());
            name.add(member.getName());
            phone.add(member.getPhone());
            mail.add(member.getMail());
            address.add(member.getAddress());
            pass.add(member.getPass());
        	allidx++;
        	
        	/*System.out.println(allidx-1);
        	System.out.println(id.get(allidx-1));
        	System.out.println(name.get(allidx-1));
        	System.out.println(phone.get(allidx-1));
        	System.out.println(mail.get(allidx-1));
        	System.out.println(address.get(allidx-1));
        	System.out.println(pass.get(allidx-1));*/
        	return true;
        }else return false;       
    }
    public String getId(int i) {
        return id.get(i);
    }
}
