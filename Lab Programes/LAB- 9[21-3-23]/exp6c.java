package com.java;

public class exp6c {
    public static void main(String[] args) {
        Bank b = new SBI();
        Bank b1 = new PNB();
        Bank b2 = new BOI();

        System.out.println("ROI: " + b.rateOfInterest());
    }
}

    interface Bank {
        float rateOfInterest();
    }

    class SBI implements Bank {
        public float rateOfInterest() {
            return 9.15f;
        }
    }

    class PNB implements Bank {
        public float rateOfInterest() {
            return 9.7f;
        }
    }

    class BOI implements Bank {
        public float rateOfInterest() {
            return 9.1f;
        }


    }

