package net.gooks.springstudy.web;

import lombok.AllArgsConstructor;
import net.gooks.springstudy.domain.posts.PostsRepository;
import net.gooks.springstudy.dto.posts.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() { return "HelloWorld"; }

    @GetMapping("/mypage")
    public String mypage() {
        return "This is mypage";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
