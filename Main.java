package com.shuanfa.callback;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Filter> filters = new ArrayList<>();
        filters.add(new ApplicationFilter());
        filters.add(new ApplicationFilter());
        filters.add(new ApplicationFilter());
        filters.add(new ApplicationFilter());
        filters.add(new ApplicationFilter());

        FilterChain filterChain = new ApplicationFilterChain(filters);
        filterChain.doFilter();

    }
}
