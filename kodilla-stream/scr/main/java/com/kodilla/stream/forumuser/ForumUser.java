package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public ForumUser(final int ID, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postsNumber) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}