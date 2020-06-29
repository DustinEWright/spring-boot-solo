package dev.dustinwright.springbootsolo.bootstap;


import dev.dustinwright.springbootsolo.domain.Automobile;
import dev.dustinwright.springbootsolo.domain.Designer;
import dev.dustinwright.springbootsolo.repositories.AutomobileRepository;
import dev.dustinwright.springbootsolo.repositories.BrandRepository;
import dev.dustinwright.springbootsolo.repositories.DesignerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by DW 06/16/20
 */

@Component
public class BootStrapData implements CommandLineRunner {

    private final AutomobileRepository automobileRepository;
    private final BrandRepository brandRepository;
    private final DesignerRepository designerRepository;

    public BootStrapData(AutomobileRepository automobileRepository, BrandRepository brandRepository, DesignerRepository designerRepository) {
        this.automobileRepository = automobileRepository;
        this.brandRepository = brandRepository;
        this.designerRepository = designerRepository;

        Designer ford = new Designer("Bob", "Ford");
        Automobile lightning = new Automobile("F-150", "802A");

        ford.getAutomobiles().add(lightning);
        lightning.getDesigners().add(ford);

        designerRepository.save(ford);
        automobileRepository.save(lightning);

        Designer chevy = new Designer("Chevy", "Chase");
        Automobile vett = new Automobile("Corvette", "BR549");

        chevy.getAutomobiles().add(vett);
        lightning.getDesigners().add(chevy);

        designerRepository.save(chevy);
        automobileRepository.save(vett);

        System.out.println("Bootstrap started");
        System.out.println("Number of automobiles: " + automobileRepository.count());
        System.out.println("Number of designers: " + designerRepository.count());




    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
    }
}

