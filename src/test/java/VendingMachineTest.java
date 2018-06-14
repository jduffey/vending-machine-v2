import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine machine = new VendingMachine();

    @Before
    public void setup() {
        machine = new VendingMachine();
    }

    @Test
    public void newInstanceShouldReturnUserBalanceOfZero() {
        assertEquals("INSERT COIN", machine.display());
    }

    @Test
    public void shouldDisplayFiveCentsWhenANickelIsInserted() {
        machine.insert("nickel");
        assertEquals("0.05", machine.display());
    }

    @Test
    public void shouldDisplayTenCentsWhenADimeIsInserted() {
        machine.insert("dime");
        assertEquals("0.10", machine.display());
    }

    @Test
    public void shouldDisplayTwentyFiveCentsWhenAQuarterIsInserted() {
        machine.insert("quarter");
        assertEquals("0.25", machine.display());
    }

    @Test
    public void shouldAddPennyToCoinReturnWhenAPennyIsInserted() {
        machine.insert("penny");
        assertEquals(new String[]{"penny"}, machine.getContentsOfCoinReturn().toArray());
    }

    @Test
    public void shouldRejectAnotherTypeOfInvalidCoin() {
        machine.insert("halfDollar");
        assertEquals(new String[]{"halfDollar"}, machine.getContentsOfCoinReturn().toArray());
    }

    @Test
    public void moreThanOneRejectedCoinCanExistInTheCoinReturn(){
        machine.insert("nillaWafer");
        machine.insert("pluggedNickel");
        machine.insert("chuckECheeseToken");
        assertEquals(new String[]{"nillaWafer", "pluggedNickel", "chuckECheeseToken"},machine.getContentsOfCoinReturn().toArray());
    }

}
