package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {

        userList.add(new ForumUser(1, "JohnS", 'M', 1992, 2,
                1, 5));
        userList.add(new ForumUser(2, "CelinaG", 'F', 1980,9,
                30, 15));
        userList.add(new ForumUser(3,"PaulinaD", 'F', 2000, 1,
                15, 3));
        userList.add(new ForumUser(4, "MateuszC", 'M', 1996, 5,
                6, 8));
        userList.add(new ForumUser(5, "GrzegorzM", 'F', 1995, 3,
                20, 9 ));
        userList.add(new ForumUser(6, "HalinaK", 'F', 1989,6,
                18, 10));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}