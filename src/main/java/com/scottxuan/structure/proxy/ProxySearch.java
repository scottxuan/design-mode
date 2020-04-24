package com.scottxuan.structure.proxy;

/**
 * @author : zhaoxuan
 * @date : 2020/4/24
 */
public class ProxySearch implements Search {
    private Log log;
    private RealSearch realSearch;
    private Auth auth;

    public ProxySearch() {
        this.log = new Log();
        this.realSearch = new RealSearch();
        this.auth = new Auth();
    }

    @Override
    public void search() {
        auth.auth();
        realSearch.search();
        log.recordLog();
    }
}
