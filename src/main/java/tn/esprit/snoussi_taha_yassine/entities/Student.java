package tn.esprit.snoussi_taha_yassine.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity

@Setter
@Getter
@ToString

public class Student {

    @Id
    private Long id;
    String name;
    Integer age;



}
