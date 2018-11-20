package hellocucumber.test;

import cucumber.api.java.en.Given;

public class Stepdef2nd {
    @Given("I have (\\d+) cukes in my belly")
    public void i_have_n_cukes_in_my_belly(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
    }
}