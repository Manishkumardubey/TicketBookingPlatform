package TicketProject;

import java.util.Scanner;

public class LoginAndBooking extends Thread {
    private int p;
    private int sat;
    private int case1;
    private int upi;

Scanner kb = new Scanner(System.in);
   public LoginAndBooking(int code) {


            System.out.println("singnup process");
            System.out.println("Enter Passward");
            try {
                p = kb.nextInt();
            }catch (Exception e){
                System.out.println("give integer value only,");
            }
            if (p==code){
                try {
                    System.out.println("wait few second while we starting");
                    sleep(5000);
                    System.out.println("select route: 1.Rani kamlpati -> Pt deen dayal ");
                    System.out.println("2.Rani Kamlapati -> Patna");
                    System.out.println("3.Patna -> Rani Kamlpati");
                    System.out.println("4.Pt Deen Dayal -> Rani kamlapti");
                    try {
                        sat = kb.nextInt();
                    } catch (Exception e) {
                        System.out.println("Inter numeric value only");
                        ;
                    }
                    try {
                        if (sat > 0 && sat <= 4) {
                            try {
                                System.out.println("wait while we loading");
                                sleep(1000);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        } else System.out.println("enet only between 1 to 4");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    switch (sat) {
                        case 1:
                            System.out.println("choose class");
                            System.out.println("1.Sleeper (Rs.545) , 2.3rd AC (Rs.1100) , 3.2nd AC (1789)");
                            try {
                                case1 = kb.nextInt();
                            } catch (Exception e) {
                                System.out.println("give integer nu. only");
                            }
                            try {
                                if (case1 > 0 && case1 < 4) {
                                    try {
                                        System.out.println("wait for a second");
                                        sleep(1000);
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                } else System.out.println("give no. only between 1 to 3");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("enter Upi id only number ");
                            try {
                                upi = kb.nextInt();
                                System.out.println("check your appliction we send request for payment");
                                sleep(5000);
                            } catch (Exception e) {
                                System.out.println("enter only number ");
                            }
                            try {
                                sleep(5000);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            System.out.println("thank you for considering us");
                        case 3:
                            System.out.println("choose class");
                            System.out.println("1.Sleeper (Rs.879) , 2.3rd AC (Rs.1540) , 3.2nd AC (2089)");
                            try {
                                case1 = kb.nextInt();
                            } catch (Exception e) {
                                System.out.println("give integer nu. only");
                            }
                            try {
                                if (case1 > 0 && case1 < 4) {
                                    try {
                                        System.out.println("wait for a second");
                                        sleep(1000);
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                } else System.out.println("give no. only between 1 to 3");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("enter Upi id only number ");
                            try {
                                upi = kb.nextInt();
                                System.out.println("check your appliction we send request for payment");
                                sleep(5000);
                            } catch (Exception e) {
                                System.out.println("enter only number ");
                            }
                            try {
                                sleep(5000);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            System.out.println("thank you for considering us");
                        case 2:
                            System.out.println("choose class");
                            System.out.println("1.Sleeper (Rs.867) , 2.3rd AC (Rs.1500) , 3.2nd AC (1989)");
                            try {
                                case1 = kb.nextInt();
                            } catch (Exception e) {
                                System.out.println("give integer nu. only");
                            }
                            try {
                                if (case1 > 0 && case1 < 4) {
                                    try {
                                        System.out.println("wait for a second");
                                        sleep(1000);
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                } else System.out.println("give no. only between 1 to 3");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("enter Upi id only number ");
                            try {
                                upi = kb.nextInt();
                                System.out.println("check your appliction we send request for payment");
                                sleep(5000);
                            } catch (Exception e) {
                                System.out.println("enter only number ");
                            }
                            try {
                                sleep(5000);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            System.out.println("thank you for considering us");
                        case 4:
                            System.out.println("choose class");
                            System.out.println("1.Sleeper (Rs.545) , 2.3rd AC (Rs.1100) , 3.2nd AC (1789)");
                            try {
                                case1 = kb.nextInt();
                            } catch (Exception e) {
                                System.out.println("give integer nu. only");
                            }
                            try {
                                if (case1 > 0 && case1 < 4) {
                                    try {
                                        System.out.println("wait for a second");
                                        sleep(1000);
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                } else System.out.println("give no. only between 1 to 3");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("enter Upi id only number ");
                            try {
                                upi = kb.nextInt();
                                System.out.println("check your appliction we send request for payment");
                                sleep(5000);
                            } catch (Exception e) {
                                System.out.println("enter only number ");
                            }
                            try {
                                sleep(5000);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            System.out.println("thank you for considering us");

                    }
                    System.out.println("Now you can Ready for book Ticket ");}
                catch (Exception e){
                    System.out.println(e);
            }}
            else  System.out.println("write correct code and Try again");

       }

}



