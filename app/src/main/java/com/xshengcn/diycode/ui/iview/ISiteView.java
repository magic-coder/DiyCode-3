package com.xshengcn.diycode.ui.iview;

import com.xshengcn.diycode.data.model.site.SiteListItem;

import java.util.List;

public interface ISiteView {

    void showSites(List<SiteListItem> siteListItems);

    void showLoading();

    void showLoadSiteError();
}
