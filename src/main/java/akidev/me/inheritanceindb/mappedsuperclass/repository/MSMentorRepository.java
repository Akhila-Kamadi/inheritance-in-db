package akidev.me.inheritanceindb.mappedsuperclass.repository;

import akidev.me.inheritanceindb.mappedsuperclass.MS_Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MSMentorRepository extends JpaRepository<MS_Mentor, Long> {
    MS_Mentor save(MS_Mentor ms_mentor);

    MS_Mentor findJT_UserById(Long id);
}
