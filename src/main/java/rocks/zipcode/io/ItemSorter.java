package rocks.zipcode.io;

import rocks.zipcode.io.Item;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    Item[] items;

    //Constructor
    public ItemSorter(Item[] items) {

        this.items = items;

    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items,comparator);

        return items;
    }
}
