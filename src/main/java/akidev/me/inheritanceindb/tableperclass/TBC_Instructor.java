package akidev.me.inheritanceindb.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tbc_instructor")
public class TBC_Instructor extends TBC_User {
    private String company;
}
