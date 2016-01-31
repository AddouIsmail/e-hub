package com.ehub;

import com.ehub.entities.*;
import com.ehub.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ismail on 31/01/2016.
 */

public class seeds {
/*

    public void insertCategories(){
        Category c = new Category();

        c.setName("Téléphones 4G");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("Android phone");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("iPhone");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("Windows phone");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("Téléphones bad gammes");
        c.setSuperCategory("TELEPHONES PORTABLES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);

//--------------------------------------------------------------------------------------

        c.setName("Téléphones 4G");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("Android");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("iPad");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("Microsoft Surface");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);

        c.setName("Tablettes bad gammes");
        c.setSuperCategory("TABLETTES");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);

//--------------------------------------------------------------------------------------

        c.setName("Power Bank");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("Accessoires universels");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("Accessoires Samsung");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);

        c.setName("Accessoires Apple");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);

        c.setName("Casque et écouteurs");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);


        c.setName("Montres connectés");
        c.setSuperCategory("ACCESSOIRES TELEPHONIE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);

//-----------------------------------------------------------------------------

        c.setName("Télephone IP");
        c.setSuperCategory("TELEPHONIE FIXE");
        c.setSuperSuperCategory("TELEPHONIE");
        categoryRepository.save(c);

//-----------------------------------------------------------------------------

        c.setName("Baskets de ville");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Chaussures de ville");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Mocassins");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Bottines");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Chaussures de sport");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Sandales et Tongs");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("T-Shirts");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Polos");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Vestes & Manteaux");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Chemises");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Pulls Gilets & Cardigan");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Pantalons & Jeans");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Vetements sport");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Montres");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Bijoux");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);


        c.setName("Sacs");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Portes feuilles & Etuis");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Ceintures");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Lunettes de soleils");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Valises");
        c.setSuperCategory("BAGAGERIE");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);

        c.setName("Sacs à dos");
        c.setSuperCategory("BAGAGERIE");
        c.setSuperSuperCategory("MODE HOMMES");
        categoryRepository.save(c);
        //---------------------------------------------------------

        c.setName("Ballerines");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);


        c.setName("Escarpins");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Bottes & Bottines");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);


        c.setName("Sandales & Nu-pieds");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);


        c.setName("Sneaker & Tennis");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Espadrilles");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Tongs");
        c.setSuperCategory("CHAUSSURES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);


        c.setName("Robes");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Débardeurs & T-Shirts");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Chemises, blouses & tuniques");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Pantalons & Leggins");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);


        c.setName("Pulls & Gilets");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);


        c.setName("Lingeries & Sous-vêtements");
        c.setSuperCategory("VETEMENTS");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Montres");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);


        c.setName("Bijoux");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);


        c.setName("Maroquinerie");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Ceintures");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Optique");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Foulard & Echarpes");
        c.setSuperCategory("ACCESSOIRES");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Valises");
        c.setSuperCategory("BAGAGERIE");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);

        c.setName("Sacs à dos");
        c.setSuperCategory("BAGAGERIE");
        c.setSuperSuperCategory("MODE FEMMES");
        categoryRepository.save(c);
        //-------------------------------------------------------------------
        c.setName("Protéïnes-Whey");
        c.setSuperCategory("NUTRITION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Gainer-Masse");
        c.setSuperCategory("NUTRITION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Acides animés");
        c.setSuperCategory("NUTRITION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Barre de musculation");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Appareils Abdominaux");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Medecine du sport");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Vêtements aminsiscants");
        c.setSuperCategory("FITNESS & MUSCULATION");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Haltères-Lestes");
        c.setSuperCategory("SPORT D'EQUIPE");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Football");
        c.setSuperCategory("SPORT D'EQUIPE");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Basket");
        c.setSuperCategory("SPORT D'EQUIPE");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Cyclisme");
        c.setSuperCategory("CYCLISME & PLEIN AIR");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Randonnées & Camping");
        c.setSuperCategory("CYCLISME & PLEIN AIR");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Rollers & Skateboards");
        c.setSuperCategory("CYCLISME & PLEIN AIR");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Surf");
        c.setSuperCategory("SPORT EXTREMES");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Skateboards");
        c.setSuperCategory("SPORT EXTREMES");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Bodyboards");
        c.setSuperCategory("SPORT EXTREMES");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);

        c.setName("Stand up paddles");
        c.setSuperCategory("SPORT EXTREMES");
        c.setSuperSuperCategory("SPORT & LOISIRS");
        categoryRepository.save(c);


//--------------------------------------------------//--------------------------------------------------
        // - Informatique  -Ordinateurs Portables

        c.setName("Pc portable");
        c.setSuperCategory("ORDINATEURS PORTABLES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Tablette Pc");
        c.setSuperCategory("ORDINATEURS PORTABLES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        // - Informatique  -Imprimantes et scanners

        c.setName("Cartouches d'encres et toners");
        c.setSuperCategory("IMPRIMANTES ET SCANNERS");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Imprimantes");
        c.setSuperCategory("IMPRIMANTES ET SCANNERS");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Scanners");
        c.setSuperCategory("IMPRIMANTES ET SCANNERS");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Papier pour Impression");
        c.setSuperCategory("IMPRIMANTES ET SCANNERS");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        // - Informatique  -Ordinateurs  fixes

        c.setName("Ecrans & Moniteurs");
        c.setSuperCategory("ORDINATEURS FIXES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Ordinateurs Tout en un");
        c.setSuperCategory("ORDINATEURS FIXES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Unités Centrales");
        c.setSuperCategory("ORDINATEURS FIXES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        // - Informatique  -périphériques et accessoires

        c.setName("Accessoires Pc");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Claviers et Souris");
                c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Son et Webcam");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Stockage externe");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Périphériques PC");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Sacoches & Housses");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Réseaux & WIFI");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Péripheriques divers");
        c.setSuperCategory("PÉRIPHÉRIQUES & ACCESSOIRES");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        // - Informatique  -Gaming et graphiques

        c.setName("PC Gamers & Graphistes");
        c.setSuperCategory("GAMING & GRAPHISME");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);

        c.setName("Accessoires Gaming & Graphisme");
        c.setSuperCategory("GAMING & GRAPHISME");
        c.setSuperSuperCategory("INFORMATIQUE & BUREAU");
        categoryRepository.save(c);


        // - BEAUTE,HYGIENE & SANTE - maquillage

        c.setName("Yeux et Sourcils");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Font de teint et correcteur");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Poudre et Paillettes");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Lévres");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Accessoires & Palettes");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Coffrets & Palettes");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Vernis");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Accessoires Manucure");
        c.setSuperCategory("MAQUILLAGE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        // - BEAUTE,HYGIENE & SANTE - PARAPHARMACIE


        c.setName("Cheveux");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Soin du Corps,Epilation");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Produits Solaires");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Soin du visage");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Pieds,Mains & Ongles");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Huile végétales et essentielles");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Univers homme");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Hygiène bucco dentaire");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Minceur");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Compléments alimentaires & Diététique");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Santé");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Intimité & Protection");
        c.setSuperCategory("PARAPHARMACIE");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        // - BEAUTE,HYGIENE & SANTE - PARFUMS HOMME


        c.setName("Eau de Toillete");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Eau de Parfum");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Eau de cologne");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Parfums Orientaux");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Cofferts");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Parfum à petit prix");
        c.setSuperCategory("PARFUMS HOMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        // - BEAUTE,HYGIENE & SANTE - PARFUM FEMME


        c.setName("Eau de Toilette");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Eau de Parfum");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Eau de cologne");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Parfums Orientaux");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Coffrets");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);

        c.setName("Parfum à petit prix");
        c.setSuperCategory("PARFUMS FEMME");
        c.setSuperSuperCategory("BEAUTE,HYGIENE & SANTE");
        categoryRepository.save(c);












    }

    public void insertAll(){
        categoryRepository.deleteAll();
        supplierRepository.deleteAll();
        productRepository.deleteAll();
        payePaymentModeRepository.deleteAll();
        orderLinesRepository.deleteAll();
        clientRepository.deleteAll();
        factureRepository.deleteAll();
        orderRepository.deleteAll();

        Supplier s=new Supplier();
        Product p=new Product();
        PaymentMode pm=new PaymentMode();
        OrderLines ol=new OrderLines();
        Order o=new Order();
        Facture f=new Facture();
        Client cli=new Client();
        Category cat=new Category();
        Admin a=new Admin();

        insertCategories();
        for(int i=0; i<100 ; i++){
            s.setAddress("Adresse "+i);
            s.setName("Name "+i);
            s.setPhoneNumber("PhoneNumber +212 6 5365"+i);
            supplierRepository.save(s);
        }

        for(int i=0; i<200 ; i++){
            p.setName("product "+i);
            p.setBrand("Brand "+i);
            p.setBuyPrice(i*7);
            p.setDescription("Description "+i);
            p.setDiscount(i/100);
            List<String> listcat=new ArrayList<String>();
            listcat.add("Téléphones 4G");
            listcat.add("Android phone");
            listcat.add("Promotions");

            p.setIdCategory(listcat);

            p.setIdSupplier(""+(int)i/4);
            p.setShippedPrice(i*4);
            p.setQuantity(i);
            p.setId(""+i);
            productRepository.save(p);
        }

        for(int i=0; i<3 ; i++){
            pm.setId(""+i);
            pm.setModality("modality "+i);
            payePaymentModeRepository.save(pm);
        }

        for(int i=0; i<1000 ; i++){
            ol.setId(""+i);
            ol.setQuantity(i);
            ol.setIdOrder(""+(int)i%100);
            ol.setIdProduct(""+(int) i%200);
            orderLinesRepository.save(ol);
        }

        for(int i=0; i<100 ; i++){
            o.setId(""+i);
            o.setIdClient(""+(int) i/2);
            o.setOrderAmount((double) (i*7));
            o.setOrderDate(new Date());
            o.setOrderDeadline(i);
            o.setShipLocation("ship location"+i);
            o.setShippingPrice(i*3);
            orderRepository.save(o);
        }

        for(int i=0; i<1000 ; i++){
            f.setId("f"+i);
            f.setIdOrder(""+i);
            f.setIdPaymentMode(""+(i%3)+1);
            f.setTotalPrice((double) (i *(7/3)));
            factureRepository.save(f);
        }

        for(int i=0; i<100 ; i++){
            cli.setId(""+i);
            cli.setAdress("addresse client "+1);
            cli.setBirthDate(new Date());
            cli.setCity("city "+i);
            cli.setCountry("country "+i);
            cli.setEmail("client"+i+"@gmail.com");
            cli.setFirstName("firstname "+i);
            cli.setLastName("lastname "+i);
            cli.setLogin("login"+i);
            cli.setPassword("password"+i);
            cli.setPhoneNumber("+212 6 5645"+i);
            cli.setPicture("user.jpg");
            cli.setSex("M");
            clientRepository.save(cli);
        }
    }

    public void deleteAllCategories(){
        categoryRepository.deleteAll();
    }

    public void deleteAll(){
        categoryRepository.deleteAll();
        supplierRepository.deleteAll();
        productRepository.deleteAll();
        payePaymentModeRepository.deleteAll();
        orderLinesRepository.deleteAll();
        clientRepository.deleteAll();
        factureRepository.deleteAll();
        orderRepository.deleteAll();
    }
*/
}
