# 挨拶出力アプリ

## 本アプリでの対応範囲
- 要件定義
- 設計書作成
- モック作成
- DB構築
- バックエンド実装
- フロントエンド実装
- **`コンテナ構築`**
- 単体テスト
- 結合テスト
- クラウドサービスにデプロイ
- ユーザーテスト
- 本番環境へデプロイ

## 概要
フォームに名前を入力することで、名前に対し挨拶を主力するシンプルなアプリです。

Dockerでアプリごとコンテナ化しており、

**docker compose up -d**

とコマンド入力をしChromeにて下記のURLを表示すればすぐにアプリの起動ができます。

**http://localhost:8080**

## 今後の課題
### コンテナでの対応範囲の拡張
- 今回実装したのはSpring Boot単体で完結するアプリのコンテナ化だったので、DBなどとの接続があるものや他のコンテナと接続できるようにするといった応用が考えられます。

### デプロイ作業への実施
- AWSなどのクラウド技術を学習し、コンテナ化したアプリをデプロイさせることを検討しています。