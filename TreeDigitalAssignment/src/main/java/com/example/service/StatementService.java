package com.example.service;

import com.example.model.Statement;
import com.example.repository.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatementService {
    @Autowired
    private StatementRepository statementRepository;

}
