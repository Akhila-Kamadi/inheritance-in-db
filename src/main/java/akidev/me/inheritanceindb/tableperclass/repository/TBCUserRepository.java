package akidev.me.inheritanceindb.tableperclass.repository;

import akidev.me.inheritanceindb.tableperclass.TBC_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TBCUserRepository extends JpaRepository<TBC_User, Long> {
    TBC_User save(TBC_User ms_mentor);

    TBC_User findJT_UserById(Long id);
}
