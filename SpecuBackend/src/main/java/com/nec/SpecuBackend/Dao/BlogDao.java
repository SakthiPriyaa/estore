package com.nec.SpecuBackend.Dao;

import java.util.List;

import com.nec.SpecuBackend.Model.Blog;

public interface BlogDao {
	void saveOrUpdateBlog(Blog blog);
	void deleteBlog(int bid);
	Blog getBlog(int bid);
	List<Blog> listBlogs();
	List<Blog> listBlogsByCreatedAt(String status);

}
