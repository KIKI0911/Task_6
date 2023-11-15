package com.country.name;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NameSearchRequest {
    private String startsWith;
    private String endsWith;
    private String contains;
}
