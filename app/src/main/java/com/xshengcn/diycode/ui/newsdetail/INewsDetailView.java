package com.xshengcn.diycode.ui.newsdetail;

import com.xshengcn.diycode.entity.news.NewsReply;
import java.util.List;

public interface INewsDetailView {

  int getNewsId();

  void showReplies(List<NewsReply> replies);
}
