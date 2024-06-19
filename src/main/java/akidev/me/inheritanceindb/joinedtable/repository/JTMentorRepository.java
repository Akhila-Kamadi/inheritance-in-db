package akidev.me.inheritanceindb.joinedtable.repository;

import akidev.me.inheritanceindb.joinedtable.JT_Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JTMentorRepository extends JpaRepository<JT_Mentor, Long> {
    JT_Mentor save(JT_Mentor mentor);
    JT_Mentor findJT_MentorById(Long id);
}
