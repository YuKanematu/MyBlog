# MyBlog Application

## 概要
MyBlogは、シンプルな個人用ブログアプリケーションです。ユーザーは、ブログ投稿の作成、編集、削除、投稿一覧表示を行うことができます。

## 機能
- **投稿の作成**  
  新しいブログ投稿を作成できます。
- **投稿の編集**  
  既存の投稿を編集できます。
- **投稿の削除**  
  投稿を削除できます。
- **投稿の一覧表示**  
  全ての投稿を一覧で表示できます。

## 技術スタック
- **言語**: Java
- **フレームワーク**: Spring Boot
- **データベース**: PostgreSQL
- **O/Rマッパー**: MyBatis
- **ビルドツール**: Gradle

## アーキテクチャ
- **フロントエンド**: Thymeleafを使用して、ユーザーインターフェースを構築。
- **バックエンド**: Spring Bootを使用して、MVCパターンに基づいたAPIを構築。
- **データベース**: PostgreSQLに接続し、MyBatisを用いてデータベース操作を行う。

## 依存関係
`build.gradle`にて以下の依存関係を使用しています：
- **Spring Web**: Webアプリケーションの基本機能を提供
- **Thymeleaf**: サーバサイドのテンプレートエンジン
- **MyBatis Framework**: データベースとのやりとりを管理
- **PostgreSQL Driver**: PostgreSQLとの接続ドライバ
- **Lombok**: 簡潔なJavaコードのためのアノテーションライブラリ
- **Spring Boot DevTools**: 開発支援ツール

## データベーステーブル構成

```sql
CREATE TABLE blog_post (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    author VARCHAR(100) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

MyBlog/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── myblog/
│   │   │               ├── MyBlogApplication.java  # アプリケーションのエントリーポイント
│   │   │               ├── controller/
│   │   │               │   └── BlogPostController.java  # コントローラークラス
│   │   │               ├── model/
│   │   │               │   └── BlogPost.java  # エンティティクラス
│   │   │               ├── repository/
│   │   │               │   └── BlogPostMapper.java  # MyBatisマッパーインターフェース
│   │   │               ├── service/
│   │   │                   └── BlogPostService.java  # サービスクラス
│   │   ├── resources/
│   │   │   ├── static/  # 静的ファイル (CSS, JavaScript, 画像など)
│   │   │   ├── templates/  # Thymeleafテンプレート
│   │   │   │   ├── blog/
│   │   │   │   │   ├── form.html  # ブログ投稿フォーム
│   │   │   │   │   ├── list.html  # ブログ一覧ページ
│   │   │   │   │   └── view.html  # ブログ詳細ページ
│   │   │   ├── mappers/
│   │   │   │   └── BlogPostMapper.xml  # MyBatisマッパーXMLファイル
│   │   │   └── application.properties  # アプリケーション設定
│   │   │   └── schema.sql # SQLファイル
├── build.gradle  # Gradleビルドファイル
└── settings.gradle  # プロジェクト設定ファイル
