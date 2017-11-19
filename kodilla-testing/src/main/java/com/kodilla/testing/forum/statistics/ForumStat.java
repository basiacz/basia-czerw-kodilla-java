package com.kodilla.testing.forum.statistics;

public class ForumStat {
    private Statistics stat;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public ForumStat(Statistics stat) {
        this.stat = stat;
    }


    public void calculateAdvStatistics() {
        usersCount = stat.usersNames().size();
        postsCount = stat.postsCount();
        commentsCount = stat.commentsCount();
        if (usersCount != 0) {
            postsPerUser = postsCount / usersCount;
            commentsPerUser = commentsCount / usersCount;
        } else {
            postsPerUser = 0;
            commentsPerUser = 0;
        }
        if (postsCount != 0) {
            commentsPerPost = commentsCount / postsCount;
        }else{
            commentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ForumStat{" +
                "usersCount=" + usersCount +
                ", postsCount=" + postsCount +
                ", commentsCount=" + commentsCount +
                ", postsPerUser=" + postsPerUser +
                ", commentsPerUser=" + commentsPerUser +
                ", commentsPerPost=" + commentsPerPost +
                '}';
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
