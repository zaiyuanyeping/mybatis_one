//package com.xxs.dao.impl;
//
//import com.xxs.dao.Usermapper;
//import com.xxs.domain.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class UsermapperImpl implements Usermapper {
//
//    @Override
//    public List<User> findAll() {
//        try {
//            // 利用mybatis向数据库查询所有User用户
//            //1 读取配置文件,将文件读成流的形式
//            InputStream stream = Resources.getResourceAsStream("SqlMapperConfig.xml");
//
//            //2 创建一个SqlSessionFactory(工厂)
//            SqlSessionFactory sqlSessionFactory =
//                    new SqlSessionFactoryBuilder().build(stream);
//
//            //3 创建一个SqlSession(工具,它是我们最重要的一个API,基于它可以完成对数据库的CRUD操作)
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//
//            //4 完成保存操作
//            //第一个参数:命名空间.statemnetId  表示这唯一一条sql语句
//            List<User> userList = sqlSession.selectList("Usermapper.findAll");
//
//            //5 提交事务(Mybatis默认不会自动提交事务)
//            sqlSession.commit();
//            //6 关闭资源
//            sqlSession.close();
//
//            return userList;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
