package def;

import java.util.Date;

import org.junit.Assert;
import io.cucumber.java.en.Given;

public class stepdefination {

	@Given("I want to write a {int} step with precondition")
	public void i_want_to_write_a_step_with_precondition(int value) throws InterruptedException {

		System.out.println(
				"before : " + value + " | time : " + new Date() + " | Thread ID : " + Thread.currentThread().getId());
		Thread.sleep(5000);
		System.out.println(
				"after : " + value + " | time : " + new Date() + " | Thread ID : " + Thread.currentThread().getId());

	}

	@Given("I want to write a step {int} with precondition")
	public void i_want_to_write_a_step_param_with_precondition(int value) throws InterruptedException {

		System.out.println(
				"before : " + value + " | time : " + new Date() + " | Thread ID : " + Thread.currentThread().getId());
		Thread.sleep(5000);
		System.out.println(
				"after : " + value + " | time : " + new Date() + " | Thread ID : " + Thread.currentThread().getId());

		Assert.fail("explicitly failed : " + value);
	}

	@Given("I want to write step a {int} with precondition")
	public void i_want_to_write_step_a_param_with_precondition(int value) throws InterruptedException {

		System.out.println(
				"before : " + value + " | time : " + new Date() + " | Thread ID : " + Thread.currentThread().getId());
		Thread.sleep(5000);
		System.out.println(
				"after : " + value + " | time : " + new Date() + " | Thread ID : " + Thread.currentThread().getId());
		
		double ran = Math.random();
		System.out.println("ran value : " + ran);
		
		if (ran < .3)
			Assert.fail("failed based on the random value: " + value);
	}

}
