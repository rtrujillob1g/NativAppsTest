package com.rijatru.development.nativappstest.presentation.views.adapters;

import com.rijatru.development.nativappstest.presentation.views.interfaces.Item;

import java.util.List;

public interface ListAdapter {

    void setItems(List<Item> listItems);

    void addNewItems(List<Item> items);

    void removeAllItems();

    void removeLastItems(int numberOfItemsToRemove);

    void addNewItemsToBeginning(List<Item> newPhotos);

    int getItemCount();

    boolean hasNoItems();

    void addItemToIndex(int index, Item item);

    void removeItem(Item item);

    List<Item> getItems();
}
