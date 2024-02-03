package com.productManager.auth.controller;

import com.productManager.auth.domain.Company;
import com.productManager.auth.service.CompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/company")
public class CompanyController extends GenericController<Company> {
    public CompanyController(CompanyService service) {
        super(service);
    }

}