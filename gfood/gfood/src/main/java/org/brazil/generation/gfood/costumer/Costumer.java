package org.brazil.generation.gfood.costumer;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity // Tabela
public class Costumer {

    @Id // Conhecido como primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String dddress;

    @Column(name="birth_date", nullable = false)
    private Date birthDate;


}
