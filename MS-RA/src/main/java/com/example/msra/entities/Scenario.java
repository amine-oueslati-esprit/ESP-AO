package com.example.msra.entities;
import com.example.msra.entities.enums.niveau_risque;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

import com.example.msra.entities.enums.niveau_impact;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Scenario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idScenario;

    @Enumerated
    niveau_impact impactConfidentialite;

    @Enumerated
    niveau_impact impactIntegrite;

    @Enumerated
    niveau_impact impactDisponibilite;

    float vraisemblanceInherente;

    float impactInherent;

    @Enumerated
    niveau_risque risqueInherentNiveau;

    float risqueInherentScore;

    float impactReel;

    float vraisemblanceReelle;

    float risqueReelScore;

    @Enumerated
    niveau_risque risqueReelNiveau;

    float impactResiduel;

    float vraisemblanceResiduelle;

    float risque_residuelScore;

    @Enumerated
    niveau_risque risqueResiduelNiveau;
    
}