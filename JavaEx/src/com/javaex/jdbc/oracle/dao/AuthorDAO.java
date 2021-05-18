package com.javaex.jdbc.oracle.dao;

import java.util.List;

public interface AuthorDAO {
	public List<AuthorVO> getList();	//	단순 SELECT
	public List<AuthorVO> search(String keyword);	//	LIKE 검색
	public AuthorVO get(Long id);	//	PK로 가져오기
	public boolean insert(AuthorVO vo);	//	INSERT
	public boolean delete(Long id);	//	pk로 삭제
	public boolean update(AuthorVO vo);	//update
}
