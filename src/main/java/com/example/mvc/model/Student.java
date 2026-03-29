package com.example.mvc.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favLang;
	private List<String> favOS;

}
