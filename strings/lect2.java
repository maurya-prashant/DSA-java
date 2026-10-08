 class lect2{
    void main(){


        String a = "lucy";
        //concatination to manupulate a string to do changes in it
        a = a.concat(" laurent");
        System.out.println(a);

        //new object 
        // a = "rohan";
        // System.out.println(a);

     
        //comparison of strings
        String c = new String("Hello");
        String d = new String("Hello");

        System.out.println(c==d);      // false
        System.out.println(c.equals(d));  // true
    }
 }