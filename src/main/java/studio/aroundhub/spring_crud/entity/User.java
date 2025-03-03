/*
    MVC Model
    Entity User
    데이터베이스 테이블과 매핑되는 객체 정의
*/
package studio.aroundhub.spring_crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
public class User {

    @Id
    @Getter
    @Setter
    private Long id;

    // 사용자 이름
    @Getter
    @Setter
    @Column(name="name")
    private String name;

    // 사용자 이메일
    @Getter
    @Setter
    @Column(name="email")
    private String email;

    // 사용자 패스워드
    @Getter
    @Setter
    @Column(name="password")
    private String password;
}
