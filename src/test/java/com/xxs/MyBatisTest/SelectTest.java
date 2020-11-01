package com.xxs.MyBatisTest;

import com.xxs.dao.UserDao;
import com.xxs.domain.User;
import com.xxs.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SelectTest {
//    单项查询
//    @Test
//    public void selectOne(){
//        SqlSession sqlSession = MyBatisUtils.getSqlSession();
//        UserDao usermapper = sqlSession.getMapper(UserDao.class);
//
//        User user = usermapper.findById(1);
//        System.out.println(user);
//
//
//        sqlSession.commit();
//        sqlSession.close();
//    }

//  两项查询
    @Test
    public void selectOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao usermapper = sqlSession.getMapper(UserDao.class);

        User user = usermapper.findByUserNameAndPWD("李四", "456789");

        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectList(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao usermapper = sqlSession.getMapper(UserDao.class);
//第一种模糊查询
        List<User> userList = usermapper.findNameLike("%三%");
        userList.forEach(user -> System.out.println(user));
        sqlSession.commit();
        sqlSession.close();
    }
}
