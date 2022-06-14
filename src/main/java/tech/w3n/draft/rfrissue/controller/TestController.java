package tech.w3n.draft.rfrissue.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
import tech.w3n.draft.rfrissue.vo.RetrieveUserVO;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public void retrieveUser(@Valid RetrieveUserVO param){
    }
}
