package com.xxs.MyBatisTest;

import com.xxs.dao.UserDao;
import com.xxs.domain.User;
import com.xxs.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class MyBatisCRUDTest {
    @Test
    public void testInsert(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserDao usermapper = sqlSession.getMapper(UserDao.class);

        User user = new User("xuba","654","654987321@qq.com",new Date());

        usermapper.insert(user);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserDao usermapper = sqlSession.getMapper(UserDao.class);

        usermapper.update("xcxx",6);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserDao usermapper = sqlSession.getMapper(UserDao.class);

        usermapper.delete(6);

        sqlSession.commit();
        sqlSession.close();
    }

}
