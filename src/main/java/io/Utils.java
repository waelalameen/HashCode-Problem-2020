package io;

import java.util.Optional;

class Utils {

    static Integer parseNumber(String number) {
        try {
            return Optional.of(Integer.valueOf(number)).get();
        } catch (NumberFormatException e) {
            return (Integer) Optional.empty().orElse(-1);
        }
    }
}
