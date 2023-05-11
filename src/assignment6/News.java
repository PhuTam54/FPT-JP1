package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    ArrayList<Float> rateList;
    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("Tilte:" + this.getTitle() + " Publish date: " + this.getPublishDate());
        System.out.println("Author:" + this.getAuthor() + " Content: " + this.getContent());
        System.out.println("Average rate:" + this.getAverageRate());
    }

    public ArrayList<Float> getRateList() {
        return rateList;
    }

    public void setRateList() {
        rateList = new ArrayList<Float>();
    }

    public void calculate(ArrayList<Float> rateList) {
        float averageRateNew = 0;
        int listSize = rateList.size();
        if (listSize == 0) {
            return;
        }
        for (int i = 0; i < listSize; i ++) {
            averageRateNew += rateList.get(i);
        }
        this.averageRate = averageRateNew / rateList.size();
    }

    public void inputRate(float rate) {
        if (rate >= 1 && rate <= 5) {
            this.rateList.add(rate);
            calculate(this.getRateList());
        }
    }
}
