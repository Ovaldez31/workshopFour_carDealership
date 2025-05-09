package com.ps;

import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput;

        do {
            System.out.println("\n---Dealership App\n---");
            System.out.println("1)Find vehicles within a price range");
            System.out.println("2)Find vehicles by make");
            System.out.println("3)Find vehicles by year range");
            System.out.println("4)Find vehicles by color");
            System.out.println("5)Find vehicles by mileage range");
            System.out.println("6)Find vehicles by type");
            System.out.println("7)List ALL vehicles");
            System.out.println("8)Add a vehicle");
            System.out.println("9)Remove a vehicle");
            System.out.println("0)Quit");
            System.out.println("Choose an option: ");

            userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Not found.");

        }
            }while (userInput != 0) ;
        

    }

    private static void processGetByPriceRequest() {
    }

    private static void processGetByMakeRequest() {
    }

    private static void processGetByYearRequest() {
    }

    private static void processGetByColorRequest() {
    }

    private static void processGetByMileageRequest() {
    }

    private static void processGetByVehicleTypeRequest() {
    }

    private static void processGetAllVehiclesRequest() {
    }

    private static void processAddVehicleRequest() {
    }

    private static void processRemoveVehicleRequest() {
    }
}


