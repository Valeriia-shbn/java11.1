package org.example;

public class MovieManager {

    private MovieItem[] items = new MovieItem[0];

    private int returnAmount;

    public MovieManager() {
    }

    public MovieManager(int returnAmount) {
        this.returnAmount = returnAmount;
    }

    public void add(MovieItem item) {
        MovieItem[] tmp = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

    public void removeById(int id) {
        MovieItem[] tmp = new MovieItem[items.length - 1];
        int copyToIndex = 0;
        for (MovieItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }


    public MovieItem[] findLast() {
        if (this.returnAmount == 0) {
            this.returnAmount = 5;
        }

        MovieItem[] last = findAll();

        if (this.returnAmount > last.length) {
            this.returnAmount = last.length;
        }

        MovieItem[] result = new MovieItem[this.returnAmount];
        for (int i = 0; i < this.returnAmount; i++) {
            result[i] = last[last.length - 1 - i];
        }
        return result;
    }

    public MovieItem[] findAll() {
        return items;
    }


}
