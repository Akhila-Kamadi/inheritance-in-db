package akidev.me.inheritanceindb.joinedtable.repository;

import akidev.me.inheritanceindb.joinedtable.JT_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JTUserRepository extends JpaRepository<JT_User, Long> {
    JT_User save(JT_User jt_user);

    JT_User findJT_UserById(Long id);
}
