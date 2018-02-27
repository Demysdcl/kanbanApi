package br.com.dclfactor.kanban.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    @Column(name = "id_task")
    private Long id;

    @Column(length = 100)
    private String title;

    @Lob
    private String description;

    @Enumerated(EnumType.ORDINAL)
    private StatusEnum status;

}
