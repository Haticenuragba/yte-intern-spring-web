package yte.intern.web.dto.resttemplate;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

	private Long id;
	private Long postId;
	private String name;
	private String email;
	private String body;
}
