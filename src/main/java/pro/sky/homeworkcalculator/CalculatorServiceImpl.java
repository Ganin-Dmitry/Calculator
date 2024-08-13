package pro.sky.homeworkcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello () {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus (String oneValue, String twoValue) {
        if (!oneValue.isBlank() && !twoValue.isBlank()) {
            int intOneValue = Integer.parseInt(oneValue);
            int intTwoValue = Integer.parseInt(twoValue);
            return Integer.toString(intOneValue + intTwoValue);
        } else {
            return valueError();
        }
    }

    public String minus (String oneValue, String twoValue) {
        if (!oneValue.isBlank() && !twoValue.isBlank()) {
            int intOneValue = Integer.parseInt(oneValue);
            int intTwoValue = Integer.parseInt(twoValue);
            return Integer.toString(intOneValue - intTwoValue);
        } else {
            return valueError();
        }
    }

    public String multiply (String oneValue,String twoValue) {
        if (!oneValue.isBlank() && !twoValue.isBlank()) {
            int intOneValue = Integer.parseInt(oneValue);
            int intTwoValue = Integer.parseInt(twoValue);
            return Integer.toString(intOneValue * intTwoValue);
        } else {
            return valueError();
        }
    }

    public String divide (String oneValue, String twoValue) {
        if (!oneValue.isBlank() && !twoValue.isBlank()) {
            int intOneValue = Integer.parseInt(oneValue);
            int intTwoValue = Integer.parseInt(twoValue);
            if (intTwoValue == 0){
                return nullError();
            } else {
                return Integer.toString(intOneValue / intTwoValue);
            }
        } else {
            return valueError();
        }

    }

    private String nullError() {
        return "<b>ERROR: На ноль делить нельзя!</b>";
    }

    private String valueError() {
        return "<b>ERROR: Не указано значение!</b>";
    }

}
