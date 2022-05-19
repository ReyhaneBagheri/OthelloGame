package com.company;

import java.util.Scanner;
/**
 * In The Main  class we test the code with create 1 Otello and 1 Scanner in the main .
 *
 * @author Reyhane
 * @version 0.0
 */

public class Main {

    public static void main(String[] args) {
        Otello otello1=new Otello();
        Scanner scan1=new Scanner(System.in);
        System.out.println("1) game with 2 player \n2)game with computer(computer has White Bead)");
        int choice=scan1.nextInt();
        if(choice==1) {
            while (true) {
                //
                otello1.printMap();
                int[][] arr1 = otello1.getArray();
                boolean checkkol1 = false;
                boolean check1 = false;
                boolean check2 = false;
                boolean check3 = false;
                boolean check4 = false;
                boolean check5 = false;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (arr1[i][j] == 0) {
                            check1 = otello1.checkHarkat(i, j, "B");
                            check2 = otello1.checkHarkat(i, j, "W");

                            if (check1 == true || check2 == true) {

                                checkkol1 = true;
                                check1 = true;
                                check2 = true;
                                break;
                            }

                        }


                    }
                    if (checkkol1 == true) {
                        break;
                    }
                }

                if (checkkol1 == false) {
                    System.out.println("End Game :)");
                    otello1.Result();
                    return;
                } else if (checkkol1 == true) {
                    if (check1 == true) {
                        boolean checkwhile1 = false;
                        while (checkwhile1 == false) {

                            System.out.println("Black player please enter Inputs :)");
                            int x = scan1.nextInt();
                            String soton = null;
                            soton = scan1.next();
                            int y = otello1.setAndGetY(soton);
                            int [][]arr33=otello1.getArray();
                            if(arr33[x-1][y]==0) {
                                check3 = otello1.checkHarkat(x - 1, y, "B");
                                if (check3 == false) {
                                    check3 = false;
                                    System.out.println("please choose the best Black player :(");
                                } else if (check3 == true) {
                                    otello1.harkat(x - 1, y, "B");
                                    checkwhile1 = true;

                                }
                            }
                            else if(arr33[x-1][y]!=0){
                                System.out.println("please choose the best Black player :(");

                            }


                        }


                    }

                    if (check1 == false) {
                        System.out.println("the Black player pass.");


                    }

                    int[][] arr2 = otello1.getArray();
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (arr2[i][j] == 0) {
                                check4 = otello1.checkHarkat(i, j, "W");
                                if (check4 == true) {
                                    check4 = true;
                                    break;
                                }
                            }
                        }
                        if (check4 == true) {
                            break;
                        }
                    }
                    if (check4 == true) {

                        ///
                        boolean checkwhile2 = false;
                        boolean checkempty=false;
                        while (checkwhile2 == false) {
                            otello1.printMap();
                            System.out.println("White player please enter Inputs :)");
                            int x2 = scan1.nextInt();
                            String soton2 = null;
                            soton2 = scan1.next();
                            int y2 = otello1.setAndGetY(soton2);
                            int [][]arr22=otello1.getArray();
                            if(arr22[x2-1][y2]==0){
                                checkempty=true;
                            }
                            if(checkempty==true) {
                                check5 = otello1.checkHarkat(x2 - 1, y2, "W");
                                if (check5 == false) {
                                    System.out.println("please choose the best  White player:(");
                                } else if (check5 == true) {
                                    otello1.harkat(x2 - 1, y2, "W");
                                    checkwhile2 = true;

                                }
                            }
                            if(checkempty==false){
                                System.out.println("please choose the best  White player:(");


                            }


                        }

                        ///
                    } else if (check4 == false) {
                        System.out.println("the White player pass :(");
                    }

                }


            }
        }

        ///////
        if(choice==2) {
            while (true) {
                //
                otello1.printMap();
                int[][] arr1 = otello1.getArray();
                boolean checkkol1 = false;
                boolean check1 = false;
                boolean check2 = false;
                boolean check3 = false;
                boolean check4 = false;
                boolean check5 = false;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (arr1[i][j] == 0) {
                            check1 = otello1.checkHarkat(i, j, "B");
                            check2 = otello1.checkHarkat(i, j, "W");

                            if (check1 == true || check2 == true) {
                                //                            System.out.println(i + "" + j + "" +check1);
                                //                            System.out.println(check2);

                                checkkol1 = true;
                                check1 = true;
                                check2 = true;
                                break;
                            }

                        }


                    }
                    if (checkkol1 == true) {
                        break;
                    }
                }

                if (checkkol1 == false) {
                    System.out.println("End Game :)");
                    otello1.Result();
                    return;
                } else if (checkkol1 == true) {
                    if (check1 == true) {
                        boolean checkwhile1 = false;
                        while (checkwhile1 == false) {

                            System.out.println("Black player please enter Inputs :)");
                            int x = scan1.nextInt();
                            String soton = null;
                            soton = scan1.next();
                            int y = otello1.setAndGetY(soton);
                            int[][] arr11=otello1.getArray();
                            if(arr11[x-1][y]==0) {
                                check3 = otello1.checkHarkat(x - 1, y, "B");
                                if (check3 == false) {
                                    check3 = false;
                                    System.out.println("please choose the best Black player :(");
                                } else if (check3 == true) {
                                    otello1.harkat(x - 1, y, "B");
                                    checkwhile1 = true;

                                }
                            }
                            else if(arr11[x-1][y]!=0){
                                System.out.println("please choose the best Black player :(");

                            }


                        }


                    }

                    if (check1 == false) {
                        System.out.println("the Black player pass.");


                    }

                    int[][] arr2 = otello1.getArray();
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (arr2[i][j] == 0) {
                                check4 = otello1.checkHarkat(i, j, "W");
                                if (check4 == true) {
                                    check4 = true;
                                    break;
                                }
                            }
                        }
                        if (check4 == true) {
                            break;
                        }
                    }
                    if (check4 == true) {

                        ///
                        boolean checkwhile2 = false;
                        while (checkwhile2 == false) {
                            otello1.printMap();
                            int maxharkat=0;
                            int x2=0;
                            int y2=0;
                            int [][]arr3=otello1.getArray();
                                for(int i=0 ; i<8 ; i++){
                                    for(int j=0 ; j< 8 ; j++){
                                        if(arr3[i][j]==0) {
                                            int numberofharkat = otello1.checkHarkatOfComputer(i, j, "W");
                                            if (maxharkat < numberofharkat) {
                                                maxharkat = numberofharkat;
                                                x2 = i;
                                                y2 = j;

                                            }
                                        }

                                    }
                                }
                                otello1.harkat(x2 , y2 ,"W");

                                checkwhile2 = true;


                        }

                        ///
                    } else if (check4 == false) {
                        System.out.println("the White player (computer) pass :(");
                    }

                }


            }
        }


    }//////
}
