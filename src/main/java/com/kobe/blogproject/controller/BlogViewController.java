package com.kobe.blogproject.controller;

import com.kobe.blogproject.domain.Article;
import com.kobe.blogproject.dto.response.ArticleListViewResponse;
import com.kobe.blogproject.dto.response.ArticleViewResponse;
import com.kobe.blogproject.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlogViewController {

	private final BlogService blogService;

	@GetMapping("/articles")
	public String articles(Model model) {
		List<ArticleListViewResponse> articles = blogService.findAll().stream()
			.map(ArticleListViewResponse::new)
			.toList();
		model.addAttribute("articles", articles); // 블로그 글 리스트 저장

		return "articleList"; // articleList.html라는 뷰 조회
	}

	// 블로그 글을 반환하는 메서드
	@GetMapping("/articles/{id}")
	public String getArticle(@PathVariable Long id, Model model) {
		Article article = blogService.findById(id);
		model.addAttribute("article", new ArticleViewResponse(article));

		return "article";
	}

	// 수정 화면을 보여주기 위한 메서드
	@GetMapping("/new-article")
	// id 키를 가진 쿼라 파라미터의 값을 id 변수에 매핑(id는 없을 수도 있음)
	public String newArticle(@RequestParam(required = false) Long id, Model model) {
		if (id == null) { // id가 없으면 생성
			model.addAttribute("article", new ArticleViewResponse());
		} else {
			Article article = blogService.findById(id);
			model.addAttribute("article", new ArticleViewResponse(article));
		}

		return "newArticle";
	}
}
