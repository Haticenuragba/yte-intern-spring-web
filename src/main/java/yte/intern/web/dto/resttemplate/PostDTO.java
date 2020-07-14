package yte.intern.web.dto.resttemplate;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

	private Long id;
	private Long userId;
	private String title;
	private String body;
}
