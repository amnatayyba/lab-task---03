public class MemberCardDemo {
    public static void main(String[] args) {

       // 1 Default
        MemberCard m1 = new MemberCard();

        // 2 Overloaded
        MemberCard m2 = new MemberCard("Amna");
        MemberCard m3 = new MemberCard("Moiza", "BSSE");

        // 2 Full Constructor
        MemberCard m4 = new MemberCard("Laiba", "BBA", 3, 500, true);
        MemberCard m5 = new MemberCard("Humna", "BSCS", 4, 1000, false);

        // 1 Copy Constructor
        MemberCard m6 = new MemberCard(m4);
  
      //methods call

        m2.payFee(300);        // Pay fee
        m5.deactivateCard();   // Deactivate
        m5.activateCard();     // Activate again

       //printing all cards

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);

        // Total Cards 
        System.out.println("Total Cards Created:"+ MemberCard.getTotalCards());
    }
}

