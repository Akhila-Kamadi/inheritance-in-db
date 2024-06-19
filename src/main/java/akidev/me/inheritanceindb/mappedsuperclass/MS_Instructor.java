package akidev.me.inheritanceindb.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_instructor")
public class MS_Instructor extends MS_User {
    private String company;
}
