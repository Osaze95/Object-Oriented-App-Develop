package Collection_pack; 

public class Collection {

       public String name        =      "";
       public double numCups               =0.0;
       public int    unitOfMeas        =0;
       public double totCal            =0.0;

       public void  set_recepie (String s, double cups, int unit, double tot)
       {
             this.name = s;
             this.numCups = cups;
             this.unitOfMeas = unit;
             this.totCal = tot;
         
       }
}
