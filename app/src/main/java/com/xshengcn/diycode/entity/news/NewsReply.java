package com.xshengcn.diycode.entity.news;

import com.google.gson.annotations.SerializedName;
import com.xshengcn.diycode.entity.common.Abilities;
import com.xshengcn.diycode.entity.common.User;
import java.util.Date;

public class NewsReply {

  @SerializedName("id") public int id;
  @SerializedName("body_html") public String bodyHtml;
  @SerializedName("created_at") public Date createdAt;
  @SerializedName("updated_at") public Date updatedAt;
  @SerializedName("deleted") public boolean deleted;
  @SerializedName("news_id") public int newsId;
  @SerializedName("user") public User user;
  @SerializedName("likes_count") public int likesCount;
  @SerializedName("abilities") public Abilities abilities;
}
