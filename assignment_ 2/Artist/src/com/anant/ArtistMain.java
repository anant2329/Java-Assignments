package com.anant;


public class ArtistMain {
    static void showArrayObject (ArtistDetails [] artistDetails){
        for (ArtistDetails details : artistDetails){
            ArtistDetails.showArtistDetails(details);
        }
    }
    static void findDuplicateArtist (ArtistDetails [] artistDetails) {

        for (int i = 0; i < artistDetails.length; i++) {
            for (int j = i + 1; j < artistDetails.length; j++) {
                if (artistDetails[i].getUniqueId() == artistDetails[j].getUniqueId()&&
                    artistDetails[i].getArtistName().equals(artistDetails[j].getArtistName())) {
                    System.out.println("Duplicate Artist Found : " + artistDetails[i].getArtistName());
                }
            }
        }
    }
    public static void main(String[] args) {
        ArtistDetails [] artistDetails = new ArtistDetails[5];
        for (int i =0; i<artistDetails.length; i++){
            System.out.println("Enter Details of Artist "+(i+1));
            artistDetails[i] = ArtistDetails.createNewArtist();
        }
        showArrayObject(artistDetails);
        findDuplicateArtist(artistDetails);
    }
}