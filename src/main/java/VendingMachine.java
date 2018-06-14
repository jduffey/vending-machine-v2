import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    double userBalance = 0;
    List<String> coinReturnContents = new ArrayList<>();

    public String display() {

        if (userBalance > 0) {
            return String.format("%1.2f", userBalance);
        } else
            return "INSERT COIN";

    }

    public void insert(String coinType) {

        if (coinType == "nickel") {
            userBalance += 0.05;
        } else if (coinType == "dime") {
            userBalance += 0.10;
        } else if (coinType == "quarter") {
            userBalance += 0.25;
        } else coinReturnContents.add(coinType);

    }

    public List<String> getContentsOfCoinReturn() {

        return coinReturnContents;
    }
}
