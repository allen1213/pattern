package com.example.fly.weight;

public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        Website google = factory.getWebSite("google");
        google.use();

        Website youtube = factory.getWebSite("youtube");
        youtube.use();

        Website youtube1 = factory.getWebSite("youtube");
        youtube1.use();

        int webSiteCount = factory.getWebSiteCount();
        System.out.println(webSiteCount);


    }
}
