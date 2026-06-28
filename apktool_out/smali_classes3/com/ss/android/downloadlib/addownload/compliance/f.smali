.class public Lcom/ss/android/downloadlib/addownload/compliance/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/addownload/compliance/f$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/f;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/f$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/compliance/f;-><init>()V

    return-void
.end method

.method public static a()Lcom/ss/android/downloadlib/addownload/compliance/f;
    .locals 1

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/f$a;->a()Lcom/ss/android/downloadlib/addownload/compliance/f;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/compliance/f;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/compliance/f;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/compliance/h;)V
    .locals 2
    .param p1    # Lcom/ss/android/downloadlib/addownload/b/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 32
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p2

    const-string v0, "response content is null"

    invoke-virtual {p2, v0}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    const/16 p2, 0x194

    .line 34
    invoke-virtual {p0, p2, p1}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(ILcom/ss/android/downloadlib/addownload/b/e;)V

    .line 35
    invoke-interface {p3}, Lcom/ss/android/downloadlib/addownload/compliance/h;->a()V

    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/f;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 37
    invoke-static {p2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->g(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/compliance/e;

    move-result-object p2

    .line 38
    invoke-virtual {p2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a()I

    move-result v0

    if-eqz v0, :cond_1

    const/16 p2, 0x193

    .line 39
    invoke-virtual {p0, p2, p1}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(ILcom/ss/android/downloadlib/addownload/b/e;)V

    .line 40
    invoke-interface {p3}, Lcom/ss/android/downloadlib/addownload/compliance/h;->a()V

    return-void

    .line 41
    :cond_1
    invoke-virtual {p2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p2, 0x195

    .line 42
    invoke-virtual {p0, p2, p1}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(ILcom/ss/android/downloadlib/addownload/b/e;)V

    .line 43
    invoke-interface {p3}, Lcom/ss/android/downloadlib/addownload/compliance/h;->a()V

    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/ss/android/downloadlib/addownload/compliance/h;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 45
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p2

    const-string p3, "DownloadMiuiMarketHelper parseResponse"

    invoke-virtual {p2, p1, p3}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private a(Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/h;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/f;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    .line 11
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/f;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 12
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/addownload/compliance/f;->b(Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/h;)V

    goto :goto_0

    :cond_0
    const-string p2, "\u5f53\u524d\u7f51\u7edc\u4e0d\u4f73\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 13
    invoke-direct {p0, p2}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Ljava/lang/String;)V

    .line 14
    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/compliance/f;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const/16 p2, 0x192

    .line 15
    invoke-virtual {p0, p2, p1}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(ILcom/ss/android/downloadlib/addownload/b/e;)V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/compliance/h;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;Lcom/ss/android/downloadlib/addownload/compliance/h;)V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/h;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/addownload/compliance/f;->b(Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/h;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .line 16
    invoke-static {}, Lcom/ss/android/downloadlib/g;->a()Lcom/ss/android/downloadlib/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/g;->b()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/f$3;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/downloadlib/addownload/compliance/f$3;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/f;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private a(Lcom/ss/android/downloadlib/addownload/b/e;ZI)[B
    .locals 3

    .line 17
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "download_url"

    .line 18
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/b/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "package_name"

    .line 19
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/b/e;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "call_scene"

    const/16 v2, 0x32

    .line 20
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string p1, "sender_package_name"

    .line 21
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "sender_version"

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->k()Lcom/ss/android/download/api/model/a;

    move-result-object p2

    iget-object p2, p2, Lcom/ss/android/download/api/model/a;->e:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-lez p3, :cond_3

    const-string p1, "store"

    .line 23
    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    const-string p2, "id"

    .line 24
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/b/e;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/b/e;->u()Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object p2

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 26
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/b/e;->u()Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object p2

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ss/android/download/api/model/DeepLink;->getWebUrl()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 27
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p2

    const-string p3, "web_url is null"

    invoke-virtual {p2, p3}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    :cond_1
    const-string p2, "web_url"

    .line 28
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/b/e;->u()Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object p1

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/download/api/model/DeepLink;->getWebUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 29
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    const-string p2, "deeplink is null"

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 30
    :catch_0
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    const-string p2, "param build error"

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    .line 31
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    return-object p1
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;ZI)[B
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Lcom/ss/android/downloadlib/addownload/b/e;ZI)[B

    move-result-object p0

    return-object p0
.end method

.method private b()Ljava/lang/String;
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/f;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_0

    const-string v1, "https://apps.bytesfield.com"

    goto :goto_0

    :cond_0
    const-string v1, "https://apps.bytesfield-b.com"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/customer/api/app/deep_link"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/h;)V
    .locals 12
    .param p1    # Lcom/ss/android/downloadlib/addownload/b/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->e()Lcom/ss/android/download/api/config/h;

    move-result-object v0

    const-string v3, "application/json; charset=utf-8"

    const/4 v4, 0x0

    new-instance v11, Lcom/ss/android/downloadlib/addownload/compliance/f$2;

    move-object v5, v11

    move-object v6, p0

    move-object v7, p1

    move-object/from16 v8, p4

    move-object v9, p2

    move-object v10, p3

    invoke-direct/range {v5 .. v10}, Lcom/ss/android/downloadlib/addownload/compliance/f$2;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;Lcom/ss/android/downloadlib/addownload/compliance/h;Ljava/lang/String;[B)V

    move-object v1, p2

    move-object v2, p3

    invoke-interface/range {v0 .. v5}, Lcom/ss/android/download/api/config/h;->a(Ljava/lang/String;[BLjava/lang/String;ILcom/ss/android/download/api/config/r;)V

    return-void
.end method

.method static synthetic b(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/h;)V

    return-void
.end method


# virtual methods
.method public a(ILcom/ss/android/downloadlib/addownload/b/e;)V
    .locals 2

    .line 46
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "download_miui_market_fail_code"

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 49
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    const-string v1, "get_miui_market_compliance_error"

    invoke-virtual {p1, v1, v0, p2}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    return-void
.end method

.method public a(ILcom/ss/android/downloadlib/addownload/b/e;Lorg/json/JSONObject;)V
    .locals 1

    :try_start_0
    const-string v0, "download_miui_market_success_result"

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 52
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    const-string v0, "get_miui_market_compliance_success"

    invoke-virtual {p1, v0, p3, p2}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    return-void
.end method

.method public a(Lcom/ss/android/downloadlib/addownload/b/e;Lcom/ss/android/downloadlib/addownload/compliance/h;)V
    .locals 2

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->e()Lcom/ss/android/download/api/config/h;

    move-result-object v0

    if-nez v0, :cond_0

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p2

    const-string v0, "getDownloadNetworkFactory == NULL"

    invoke-virtual {p2, v0}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    const/16 p2, 0x191

    .line 8
    invoke-virtual {p0, p2, p1}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(ILcom/ss/android/downloadlib/addownload/b/e;)V

    return-void

    .line 9
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/d;->a()Lcom/ss/android/downloadlib/d;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/f$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/downloadlib/addownload/compliance/f$1;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;Lcom/ss/android/downloadlib/addownload/compliance/h;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method
