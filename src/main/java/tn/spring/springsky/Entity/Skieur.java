package tn.spring.springsky.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    public Long numSkieur;
    @NonNull
    public String nomS;
    @NonNull
    public String prenomS;
    @NonNull
    @Temporal(TemporalType.DATE)
    public Date dateNaissance;
    @NonNull
    public String ville;

    @OneToOne
    Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")
    Set<Inscription> inscription;

    @ManyToMany(mappedBy = "skieur")
    Set<Piste> piste;

}
