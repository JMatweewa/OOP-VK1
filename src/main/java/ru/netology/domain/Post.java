package ru.netology.domain;

public class Post {
    private int id; //идентификатор записи
    private int ownerId; //идентификатор владельца стены
    private int fromId; //идентификатор автора записи
    private int createdBy; //идентификатор администратора, который опубликовал запись
    private int data; //время публикации записи
    //private int imageUrl; //ссылка на видео
    private String text; //текст записи
    private int replyOwnerId; //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; //идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; // 1, если запись была создана с опцией "Только для друзей"
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private Copyright copyright;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

    // + get/set на все поля
}

