package com.three.zhongdian.book.mapper;

import com.three.zhongdian.book.po.LookBook;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Created by admin on 2017/8/17.
 */
public interface BookRepository extends ElasticsearchRepository<LookBook,Integer> {
    LookBook findByBookNameAndId(String name ,Integer id);
}
