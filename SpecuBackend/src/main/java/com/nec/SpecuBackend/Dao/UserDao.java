package com.nec.SpecuBackend.Dao;

import java.util.List;

import com.nec.SpecuBackend.Model.User;

public interface UserDao {
	
	void saveOrUpdateUser(User user);
	
	void deleteUser(String email);
	
	User getUser(int uid);
	
	List<User> listUserDetails();
	
	User getUserByEmail(String email);
	
	User checkUser(String email,String password);

}
