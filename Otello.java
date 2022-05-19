package com.company;
/**
 * The Otello class represents a Game.
 * It holds the otello details relevant in our context.
 * This game can Two people or one person with computer.
 *
 * @author Reyhane
 * @version 0.0
 */
public class Otello {
    private int [][]arr;
    private char [][]map;
    private ConsoleColors consoleColors;


    /**
     * Create a new otello with creat an array of map in console and an array for game .
     * first four Beads exist in the map .two Beads are White and two Beads are Black.
     * for White Beads Consider the number one in arr.
     */

    public Otello(){

        arr=new int[8][8];
        map=new char[36][101];
        consoleColors=new ConsoleColors();

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                arr[i][j]=0;
            }


        }

        arr[3][3]=1 ;
        arr[4][4]=1 ;
        arr[4][3]= 2;
        arr[3][4]= 2;
    }


    /**
     * this metod return  Point width .
     * @param soton is name of column .
     * @return column of Point.
     */
    public int setAndGetY(String soton){
        int y=0;
        if(soton.equals("A")){
            y=0;

        }
        else if(soton.equals("B")){
            y=1;

        }else if(soton.equals("C")){
            y=2;

        }else if(soton.equals("D")){
            y=3;

        }else if(soton.equals("E")){
            y=4;

        }else if(soton.equals("F")){
            y=5;

        }else if(soton.equals("G")){
            y=6;

        }else if(soton.equals("H")){
            y=7;

        }
        return y;

    }




    /**
     * this metod add  point  in the arr  .
     * this metod check all Direction around the point.
     * @param colour is name of colour of player.
     * @param x is row of point.
     * @param y is column of point.
     */
    public void harkat(int x , int y , String colour){
        boolean ceckkoli=false;
        int number = 0;
        if(colour.equals("W")){
            number=1;
        }
        else if(colour.equals("B")){
            number=2;
        }
        //check down
        if(x!=7) {
            if (arr[x + 1][y] != number && arr[x + 1][y] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int x2 = 0;

                for (int i = x + 1; i < 8; i++) {

                    if (arr[i][y] == number) {
                        x2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = x + 1; i < x2; i++) {
                        if (arr[i][y] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if (check2 == false) {
                        arr[x][y]=number;
                        for (int i = x + 1; i < x2; i++) {
                            arr[i][y] = number;
                        }

                    }


                }


            }
        }
        //check up
        if(x!=0) {
            if (arr[x - 1][y] != number && arr[x - 1][y] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int x2 = 0;

                for (int i = x - 1; i >= 0; i--) {

                    if (arr[i][y] == number) {
                        x2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = x - 1; i > x2; i--) {
                        if (arr[i][y] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if (check2 == false) {
                        arr[x][y]=number;
                        for (int i = x - 1; i > x2; i--) {
                            arr[i][y] = number;
                        }

                    }


                }


            }
        }

        //check Left
        if(y!=0) {
            if (arr[x][y - 1] != number && arr[x][y - 1] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int y2 = 0;

                for (int i = y - 1; i >= 0; i--) {

                    if (arr[x][i] == number) {
                        y2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = y - 1; i > y2; i--) {
                        if (arr[x][i] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if (check2 == false) {
                        arr[x][y]=number;
                        for (int i = y - 1; i > y2; i--) {
                            arr[x][i] = number;
                        }

                    }


                }


            }
        }
        //check Right
        if(y!=7) {
            if (arr[x][y + 1] != number && arr[x][y + 1] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int y2 = 0;

                for (int i = y + 1; i < 8; i++) {

                    if (arr[x][i] == number) {
                        y2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = y + 1; i < y2; i++) {
                        if (arr[x][i] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if (check2 == false) {
                        arr[x][y]=number;
                        for (int i = y + 1; i < y2; i++) {
                            arr[x][i] = number;
                        }

                    }


                }


            }
        }

        //check northeast
        if(x>0 && y<7) {
            if (arr[x - 1][y + 1] != number && arr[x - 1][y + 1] != 0) {

                int i = x - 1;
                int j = y + 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i >= 0 && j < 8) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i--;
                    j++;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x - 1;
                    int j2 = y + 1;
                    while (i2 > x2 && j2 < y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2--;
                        j2++;

                    }

                    if (check2 == false) {
                        arr[x][y]=number;
                        int i3 = x - 1;
                        int j3 = y + 1;
                        while (i3 > x2 && j3 < y2) {

                            arr[i3][j3] = number;
                            i3--;
                            j3++;


                        }


                    }


                }


            }
        }


        //check Southeast
        if(x<7 && y<7) {
            if (arr[x + 1][y + 1] != number && arr[x + 1][y + 1] != 0) {

                int i = x + 1;
                int j = y + 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i < 8 && j < 8) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i++;
                    j++;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x + 1;
                    int j2 = y + 1;
                    while (i2 < x2 && j2 < y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2++;
                        j2++;

                    }

                    if (check2 == false) {
                        arr[x][y]=number;
                        int i3 = x + 1;
                        int j3 = y + 1;
                        while (i3 < x2 && j3 < y2) {

                            arr[i3][j3] = number;
                            i3++;
                            j3++;


                        }


                    }


                }


            }
        }

        //check North West
        if(x>0 && y>0) {
            if (arr[x - 1][y - 1] != number && arr[x - 1][y - 1] != 0) {

                int i = x - 1;
                int j = y - 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i >= 0 && j >= 0) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i--;
                    j--;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x - 1;
                    int j2 = y - 1;
                    while (i2 > x2 && j2 > y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2--;
                        j2--;

                    }

                    if (check2 == false) {
                        arr[x][y]=number;
                        int i3 = x - 1;
                        int j3 = y - 1;
                        while (i3 > x2 && j3 > y2) {

                            arr[i3][j3] = number;
                            i3--;
                            j3--;


                        }


                    }


                }


            }
        }

        //check Southwest
        if(x<7 && y >0) {
            if (arr[x + 1][y - 1] != number && arr[x + 1][y - 1] != 0) {

                int i = x + 1;
                int j = y - 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i < 8 && j >= 0) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i++;
                    j--;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x + 1;
                    int j2 = y - 1;
                    while (i2 < x2 && j2 > y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2++;
                        j2--;

                    }

                    if (check2 == false) {
                        arr[x][y]=number;
                        int i3 = x + 1;
                        int j3 = y - 1;
                        while (i3 < x2 && j3 > y2) {

                            arr[i3][j3] = number;
                            i3++;
                            j3--;


                        }


                    }


                }


            }
        }


    }


    /**
     * get the arr  .
     * @return array of game field
     */
    public int[][] getArray(){

        return arr;
    }



    /**
     * @param x is row of point.
     * @param y is column of point.
     * @param colour is name of colour of player.
     * @return  check If there is movement return true.
     */




    public boolean checkHarkat(int x , int y , String colour) {
        boolean checkkol=false;
        boolean checkdown=false;
        boolean checkup=false;
        boolean checkLeft=false;
        boolean checkright=false;
        boolean checkNortheast=false;
        boolean checkSoutheast=false;
        boolean checkNorthWest=false;
        boolean checkSouthwest=false;

        int number = 0;
        if (colour.equals("W")) {
            number = 1;
        } else if (colour.equals("B")) {
            number = 2;
        }
        //check down
        if(x!=7) {
            if (arr[x + 1][y] != number && arr[x + 1][y] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int x2 = 0;

                for (int i = x + 1; i < 8; i++) {

                    if (arr[i][y] == number) {
                        x2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = x + 1; i < x2; i++) {
                        if (arr[i][y] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if(check2==false){
                        checkdown = true;
                    }

                }

            }
        }
        //check up
        if(x!=0) {
            if (arr[x - 1][y] != number && arr[x - 1][y] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int x2 = 0;

                for (int i = x - 1; i >= 0; i--) {

                    if (arr[i][y] == number) {
                        x2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = x - 1; i > x2; i--) {
                        if (arr[i][y] == 0) {
                            check2 = true;
                            break;


                        }

                    }
                    if(check2==false){
                        checkup = true;
                    }




                }

            }
        }
        //check Left
        if(y!=0) {
            if (arr[x][y - 1] != number && arr[x][y - 1] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int y2 = 0;

                for (int i = y - 1; i >= 0; i--) {

                    if (arr[x][i] == number) {
                        y2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = y - 1; i > y2; i--) {
                        if (arr[x][i] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if (check2 == false) {
                       checkLeft=true;
                    }


                }


            }
        }
        //check Right
        if(y!=7) {
            if (arr[x][y + 1] != number && arr[x][y + 1] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int y2 = 0;

                for (int i = y + 1; i < 8; i++) {

                    if (arr[x][i] == number) {
                        y2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = y + 1; i < y2; i++) {
                        if (arr[x][i] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if (check2 == false) {
                        checkright=true;

                    }


                }


            }
        }

        //check northeast
        if(x>0 && y<7) {
            if (arr[x - 1][y + 1] != number && arr[x - 1][y + 1] != 0) {

                int i = x - 1;
                int j = y + 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i >= 0 && j < 8) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i--;
                    j++;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x - 1;
                    int j2 = y + 1;
                    while (i2 > x2 && j2 < y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2--;
                        j2++;

                    }

                    if (check2 == false) {
                        checkNortheast=true;

                    }


                }


            }
        }


        //check Southeast
        if(x<7 && y<7) {
            if (arr[x + 1][y + 1] != number && arr[x + 1][y + 1] != 0) {

                int i = x + 1;
                int j = y + 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i < 8 && j < 8) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i++;
                    j++;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x + 1;
                    int j2 = y + 1;
                    while (i2 < x2 && j2 < y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2++;
                        j2++;

                    }

                    if (check2 == false) {
                        checkSoutheast=true;

                    }


                }


            }
        }

        //check North West
        if(x>0 && y>0) {
            if (arr[x - 1][y - 1] != number && arr[x - 1][y - 1] != 0) {

                int i = x - 1;
                int j = y - 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i >= 0 && j >= 0) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i--;
                    j--;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x - 1;
                    int j2 = y - 1;
                    while (i2 > x2 && j2 > y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2--;
                        j2--;

                    }

                    if (check2 == false) {
                        checkNorthWest=true;


                    }


                }


            }
        }

        //check Southwest
        if(x<7 && y >0) {
            if (arr[x + 1][y - 1] != number && arr[x + 1][y - 1] != 0) {

                int i = x + 1;
                int j = y - 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i < 8 && j >= 0) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i++;
                    j--;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x + 1;
                    int j2 = y - 1;
                    while (i2 < x2 && j2 > y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2++;
                        j2--;

                    }

                    if (check2 == false) {
                       checkSouthwest=true;


                    }


                }


            }
        }

        if(checkdown==false && checkup==false && checkLeft==false && checkright==false && checkNortheast==false && checkNorthWest==false && checkSoutheast==false && checkSouthwest==false ){
            checkkol= false;
        }
        else if(checkdown==true  || checkup==true  || checkLeft==true  || checkright==true  || checkNortheast==true  || checkNorthWest==true  || checkSoutheast==true  || checkSouthwest==true ){
            checkkol= true;
        }
        //if exist return true

        return checkkol;
    }


    /**
     * check array of game if that is full return true .
     * @return check boolean(true) if end of game.
     */


    public boolean endGame(){

        boolean check1=false;
        boolean checkkol=false;

        for(int i=0;i<8 ;i++){
            for(int j=0 ; j<8 ;j++){
                if(arr[i][j]==0){
                    check1=true;
                    break;

                }

            }
        }

        //not empty

        if(check1==false){
            checkkol=true;
        }

        //if end of game return true
        return checkkol;

    }

    /**
     *Prints details of players in
     output terminal if game was end.
     */


    public void Result(){


        int number1=0;
        int number2=0;
        for(int i=0;i<8 ;i++){
            for(int j=0 ; j<8 ;j++){
                if(arr[i][j]==1){
                    number1++;

                }
                else if(arr[i][j]==2){
                    number2++;

                }

            }
        }

        if(number1==number2){

            System.out.println("They were equal :)");
            System.out.println("resulte of equal : " + number1);
        }

        else if(number1>number2){
            System.out.println("The white player won :)");
            System.out.println("Total points  of white player : " + number1);
            System.out.println("Total points  of Black player : " + number2);



        }
        else if(number2>number1){
            System.out.println("The Black  player won :)");
            System.out.println("Total points  of Black player : " + number2);
            System.out.println("Total points  of white player : " + number1);
        }





    }

    /**
     *Prints details of a point   in
     output terminal with call the  ConsoleColor class.
     */


    public void printMap(){

        for (int i=0 ; i< 36 ;i++){
            for(int j=0 ; j<101 ; j++){

                if(i==2){
                    if(j==10){
                        map[i][j]='A';
                    }
                    else if(j==22){
                        map[i][j]='B';
                    }else  if(j==34){
                        map[i][j]='C';
                    }else  if(j==46){
                        map[i][j]='D';
                    }else  if(j==58){
                        map[i][j]='E';
                    }else  if(j==70){
                        map[i][j]='F';
                    }else  if(j==82){
                        map[i][j]='G';
                    }else  if(j==94){
                        map[i][j]='H';
                    }
                }
                if(j==1){
                    if(i==5){
                        map[i][j]='1';
                    }else if(i==9){
                        map[i][j]='2';
                    }else if(i==13){
                        map[i][j]='3';
                    }else if(i==17){
                        map[i][j]='4';
                    }else if(i==21){
                        map[i][j]='5';
                    }else if(i==25){
                        map[i][j]='6';
                    }else if(i==29){
                        map[i][j]='7';
                    }else if(i==33){
                        map[i][j]='8';
                    }

                }


                if(i>=3 && j%12==4){
                    map[i][j]='*';

                }
                if(j>=4 && i%4==3){
                    map[i][j]='*';

                }



            }
        }

        for(int i=0 ; i<8 ; i++){
            for(int j=0 ; j< 8 ;j++){
                if(arr[i][j]==1){
                    map[4*i+5][12*j+10]='W';
                }
                if(arr[i][j]==2){
                    map[4*i+5][12*j+10]='B';
                }

            }
        }

        for(int i=0 ; i<36 ; i++){
            for(int j=0 ; j< 101 ;j++){
                if(map[i][j]=='*'){
                    System.out.print(consoleColors.BLUE_BOLD);

                }
                else if(map[i][j]=='W'){
                    System.out.print(consoleColors.BLACK_BOLD);

                }
                else if(map[i][j]=='B'){
                    System.out.print(consoleColors.BLACK_BOLD);

                }
                else if(map[i][j]=='A' || map[i][j]=='C' || map[i][j]=='D' || map[i][j]=='E' || map[i][j]=='F' || map[i][j]=='G' || map[i][j]=='H' ){
                    System.out.print(consoleColors.BLACK_BOLD);

                }



                else if(map[i][j]=='1' ||map[i][j]=='2' ||map[i][j]=='3' ||map[i][j]=='4' ||map[i][j]=='5' ||map[i][j]=='6' ||map[i][j]=='7' ||map[i][j]=='8'){
                    System.out.print(consoleColors.BLACK_BOLD);

                }


                System.out.print(map[i][j]);
            }
            System.out.print("\n");
        }




    }

    /**
     * @param x is row of point.
     * @param y is column of point.
     * @param colour is name of colour of player.
     * @return the number of rows it converts to its color.
     */

    public int  checkHarkatOfComputer(int x , int y , String colour) {
        int counter=0;
        boolean checkkol=false;
        boolean checkdown=false;
        boolean checkup=false;
        boolean checkLeft=false;
        boolean checkright=false;
        boolean checkNortheast=false;
        boolean checkSoutheast=false;
        boolean checkNorthWest=false;
        boolean checkSouthwest=false;

        int number = 0;
        if (colour.equals("W")) {
            number = 1;
        } else if (colour.equals("B")) {
            number = 2;
        }
        //check down
        if(x!=7) {
            if (arr[x + 1][y] != number && arr[x + 1][y] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int x2 = 0;

                for (int i = x + 1; i < 8; i++) {

                    if (arr[i][y] == number) {
                        x2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = x + 1; i < x2; i++) {
                        if (arr[i][y] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if(check2==false){
                        counter++;
                        checkdown = true;
                    }

                }

            }
        }
        //check up
        if(x!=0) {
            if (arr[x - 1][y] != number && arr[x - 1][y] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int x2 = 0;

                for (int i = x - 1; i >= 0; i--) {

                    if (arr[i][y] == number) {
                        x2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = x - 1; i > x2; i--) {
                        if (arr[i][y] == 0) {
                            check2 = true;
                            break;


                        }

                    }
                    if(check2==false){
                        counter++;
                        checkup = true;
                    }




                }

            }
        }
        //check Left
        if(y!=0) {
            if (arr[x][y - 1] != number && arr[x][y - 1] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int y2 = 0;

                for (int i = y - 1; i >= 0; i--) {

                    if (arr[x][i] == number) {
                        y2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = y - 1; i > y2; i--) {
                        if (arr[x][i] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if (check2 == false) {
                        counter++;
                        checkLeft=true;
                    }


                }


            }
        }
        //check Right
        if(y!=7) {
            if (arr[x][y + 1] != number && arr[x][y + 1] != 0) {
                boolean check1 = false;
                boolean check2 = false;

                int y2 = 0;

                for (int i = y + 1; i < 8; i++) {

                    if (arr[x][i] == number) {
                        y2 = i;
                        check1 = true;
                        break;
                    }

                }
                if (check1 == true) {

                    for (int i = y + 1; i < y2; i++) {
                        if (arr[x][i] == 0) {
                            check2 = true;
                            break;


                        }

                    }

                    if (check2 == false) {
                        counter++;
                        checkright=true;

                    }


                }


            }
        }

        //check northeast
        if(x>0 && y<7) {
            if (arr[x - 1][y + 1] != number && arr[x - 1][y + 1] != 0) {

                int i = x - 1;
                int j = y + 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i >= 0 && j < 8) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i--;
                    j++;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x - 1;
                    int j2 = y + 1;
                    while (i2 > x2 && j2 < y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2--;
                        j2++;

                    }

                    if (check2 == false) {
                        counter++;
                        checkNortheast=true;

                    }


                }


            }
        }


        //check Southeast
        if(x<7 && y<7) {
            if (arr[x + 1][y + 1] != number && arr[x + 1][y + 1] != 0) {

                int i = x + 1;
                int j = y + 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i < 8 && j < 8) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i++;
                    j++;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x + 1;
                    int j2 = y + 1;
                    while (i2 < x2 && j2 < y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2++;
                        j2++;

                    }

                    if (check2 == false) {
                        counter++;
                        checkSoutheast=true;

                    }


                }


            }
        }

        //check North West
        if(x>0 && y>0) {
            if (arr[x - 1][y - 1] != number && arr[x - 1][y - 1] != 0) {

                int i = x - 1;
                int j = y - 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i >= 0 && j >= 0) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i--;
                    j--;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x - 1;
                    int j2 = y - 1;
                    while (i2 > x2 && j2 > y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2--;
                        j2--;

                    }

                    if (check2 == false) {
                        counter++;
                        checkNorthWest=true;


                    }


                }


            }
        }

        //check Southwest
        if(x<7 && y >0) {
            if (arr[x + 1][y - 1] != number && arr[x + 1][y - 1] != 0) {

                int i = x + 1;
                int j = y - 1;
                int x2 = 0;
                int y2 = 0;
                boolean check1 = false;
                while (i < 8 && j >= 0) {
                    if (arr[i][j] == number) {
                        x2 = i;
                        y2 = j;
                        check1 = true;
                        break;

                    }

                    i++;
                    j--;

                }
                if (check1 == true) {

                    boolean check2 = false;
                    int i2 = x + 1;
                    int j2 = y - 1;
                    while (i2 < x2 && j2 > y2) {
                        if (arr[i2][j2] == 0) {
                            check2 = true;
                            break;
                        }
                        i2++;
                        j2--;

                    }

                    if (check2 == false) {
                        counter++;
                        checkSouthwest=true;


                    }


                }


            }
        }


        return counter;
    }




}

