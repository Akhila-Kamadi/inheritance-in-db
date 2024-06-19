package akidev.me.inheritanceindb.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_mentor")
@DiscriminatorValue(value = "2")
public class ST_Mentor extends ST_User {
    private int numberOfSessions;
    private int numberOfMentees;
}
