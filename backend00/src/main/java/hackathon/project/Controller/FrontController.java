package hackathon.project.Controller;

import hackathon.project.domain.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.EditorAwareTag;

@Controller
public class FrontController {
    @GetMapping("/game/Korail/start")
    public String start(){
        return "redirect:http://101.101.210.80:3000/";
    }
}
