package com.example.firstProject.repository;

import com.example.firstProject.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> { // <해결할 파일, 대표값의 타입>

}
