package sample;

public enum Policy {
    LEAS_CONDITION_1("전세조건확인지표1") {
        @Override
        public boolean test(Info info) {
            System.out.println("con1");
            return info.getSalary() > 100_000_000;
        }
    },
    LEAS_CONDITION_2("전세조건확인지표2") {
        @Override
        public boolean test(Info info) {
            System.out.println("con2");
            return "Y".equals(info.getRestrictAptYn());
        }
    },
    LEAS_CONDITION_3("전세조건확인지표3") {
        @Override
        public boolean test(Info info) {
            System.out.println("con3");
            return "Y".equals(info.getRestrictAptYn());
        }
    };

    private final String desc;
    public abstract boolean test(Info info);

    Policy(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
