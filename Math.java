public class Math {




    public static int doMath(String acting, int i, int g) {
        int z;

         try {

             if (acting.equals("сумма"))
                 z = i + g;

         } catch  (Exception ex){
             System.err.println(ex.getMessage());
         }


         catch  (Error e){
             System.err.println(e.getMessage());
             System.out.println("Произошла ошибка но ситуация под контролем");
         }

        return z = i + g;
    }
}

    public static int doMath2(String acting, int i, int g) throws Exception {
        switch (acting) {
            case "Summ":
                return i + g;
            case "Multiply":
                return i * g;
            case "Substract":
                return i - g;
            case "Devision":
                return i / g;
            default:
                throw new Exception("Unknown operation provided");
        }
    }
