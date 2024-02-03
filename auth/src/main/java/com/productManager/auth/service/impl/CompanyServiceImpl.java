package com.productManager.auth.service.impl;

import com.productManager.auth.domain.Company;
import com.productManager.auth.repository.CompanyRepository;
import com.productManager.auth.service.CompanyService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CompanyServiceImpl extends GenericServiceImpl<Company, Long, CompanyRepository> implements CompanyService {
    public CompanyServiceImpl(CompanyRepository repository) {
        super(repository);
    }
}