package tn.spring.springsky.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor

public class Abonnement {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @NonNull
    public Long numAbon;
    @NonNull
    @Temporal(TemporalType.DATE)
    public Date dateDebut;
    @NonNull
    @Temporal(TemporalType.DATE)
    public Date dateFin;
    @NonNull
    public Float prixAbon;
    @NonNull
    public TypeAbonnement typeAbon;

}
