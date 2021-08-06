//package WK3;
//
//public class Tax {
//    public static final int UNMARRIED_INDIVIDUAL = 0;
//    public static final int MARRIED_INDIVIDUAL_FILING_SEPARATELY = 1;
//    public static final int MARRIED_INDIVIDUAL_FILING_JOINTLY = 2;
//    public static final int HEAD_OF_HOUSEHOLD = 3;
//
//    public static class TaxStuff {
//        private double income;
//        private int fillingType;
//        private double[][] taxBrackets;
//        private double[] taxRate;
//
//        //Constructors
//        public TaxStuff() {
//            fillingType = UNMARRIED_INDIVIDUAL;
//            income = 0;
//        }
//
//        public TaxStuff(double income, int fillingType, double[][] taxBrackets, double[] taxRate) {
//            this.income = income;
//            this.fillingType = fillingType;
//            this.taxBrackets = taxBrackets;
//            this.taxRate = taxRate;
//        }
//
//        public TaxStuff(double income, int fillingType) {
//            this.income = income;
//            this.fillingType = fillingType;
//        }
//        //Setter
//
//        public double getIncome() {
//            return income;
//        }
//
//        public void setIncome(double income) {
//            this.income = income;
//        }
//
//        public int getFillingType() {
//            return fillingType;
//        }
//
//        public void setFillingType(int fillingType) {
//            this.fillingType = fillingType;
//        }
//        //Getter
//
//        public double[][] getTaxBrackets() {
//            return taxBrackets;
//        }
//
//        public void setTaxBrackets(double[][] taxBrackets) {
//            this.taxBrackets = taxBrackets;
//        }
//
//        public double[] getTaxRate() {
//            return taxRate;
//        }
//
//        public void setTaxRate(double[] taxRate) {
//            this.taxRate = new double[taxRate.length];
//            for (int i = 0; i < taxRate.length; i++) {
//                this.taxRate[i] = taxRate[i] / 100;
//            }
//        }
//
//        //Methode
//        public double calTax() {
//            double tax = 0;
//            double incomeTaxed;
//            double incomenoTax = income;
//            for (int i = 5; i >= 0; i--) {
//                if (incomenoTax > taxBrackets[fillingType][i]) {
//                    tax += (incomeTaxed = incomenoTax - taxBrackets[fillingType][i] * taxRate[i + 1]);
//                    incomenoTax -= incomeTaxed;
//                }
//            }
//            return tax + taxBrackets[fillingType][0] * taxRate[0];
//        }
//
//        //Default filling status
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            System.out.println();
//            double income = 0;
//            int fillingType = 0;
//            //Filling in tax Brackets and tax rate
//            double[][] taxBrackets = new double[0][];
//            double[] taxRate = new double[0];
//            TaxStuff tax = new TaxStuff(income, fillingType, taxBrackets, taxRate);
//        }
//    }
//}
