package AdvanceProb.com;

import java.util.*;

public class Polices {
    enum PolicyType {
        HEALTH,
        LIFE,
        AUTO,
        FIRE
    }
    public int policy_number;
    public String policyholder_name;
    PolicyType type;



    public void setValues(){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);

        System.out.println("Enter the Policy Number");
        this.policy_number=sc.nextInt();
        System.out.println("Enter the Policy Holder Name");
        this.policyholder_name=sc1.nextLine();
        setType();


    }

    public void setType(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose Policy Type");
        System.out.println("1. Health");
        System.out.println("2. Life");
        System.out.println("3. Auto");
        System.out.println("4. Fire");
        int option= sc.nextInt();

        switch (option){
            case 1:
                this.type=PolicyType.HEALTH;
                break;
            case 2:
                this.type=PolicyType.LIFE;
                break;
            case 3:
                this.type=PolicyType.AUTO;
                break;
            case 4:
                this.type=PolicyType.FIRE;
                break;
            default:
                System.out.println("Enter Valid input");
                break;
        }
    }

    @Override
    public String toString() {
        return this.policy_number + " " + this.policyholder_name + " " + this.type;
    }



    public static void main(String[] args) {

        System.out.println("Welcome to Policy Management");
       // Map<PolicyType, ArrayList<AdvanceProb.com.Polices>> policy_list=new HashMap<>();
        Map<Integer,Polices>  policesMap=new HashMap<>();
        boolean fl=true;
        while(fl){
            System.out.println("1. Add new Policies");
            System.out.println("2. Remove Policies");
            System.out.println("3. Update Policies");
            System.out.println("4. List all the policies of Specific Type");
            System.out.println("5. Exit");

            Scanner sc=new Scanner(System.in);
            Scanner sc1=new Scanner(System.in);
            int option=sc.nextInt();

            switch (option){
                case 1:
                    Polices policy=new Polices();
                    policy.setValues();
                    policesMap.put(policy.policy_number,policy);
                    System.out.println("New Policy Added");
                    break;

                case 2:
                    int rem= sc.nextInt();
                    if (policesMap.containsKey(rem)){
                        policesMap.remove(rem);
                        System.out.println("Removed");
                    }
                    else
                        System.out.println("Policy number is not present");
                    break;
                case 3:
                    System.out.println("Enter the policy number");
                    int rem1= sc.nextInt();
                    if (policesMap.containsKey(rem1)){
                       Polices old=policesMap.get(rem1);
                        System.out.println("What you want to change");
                        System.out.println("1. Policy Holder Name:");
                        System.out.println("2. Policy Type");
                        int op=sc.nextInt();

                        switch (op){
                            case 1:
                                System.out.println("Enter the new Name");
                                old.policyholder_name=sc1.nextLine();
                                break;
                            case 2:
                                System.out.println("select the new policy type");
                                old.setType();
                                break;
                            default:
                                System.out.println("choose valid option");
                                break;
                        }
                        System.out.println("Policy updated");
                    }
                    else
                        System.out.println("Particular Policy number is not present");
                    break;
                case 4:
                    System.out.println("Select the Policy Type");
                    Polices pp=new Polices();
                    pp.setType();
                    for(Map.Entry i:policesMap.entrySet()){
                        Polices z=(Polices)i.getValue();
                        if(z.type==pp.type)
                            System.out.println(z.policy_number+" ");
                    }
                    break;
                case 5:
                    fl=false;
                    break;
                default:
                    System.out.println("Enter the valid option");
                    break;

            }

        }

    }

}