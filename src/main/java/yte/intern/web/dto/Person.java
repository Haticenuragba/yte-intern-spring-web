package yte.intern.web.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class Person {

	private String isim;
	private String soyisim;
	private Integer age;

	public void yasiArtir() {
		this.age++;
	}
}
