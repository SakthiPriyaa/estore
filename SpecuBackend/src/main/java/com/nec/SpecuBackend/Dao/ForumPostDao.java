package com.nec.SpecuBackend.Dao;

import java.util.List;

import com.nec.SpecuBackend.Model.ForumPost;

public interface ForumPostDao {
	
void saveOrUpdateForumPost(ForumPost forumPost);
	
	void deleteForumPost(int fpid);
	
	ForumPost getForumPost(int fpid);
	
	List<ForumPost> listForumPosts();
}
