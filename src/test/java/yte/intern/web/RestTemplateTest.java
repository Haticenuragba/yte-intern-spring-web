package yte.intern.web;

import org.junit.jupiter.api.Test;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import yte.intern.web.dto.resttemplate.CommentDTO;
import yte.intern.web.dto.resttemplate.PostDTO;

import java.net.URI;
import java.util.List;

public class RestTemplateTest {

	private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

	private RestTemplate restTemplate = new RestTemplate();

	@Test
	public void tumPostlariGetir() {

		URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
				.pathSegment("posts")
				.build()
				.toUri();

		RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();

		ResponseEntity<List> response = restTemplate.exchange(requestEntity, List.class);

		List<PostDTO> posts = response.getBody();

		System.out.println(posts);

	}

	@Test
	public void idyeGorePostGetir() {

		URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
				.pathSegment("posts")
				.pathSegment("2")
				.build()
				.toUri();

		RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();

		ResponseEntity<PostDTO> response = restTemplate.exchange(requestEntity, PostDTO.class);

		System.out.println(response.getBody());

	}

	@Test
	public void yeniPostEkle() {

		URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
				.pathSegment("posts")
				.build()
				.toUri();

		RequestEntity<PostDTO> requestEntity = RequestEntity.post(uri).body(new PostDTO(null, null, "hebele", "hubele"));

		ResponseEntity<PostDTO> response = restTemplate.exchange(requestEntity, PostDTO.class);

		System.out.println(response.getBody());

	}

	@Test
	public void postuUserIdyeGoreGetir() {

		URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
				.pathSegment("comments", "5")
				.build()
				.toUri();

		RequestEntity<CommentDTO> requestEntity = RequestEntity.put(uri).body(new CommentDTO(5L, null, "asfasada", "asfas@casd.com", "asdasd"));

		ResponseEntity<CommentDTO> response = restTemplate.exchange(requestEntity, CommentDTO.class);

		System.out.println(response.getBody());
	}

	@Test
	public void postuSil() {

		URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
				.pathSegment("posts", "1")
				.build()
				.toUri();

		RequestEntity<Void> requestEntity = RequestEntity.delete(uri).build();


		ResponseEntity<Void> response = restTemplate.exchange(requestEntity, Void.class);
	}
}
