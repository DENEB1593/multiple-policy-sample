package sample;

import java.util.function.Function;
import java.util.function.Predicate;

public class CheckPolicy {
    // 전세특례대상자 여부 조건 목록
//    public static final Predicate<Info> LEAS_CONDITION_1 = (info) -> {
//        return info.getSalary() > 100_000_000;
//    };
//
//    public static final Predicate<Info> LEAS_CONDITION_2 = (info) -> {
//        return "Y".equals(info.getRestrictAptYn());
//    };
//
//    public static final Predicate<Info> LEAS_CONDITION_3 = (info) -> {
//        return "Y".equals(info.getRestrictAptYn());
//    };
    // -- 전세특례대상자 여부 조건 목록


    // 보증한도 책정 정책
    public static final Function<Info, Long> LEAS_LIMIT_1 = (info) -> {
        return 100_000_000L;
    };

    public static final Function<Info, Long> LEAS_LIMIT_2 = (info) -> {
        return 200_000_000L;
    };

    public static final Function<Info, Long> LEAS_LIMIT_3 = (info) -> {
        return 300_000_000L;
    };
    // -- 보증한도 책정 정책

}
