package org.fasttrackit.curs20.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ClimateUnite {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private int setTemperature;
    @Column
    private boolean state;
    @Column
    private boolean maintenance;
}
