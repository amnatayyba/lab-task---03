public class MemberCard{

private static int counter = 0;
   //Used in generating the card number
   private static final String ID_PREFIX="LIB-";

   private String CardNo;
   private String StudentName;
   private String department;
   private int semester;
   private double feePaid;
   private boolean active;      //true = active , false = inactive

   public MemberCard(){
   this.CardNo=generateCardNo();
   this.StudentName="Unknown";
   this.department="BSE";
   this.semester=1;
   this.feePaid=0;
   this.active=true;
 
    }

  public MemberCard(String StudentName){
   this.StudentName=StudentName;
}

  public MemberCard(String StudentName , String department){
     this.StudentName=StudentName;
     this.department="BSE";
}

  public MemberCard(String StudentName, String department, int semester, double feePaid, boolean active){
   this.CardNo=generateCardNo();
   this.StudentName=StudentName;
   this.department=department;
   this.semester=semester;
   this.feePaid=feePaid;
   this.active=active;
   
  }
  public MemberCard(MemberCard other){
        this(other.StudentName, other.department, other.semester, other.feePaid, other.active);
    }
   
    public static int getTotalCards(){
        return counter;
    }

 //  Private Method to Generate Card Number
   private static String generateCardNo(){
        return ID_PREFIX + String.format("%03d", counter++);
    }
   public void deactivateCard(){
    active=false;
  }
  public void activateCard(){
   active=true;
 } 

   public void payFee(double amount){
  if (amount>0) {
  feePaid=feePaid+ amount;
  }else{
   System.out.println("Fee can not be negative");
  }
}
  public String toString(){
        return String.format(
                "%-9s | %-12s | %-28s | %-10d | Rs%8.2f | %10b " ,
                CardNo, StudentName, department , semester, feePaid, active
        );
    }


}


