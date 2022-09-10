package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static sample.CheckPolicy.*;

public class CheckPolicyService {

    public static long limit(Info info) {

        // 정책 요건 확인
//        boolean isPolicyTarget = LEAS_CONDITION_1
//                                    .and(LEAS_CONDITION_2)
//                                    .test(info);
        boolean isPolicyTarget = Stream.of(Policy.values())
                .allMatch(p -> p.test(info));

        System.out.println("isPolicyTarget : " + isPolicyTarget);
        if (!isPolicyTarget) {
            return 0L;
        }

        // 한도 책정
        List<Long> limitList = Arrays.asList(
                LEAS_LIMIT_1.apply(info),
                LEAS_LIMIT_2.apply(info),
                LEAS_LIMIT_3.apply(info)
        );

        return Collections.min(limitList);
    }
}
