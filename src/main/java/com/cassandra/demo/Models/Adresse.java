package com.cassandra.demo.Models;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;


@Table("adresse")
public class Adresse {
    @Id
    private UUID id;
    private String rue;
    private String ville;
    private String codePostal;
    private String pays;
    private UUID personneId;  // L'ID de la personne à laquelle l'adresse appartient

    // Constructeur
    public Adresse(UUID id, String rue, String ville, String codePostal, String pays, UUID personneId) {
        this.id = id;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.pays = pays;
        this.personneId = personneId;
    }

    // Getters et Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public UUID getPersonneId() {
        return personneId;
    }

    public void setPersonneId(UUID personneId) {
        this.personneId = personneId;
    }
    @Override
    public String toString() {
        return "Adresse{" +
               "id=" + id +
               ", rue='" + rue + '\'' +
               ", ville='" + ville + '\'' +
               ", codePostal='" + codePostal + '\'' +
               ", pays='" + pays + '\'' +
               ", personneId=" + personneId +
               '}';
    }
}
