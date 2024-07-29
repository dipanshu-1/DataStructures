package AdvanceProb.com;


    import java.util.ArrayList;
import java.util.Scanner;

    class CoverageOption {
        private String coverageType;
        private double coverageAmount;
        private double premium;

        public CoverageOption(String coverageType, double coverageAmount, double premium) {
            this.coverageType = coverageType;
            this.coverageAmount = coverageAmount;
            this.premium = premium;
        }

        // Getters and Setters
        public String getCoverageType() {
            return coverageType;
        }

        public void setCoverageType(String coverageType) {
            this.coverageType = coverageType;
        }

        public double getCoverageAmount() {
            return coverageAmount;
        }

        public void setCoverageAmount(double coverageAmount) {
            this.coverageAmount = coverageAmount;
        }

        public double getPremium() {
            return premium;
        }

        public void setPremium(double premium) {
            this.premium = premium;
        }

        @Override
        public String toString() {
            return "Coverage Type: " + coverageType + ", Coverage Amount: " + coverageAmount + ", Premium: " + premium;
        }
    }

    public class CoverageComparison {
        private ArrayList<CoverageOption> coverageOptions;

        public CoverageComparison() {
            coverageOptions = new ArrayList<>();
        }

        public void addCoverageOption(CoverageOption option) {
            coverageOptions.add(option);
        }

        public void compareCoverageOptions() {
            if (coverageOptions.isEmpty()) {
                System.out.println("No coverage options available to compare.");
                return;
            }

            CoverageOption bestOption = coverageOptions.get(0);
            for (CoverageOption option : coverageOptions) {
                if (option.getCoverageAmount() > bestOption.getCoverageAmount() && option.getPremium() <= bestOption.getPremium()) {
                    bestOption = option;
                }
            }

            System.out.println("Best Coverage Option:");
            System.out.println(bestOption);
        }

        public void displayAllCoverageOptions() {
            for (CoverageOption option : coverageOptions) {
                System.out.println(option);
            }
        }

        public static void main(String[] args) {
            CoverageComparison manager = new CoverageComparison();
            Scanner scanner = new Scanner(System.in);
            int choice;

            while(true) {
                System.out.println("\nCoverage Option Management System");
                System.out.println("1. Add Coverage Option");
                System.out.println("2. Compare Coverage Options");
                System.out.println("3. Display All Coverage Options");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Coverage Type: ");
                        String coverageType = scanner.nextLine();
                        System.out.print("Enter Coverage Amount: ");
                        double coverageAmount = scanner.nextDouble();
                        System.out.print("Enter Premium: ");
                        double premium = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        manager.addCoverageOption(new CoverageOption(coverageType, coverageAmount, premium));
                        System.out.println("\nCoverage Option Added Successfully.\n");
                        break;
                    case 2:
                        manager.compareCoverageOptions();
                        break;
                    case 3:
                        manager.displayAllCoverageOptions();
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

