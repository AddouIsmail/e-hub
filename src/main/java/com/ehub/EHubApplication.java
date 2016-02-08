package com.ehub;

import com.ehub.entities.Admin;
import com.ehub.entities.Category;
import com.ehub.entities.Client;
import com.ehub.entities.Facture;
import com.ehub.entities.Order;
import com.ehub.entities.OrderLines;
import com.ehub.entities.PaymentMode;
import com.ehub.entities.Product;
import com.ehub.entities.Supplier;
import com.ehub.repositories.AdminRepository;
import com.ehub.repositories.CategoryRepository;
import com.ehub.repositories.ClientRepository;
import com.ehub.repositories.FactureRepository;
import com.ehub.repositories.OrderLinesRepository;
import com.ehub.repositories.OrderRepository;
import com.ehub.repositories.PaymentModeRepository;
import com.ehub.repositories.ProductRepository;
import com.ehub.repositories.SupplierRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EHubApplication implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private SupplierRepository supplierRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderLinesRepository orderLinesRepository;
    @Autowired
    private FactureRepository factureRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PaymentModeRepository payePaymentModeRepository;
    @Autowired
    private AdminRepository adminRepository;

    public static void main(String[] args) {
        SpringApplication.run(EHubApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        deleteAll();
        insertAll();
    }

    public void insertAll() {

        Supplier s = new Supplier();
        Product p = new Product();
        PaymentMode pm = new PaymentMode();
        OrderLines ol = new OrderLines();
        Order o = new Order();
        Facture f = new Facture();
        Client cli = new Client();
        Category cat = new Category();
        Admin a = new Admin();

        insertCategories();
        for (int i = 0; i < 10; i++) {
            s = new Supplier();
            s.setAddress("Adresse " + i);
            s.setName("Name " + i);
            s.setPhoneNumber("+212 6 5365" + i);
            supplierRepository.insert(s);
        }

        for (int i = 0; i < 20; i++) {
            p = new Product();
            p.setName("product " + i);
            p.setBrand("Brand " + i);
            p.setBuyPrice(i * 7);
            p.setDescription("Description " + i);
            p.setDiscount(i / 100);
            List<String> listcat = new ArrayList<String>();
            listcat.add("Téléphones 4G");
            listcat.add("Android phone");
            listcat.add("Promotions");
            List<String> listimages = new ArrayList<>();
            listimages.add("picture.jpg");
            p.setImages(listimages);

            p.setIdCategory(listcat);

            p.setIdSupplier("" + (int) i / 4);
            p.setShippedPrice(i * 4);
            p.setQuantity(i);
            p.setId("" + i);
            productRepository.insert(p);
        }

        for (int i = 0; i < 3; i++) {
            pm = new PaymentMode();
            pm.setId("" + i);
            pm.setModality("modality " + i);
            payePaymentModeRepository.insert(pm);
        }

        for (int i = 0; i < 100; i++) {
            ol = new OrderLines();
            ol.setId("" + i);
            ol.setQuantity(i);
            ol.setIdOrder("" + (int) i % 10);
            ol.setIdProduct("" + (int) i % 20);
            orderLinesRepository.insert(ol);
        }

        for (int i = 0; i < 10; i++) {
            o = new Order();
            o.setId("" + i);
            o.setIdClient("" + (int) i / 2);
            o.setOrderAmount((double) (i * 7));
            o.setOrderDate(new Date());
            o.setOrderDeadline(i);
            o.setShipLocation("ship location" + i);
            o.setShippingPrice(i * 3);
            orderRepository.insert(o);
        }

        for (int i = 0; i < 100; i++) {
            f = new Facture();
            f.setId("f" + i);
            f.setIdOrder("" + i);
            f.setIdPaymentMode("" + (i % 3) + 1);
            f.setTotalPrice((double) (i * (7 / 3)));
            factureRepository.insert(f);
        }

        for (int i = 0; i < 10; i++) {
            cli = new Client();
            cli.setId("" + i);
            cli.setAddress("addresse client " + 1);
            cli.setBirthDate(new Date());
            cli.setEmail("client" + i + "@gmail.com");
            cli.setFirstName("firstname " + i);
            cli.setLastName("lastname " + i);
            cli.setPassword("password" + i);
            cli.setPhoneNumber("+212 6 5645" + i);
            cli.setPicture("user.jpg");
            cli.setSex("M");
            cli.setLogin("login" + i);
            clientRepository.insert(cli);
        }
    }

    public void deleteAllCategories() {
        categoryRepository.deleteAll();
    }

    public void deleteAll() {
        adminRepository.deleteAll();
        categoryRepository.deleteAll();
        supplierRepository.deleteAll();
        productRepository.deleteAll();
        payePaymentModeRepository.deleteAll();
        orderLinesRepository.deleteAll();
        clientRepository.deleteAll();
        factureRepository.deleteAll();
        orderRepository.deleteAll();
    }

    public void insertCategories() {
        Category c = new Category();

        c.setName("Téléphones 4G");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Android phone");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("iPhone");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Windows phone");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Téléphones bad gammes");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

//--------------------------------------------------------------------------------------
        c = new Category();
        c.setName("Téléphones 4G");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Android");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("iPad");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Microsoft Surface");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Tablettes bad gammes");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

//--------------------------------------------------------------------------------------
        c = new Category();
        c.setName("Power Bank");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Accessoires universels");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Accessoires Samsung");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Accessoires Apple");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Casque et écouteurs");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Montres connectés");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

