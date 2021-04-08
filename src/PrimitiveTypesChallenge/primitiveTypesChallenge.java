package PrimitiveTypesChallenge;

public class primitiveTypesChallenge {
    public static void main(String[] args) {

        byte challengeByteValue = 10;
        short challengeShortValue = 20;
        int challengeIntValue = 50;
        long challengeLongValue = (50000) + (10 * (challengeByteValue + challengeIntValue + challengeShortValue));
        System.out.println(challengeLongValue);

        short shortTotal = (short) (100 + 10 *
                (challengeByteValue + challengeShortValue + challengeIntValue));
    }
}
