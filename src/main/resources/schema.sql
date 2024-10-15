DROP TABLE IF EXISTS blog_post;

CREATE TABLE blog_post (
    id SERIAL PRIMARY KEY,              -- ブログ記事ごとの一意のID（自動インクリメント）
    title VARCHAR(255) NOT NULL,        -- 記事のタイトル
    content TEXT NOT NULL,              -- 記事の本文（大きなテキストデータを扱うためTEXT型）
    author VARCHAR(100) NOT NULL       -- 記事の著者
);
