package com.example.arvind.svceinterrupt;

/**
 * Created by Arvind on 02-09-2018.
 */

public interface MailInterface {
    public void getMail(String mail);

    public String sendMail();

    public void storePass(String pass);

    public String getPass();
}
