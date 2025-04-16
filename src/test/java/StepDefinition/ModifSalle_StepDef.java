package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageSalle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifSalle_StepDef {

	WebDriver driver = SetUp.driver;
	PageSalle modif = new PageSalle(driver);

	@Given("je cherche la salle a modifer {string}")
	public void je_cherche_la_salle_a_modifer(String string) {
		modif.RechercheSalleMdf(string);
	}

	@When("je clique sur icon stylo")
	public void je_clique_sur_icon_stylo() {
		modif.ClickModif();
	}

	@When("je change le nom de salle {string}")
	public void je_change_le_nom_de_salle(String string) {
		modif.ChangerNomSalle(string);
	}

	@When("je change la capacité de la salle {string}")
	public void je_change_la_capacité_de_la_salle(String string) {
		modif.ChangerCapacité(string);
	}

	@When("je change  le type de la salle {string}")
	public void je_change_le_type_de_la_salle(String string) {
		modif.ChangerType(string);

	}

	@When("je clique sur bouton Modifier")
	public void je_clique_sur_bouton_modifier() {
		modif.ClickModifier();
	}

	@Then("je vérifie la modification de nouvelle salle avec le message popup {string}")
	public void je_vérifie_la_modification_de_nouvelle_salle_avec_le_message_popup(String string) {
		Assert.assertEquals(string, modif.ConfirmModif());
		System.out.println("LA SALLE A ETE MODIFIE AVEC SUCCEE");
	}

	@Then("je clique sur bouton OK pour con firmer la modification et je deconnecte")
	public void je_clique_sur_bouton_ok_pour_con_firmer_la_modification_et_je_deconnecte() {
		modif.ClickOKmodif();
		modif.Deconnexion();
	}
}
