package model;

public class Member {
	private int nomber;
    private String name;
    private String phone;
    private String mail;
    private String Id;
    private String pass;
    private String address;

    public Member(String name, String Id, String phone, String mail, String pass, String address) {
        //this.nomber = nomber;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.Id = Id;
        this.pass = pass;
        this.address = address;
    }

    public String getName(String Id) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomber() {
        return nomber;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
