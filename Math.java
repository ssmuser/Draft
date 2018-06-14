public class Math {




    public static int doMath(String acting, int i, int g) {
        int z;

         try {

             if (acting.equals("сумма")) return i + g;

         } catch  (Exception e){
             System.err.println(e.getMessage());
         }


        return i+g;
    }
}
