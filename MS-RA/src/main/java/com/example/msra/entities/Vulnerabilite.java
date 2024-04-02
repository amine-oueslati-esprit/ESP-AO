package com.example.msra.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Vulnerabilite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idvulnerabilite;

    String desc_vul;

    /*//MM-B actifs concernes
    //child
    @JsonIgnore
    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="projets")
    List<Actif> actifsconcernes=new ArrayList<>();
*/
    //OO-U
    @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Menace menace;
}