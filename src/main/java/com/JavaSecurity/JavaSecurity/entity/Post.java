package com.JavaSecurity.JavaSecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "USER_POST_TBL")
public class Post {
    @Id
    @GeneratedValue
    private int postId;
    private String subject;
    private String description;
    private String username;
    @Enumerated(EnumType.STRING)
    private PostStatus status;
}
