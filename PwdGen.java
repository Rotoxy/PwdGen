package assignment;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.Random;

public class PwdGen {

    public static void main(String[] args) {
        int char1, char2, char3, char4, char5, char6, char7, char8;
        try {
            String fname = JOptionPane.showInputDialog("Enter your first name: ");
            String lname = JOptionPane.showInputDialog("Enter your last name: ");
            String gender = JOptionPane.showInputDialog("Enter your gender: ");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
            String new_age = Integer.toString(age);
            long phone = Long.parseLong(JOptionPane.showInputDialog("Enter your phone number: "));
            String new_phone = Long.toString(phone);
            String religion = JOptionPane.showInputDialog("Enter your religion: ");

            String email;
            Boolean mailcheck;
            do {
                email = JOptionPane.showInputDialog("Enter your email: ");
                mailcheck = email.contains("@");
            } while (!mailcheck);

            Random ran = new Random();
            System.out.println();

            char1 = ran.nextInt(fname.length());
            char2 = ran.nextInt(lname.length());
           char3 = ran.nextInt(gender.length());
            char4 = ran.nextInt(new_phone.length());
            char5 = ran.nextInt(email.length());
            char6 = ran.nextInt(religion.length());
            char7 = ran.nextInt(email.length());
            char8 = ran.nextInt(new_age.length());

            char w1, w2, w3, w4, w5, w6, w7, w8;
            w1 = fname.charAt(char1);
            w2 = lname.charAt(char2);
            w3 = gender.charAt(char3);
            w4 = new_phone.charAt(char4);
            w5 = email.charAt(char5);
            w6 = religion.charAt(char6);
            w7 = email.charAt(char7);
            w8 = new_age.charAt(char8);
            //System.out.println(w1);
            //System.out.println(w2);

            char[] pwd = {w1, w2, w3, w4, w5, w6, w7, w8};
            String password = new String(pwd);

           JOptionPane.showMessageDialog(null, "Your default password is: " + password);
        } catch (HeadlessException | NumberFormatException  | IndexOutOfBoundsException e) {
            e.getMessage();
        }
    }
}
