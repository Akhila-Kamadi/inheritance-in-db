package akidev.me.inheritanceindb.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_ta")
public class MS_TA extends MS_User {
    private double averageRating;
}
