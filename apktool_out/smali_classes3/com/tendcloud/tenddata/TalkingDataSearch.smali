.class public Lcom/tendcloud/tenddata/TalkingDataSearch;
.super Lorg/json/JSONObject;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "category"

.field private static final b:Ljava/lang/String; = "content"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    return-void
.end method

.method public static createSearch()Lcom/tendcloud/tenddata/TalkingDataSearch;
    .locals 1

    new-instance v0, Lcom/tendcloud/tenddata/TalkingDataSearch;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/TalkingDataSearch;-><init>()V

    return-object v0
.end method


# virtual methods
.method public setCategory(Ljava/lang/String;)Lcom/tendcloud/tenddata/TalkingDataSearch;
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "category"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    const-string v0, "set category error "

    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setContent(Ljava/lang/String;)Lcom/tendcloud/tenddata/TalkingDataSearch;
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "content"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    const-string v0, "set content error "

    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
