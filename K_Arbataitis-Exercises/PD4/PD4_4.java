public class PD4_3 {
    public static void main(String[] args) {
        boolean myTrue = true;
        boolean myFalse = true;
        System.out.println(myTrue && myTrue); 
        System.out.println(myTrue && myFalse); 
        System.out.println(myFalse && myTrue); 

        System.out.println(myTrue || myTrue); 
        System.out.println(myTrue || myFalse); 
        System.out.println(myFalse || myTrue); 
        System.out.println(myFalse || myFalse); 

        System.out.println(!myFalse); 

    }
}
