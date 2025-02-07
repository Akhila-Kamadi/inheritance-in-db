package akidev.me.inheritanceindb.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class JT_Mentor extends JT_User {
    private int numberOfSessions;
    private int numberOfMentees;
}
