package akidev.me.inheritanceindb.singletable.repository;

import akidev.me.inheritanceindb.singletable.ST_Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface STMentorRepository extends JpaRepository<ST_Mentor, Long> {
    ST_Mentor save(ST_Mentor mentor);

    ST_Mentor findJT_MentorById(Long id);
}
