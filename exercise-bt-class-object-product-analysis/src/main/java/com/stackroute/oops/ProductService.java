package com.stackroute.oops;
import  java.util.*;
/*
    Class for Analyzing the products present in ProductRepository
 */

    public class ProductService{
    /*
        Returns the name of the product given the productCode
     */

    Product[] p1=ProductRepository.getProducts();
    public String findProductNameByCode(int productCode) {
        for(int i=0;i<p1.length;i++){
            if(productCode==p1[i].productCode){
                return p1[i].name;
            }
        }
        return null;
    }



    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category){
        int max=-1;
        Product ans=null;
        for(int i=0;i<p1.length;i++){
            if(category==p1[i].category) {
                if ( p1[i].price>max) {
                    max = (int) p1[i].price;
                    ans = p1[i];
                }
            }
        }

        return ans;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category){
        List<Product> l1=new ArrayList<Product>();
        for(int i=0;i<p1.length;i++){
            if(p1[i].category==category){
                l1.add(p1[i]);
            }
        }
        Product[] ans=new Product[l1.size()];
        ans=l1.toArray(ans);
        if(ans.length==0){
            return null;
        }
        return ans;
    }
}
