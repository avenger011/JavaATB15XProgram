// 1. Remove 'static' from the top-level class
 static class GetSet {
    // 2. Encapsulation: Usually, 'val' should be private when using getters/setters
    private int val = 100;

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}

// 3. Create a wrapper class for your main method

 static class met extends GetSet{
     met(int a){
         GetSet l1=new GetSet();
         if(a>l1.getVal())
         {
             System.out.println("the number is greater than 100");
         }
     }
}

public static void main(String[] args){
     met n=new met(101);

}