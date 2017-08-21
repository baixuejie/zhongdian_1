package com.three.zhongdian.book.po;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by admin on 2017/8/21.
 */
@Data
@Document(indexName = "zhongdian", type = "book")
public class LookBook {
    @Id
    private Integer id;
    private String  bookName;
    private String catalogue;
    private String content;

}
