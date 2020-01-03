package com.hyman.proxy.example.example.search;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 14:57
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("用户：" + userId + ", 使用关键字: " + keyword + " 查询信息...");
        return keyword;
    }
}
