package AdvanceProb.com;

import java.util.ArrayList;
import java.util.Scanner;



public class ClaimSystem {
    static class Claim{

        private String claimNumber;
        private String policyNumber;
        private String claimantName;
        private double claimAmount;
        private String status;

        public Claim(String claimNumber, String policyNumber, String claimantName, double claimAmount, String status) {
            this.claimNumber = claimNumber;
            this.policyNumber = policyNumber;
            this.claimantName = claimantName;
            this.claimAmount = claimAmount;
            this.status = status;
        }

        public String getClaimNumber() {
            return claimNumber;
        }

        public void setClaimNumber(String claimNumber) {
            this.claimNumber = claimNumber;
        }

        public String getPolicyNumber() {
            return policyNumber;
        }

        public void setPolicyNumber(String policyNumber) {
            this.policyNumber = policyNumber;
        }

        public String getClaimantName() {
            return claimantName;
        }

        public void setClaimantName(String claimantName) {
            this.claimantName = claimantName;
        }

        public double getClaimAmount() {
            return claimAmount;
        }

        public void setClaimAmount(double claimAmount) {
            this.claimAmount = claimAmount;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String toString() {
            return "Claim Number: " + claimNumber + ", Policy Number: " + policyNumber +
                    ", Claimant Name: " + claimantName + ", Claim Amount: " + claimAmount +
                    ", Status: " + status;
        }
    }
    ArrayList<Claim> claims;

    public ClaimSystem() {
        claims = new ArrayList<>();
    }

    public void addClaims(Claim claim){
        claims.add(claim);
    }

    public void updateClaimStatus(String claimNumber, String status){
        for (Claim claim: claims){
            if(claim.getClaimNumber().equals(claimNumber)){
                claim.setStatus(status);
                break;
            }
        }
    }

    public void generateReportByStatus(String status){
        for(Claim claim: claims){
            if(claim.getStatus().equalsIgnoreCase(status)){
                System.out.println(claim);
            }
        }
    }

    public void displayAllCLaims(){
        for (Claim claim: claims){
            System.out.println(claim);
        }
    }

    public static void main(String[] args) {
        ClaimSystem insuranceClaimSystem = new ClaimSystem();
        Scanner sc = new Scanner(System.in);

        int choice;

        while(true){
            System.out.println("\nClaim Tracking System");
            System.out.println("1. Add Claim");
            System.out.println("2. Update Claim Status");
            System.out.println("3. Generate Report by Status");
            System.out.println("4. Display All Claims");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice){
                case 1:
                    System.out.print("Enter Claim Number: ");
                    String claimNumber = sc.nextLine();
                    System.out.print("Enter Policy Number: ");
                    String policyNumber = sc.nextLine();
                    System.out.print("Enter Claimant Name: ");
                    String claimantName = sc.nextLine();
                    System.out.print("Enter Claim Amount: ");
                    double claimAmount = sc.nextDouble();

                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Status (pending, approved, rejected): ");
                    String status = sc.nextLine();

                    insuranceClaimSystem.addClaims(new Claim(claimNumber, policyNumber, claimantName, claimAmount, status));

                    System.out.println("\nClaim Added Successfully.\n");
                    break;

                case 2:
                    System.out.print("Enter Claim Number to Update: ");
                    claimNumber = sc.nextLine();
                    System.out.print("Enter New Status (pending, approved, rejected): ");
                    status = sc.nextLine();

                    insuranceClaimSystem.updateClaimStatus(claimNumber, status);

                    System.out.println("\nClaim Status Updated Successfully.\n");
                    break;

                case 3:
                    System.out.println("Enter Status to Generate Report(pending, approved, rejected)");
                    status = sc.nextLine();

                    insuranceClaimSystem.generateReportByStatus(status);

                    break;

                case 4:
                    insuranceClaimSystem.displayAllCLaims();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice!! Please Try Again.");
            }
        }
    }

}