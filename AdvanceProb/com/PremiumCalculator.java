package AdvanceProb.com;
import java.util.ArrayList;
import java.util.Scanner;



    class PremiumPolicy {
        private String policyType;
        private double basePremium;
        private double riskFactor;
        private double calculatedPremium;

        public PremiumPolicy(String policyType, double basePremium, double riskFactor) {
            this.policyType = policyType;
            this.basePremium = basePremium;
            this.riskFactor = riskFactor;
            this.calculatedPremium = calculatePremium();
        }

        // Getters and Setters
        public String getPolicyType() {
            return policyType;
        }

        public void setPolicyType(String policyType) {
            this.policyType = policyType;
        }

        public double getBasePremium() {
            return basePremium;
        }

        public void setBasePremium(double basePremium) {
            this.basePremium = basePremium;
        }

        public double getRiskFactor() {
            return riskFactor;
        }

        public void setRiskFactor(double riskFactor) {
            this.riskFactor = riskFactor;
        }

        public double getCalculatedPremium() {
            return calculatedPremium;
        }

        public void setCalculatedPremium(double calculatedPremium) {
            this.calculatedPremium = calculatedPremium;
        }

        public double calculatePremium() {
            return basePremium * (1 + riskFactor);
        }

        @Override
        public String toString() {
            return "Policy Type: " + policyType + ", Base Premium: " + basePremium +
                    ", Risk Factor: " + riskFactor + ", Calculated Premium: " + calculatedPremium;
        }
    }

    public class PremiumCalculator {
        private ArrayList<PremiumPolicy> policies;

        public PremiumCalculator() {
            policies = new ArrayList<>();
        }

        public void addPolicy(PremiumPolicy policy) {
            policies.add(policy);
        }

        public void updatePremiums() {
            for (PremiumPolicy policy : policies) {
                policy.setCalculatedPremium(policy.calculatePremium());
            }
        }

        public void displayAllPremiums() {
            for (PremiumPolicy policy : policies) {
                System.out.println(policy);
            }
        }

        public static void main(String[] args) {
            PremiumCalculator system = new PremiumCalculator();
            Scanner scanner = new Scanner(System.in);
            int choice;

            while(true) {
                System.out.println("\nPremium Calculation System");
                System.out.println("1. Add Policy");
                System.out.println("2. Update Premiums");
                System.out.println("3. Display All Premiums");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Policy Type: ");
                        String policyType = scanner.nextLine();
                        System.out.print("Enter Base Premium: ");
                        double basePremium = scanner.nextDouble();
                        System.out.print("Enter Risk Factor (e.g., 0.2 for 20%): ");
                        double riskFactor = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        system.addPolicy(new PremiumPolicy(policyType, basePremium, riskFactor));
                        System.out.println("\nPolicy Added Successfully.\n");
                        break;

                    case 2:
                        system.updatePremiums();
                        System.out.println("\nPremiums updated successfully.\n");
                        break;

                    case 3:
                        system.displayAllPremiums();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }


        }
    }

