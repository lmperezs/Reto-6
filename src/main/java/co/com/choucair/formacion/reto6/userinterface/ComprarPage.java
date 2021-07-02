package co.com.choucair.formacion.reto6.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ComprarPage extends PageObject {
    public static final Target Televisor = Target.the("Seleccionar Televisores")
            .located(By.xpath("//IMG[@src='https://exitocol.vtexassets.com/assets/vtex.file-manager-graphql/images/c3554ba2-436b-45ec-b0c9-e067d8e594b1___004ad640991f6aa8a25ffe5dcb2764be.png']"));
    public static final Target Marca = Target.the("Seleccionar marca LG")
            .located(By.xpath("(//IMG[@class='false false'])[1]"));
    public static final Target Pulgadas = Target.the("Seleccionar 44 - 50 pulgadas ")
            .located(By.xpath("(//IMG[@class='false false'])[14]"));
    public static final Target Resolucion = Target.the("seleccionar resolucion 4K")
            .located(By.xpath("//INPUT[@id='specificationFilter_19958-Uhd-4K']"));
    public static final Target Comprar = Target.the("agregar al carrito")
            .located(By.xpath("(//DIV[@class='vtex-button__label flex items-center justify-center h-100 ph6 w-100 border-box '])[7]"));
}