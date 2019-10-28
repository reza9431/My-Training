public class Training {

    public static void multi_tabel(int row , int col){

//        str:
        for (int i=1 ; i<row ; i++){
              for (int j=1 ; j<col; j++){

                System.out.printf("%5d",i*j);
                if (i*j==12){

//                    break str;
                }



            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        multi_tabel(7,6);


    }
}
