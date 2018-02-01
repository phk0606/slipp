package net.slipp.dao.users;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import net.slipp.domain.users.User;

@Repository("userDao")
public class MybatisUserDao implements UserDao {
	private static final Logger logger = LoggerFactory.getLogger(MybatisUserDao.class);
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;	

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}	

	@Override
	public User findById(String userId) {
		return sqlSession.selectOne("UserMapper.findById", userId);
	}

	@Override
	public void create(User user) {
		sqlSession.insert("UserMapper.create", user);
	}

	@Override
	public void update(User user) {
		sqlSession.update("UserMapper.update", user);
	}

}
