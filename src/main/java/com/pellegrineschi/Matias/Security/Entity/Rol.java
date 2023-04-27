
package com.pellegrineschi.Matias.Security.Entity;

import com.pellegrineschi.Matias.Security.Enums.RolNombre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Rol {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre RolNombre;
    
    //contructor

    public Rol() {
    }

    public Rol(RolNombre RolNombre) {
        this.RolNombre = RolNombre;
    }
    //getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return RolNombre;
    }

    public void setRolNombre(RolNombre RolNombre) {
        this.RolNombre = RolNombre;
    }
    
    
    
}
