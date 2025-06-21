public class StringCreation{
    public static void main(String[] args) {

    
        String str1 = "Hello World";

   
        String str2 = new String("Hello Java");

   
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);

  
        byte[] byteArray = {65, 66, 67}; 
        String str4 = new String(byteArray);

   
        StringBuilder sb = new StringBuilder();
        sb.append("StringBuilder Example");
        String str5 = sb.toString();

        
        StringBuffer sf = new StringBuffer("StringBuffer Example");
        String str6 = sf.toString();

      
        System.out.println("1. Literal: " + str1);
        System.out.println("2. new keyword: " + str2);
        System.out.println("3. char array: " + str3);
        System.out.println("4. byte array: " + str4);
        System.out.println("5. StringBuilder: " + str5);
        System.out.println("6. StringBuffer: " + str6);
    }
}
