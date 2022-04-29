package Models.Response;

public class Author {
        private String username;
        private String image;
        private Boolean following;
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getImage() {
            return image;
        }
        public void setImage(String image) {
            this.image = image;
        }
        public Boolean getFollowing() {
            return following;
        }
        public void setFollowing(Boolean following) {
            this.following = following;
        }
    }
