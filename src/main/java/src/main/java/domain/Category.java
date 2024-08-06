package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Category {



    private int categoryId;

    private String categoryName;

    Scanner sc = new Scanner(System.in);


    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }


    public Category(){

    }

    // Getter and Setter

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    // Métodos propios

        //ArrayList<String> categories = new ArrayList<String>();

        String [] categories = new String[5];


    public void createCategory(){

        System.out.println("Ingrese el ID");
        categoryId = sc.nextInt();
        categories [0] = categoryId + "";
        sc.nextLine();
        System.out.println("Ingrese el nombre de la categoria");
        categoryName = sc.nextLine();
        categories[1]=categoryName + "";

    }

    public void listCategory(){
        System.out.println("Id: " +categoryId + "\n" +
                "Nombre Categoria: " + categoryName);
    }

    public void printCategories(){
        for(int i = 0; i < categories.length; i++)
        {
            System.out.println(categories[i]);
        }
    }




}
