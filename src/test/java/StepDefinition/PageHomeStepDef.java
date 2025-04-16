package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PageHomeStepDef {
	

	WebDriver driver=SetUp.driver;
	PageHome log=new PageHome (driver);
	
	@Given("je saisis url {string}")
	public void je_saisis_url(String string) {
	    log.SaisirURL(string);
	}

	@When("je saisis le login {string}")
	public void je_saisis_le_login(String string) {
	   log.SaisirLogin(string);
	}

	@When("je saisis le mot de passe {string}")
	public void je_saisis_le_mot_de_passe(String string) {
	   log.SaisirPassword(string);
	}

	@When("je clique sur le bouton login")
	public void je_clique_sur_le_bouton_login() {
	  log.ClickSeConnecter();
	  log.ClickFaculte();
	}

	@Then("je verifie la connexion par le texte {string}")
	public void je_verifie_la_connexion_par_le_texte(String string) {
	    Assert.assertEquals(string,log.TexteDashboard());
	    System.out.println("LA CONNEXION EST SREUSSI");
	    
	}

}
