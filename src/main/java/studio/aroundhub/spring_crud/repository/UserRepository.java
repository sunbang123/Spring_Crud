/*
    MVC Model
    Repository UserRepository
    데이터베이스와 상호작용
    데이터 조회, 저장
*/
package studio.aroundhub.spring_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studio.aroundhub.spring_crud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 기본적인 CRUD 메서드를 제공하는 JPA 레포지토리
    // JPA 레포지토리를 상속받음으로 Hibernate를 통해 데이터베이스와 상호작용
}