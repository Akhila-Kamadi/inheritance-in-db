package akidev.me.inheritanceindb.singletable.repository;

import akidev.me.inheritanceindb.singletable.ST_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface STUserRepository extends JpaRepository<ST_User, Long> {
    ST_User save(ST_User ms_mentor);

    ST_User findJT_UserById(Long id);
}
