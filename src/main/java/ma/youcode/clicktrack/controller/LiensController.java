package ma.youcode.clicktrack.controller;

import ma.youcode.clicktrack.dto.ClickResponseDto;
import ma.youcode.clicktrack.service.LienServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/t")
public class LiensController {

    private final LienServiceInterface serviceL;

    public LiensController(LienServiceInterface serviceL) {
        this.serviceL = serviceL;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> click(@PathVariable("id") long id){

        ClickResponseDto result = serviceL.click(id);

        if (result == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Lien not found");
        }

        return ResponseEntity.ok(result);
    }
}
