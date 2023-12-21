package prog5.poja.sum.endpoint.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@AllArgsConstructor
public class BigSumController {
    @GetMapping("/big-sum")
    public String calculateBigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        try {
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);

            BigInteger result = bigA.add(bigB);
            return result.toString();
        } catch (NumberFormatException e) {
            return "{ \"error\": \"Les paramètres doivent être des entiers valides.\" }";
        }
    }
}