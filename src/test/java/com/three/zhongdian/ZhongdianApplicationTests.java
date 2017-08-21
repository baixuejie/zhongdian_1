package com.three.zhongdian;

import com.three.zhongdian.author.mapper.AuthorMapper;
import com.three.zhongdian.book.mapper.BookMapper;
import com.three.zhongdian.book.mapper.BookRepository;
import com.three.zhongdian.book.po.Book;
import com.three.zhongdian.book.po.LookBook;
import com.three.zhongdian.user.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhongdianApplicationTests {
@Autowired
private BookRepository bookRepository;
	@Test
	public void contextLoads() {



	}


}
