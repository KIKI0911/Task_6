package com.country.name;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NameSearch {
    private String prefix;
    private String suffix;
    private String contains;
}
