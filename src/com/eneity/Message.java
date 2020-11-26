package com.eneity;

/**
 * 作者：凌宇
 * 日期：2020/11/26 15:46
 * 描述：
 */
public class Message {
    private Integer id; //邮件ID
    private Integer fromUid; //发送方ID
    private Integer toUid ; //接收方ID
    private String mTitle; //标题
    private String mContent; //内容
    private Integer isReadFlag; //是否已读
    private String createTime;//创建时间

    public Message() {
    }

    public Message(Integer id, Integer fromUid, Integer toUid, String mTitle, String mContent, Integer isReadFlag, String createTime) {
        this.id = id;
        this.fromUid = fromUid;
        this.toUid = toUid;
        this.mTitle = mTitle;
        this.mContent = mContent;
        this.isReadFlag = isReadFlag;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public Integer getToUid() {
        return toUid;
    }

    public void setToUid(Integer toUid) {
        this.toUid = toUid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public Integer getIsReadFlag() {
        return isReadFlag;
    }

    public void setIsReadFlag(Integer isReadFlag) {
        this.isReadFlag = isReadFlag;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "id=" + id +
                ", fromUid=" + fromUid +
                ", toUid=" + toUid +
                ", mTitle='" + mTitle + '\'' +
                ", mContent='" + mContent + '\'' +
                ", isReadFlag=" + isReadFlag +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
