.class public Lcom/umeng/cconfig/UMRemoteConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/cconfig/UMRemoteConfig$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static b:Z

.field private static c:Landroid/content/Context;

.field private static d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/umeng/cconfig/b/c;",
            ">;"
        }
    .end annotation
.end field

.field private static e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/umeng/cconfig/b/c;",
            ">;"
        }
    .end annotation
.end field

.field private static f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private g:I

.field private h:Lcom/umeng/cconfig/RemoteConfigSettings;

.field private i:Lcom/umeng/cconfig/listener/OnConfigStatusChangedListener;

.field private final j:Ljava/util/concurrent/locks/ReadWriteLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^[a-zA-Z_][a-zA-Z0-9_]{1,255}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->a:Ljava/util/regex/Pattern;

    const/4 v0, 0x0

    sput-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->f:Ljava/util/Map;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/umeng/cconfig/UMRemoteConfig;->b:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>(Z)V

    iput-object v0, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lcom/umeng/cconfig/UMRemoteConfig;-><init>()V

    return-void
.end method

.method static synthetic a()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    return-object v0
.end method

.method private a(Landroid/content/Context;I)V
    .locals 9

    const-string v0, "[xmlLoad] xml load fail"

    const-string v1, "jessie"

    if-eqz p1, :cond_7

    if-lez p2, :cond_7

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    iget-object v4, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v4}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result p2

    const/4 v4, 0x0

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    :goto_0
    if-eq p2, v3, :cond_6

    const/4 v8, 0x2

    if-ne p2, v8, :cond_0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_0
    const/4 v8, 0x3

    if-ne p2, v8, :cond_3

    const-string p2, "entry"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz v6, :cond_2

    if-eqz v7, :cond_2

    sget-object p2, Lcom/umeng/cconfig/UMRemoteConfig;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lcom/umeng/cconfig/UMRemoteConfig;->f:Ljava/util/Map;

    invoke-interface {p2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/umeng/cconfig/b/c;

    invoke-direct {p2}, Lcom/umeng/cconfig/b/c;-><init>()V

    iput-object v6, p2, Lcom/umeng/cconfig/b/c;->a:Ljava/lang/String;

    iput-object v7, p2, Lcom/umeng/cconfig/b/c;->b:Ljava/lang/String;

    sget-object v5, Lcom/umeng/cconfig/UMRemoteConfig;->e:Ljava/util/Map;

    invoke-interface {v5, v6, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v6, v4

    move-object v7, v6

    :cond_1
    sget-object p2, Lcom/umeng/cconfig/UMRemoteConfig;->f:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p2

    const/16 v5, 0x3e8

    if-gt p2, v5, :cond_6

    :cond_2
    move-object v5, v4

    goto :goto_1

    :cond_3
    const/4 v8, 0x4

    if-ne p2, v8, :cond_5

    const-string p2, "key"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_4
    const-string p2, "value"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v7

    :cond_5
    :goto_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_6
    :try_start_1
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :try_start_2
    new-array p1, v3, [Ljava/lang/Object;

    aput-object v0, p1, v2

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    return-void

    :catch_1
    :try_start_4
    new-array p1, v3, [Ljava/lang/Object;

    aput-object v0, p1, v2

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_2
    iget-object p2, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    new-array p1, v3, [Ljava/lang/Object;

    aput-object v0, p1, v2

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    return-void
.end method

.method private a(Lcom/umeng/cconfig/b/d;)V
    .locals 14

    const-string v0, "g"

    const-string v1, "e"

    const-string v2, "v"

    const-string v3, "[active] new config active false"

    const-string v4, "k"

    const-string v5, "jessie"

    if-eqz p1, :cond_6

    iget-object p1, p1, Lcom/umeng/cconfig/b/d;->b:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x1

    :try_start_0
    iget-object v8, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v8}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/concurrent/locks/Lock;->lock()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result p1

    move v9, v6

    :goto_0
    if-ge v9, p1, :cond_5

    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v10, ""

    new-instance v12, Lcom/umeng/cconfig/b/c;

    invoke-direct {v12}, Lcom/umeng/cconfig/b/c;-><init>()V

    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v12, Lcom/umeng/cconfig/b/c;->a:Ljava/lang/String;

    :cond_0
    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iput-object v13, v12, Lcom/umeng/cconfig/b/c;->b:Ljava/lang/String;

    :cond_1
    invoke-virtual {v11, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-virtual {v11, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iput-object v13, v12, Lcom/umeng/cconfig/b/c;->c:Ljava/lang/String;

    :cond_2
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iput-object v13, v12, Lcom/umeng/cconfig/b/c;->d:Ljava/lang/String;

    :cond_3
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_4

    sget-object v10, Lcom/umeng/cconfig/UMRemoteConfig;->e:Ljava/util/Map;

    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    :try_start_2
    new-array v10, v7, [Ljava/lang/Object;

    aput-object v3, v10, v6

    invoke-static {v5, v10}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_5
    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->d:Ljava/util/Map;

    sget-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->e:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->e:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    new-array p1, v7, [Ljava/lang/Object;

    const-string v0, "[active] new config active success i"

    aput-object v0, p1, v6

    invoke-static {v5, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_1
    :goto_2
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_2
    :try_start_3
    new-array p1, v7, [Ljava/lang/Object;

    aput-object v3, p1, v6

    invoke-static {v5, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :goto_3
    iget-object v0, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_6
    :try_start_4
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->d:Ljava/util/Map;

    sget-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->e:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->e:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    const-string p1, "[active] new config active success ii"

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    iget-object v0, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public static getInstance()Lcom/umeng/cconfig/UMRemoteConfig;
    .locals 1

    invoke-static {}, Lcom/umeng/cconfig/UMRemoteConfig$a;->a()Lcom/umeng/cconfig/UMRemoteConfig;

    move-result-object v0

    return-object v0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.0.0"

    return-object v0
.end method


# virtual methods
.method public activeFetchConfig()V
    .locals 4

    sget-boolean v0, Lcom/umeng/cconfig/UMRemoteConfig;->b:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "ucc"

    if-nez v0, :cond_0

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "remote config disable"

    aput-object v2, v0, v1

    invoke-static {v3, v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    if-nez v0, :cond_1

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "UMRemoteConfig did not init"

    aput-object v2, v0, v1

    invoke-static {v3, v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {v0}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "can not be called in child process"

    aput-object v2, v0, v1

    invoke-static {v3, v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    new-instance v0, Lcom/umeng/cconfig/d/a;

    sget-object v1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/umeng/cconfig/d/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/umeng/cconfig/d/a;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public getConfigValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    sget-boolean v0, Lcom/umeng/cconfig/UMRemoteConfig;->b:Z

    const-string v1, "ucc"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_0

    new-array p1, v4, [Ljava/lang/Object;

    const-string v0, "remote config disable"

    aput-object v0, p1, v3

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_0
    sget-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    if-nez v0, :cond_1

    new-array p1, v4, [Ljava/lang/Object;

    const-string v0, "UMRemoteConfig did not init"

    aput-object v0, p1, v3

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_1
    invoke-static {v0}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    new-array p1, v4, [Ljava/lang/Object;

    const-string v0, "can not be called in child process"

    aput-object v0, p1, v3

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    sget-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/umeng/cconfig/b/c;

    if-eqz p1, :cond_3

    iget-object v2, p1, Lcom/umeng/cconfig/b/c;->b:Ljava/lang/String;

    iget-object v0, p1, Lcom/umeng/cconfig/b/c;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/umeng/cconfig/b/e;->a(Lcom/umeng/cconfig/b/c;Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object p1

    const-string v0, "jessie"

    new-array v1, v4, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[ablog] ablog params : "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-static {v0, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/umeng/cconfig/c/b;

    const-string v1, "https://pslog.umeng.com/ablog"

    invoke-direct {v0, v1, p1}, Lcom/umeng/cconfig/c/b;-><init>(Ljava/lang/String;Lorg/json/JSONArray;)V

    invoke-static {v0}, Lcom/umeng/cconfig/c/c;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :catch_0
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v2
.end method

.method public handlerMessage(ILjava/lang/Object;Ljava/lang/String;)V
    .locals 9

    const-string v0, "jessie"

    const-string v1, "ts"

    const-string v2, "cc"

    const-string v3, "ucc"

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne p1, v5, :cond_8

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    :try_start_0
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const-string p3, ""

    if-eqz p2, :cond_0

    :try_start_1
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p3

    :goto_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/cconfig/a/b;->a(Landroid/content/Context;)Lcom/umeng/cconfig/a/b;

    move-result-object p1

    const-string v1, "0"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    invoke-virtual {p1}, Lcom/umeng/cconfig/a/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v6, "__ts"

    invoke-virtual {v2, v6, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "__c"

    invoke-virtual {v2, v6, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "__a"

    invoke-virtual {v2, v6, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-array v6, v5, [Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[DbManager] insert timeStamp: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " content: "

    invoke-virtual {v7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " active: "

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v6, v4

    invoke-static {v0, v6}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p1, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string p3, "__cc"

    instance-of v1, p2, Landroid/database/sqlite/SQLiteDatabase;

    const/4 v6, 0x0

    if-nez v1, :cond_2

    invoke-virtual {p2, p3, v6, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_1

    :cond_2
    invoke-static {p2, p3, v6, v2}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->insert(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    :goto_1
    iget-object p2, p1, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object p2, p1, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    :cond_3
    :goto_2
    :try_start_4
    invoke-virtual {p1}, Lcom/umeng/cconfig/a/b;->b()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_3

    :catchall_1
    :try_start_5
    iget-object p2, p1, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :catch_0
    :try_start_6
    new-array p2, v5, [Ljava/lang/Object;

    const-string p3, "[DbManager] insert failed"

    aput-object p3, p2, v4

    invoke-static {v0, p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    iget-object p2, p1, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_2

    :goto_3
    :try_start_8
    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/cconfig/a/b;->a(Landroid/content/Context;)Lcom/umeng/cconfig/a/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/cconfig/a/b;->d()Z

    new-array p1, v5, [Ljava/lang/Object;

    const-string p2, "get new config success"

    aput-object p2, p1, v4

    invoke-static {v3, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->h:Lcom/umeng/cconfig/RemoteConfigSettings;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/umeng/cconfig/RemoteConfigSettings;->isAutoUpdateModeEnabled()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->i:Lcom/umeng/cconfig/listener/OnConfigStatusChangedListener;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lcom/umeng/cconfig/listener/OnConfigStatusChangedListener;->onFetchComplete()V

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lcom/umeng/cconfig/UMRemoteConfig;->activeFetchConfig()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_4

    :catchall_2
    move-exception p2

    :try_start_9
    iget-object p3, p1, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_3
    :cond_5
    :try_start_a
    invoke-virtual {p1}, Lcom/umeng/cconfig/a/b;->b()V

    throw p2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catch_1
    :cond_6
    :goto_4
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_4
    move-exception p1

    iget-object p2, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_7
    return-void

    :cond_8
    const/4 v0, 0x2

    if-ne p1, v0, :cond_9

    :try_start_b
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/cconfig/a/c;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "abtest_sp_last_request_data"

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p1

    iget-object p2, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_9
    const/4 p3, 0x3

    if-ne p1, p3, :cond_a

    :try_start_c
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    iget p2, p0, Lcom/umeng/cconfig/UMRemoteConfig;->g:I

    invoke-direct {p0, p1, p2}, Lcom/umeng/cconfig/UMRemoteConfig;->a(Landroid/content/Context;I)V

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/cconfig/a/b;->a(Landroid/content/Context;)Lcom/umeng/cconfig/a/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/cconfig/a/b;->c()Lcom/umeng/cconfig/b/d;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/umeng/cconfig/UMRemoteConfig;->a(Lcom/umeng/cconfig/b/d;)V

    new-array p1, v5, [Ljava/lang/Object;

    const-string p2, "active new config success"

    aput-object p2, p1, v4

    invoke-static {v3, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->h:Lcom/umeng/cconfig/RemoteConfigSettings;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->i:Lcom/umeng/cconfig/listener/OnConfigStatusChangedListener;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lcom/umeng/cconfig/listener/OnConfigStatusChangedListener;->onActiveComplete()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto/16 :goto_4

    :catchall_6
    move-exception p1

    iget-object p2, p0, Lcom/umeng/cconfig/UMRemoteConfig;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_a
    return-void
.end method

.method public init(Landroid/content/Context;)V
    .locals 4

    :try_start_0
    sget-boolean v0, Lcom/umeng/cconfig/UMRemoteConfig;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "ucc"

    if-nez v0, :cond_0

    :try_start_1
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "remote config disable"

    aput-object v0, p1, v1

    invoke-static {v3, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    sget-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    :cond_2
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_3

    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "can not be called in child process"

    aput-object v0, p1, v1

    invoke-static {v3, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->h:Lcom/umeng/cconfig/RemoteConfigSettings;

    if-nez p1, :cond_4

    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "please set RemoteConfigSettings using UMRemoteConfig.getInstance().setConfigSettings"

    aput-object v0, p1, v1

    invoke-static {v3, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    iget v0, p0, Lcom/umeng/cconfig/UMRemoteConfig;->g:I

    invoke-direct {p0, p1, v0}, Lcom/umeng/cconfig/UMRemoteConfig;->a(Landroid/content/Context;I)V

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/cconfig/a/b;->a(Landroid/content/Context;)Lcom/umeng/cconfig/a/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/cconfig/a/b;->c()Lcom/umeng/cconfig/b/d;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/umeng/cconfig/UMRemoteConfig;->a(Lcom/umeng/cconfig/b/d;)V

    sget-object p1, Lcom/umeng/cconfig/UMRemoteConfig;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    move-result-object p1

    new-instance v0, Lcom/umeng/cconfig/UMRemoteConfig$1;

    invoke-direct {v0, p0}, Lcom/umeng/cconfig/UMRemoteConfig$1;-><init>(Lcom/umeng/cconfig/UMRemoteConfig;)V

    invoke-virtual {p1, v3, v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method public declared-synchronized setConfigSettings(Lcom/umeng/cconfig/RemoteConfigSettings;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lcom/umeng/cconfig/UMRemoteConfig;->b:Z

    if-nez v0, :cond_0

    const-string p1, "ucc"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "remote config disable"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    :try_start_1
    iput-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->h:Lcom/umeng/cconfig/RemoteConfigSettings;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setDefaults(I)V
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lcom/umeng/cconfig/UMRemoteConfig;->b:Z

    if-nez v0, :cond_0

    const-string p1, "ucc"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "remote config disable"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->g:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setOnNewConfigfecthed(Lcom/umeng/cconfig/listener/OnConfigStatusChangedListener;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lcom/umeng/cconfig/UMRemoteConfig;->b:Z

    if-nez v0, :cond_0

    const-string p1, "ucc"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "remote config disable"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    :try_start_1
    iput-object p1, p0, Lcom/umeng/cconfig/UMRemoteConfig;->i:Lcom/umeng/cconfig/listener/OnConfigStatusChangedListener;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
