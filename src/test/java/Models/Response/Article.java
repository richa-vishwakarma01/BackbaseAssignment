package Models.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    public class Article {
        private String slug;
        private String title;
        private String description;
        private String body;
        private String createdAt;
        private String updatedAt;
        private List<String> tagList = new ArrayList<String>();
        private Boolean favorited;
        private Integer favoritesCount;
        private Author author;
        public String getSlug() {
            return slug;
        }
        public void setSlug(String slug) {
            this.slug = slug;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public String getBody() {
            return body;
        }
        public void setBody(String body) {
            this.body = body;
        }
        public String getCreatedAt() {
            return createdAt;
        }
        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }
        public String getUpdatedAt() {
            return updatedAt;
        }
        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }
        public List<String> getTagList() {
            return tagList;
        }
        public void setTagList(List<String> tagList) {
            this.tagList = tagList;
        }
        public Boolean getFavorited() {
            return favorited;
        }
        public void setFavorited(Boolean favorited) {
            this.favorited = favorited;
        }
        public Integer getFavoritesCount() {
            return favoritesCount;
        }
        public void setFavoritesCount(Integer favoritesCount) {
            this.favoritesCount = favoritesCount;
        }
        public Author getAuthor() {
            return author;
        }
        public void setAuthor(Author author) {
            this.author = author;
        }
    }

