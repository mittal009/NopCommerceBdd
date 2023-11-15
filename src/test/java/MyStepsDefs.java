import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsDefs
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage =  new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    Comment_List comment_list = new Comment_List();

    @Given("I am on Nopcommerce HomePage")
    public void i_am_on_nopcommerce_home_page()
    {
    }
    @When("I Click On Register Button")
    public void i_click_on_register_button()
    {
     homePage.clickOnRegisterButton();
    }
    @When("I enter all required registration details")
    public void i_enter_all_required_registration_details()
    {
     registerPage.enterRegistrationDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully()
    {
     registerResultPage.verifyUserRegisterSuccessfully();
    }
    @When("I Click On Details Button")
    public void i_click_on_details_button()
    {
       comment_list.clickOnDetailsButton();
    }
    @When("I Click On Comment Button")
    public void i_click_on_comment_button()
    {
      comment_list.clickOnNewCommentButton();
    }
    @Then("My Comment Should Appear In The Comment List Below")
    public void my_comment_should_appear_in_the_comment_list_below()
    {
       comment_list.verifyMessage();
    }
    @Then("Comments Should Be Verify In The List")
    public void comments_should_be_verify_in_the_list()
    {
      comment_list.verifyComment();
    }

}
