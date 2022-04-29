# Web Specs

You can access the BBlog web page using the following URL: [https://qa-task.backbasecloud.com](https://qa-task.backbasecloud.com)

To authenticate into the page you can use the following credentials:
* Username: `candidatex`
* Password: `qa-is-cool`

## URLs and Functionalities

- Home page (URL: `/#/` )
  - List of tags
  - List of articles pulled from either Feed, Global, or by Tag
  - Pagination for list of articles
- Sign in/Sign up pages (URL: `/#/login, /#/register` )
  - Uses JWT (store the token in localStorage)
  - Authentication can be easily switched to session/cookie based
- Settings page (URL: `/#/settings` )
- Editor page to create/edit articles (URL: `/#/editor`, `/#/editor/article-slug-here` )
- Article page (URL: `/#/article/article-slug-here` )
  - Delete article button (_only shown to article's author_)
  - Render markdown from server client side
  - Comments section at bottom of page
  - Delete comment button (_only shown to comment author_)
- Profile page (URL: `/#/profile/:username`, `/#/profile/:username/favorites` )
  - Show basic user info
  - List of articles populated from author's created articles or author's favorite articles