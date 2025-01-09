package com.ll.springdoc20250109.domain.post.post.repository;

import com.ll.springdoc20250109.domain.member.member.entity.Member;
import com.ll.springdoc20250109.domain.post.post.entity.Post;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByIdDesc();
    Optional<Post> findFirstByOrderByIdDesc();
    Page<Post> findByListed(boolean listed, PageRequest pageRequest);
    Page<Post> findByListedAndTitleLike(boolean listed, String titleLike, PageRequest pageRequest);
    Page<Post> findByListedAndContentLike(boolean listed, String contentLike, PageRequest pageRequest);
    Page<Post> findByAuthor(Member author, PageRequest pageRequest);
    Page<Post> findByAuthorAndTitleLike(Member author, String titleLike, PageRequest pageRequest);
    Page<Post> findByAuthorAndContentLike(Member author, String contentLike, PageRequest pageRequest);
}
