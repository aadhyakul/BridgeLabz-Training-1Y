package com.gla.interfaceAbstraction;

import java.io.*;

class UserData implements Serializable {
    String username;
    String email;

    UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }
}

public class DataSerializationForBackup {
    public static void main(String[] args) throws Exception {
        UserData user = new UserData("Alice", "alice@email.com");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.ser"));
        out.writeObject(user);
        out.close();
        System.out.println("Backup saved for: " + user.username);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("backup.ser"));
        UserData restored = (UserData) in.readObject();
        in.close();
        System.out.println("Restored: " + restored.username + " | " + restored.email);
    }
}