package fr.fajitasmaster974.EvergreenData.Entities;


import fr.fajitasmaster974.EvergreenData.Entities.Id.SubjectUserId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "subject_deputy")
public class SubjectDeputy {
    

    @EmbeddedId
    private SubjectUserId id;

    @ManyToOne
    @MapsId("userId")
    private User deputy;

    @ManyToOne
    @MapsId("subjectId")
    private Subject subject;

    public SubjectDeputy(User deputy, Subject subject) {
        this.id = new SubjectUserId(deputy.getId(), subject.getId());
        this.deputy = deputy;
        this.subject = subject;
    }
}
