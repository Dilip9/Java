package gouri.JL.JLException;

import gouri.JL.enums.Branches;

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

}
