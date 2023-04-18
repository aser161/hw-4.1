package com.example.hw_4_1;

public class User {
    private String login ;
    private String mail;

    public User() {

    }

    public User(String login , String mail) {
        this.login  = login ;
        this.mail = mail;
        if (!this.checkUserArgs() || !this.compareLoginMail() || !this.checkAreArgs()) {
            throw new IllegalArgumentException();
        }
    }

    private boolean checkUserArgs(){
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

    private boolean compareLoginMail(){
        return !getLogin().equals(getMail());
    }

    private boolean checkAreArgs (){
        boolean log = !this.getLogin().isEmpty() && !this.getLogin().isBlank() && this.getLogin() != null;
        boolean mail = !this.getMail().isEmpty() && !this.getMail().isBlank() && this.getMail() != null;
        return log && mail;
    }

    public String getLogin () {
        return login ;
    }

    public String getMail() {
        return mail;
    }
}
