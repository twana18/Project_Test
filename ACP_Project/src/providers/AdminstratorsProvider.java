package providers;

import characters.Adminstrator;

import java.util.Arrays;
import java.util.List;

public class AdminstratorsProvider {
    public static final List<Adminstrator> adminstrators = Arrays.asList(
            new Adminstrator("a_1", "Admin1", "12345678"),
            new Adminstrator("a_2", "Admin2", "12345678"));
}
