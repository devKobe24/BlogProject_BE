package com.kobe.blogproject.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	private Long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "content", nullable = false)
	private String content;

	@CreatedDate // 엔티티가 생성될 때 생성 시간 저장
	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@LastModifiedDate // 엔티티가 수정될 때 수정 시간 저장
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@Builder
	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}

	// 블로그 글 수정하는 메서드
	public void update(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
