package akidev.me.inheritanceindb.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tbc_mentor")
public class TBC_Mentor extends TBC_User {
    private int numberOfSessions;
    private int numberOfMentees;
}
