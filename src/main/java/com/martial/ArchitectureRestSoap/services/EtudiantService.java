package com.martial.ArchitectureRestSoap.services;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.martial.ArchitectureRestSoap.models.EtudiantDtIn;
import com.martial.ArchitectureRestSoap.models.ResponseDto;


@Service
public class EtudiantService {

	public ResponseDto convertJsonToXml(EtudiantDtIn etudiantDtIn) {

		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.martial.ArchitectureRestSoap.models");

		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(marshaller);

		return (ResponseDto) webServiceTemplate.marshalSendAndReceive("http://localhost:3200/ws",
				etudiantDtIn);
		
	}
}
