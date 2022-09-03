package com.shuanfa.callback;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFilterChain implements FilterChain{
    private List<Filter> filters = null;
    private int i = -1;
    private int m = 0;

    public ApplicationFilterChain(List<Filter> filters){
        this.filters = filters;
        this.m = filters.size();
    }

    @Override
    public void doFilter() {
        i++;
        doByFilters();
    }

    public void doByFilters(){
        if(i == m) System.out.println("交给Servlet");
        while(i<m){
            System.out.println(String.format("现在要执行第{%d}个filter", i));
            Filter filter = filters.get(i);
            filter.doFilter(this,i);
        }
    }
}
