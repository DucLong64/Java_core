package OOP.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangeNews {
    private static List<News> newsList= new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the News Management System");
        System.out.println("Please choose an operation: ");
        System.out.println("1. Insert News");
        System.out.println("2. View List of News");
        System.out.println("3. Calculate Average Rate of News");
        System.out.println("4. Exit");
        while(true){
            int choice = scanner.nextInt();
            choose(choice);
       }

        
        // You can add more operations here if needed1
    }
    public static void choose(int x){
        switch(x){
            case 1: insertNews();
                break;
            case 2: viewListNews();
                System.out.println("List of news displayed successfully.");
                break;
        
            case 3: calculateAverageRate(); viewListNews();
                System.out.println("Average rate calculated and list displayed successfully.");
                break;
            case 4: System.out.println("Exiting the program.");
                System.exit(0);
                

        }
    }
    public static void insertNews(){
        String title, publishDate, author, content;
        int[] rates = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter news title: ");
        title = scanner.nextLine();
        System.out.println("Enter news publish date: ");
        publishDate = scanner.nextLine();
        System.out.println("Enter news author: ");
        author = scanner.nextLine();
        System.out.println("Enter news content: ");
        content = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter rate " + (i + 1) + ": ");
            rates[i] = scanner.nextInt();
        }
        News news = new News(title, publishDate, author, content, rates);
        news.Calculate();
        System.out.println("News inserted successfully " + news.toString());
        newsList.add(news);
    }
    public static void viewListNews(){
        for (News news : newsList) {
            news.displayNews();
        }
    }
    public static void calculateAverageRate(){

    }
}


