package sample;

public class Main {

    public static void main(String[] args) {
        Info info = new Info();
        info.setSalary(200_000_000);
        info.setRestrictAptYn("N");

        long limit = CheckPolicyService.limit(info);
        System.out.println(limit);
    }

}
