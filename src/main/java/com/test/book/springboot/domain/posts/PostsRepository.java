package com.test.book.springboot.domain.posts;


import org.springframework.data.jpa.repository.JpaRepository;

//Posts클래스로 Database를 접근하게 해줄 JpaRepository
//Mybatis에서 Dao라고 불리는 Db Layer 접근자, JPA에선 Repository라고 부르며 인터페이스로 생성
//JpaRepository<Entity클래스,Pk타입>
public interface PostsRepository  extends JpaRepository<Posts,Long> {
}
