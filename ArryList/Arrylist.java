import java.io.*;
import java.util.*;




class Arrylist
{
    public static void main(String args[]){
        Console c = System.console();

        ArrayList<String>names = new ArrayList<>();

        while(true)
        {
            int op = Integer.parseInt(c.readLine("1.add ,  2.view , 3.remove , 4.exit" ));
            if(op == 1){

                        String n = c.readLine("enter the name here ");
                        names.add(n);
                        System.out.println("The name has been added");

            }else if(op == 2){

                System.out.println("The List As Below" + names);


            }else if(op == 3){

                String ask = c.readLine("enter the name which You want to remove ");

                if(names.contains(ask)){
                        names.remove(ask);
                        System.out.println("The Name Has Been Removed,, thanks ");
                }else{
                        System.out.println("Sorry the error has in name or the name has not exists in the List ");
                }

            }else if(op == 4){
                break;

            }else
            {
                System.out.println("Sorry Not understand ");
            }
        }


        
    }
}