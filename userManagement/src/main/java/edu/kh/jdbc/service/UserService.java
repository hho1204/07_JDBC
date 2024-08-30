package edu.kh.jdbc.service;

import java.util.List;

import edu.kh.jdbc.dto.User;

public interface UserService {

	/** 사용자 등록
	 * @param userId
	 * @return result : 1 || 0
	 * @throws Exception
	 */
	int insertUser(User user) throws Exception;

	int idCheck(String userId) throws Exception;
	
	/** 로그인
	 * 
	 * @param userId
	 * @param userPw
	 * @return
	 * @throws Exception
	 */
	User login(String userId, String userPw) throws Exception;

	

	List<User> selectAll() throws Exception;

	List<User> search(String searchId) throws Exception;



	User selectUser(String userNo) throws Exception;

	int deleteUser(int userNo) throws Exception;
		
	
	/** 사용자 정보 수정
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int updateUser(User user) throws Exception;

	


}