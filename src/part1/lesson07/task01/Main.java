package part1.lesson07.task01;

public class Main {

    public static void main(String[] args) {
        arhiv a1 = new arhiv();
        System.out.printf("Архив № %d по адресу %s содержат содержат документы %s \n",a1.number,a1.adress,a1.opis);
        stilag b1= new stilag(2010,1);
        System.out.printf("Дело %d года имеет номер %d \n",b1.god,b1.number);
        polka c1= new polka(2010,1,3415);
        System.out.printf("На полке дело № %d",c1.nomer_dela);



    }

        static class arhiv {
            String adress;
            int number;
            String opis;
           // private stilag arhiva [];

            arhiv(){
                this.adress = adress;
                this.number = number;
                this.opis = opis;


            }
        }
        static class stilag extends arhiv{
            int god;
            int number;

          //  private polka stilaja[];

            stilag(int god,int number){
                super();
                this.god=god;
                this.number=number;

            }

        }
        static class polka extends stilag{
            int nomer_dela;


            polka(int god,int number,int nomer_dela){
                super(god,number);
                this.nomer_dela=nomer_dela;

            }

        }
    }

