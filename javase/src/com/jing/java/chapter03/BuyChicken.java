package com.jing.java.chapter03;

public class BuyChicken {
    public static void main(String[] args) {
        final int MAX_COCK = 20;
        final int MAX_HEN = 33;
        final int MAX_CHICK = 300;
        for (int numCock = 0; numCock<=MAX_COCK; numCock++){
            for (int numHen = 0; numHen<=MAX_HEN; numHen++){
                for (int numChick = 0; numChick<=MAX_CHICK; numChick++){
                    if (((numCock+numHen+numChick)==100) && ((5*numCock+3*numHen+numChick/3)==100))
                    {
                        System.out.println("Cock: "+numCock+"  Hen: "+numHen+"  Chicken: "+numChick);
                    }
                }
            }
        }
    }
}
