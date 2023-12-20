package entity;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Course {

    private Integer id;
    private String name;
    private Integer credit;
    private Grade grade;
}
