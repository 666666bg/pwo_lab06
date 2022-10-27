package pwo.seq;

import java.math.BigDecimal;
import pwo.utils.SequenceGenerator;
/**
 * Klasa abstrakcyjna spajająca wspólne elementy wszystkich generowanych ciągów.
 *
 * @author wladyslaw
 * @version 1.0.0
 */
abstract class Generator implements SequenceGenerator {

    protected int lastIndex = 0;
    protected BigDecimal current = null,
            f_1 = null,
            f_2 = null,
            f_3 = null;
    /**
     *  Odbyłą sie reset index ostatniego wyliczanego wyrazu ciągu.
     */
    @Override
    public void reset() {
        lastIndex = 0;
    }

    /**
     * Zwracanie podanego wyrazu ciągu
     *
     * @param i indeks wyrazu ciągu
     * @return wyraz ciągu o indeksie i
     */

    @Override
    public final BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
    }
}
