package com.anant;

import java.util.Scanner;

public class ArtistDetails {
    private final String artistName;
    private final int uniqueId;

    public ArtistDetails(int uniqueId, String artistName) {
        this.uniqueId = uniqueId;
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public static ArtistDetails createNewArtist(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Artist Name: ");
        String artistName = sc.nextLine();
        System.out.print("Enter Artist Id: ");
        int uniqueId = sc.nextInt();
        return new ArtistDetails(uniqueId, artistName);
    }
    public static String showArtistDetails(ArtistDetails artistDetails){
        return ("Artist Name : "+ artistDetails.getArtistName()+ ",   ID : "+ artistDetails.getUniqueId());
    }
}
