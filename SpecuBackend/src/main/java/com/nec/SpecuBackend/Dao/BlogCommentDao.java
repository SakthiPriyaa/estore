package com.nec.SpecuBackend.Dao;

import java.util.List;

import com.nec.SpecuBackend.Model.BlogComment;

public interface BlogCommentDao {
	
	void saveOrUpdateBlogComment(BlogComment blogComment);

	void deleteBlogComment(int bcid);

	BlogComment getBlogComment(int bcid);

	List<BlogComment> listBlogComments();
	
	List<BlogComment> listBlogByCreatedAt(int bid);

}
