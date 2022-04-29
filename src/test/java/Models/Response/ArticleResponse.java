package Models.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    public class ArticleResponse {
        private List<Article> articles = new ArrayList<Article>();
        private Integer articlesCount;
        public List<Article> getArticles() {
            return articles;
        }
        public void setArticles(List<Article> articles) {
            this.articles = articles;
        }
        public Integer getArticlesCount() {
            return articlesCount;
        }
        public void setArticlesCount(Integer articlesCount) {
            this.articlesCount = articlesCount;
        }
    }

