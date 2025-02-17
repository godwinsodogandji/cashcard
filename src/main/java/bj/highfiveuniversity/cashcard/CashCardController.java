package bj.highfiveuniversity.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/cashcards")
public class CashCardController {
    @GetMapping("/{requestedId}")
    private ResponseEntity<CashCard> findById() {
        CashCard cashCard = new CashCard(99L, 0.0);
        return ResponseEntity.ok(cashCard);
    }
}
