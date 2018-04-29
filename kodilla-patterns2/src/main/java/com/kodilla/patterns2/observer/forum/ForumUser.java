package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer{
    private final String usermane;
    private int updateCount;

    public ForumUser(String usermane){
        this.usermane = usermane;
    }

    @Override
    public void update(ForumTopic forumTopic){
        System.out.println(usermane + ": New messages in topic " +forumTopic.getName() + "\n" +
            " (total: " + forumTopic.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsermane(){
        return usermane;
    }

    public int getUpdateCount(){
        return updateCount;
    }
}