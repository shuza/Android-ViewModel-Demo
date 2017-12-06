package me.shuza.viewmodeldemo;

import android.arch.lifecycle.ViewModel;

/**
 * :=  created by:  Shuza
 * :=  create date:  12/6/2017
 * :=  (C) CopyRight Shuza
 * :=  www.shuza.me
 * :=  shuza.sa@gmail.com
 * :=  Fun  :  Coffee  :  Code
 **/
public class DataModel extends ViewModel {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
