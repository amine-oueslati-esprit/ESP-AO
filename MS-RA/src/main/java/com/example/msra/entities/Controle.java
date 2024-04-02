package com.example.msra.entities;
import com.example.msra.entities.enums.typeControle;
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

public class Controle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idControle;

    String descriptionControle;

    @Enumerated
    com.example.msra.entities.enums.typeControle typeControle;

    float conception;

    float performance;

    float efficacite;

    float ponderationSurImpact;

    float ponderationSurProbabilite;

    float valeurReductionImpact;

    float valeurReductionProbabilite;

    boolean existant;




}
