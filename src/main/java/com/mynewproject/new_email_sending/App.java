package com.mynewproject.new_email_sending;


public class App 
{
    public static void main( String[] args )
    {
    	GEmailSender gEmailSender = new GEmailSender();
        String to = "harshita@gmail.com";
        String from = "harshita44@gmail.com";
        String subject = "Second: Sending email using GMail";
        String text = "This is a example email send using gmail and java program with out less secure app";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }
    }
}
