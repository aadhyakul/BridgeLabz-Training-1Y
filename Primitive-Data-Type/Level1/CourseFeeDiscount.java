
class CourseFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;
        System.out.println(
            "The discount amount is INR " + discountAmount +
            " and final discounted fee is INR " + finalFee
        );
    }
}
