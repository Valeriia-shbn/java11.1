package org.example;

public class MovieManager {

    private MovieItem[] items = new MovieItem[0];

    private int returnAmount = 5;

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
        int amount = 0;

        MovieItem[] last = findAll();

        if (this.returnAmount > last.length) {
            amount = last.length;
        } else {
            amount = this.returnAmount;
        }

        MovieItem[] result = new MovieItem[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = last[last.length - 1 - i];
        }
        return result;
    }

    public MovieItem[] findAll() {
        return items;
    }


}
