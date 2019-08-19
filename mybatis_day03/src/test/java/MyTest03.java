import com03.Order;
import com03.OrderMapper;
import com03.User;
import com03.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest03 {


    @Test
    public void test03() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig_day03.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userAndRoleAll = userMapper.findUserAndRoleAll();
        System.out.println("userAndRoleAll = " + userAndRoleAll);
    }

    @Test
    public void test02() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig_day03.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.fiandAll();
        System.out.println("orderList = " + orderList);
    }

    @Test
    public void test01() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig_day03.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User>userList = userMapper.findAllUser();
        System.out.println("userMapperAll = " + userList);
    }
}
