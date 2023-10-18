package com.martial.ArchitectureRestSoap.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martial.ArchitectureRestSoap.models.EtudiantDtIn;
import com.martial.ArchitectureRestSoap.models.ResponseDto;
import com.martial.ArchitectureRestSoap.services.EtudiantService;

@RestController
@RequestMapping("/etudiant")
public class EtudiantControler {

	@Autowired
	EtudiantService etudiantService;

	@PostMapping("/add")
	public ResponseDto create(@RequestBody EtudiantDtIn etudiant) {
		ResponseDto responseDto = etudiantService.convertJsonToXml(etudiant);
		
		System.out.println(responseDto.toString());
		
		return responseDto;
	}

}
