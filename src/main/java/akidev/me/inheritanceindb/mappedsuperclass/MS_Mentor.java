package akidev.me.inheritanceindb.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_mentor")
public class MS_Mentor extends MS_User {
    private int numberOfSessions;
    private int numberOfMentees;
}
