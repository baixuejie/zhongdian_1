package com.three.zhongdian.book.service;

import com.three.zhongdian.book.po.BigType;
import com.three.zhongdian.book.po.Book;
import com.three.zhongdian.book.po.Comment;
import com.three.zhongdian.book.po.LookBook;

import java.util.List;
import java.util.Map;

public interface BookService {
     List<Book> findBookAll();
     List<BigType> findTypeAll();
     List<BigType> findBigType();
     List<Book> findBookByType(int typeId);
     BigType findTypeById(int id);
     List<Book> findBookByMap(Map<String, Object> map);
     Book findBookById(int id);
    List<Book> findBookByName(String name);
     void insertComment(Comment comment);
    List<Comment> findComment(Integer bookid);
    LookBook findByBookNameAndId(LookBook lookBook);
}
