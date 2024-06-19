package akidev.me.inheritanceindb.tableperclass.repository;

import akidev.me.inheritanceindb.tableperclass.TBC_Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TBCMentorRepository extends JpaRepository<TBCMentorRepository, Long> {
    TBC_Mentor save(TBC_Mentor mentor);

    TBC_Mentor findJT_MentorById(Long id);
}
