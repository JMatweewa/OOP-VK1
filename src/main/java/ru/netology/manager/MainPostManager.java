package ru.netology.manager;

import ru.netology.domain.Post;


public class MainPostManager {
    private PostManager postManager;

    public String generatePage() {
        Post[] posts = postManager.getPostForFeed();
            return null;
        }
    }
