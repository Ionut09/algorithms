package com.lseg.movie_rental_homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VideoStore {

    private List<Video> inventory; //instante de Video

    public VideoStore(List<Video> list) {
        inventory = list;//polimorfism
    }

    public void addVideo(String title) {
        Video video = new Video(title);
        boolean videoIsAvailable = false;

        for (Video tempVideo : inventory) {
            if (tempVideo.getTitle().equals(title)) {
                int oldStock = tempVideo.getStock();
                tempVideo.setStock(oldStock + 1);
                videoIsAvailable = true;
            }
        }
        if(!videoIsAvailable) {
            inventory.add(video);
        }
    }

    public void checkOut(String title) {
        boolean videoIsAvailable = false;
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.rent();
                videoIsAvailable = true;
                break;
            }
        }

        if (videoIsAvailable) {
            System.out.println("Video " + title + " rented successfully");
        } else {
            System.out.println("We don't have this video");
        }
    }

    public void returnVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.returnVideo();
            }
        }
    }

    public void receiveRating(String title, int rating) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.rate(rating);
                break;
            }
        }
    }

    public void listInventory() {
        for (Video video : inventory) {
//            System.out.println(video);
            //echivalent cu
            System.out.println(video.toString());
        }
    }
}
