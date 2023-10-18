package com.martial.ArchitectureRestSoap.models;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@XmlRootElement(namespace = "http://www.martial.com/etudiant/dto/Etudiant", name = "EtudiantDtIn")
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantDtIn {
    private String name;
    private int age;
    private String dateNaissance;
    private String mail;

    @XmlElement(namespace = "http://www.martial.com/etudiant/dto/Etudiant")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(namespace = "http://www.martial.com/etudiant/dto/Etudiant")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement(namespace = "http://www.martial.com/etudiant/dto/Etudiant")
    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @XmlElement(namespace = "http://www.martial.com/etudiant/dto/Etudiant")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
