package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageSalle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuppSalle_StepDaf {

	WebDriver driver = SetUp.driver;
	PageSalle supp = new PageSalle(driver);

	@Given("je cherchere la salle {string}")
	public void je_cherchere_la_salle(String string) {
		supp.RechercherSalleSupp(string);
	}

	@When("je clique sur bouton supprimer")
	public void je_clique_sur_bouton_supprimer() {
		supp.ClickSupp();
	}

	@When("je clique bouton OUI Supprimer de popup")
	public void je_clique_bouton_oui_supprimer_de_popup() {
		supp.ClickSuppPopup();
	}

	@Then("je vérifie la suppression de la salle avec le message popup {string}")
	public void je_vérifie_la_suppression_de_la_salle_avec_le_message_popup(String string) {
		Assert.assertEquals(string, supp.ConfirmSupp());
		System.out.println("LA SALLE A ETE SUPPRIME AVEC SUCCEE");
	}

	@Then("je déconnecte")
	public void je_déconnecte() {
		supp.ClickOKSupp();
		supp.Deconnexion();
	}

}
