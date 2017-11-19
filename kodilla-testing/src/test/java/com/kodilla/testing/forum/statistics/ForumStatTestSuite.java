package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatTestSuite {
    Statistics statMock = mock(Statistics.class);
    ForumStat fs = new ForumStat(statMock);

    @Test
    public void testCalculateStatisticsPosts0() {
        //given
        int testPosts = 0;
        when(statMock.postsCount()).thenReturn(testPosts);

        //when
        fs.calculateAdvStatistics();

        //then
        Assert.assertEquals(0, fs.getPostsCount());
        fs.showStatistics();
    }
    @Test
    public void testCalculateStatisticsPosts1000() {
        //given
        int testPosts1000 = 1000;
        when(statMock.postsCount()).thenReturn(testPosts1000);

        //when
        fs.calculateAdvStatistics();

        //then
        Assert.assertEquals(1000, fs.getPostsCount());
        fs.showStatistics();
    }
    @Test
    public void testCalculateStatisticsComments0() {
        //given
        int testComments = 0;
        when(statMock.commentsCount()).thenReturn(testComments);

        //when
        fs.calculateAdvStatistics();

        //then
        Assert.assertEquals(0, fs.getCommentsCount());
        fs.showStatistics();
    }
    @Test
    public void testCalculateStatisticsPostsGraterThanComments() {
        //given
        int testPosts100 = 100;
        int testComments10 = 10;
        when(statMock.commentsCount()).thenReturn(testComments10);
        when(statMock.postsCount()).thenReturn(testPosts100);

        //when
        fs.calculateAdvStatistics();

        //then
        Assert.assertTrue(testComments10 < testPosts100);
        fs.showStatistics();
    }
    @Test
    public void testCalculateStatisticsCommentsGraterThanPosts() {
        //given
        int testPosts10 = 10;
        int testComments100 = 100;
        when(statMock.commentsCount()).thenReturn(testComments100);
        when(statMock.postsCount()).thenReturn(testPosts10);

        //when
        fs.calculateAdvStatistics();

        //then6
        Assert.assertTrue(testComments100 > testPosts10);
        fs.showStatistics();
    }
        @Test
        public void testCalculateStatisticsUsers0 () {
            //given
            List<String> testUsers = new ArrayList<>();
            when(statMock.usersNames()).thenReturn(testUsers);

            //when
            fs.calculateAdvStatistics();

            //then
            Assert.assertEquals(0, fs.getUsersCount());
            fs.showStatistics();
        }
        @Test
        public void testCalculateStatisticsUsers100 () {
            //given
            List<String> testUsers = new ArrayList<>();
            for (int i = 1; i < 101; i++) {
                testUsers.add("USER" + i);
            }

            when(statMock.usersNames()).thenReturn(testUsers);

            //when
            fs.calculateAdvStatistics();

            //then
            Assert.assertEquals(100, fs.getUsersCount());
            fs.showStatistics();
    }
}