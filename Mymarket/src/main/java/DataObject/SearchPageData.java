package DataObject;
import com.github.javafaker.Faker;

public interface SearchPageData {

        Faker faker = new Faker();
        int MaxPriceValue = faker.number().numberBetween(30,999);
}
