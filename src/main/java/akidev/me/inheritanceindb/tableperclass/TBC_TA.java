package akidev.me.inheritanceindb.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tbc_ta")
public class TBC_TA extends TBC_User {
    private double averageRating;
}
