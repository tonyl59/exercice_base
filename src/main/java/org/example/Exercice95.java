package org.example;

public class Exercice95 {
    public static void main(String[] args) {
        int[] tableauSource = new int[10];
        tableauSource[0] = -5;
        tableauSource[1] = 3;
        tableauSource[2] = 24;
        tableauSource[3] = -12;
        tableauSource[4] = -10;
        tableauSource[5] = 5;
        tableauSource[6] = 100;
        tableauSource[7] = -2;
        tableauSource[8] = -71;
        tableauSource[9] = 0;

        int[] tableauDestination = new int[tableauSource.length];
        for (int i = 0; i<tableauSource.length;i++ ){
            if(tableauSource[i] >0){
                tableauDestination[i] = tableauSource[i];
            }
        }

        System.out.print("tableauSource = ");
        for (int i = 0; i<tableauSource.length;i++ ){
            System.out.print(tableauSource[i]+" ");
        }
        System.out.println();

        System.out.print("tableauDestination = ");
        for (int i = 0; i<tableauDestination.length;i++ ){
            System.out.print(tableauDestination[i]+" ");
        }


    }

}
