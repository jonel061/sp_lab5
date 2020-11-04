package com.company;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)  throws Exception{
        // System.out.println("Hi!");
        List<Autor> autori = Arrays.asList(new Autor("Ion Barbu"));
        long startTime = System.currentTimeMillis();
        ImageProxi img1 = new ImageProxi("Pamela Anderson");
        ImageProxi img2 = new ImageProxi("Kim Kardashian");
        ImageProxi img3 = new ImageProxi("Kirby Griffin");
        Section playboysS1= new Section("Front cover");
        playboysS1.add(img1);
        Section playboysS2=new Section("Summer Girls");
        playboysS2.add(img2);
        playboysS2.add(img3);
       Carte playboy = new Carte (autori,"Playboy");
        playboy.add(playboysS1);
        playboy.add(playboysS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboysS1.render();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboysS1.render();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
        Section cap1 = new Section("Cap 1");

        Paragraf paragraf1 = new Paragraf("Paragraph 1", "Text1");
        cap1.add(paragraf1);

        Paragraf paragraf2 = new Paragraf("Paragraph 2", "Text2");
        cap1.add(paragraf2);

        Paragraf paragraf3 = new Paragraf("Paragraph 3", "Text3");
        cap1.add(paragraf3);

        Paragraf paragraf4 = new Paragraf("Paragraph 4", "Text4");
        cap1.add(paragraf4);

        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();

        System.out.println();
        paragraf1.setAlignStrategy(new AlignLeft());
        paragraf2.setAlignStrategy(new AlignCenter());
        paragraf3.setAlignStrategy(new AlignRight());
        paragraf4.setAlignStrategy(new AlignRight());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}

      /* Section section = new Section();
        List<Autor> autori = Arrays.asList(new Autor("Ion Barbu"));

        Carte c = new Carte(autori, "CarteX");
        c.add(new Paragraf());
        Section s1 = new Section();
        s1.add(new Imagine());
        c.add(s1);
        // c.createCapitol("Introducere", Arrays.asList(new Paragraf(), new Imagine(), new Tabel(), new Tabel()));

        c.rander();
*/


