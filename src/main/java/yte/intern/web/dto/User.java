package yte.intern.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import yte.intern.web.validators.TcKimlikNo;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
public class User {

	@NotBlank(message = "İsim boş olamaz!")
	private String isim;
	@NotBlank
	private String soyisim;
	@Min(12)
	@Max(100)
	private Integer yas;
	@NotBlank
	@Email
	private String email;
	@TcKimlikNo
	private String tcKimlikNumarasi;
	@PastOrPresent
	private LocalDate dogumTarihi;
	@Size(max = 250)
	private String ikametgahAdresi;
	@NotBlank
	private String kullaniciAdi;

	@AssertTrue
	public boolean isKullaniciAdiValid() {
		return !kullaniciAdi.equals("admin");
	}
}
