package gouri.JL.JLException;

import gouri.JL.enums.Branches;
import gouri.JL.utility.JLStatusCode;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class JLExceptionDemo {

    List<JLUser> users = Arrays.asList(
        new JLUser("John Doe", "john.deo@hotmail.com", "1234567890", UUID.randomUUID(), Branches.CSE),
        new JLUser("Jane Smith", "Molly Jane", "0987654321", UUID.randomUUID(), Branches.ECE),
        new JLUser("Alice Johnson", "alice Hopper", "5555555555", UUID.randomUUID(), Branches.EEE),
        new JLUser("Bob Brown", "bob Brown", "1111111111", UUID.randomUUID(), Branches.MECH),
        new JLUser("Charlie Davis", "charlie Davis", "2222222222", UUID.randomUUID(), Branches.CIVIL),
        new JLUser("David Wilson", "david Wilson", "3333333333", UUID.randomUUID(), Branches.CSE),
        new JLUser("Eve Thompson", "eve Adam", "4444444444", UUID.randomUUID(), Branches.ECE),
        new JLUser("Frank Miller", "frank Miller", "6666666666", UUID.randomUUID(), Branches.EEE),
        new JLUser("Grace Lee", "grace Lee", "7777777777", UUID.randomUUID(), Branches.MECH),
        new JLUser("Hannah White", "hannah White", "8888888888", UUID.randomUUID(), Branches.CIVIL),
            new JLUser("Ivy Green", "ivy Green", "9999999999", UUID.randomUUID(), Branches.CSE),
            new JLUser("Jack Black", "jack Black", "0000000000", UUID.randomUUID(), Branches.ECE)
    );

    public static void main(String[] args) {
        JLExceptionDemo demo = new JLExceptionDemo();
        demo.validateUsers();
    }

    private Result validateUsers() {
        Result result = new Result();
        try {
            for (JLUser user : users) {
                if (user.getUsername() == null || user.getUsername().isEmpty()) {
                    throw new JLException("Username cannot be null or empty");
                }
                if (user.getEmail() == null || user.getEmail().isEmpty()) {
                    throw new JLException("Email cannot be null or empty");
                }
                if (user.getContactNumber() == null || user.getContactNumber().isEmpty()) {
                    throw new JLException("Contact number cannot be null or empty");
                }
                if (user.getSSN() == null) {
                    throw new JLException("SSN cannot be null");
                }
                if (user.getBranch() == null) {
                    throw new JLException("Branch cannot be null");
                }
            }
            result.setMessage("All users are valid");
            result.setStatusCode(JLStatusCode.SUCCESS);
        } catch (JLException e) {
            result.setMessage(e.getMessage());
            result.setStatusCode(JLStatusCode.GENERIC_ERROR);
        } catch (Exception e) {
            result.setMessage("An unexpected error occurred: " + e.getMessage());
            result.setStatusCode(JLStatusCode.GENERIC_ERROR);
        }
        return result;
    }

}
