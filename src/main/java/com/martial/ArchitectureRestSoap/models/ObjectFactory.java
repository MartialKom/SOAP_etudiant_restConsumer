package com.martial.ArchitectureRestSoap.models;


import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	public EtudiantDtIn creatEtudiant() {
		return new EtudiantDtIn();
	}

	public ResponseDto createObject() {
		return new ResponseDto();
	}
}
