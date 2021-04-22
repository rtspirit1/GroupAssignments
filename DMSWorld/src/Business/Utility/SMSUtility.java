/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

/**
 *
 * @author rtspi
 */
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;

public class SMSUtility {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACa953248eafe8b62db9ffaa51f29309e0";
  public static final String AUTH_TOKEN = "0400e748563d27179ada415c40daca7d";

  public static void main(String[] args) {
//    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//
//    Message message = Message.creator(new PhoneNumber("+16177089658"),
//        new PhoneNumber("+12244780006"), 
//        "Aye BSDK").create();
//
//    System.out.println(message.getSid());
  }
}
