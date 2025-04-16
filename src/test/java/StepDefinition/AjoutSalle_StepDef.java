package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageSalle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutSalle_StepDef {
		
	WebDriver driver=SetUp.driver;
	PageSalle ajout= new PageSalle(driver);
	
	@Given("je clique sur plan etude")
	public void je_clique_sur_plan_etude()  {
	   ajout.SlidebarScroll();
	   ajout.ClickPlanEtude();
	}

	@When("je clique sur parametrage")
	public void je_clique_sur_parametrage()  {
	    ajout.ClickParametrage();
	}

	@When("je clique sur bloc et salle")
	public void je_clique_sur_bloc_et_salle()  {
	    ajout.ClickBlocetSalle();
	}

	@When("je clique sur nom des salles")
	public void je_clique_sur_nom_des_salles()  {
	    ajout.ClickNomdesSalle();
	}

	@When("je clique sur bouton ajouter salle")
	public void je_clique_sur_bouton_ajouter_salle() {
	    ajout.ClickAjouterSalle();
	}

	@When("je saisis le nom de salle {string}")
	public void je_saisis_le_nom_de_salle(String string) {
	   ajout.SaisirNom(string);
	}

	@When("je saisis le la capacité de la salle {string}")
	public void je_saisis_le_la_capacité_de_la_salle(String string) {
	   ajout.SaisirCapacite(string);
	}

	@When("je selectionne le type de la salle {string}")
	public void je_selectionne_le_type_de_la_salle(String string)  {
	    ajout.SlectionnerType(string);
	}

	@When("je selectionne le bloc de la salle {string}")
	public void je_selectionne_le_bloc_de_la_salle(String string)  {
	    ajout.SlectionnerBloc(string);
	}

	@When("je clique sur bouton Ajouter")
	public void je_clique_sur_bouton_ajouter() {
	   ajout.ClickAjout();
	}

	@Then("je vérifie l ajout de nouvelle salle avec le message de popup {string}")
	public void je_vérifie_l_ajout_de_nouvelle_salle_avec_le_message_popup(String string) {
	    Assert.assertEquals(string,ajout.ConfirmAjout());
	    System.out.println("LA SALLE AJOUTE AVEC SUCCEE");     
	}
	
//	@Then("je clique sur bouton OK pour onfirmer l ajout et je deconnecte")
//	public void je_clique_sur_bouton_OK_pour_confirmer_l_ajout_et_je_deconnecte() {
//	    ajout.ClickOKAjout();
//	    ajout.Deconnexion();
//	}
	@Then("je clique sur bouton OK pour confirmer l ajout et je deconnecte")
	public void je_clique_sur_bouton_ok_pour_confirmer_l_ajout_et_je_deconnecte() {
		ajout.ClickOKAjout();
	    ajout.Deconnexion();
	}
}