//-----------------------------------------------------------------------------
        c = new Category();
        c.setName("Télephone IP");
        c.setSuperCategory("TELEPHONIE FIXE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.insert(c);

//-----------------------------------------------------------------------------
        c = new Category();
        c.setName("Baskets de ville");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();

        c.setName("Chaussures de ville");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Mocassins");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Bottines");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Chaussures de sport");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Sandales et Tongs");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("T-Shirts");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Polos");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Vestes & Manteaux");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Chemises");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Pulls Gilets & Cardigan");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Pantalons & Jeans");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Vetements sport");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Montres");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Bijoux");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Sacs");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Portes feuilles & Etuis");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Ceintures");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Lunettes de soleils");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Valises");
        c.setSuperCategory("BAGAGERIE");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Sacs à dos");
        c.setSuperCategory("BAGAGERIE");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.insert(c);
//---------------------------------------------------------
        c = new Category();
        c.setName("Ballerines");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Escarpins");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Bottes & Bottines");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Sandales & Nu-pieds");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Sneaker & Tennis");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Espadrilles");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Tongs");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Robes");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Débardeurs & T-Shirts");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Chemises, blouses & tuniques");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Pantalons & Leggins");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Pulls & Gilets");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Lingeries & Sous-vêtements");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        c = new Category();
        c.setName("Montres");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        c = new Category();

        c.setName("Bijoux");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Maroquinerie");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Ceintures");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Optique");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Foulard & Echarpes");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Valises");
        c.setSuperCategory("BAGAGERIE");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Sacs à dos");
        c.setSuperCategory("BAGAGERIE");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.insert(c);
        //-------------------------------------------------------------------
        c = new Category();
        c.setName("Protéïnes-Whey");
        c.setSuperCategory("NUTRITION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Gainer-Masse");
        c.setSuperCategory("NUTRITION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Acides animés");
        c.setSuperCategory("NUTRITION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Barre de musculation");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Appareils Abdominaux");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Medecine du sport");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Vêtements aminsiscants");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Haltères-Lestes");
        c.setSuperCategory("SPORT D'EQUIPE");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Football");
        c.setSuperCategory("SPORT D'EQUIPE");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Basket");
        c.setSuperCategory("SPORT D'EQUIPE");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Cyclisme");
        c.setSuperCategory("CYCLISME & PLEIN AIR");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Randonnées & Camping");
        c.setSuperCategory("CYCLISME & PLEIN AIR");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Rollers & Skateboards");
        c.setSuperCategory("CYCLISME & PLEIN AIR");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Surf");
        c.setSuperCategory("SPORT EXTREMES");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Skateboards");
        c.setSuperCategory("SPORT EXTREMES");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Bodyboards");
        c.setSuperCategory("SPORT EXTREMES");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Stand up paddles");
        c.setSuperCategory("SPORT EXTREMES");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.insert(c);

//--------------------------------------------------//--------------------------------------------------
        // - Informatique  -Ordinateurs Portables
        c = new Category();
        c.setName("Pc portable");
        c.setSuperCategory("ORDINATEURS PORTABLES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Tablette Pc");
        c.setSuperCategory("ORDINATEURS PORTABLES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        // - Informatique  -Imprimantes et scanners
        c = new Category();
        c.setName("Cartouches d'encres et toners");
        c.setSuperCategory("IMPRIMANTES ET SCANNERS");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Imprimantes");
        c.setSuperCategory("IMPRIMANTES ET SCANNERS");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Scanners");
        c.setSuperCategory("IMPRIMANTES ET SCANNERS");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Papier pour Impression");
        c.setSuperCategory("IMPRIMANTES ET SCANNERS");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        // - Informatique  -Ordinateurs  fixes
        c = new Category();
        c.setName("Ecrans & Moniteurs");
        c.setSuperCategory("ORDINATEURS FIXES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Ordinateurs Tout en un");
        c.setSuperCategory("ORDINATEURS FIXES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Unités Centrales");
        c.setSuperCategory("ORDINATEURS FIXES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        // - Informatique  -périphériques et accessoires
        c = new Category();
        c.setName("Accessoires Pc");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Claviers et Souris");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Son et Webcam");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Stockage externe");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Périphériques PC");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Sacoches & Housses");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Réseaux & WIFI");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Péripheriques divers");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        // - Informatique  -Gaming et graphiques
        c = new Category();
        c.setName("PC Gamers & Graphistes");
        c.setSuperCategory("GAMING & GRAPHISME");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Accessoires Gaming & Graphisme");
        c.setSuperCategory("GAMING & GRAPHISME");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.insert(c);

        // - BEAUTE,HYGIENE & SANTE - maquillage
        c = new Category();
        c.setName("Yeux et Sourcils");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Font de teint et correcteur");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Poudre et Paillettes");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Lévres");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Accessoires & Palettes");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Coffrets & Palettes");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Vernis");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Accessoires Manucure");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        // - BEAUTE,HYGIENE & SANTE - PARAPHARMACIE
        c = new Category();
        c.setName("Cheveux");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Soin du Corps,Epilation");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Produits Solaires");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Soin du visage");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Pieds,Mains & Ongles");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Huile végétales et essentielles");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Univers homme");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Hygiène bucco dentaire");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Minceur");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Compléments alimentaires & Diététique");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Santé");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Intimité & Protection");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        // - BEAUTE,HYGIENE & SANTE - PARFUMS HOMME
        c = new Category();
        c.setName("Eau de Toillete");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Eau de Parfum");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Eau de cologne");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Parfums Orientaux");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Cofferts");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Parfum à petit prix");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        // - BEAUTE,HYGIENE & SANTE - PARFUM FEMME
        c = new Category();
        c.setName("Eau de Toilette");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Eau de Parfum");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Eau de cologne");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Parfums Orientaux");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Coffrets");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);

        c = new Category();
        c.setName("Parfum à petit prix");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.insert(c);
    }

}
