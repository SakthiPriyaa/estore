package com.nec.SpecuBackend.Dao;

import java.util.List;

import com.nec.SpecuBackend.Model.ForumPost;
import com.nec.SpecuBackend.Model.ForumPostComments;

public interface ForumPostCommentsDao {
	
	void saveOrUpdateForumPostComment(ForumPost forumPostComment);

	void deleteForumPostComment(int fpcid);

	ForumPostComments getForumPostComment(int fpcid);

	List<ForumPostComments> listForumPostComments();

}
