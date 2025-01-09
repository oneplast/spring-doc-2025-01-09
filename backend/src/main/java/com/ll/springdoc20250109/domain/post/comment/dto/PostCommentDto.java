package com.ll.springdoc20250109.domain.post.comment.dto;

import com.ll.springdoc20250109.domain.post.comment.entity.PostComment;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class PostCommentDto {
    private long id;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private long postId;

    private long authorId;

    private String authorName;

    private String content;

    public PostCommentDto(PostComment postComment) {
        this.id = postComment.getId();
        this.createDate = postComment.getCreateDate();
        this.modifyDate = postComment.getModifyDate();
        this.postId = postComment.getPost().getId();
        this.authorId = postComment.getAuthor().getId();
        this.authorName = postComment.getAuthor().getName();
        this.content = postComment.getContent();
    }
}
