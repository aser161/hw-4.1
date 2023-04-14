package com.example.hw_4_1;

public class User {
    private String login ;
    private String mail;

    public User() {

    }

    public User(String login , String mail) {
        this.login  = login ;
        this.mail = mail;
    }

    public boolean checkUserArgs(){
        char[] chars = getMail().toCharArray();
        for (char sim:chars) {
            if (sim == '@') {
                for (char sim1:chars){
                    if (sim1 == '.') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean compareLoginMail(){
        return !getLogin().equals(getMail());
    }

    public String getLogin () {
        return login ;
    }

    public String getMail() {
        return mail;
    }
}
