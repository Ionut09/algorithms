package com.lseg.movie_rental_homework;

public class Video {

    private String title;

    private int averageRating;

    private int ratingsNumber;

    private int stock;

    public Video(String title) {
        this.title = title;
        this.averageRating = 0;
        this.stock = 1;
    }

    public void rent() {
        if (isAvailable()) {
            stock--;
        } else {
            System.out.println("This video is not available now");
        }
    }

    public void returnVideo() {
        stock++;
    }

    public void rate(int rate) {
        averageRating = (averageRating * ratingsNumber + rate) / (ratingsNumber + 1);
        ratingsNumber++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public int getRatingsNumber() {
        return ratingsNumber;
    }

    public void setRatingsNumber(int ratingsNumber) {
        this.ratingsNumber = ratingsNumber;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", averageRating=" + averageRating +
                ", ratingsNumber=" + ratingsNumber +
                ", stock=" + stock +
                '}';
    }
}
