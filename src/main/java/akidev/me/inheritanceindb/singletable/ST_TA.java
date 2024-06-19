package akidev.me.inheritanceindb.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_ta")
@DiscriminatorValue(value = "3")
public class ST_TA extends ST_User {
    private double averageRating;
}
