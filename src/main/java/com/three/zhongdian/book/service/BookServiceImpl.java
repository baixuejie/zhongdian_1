package com.three.zhongdian.book.service;

import com.three.zhongdian.book.mapper.BookMapper;
import com.three.zhongdian.book.mapper.BookRepository;
import com.three.zhongdian.book.po.BigType;
import com.three.zhongdian.book.po.Book;
import com.three.zhongdian.book.po.Comment;
import com.three.zhongdian.book.po.LookBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findBookAll() {
        return bookMapper.findBookAll();
    }

    @Override
    public List<BigType> findTypeAll() {
        return bookMapper.findTypeAll();
    }

    @Override
    public List<BigType> findBigType() {
        return bookMapper.findBigType();
    }

    @Override
    public List<Book> findBookByType(int typeId) {
        return bookMapper.findBookByType(typeId);
    }

    @Override
    public BigType findTypeById(int id) {
        return bookMapper.findTypeById(id);
    }

    @Override
    public List<Book> findBookByMap(Map<String, Object> map) {
        return bookMapper.findBookByMap(map);
    }

    @Override
    public Book findBookById(int id) {
        return bookMapper.findBookById(id);
    }

    @Override
    public List<Book> findBookByName(String name) {
        return bookMapper.findBookByName(name);
    }

    @Override
    public void insertComment(Comment comment) {
        bookMapper.insertComment(comment);
    }

    @Override
    public List<Comment> findComment(Integer bookid) {
        return bookMapper.findComment(bookid);
    }

    @Override
    public LookBook findByBookNameAndId(LookBook lookBook) {
        return bookRepository.findByBookNameAndId(lookBook.getBookName(),lookBook.getId());
    }
}
