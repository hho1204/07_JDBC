package edu.kh.jdbc.dao;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.dto.User;

public interface UserDao {
	
	/**
	 * 
	 * @param conn
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int insertUser(Connection conn, User user) throws Exception;
	
	/** 아이디 중복 여부 확인
	 * @param conn
	 * @param userId
	 * @return result
	 * @throws Exception
	 */
	int idCheck(Connection conn, String userId) throws Exception;
	
	/** 로그인
	 * @param conn
	 * @param userId
	 * @param userPw
	 * @return loginUser
	 * @throws Exception
	 */

	User login(Connection conn, String userId, String userPw) throws Exception;

	List<User> selectAll(Connection conn) throws Exception;
	
	/** 검색어가 아이디에 포함된 사용자 조회
	 * @param conn
	 * @param searchId
	 * @return userList
	 * @throws Exception
	 */
	List<User> search(Connection conn, String searchId) throws Exception;
	
	/** 번호 조회
	 * 
	 * @param conn
	 * @return userList
	 * @throws Exception
	 */
	List<User> userFindNo(Connection conn) throws Exception;
	
	/**
	 * 
	 * @param conn
	 * @param userNo
	 * @return
	 */
	User selectUser(Connection conn, String userNo) throws Exception;
	
	/** 사용자 삭제 
	 * 
	 * @param conn
	 * @param userNo
	 * @return result
	 * @throws Exception
	 */
	int deleteUser(Connection conn, int userNo) throws Exception;

	int updateUser(Connection conn, User user) throws Exception;
	
}
