package pwo.seq;

import java.math.BigDecimal;
/**
 * Klasa odpowiadająca za generowanie wyrazów ciągu Fibonacciego.
 *
 * @author wladyslaw
 * @version 1.0.0
 */
public class FibonacciGenerator extends Generator {

    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }
    /**
     * Reset aktualnych wyrazów ciągu, dzięki czemu możemy zacząć
     * generować nowy ciąg od pierwszych wyrazów.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * tutaj odbyła się zwracanie następnego wyrazu ciągu.
     *
     * @return następny wyraz ciągu
     */
    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
