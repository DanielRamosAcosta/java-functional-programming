package declarative;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ImperativeVsDeclarative {
    static void doWorkImperative () {
        int[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] * 2;
        }

        System.out.println(Arrays.toString(list));
    }

    static void doWorkDeclarative () {
        List<Integer> list = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
