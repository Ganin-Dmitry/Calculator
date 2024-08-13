package pro.sky.homeworkcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello () {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus (@RequestParam(value = "num1", required = false) String oneValue, @RequestParam (value = "num2", required = false) String twoValue) {
        return oneValue + " + " + twoValue + " = " + calculatorService.plus(oneValue, twoValue);
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam (value = "num1", required = false) String oneValue, @RequestParam (value = "num2", required = false) String twoValue) {
        return oneValue + " - " + twoValue + " = " + calculatorService.minus(oneValue, twoValue);
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam (value = "num1", required = false) String oneValue, @RequestParam (value = "num2", required = false) String twoValue) {
        return oneValue + " * " + twoValue + " = " + calculatorService.multiply(oneValue, twoValue);
    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam (value = "num1", required = false) String oneValue, @RequestParam (value = "num2", required = false) String twoValue) {
        return oneValue + " / " + twoValue + " = " + calculatorService.divide(oneValue, twoValue);
    }

}
