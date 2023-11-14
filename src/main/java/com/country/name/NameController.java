package com.country.name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    private final NameMapper nameMapper;
    public NameController(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }
    @GetMapping("/countries")
    public List<Countries> findByNames(NameSearchRequest request) {
        return nameMapper.findByNameStartingWith(request.getStartsWith(), request.getEndsWith(), request.getContains());
    }
    @GetMapping("/country")
    public List<Countries> findByName(NameSearch requestedName) {
        return nameMapper.findNameStartingWith(requestedName.getPrefix(),
                requestedName.getSuffix(),
                requestedName.getContains());
    }

}
