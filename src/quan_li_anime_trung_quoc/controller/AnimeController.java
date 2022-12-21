package quan_li_anime_trung_quoc.controller;

import quan_li_anime_trung_quoc.model.Anime;
import quan_li_anime_trung_quoc.service.AnimeService;

import java.util.Scanner;

public class AnimeController {
    private static AnimeService animeService = new AnimeService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu-------\n"
                            + "1. Add anime\n"
        + "2. Display anime\n");
        System.out.println("Mời bạn nhập menu: ");
        do {
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên anime: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập só tập: ");
                    int episodes = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập năm sản xuất: ");
                    int year = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập thể loại: ");
                    String category = sc.nextLine();
                    animeService.add(new Anime(id,name,episodes,year,category));
                    break;
                case 2:
                    animeService.displayAnime();
                    break;
                case 3:
                    break;
            }
        }while (true);
    }
}
