package com.xxs.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory=null;
    static {
        try {
            // 利用mybatis向数据库查询所有User用户
            //1 读取配置文件,将文件读成流的形式
            InputStream stream = Resources.getResourceAsStream("SqlMapperConfig.xml");

            //2 创建一个SqlSessionFactory(工厂)
            sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
