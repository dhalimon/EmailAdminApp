package emailApp;

import java.util.Scanner;


    public class Email {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private String email;
        private int mailboxCapacity = 200;
        private int defaultPasswordLength = 7;
        private String alternateEmail;
        private String companySuffix = "computermentors.org";


        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

            // call a method asking for the department - return the department
            this.department = setDepartment();

            // call a method that returns a random password
            this.password = randomPassword(defaultPasswordLength);


            // combine elements to generate email
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        }
        // Constructor to receive the first name and the last name

        // Ask for the department
        private String setDepartment() {
            System.out.print("New worker: " + firstName + ". DEPARTMENT CODES\n1 for Management\n2 for Instructors\n3 for Technology\n4 for Office\n0 for none\nEnter department code: ");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if (depChoice == 1) {
                return "sales";
            } else if (depChoice == 2) {
                return "dev";
            } else if (depChoice == 3) {
                return "acct";
            } else {
                return "";
            }
        }

        // Generate a random password
        private String randomPassword(int length) {
            String passwordSet = "ABCDEFGHIJKLMNOPKRSTUWXYZ0123456789!!#@$";
            char[] password = new char[length];
            for (int i = 0; i < length; i++) {
                int rand = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }
            return new String(password);
        }

        // Set the mailbox capacity
        public void setMailBoxCapacity(int capacity) {
            this.mailboxCapacity = capacity;
        }

        //Set the alternate email
        public void setAlternateEmail(String altEmail) {
            this.alternateEmail = altEmail;
        }

        // Change the password
        public void changePassword(String password) {
            this.password = password;
        }

        public String showInfo() {
            return "DISPLAY NAME: " + firstName + " " + lastName +
                    "\nCOMPANY EMAIL: " + email +
                    "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
        }
    }

