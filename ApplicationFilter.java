package com.shuanfa.callback;

public class ApplicationFilter implements Filter{
    @Override
    public void doFilter(FilterChain filterChain,int name) {
        System.out.println(String.format("进入：这里是第{%d}Filter的实现", name));
        filterChain.doFilter();
        System.out.println(String.format("退出：第{%d}Filter实现退出", name));
    }
}
