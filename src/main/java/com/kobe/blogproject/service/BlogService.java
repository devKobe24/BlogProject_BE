package com.kobe.blogproject.service;

import com.kobe.blogproject.domain.Article;
import com.kobe.blogproject.dto.request.AddArticleRequest;
import com.kobe.blogproject.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

	private final BlogRepository blogRepository;

	// 블로그 글 추가 메서드
	public Article save(AddArticleRequest request) {
		return blogRepository.save(request.toEntity());
	}

	// 블로그 글 가져오기 메서드
	public List<Article> findAll() {
		return blogRepository.findAll();
	}

	// 블로그 글 하나를 조회하는 메서드
	public Article findById(long id) {
		return blogRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("not found: " + id));
	}

	// 블로그 글 삭제하는 메서드
	public void delete(long id) {
		blogRepository.deleteById(id);
	}
}
