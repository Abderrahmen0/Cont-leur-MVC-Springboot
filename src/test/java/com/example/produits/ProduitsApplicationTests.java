package com.example.produits;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitsApplicationTests {
    @Autowired
    private ProduitRepository produitRepository;


    @Test
    public void testCreateProduit() {
        Produit prod=new Produit("Souris", 500.2,new Date());
        produitRepository.save(prod);
    }
    @Test
    public void testFindProduit(){
        Produit p= produitRepository.findById(1L).get();
        System.out.println(p);
    }
    @Test
    public  void testUpdateProduit(){
        Produit p= produitRepository.findById(1L).get();
        p.setPrixProduit(9999.0);
        System.out.println(p);
    }
    @Test
    public void testDeleteProduit(){
        produitRepository.deleteById(1L);

    } @Test
    public void testFindAllProduits(){
        List<Produit> prod=produitRepository.findAll();
        for (Produit p:prod)
            System.out.println(p);

    }


}
