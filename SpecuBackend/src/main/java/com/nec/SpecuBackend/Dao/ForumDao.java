package com.nec.SpecuBackend.Dao;

import java.util.List;

import com.nec.SpecuBackend.Model.Forum;

public interface ForumDao {
	
	void saveOrUpdateForum(Forum forum);

	void deleteForum(int fid);

	Forum getForum(int fid);

	List<Forum> listForums();
	
	List<Forum> listForumByCreatedAt(String status);
}
