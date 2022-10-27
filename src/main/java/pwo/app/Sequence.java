package pwo.app;

/**
 * Ta klasa dpowiada za uruchamianie określonej sekwencji zależnie
 * od liczby podanych argumentów w linii poleceń.
 *
 * @author wladyslaw
 * @version 1.0.0
 */
public class Sequence {

    public static void main(String[] args) {

        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Illegal arguments\n"
                        + "Legal usage: seqName from to [fileName]");
        }
    }
}
