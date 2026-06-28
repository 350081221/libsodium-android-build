.class final Lcom/tendcloud/tenddata/br;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field a:Lcom/tendcloud/tenddata/bb;

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/net/wifi/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field c:Lorg/json/JSONArray;

.field d:Lcom/tendcloud/tenddata/ba;

.field e:Lcom/tendcloud/tenddata/ba;

.field f:J

.field g:J

.field private h:J

.field private i:Landroid/net/wifi/WifiManager;


# direct methods
.method public constructor <init>(Landroid/net/wifi/WifiManager;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/tendcloud/tenddata/bb;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/tendcloud/tenddata/bb;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/tenddata/br;->a:Lcom/tendcloud/tenddata/bb;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/tendcloud/tenddata/br;->f:J

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/tendcloud/tenddata/br;->g:J

    .line 16
    .line 17
    const-wide/32 v0, 0x2bf20

    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, Lcom/tendcloud/tenddata/br;->h:J

    .line 21
    .line 22
    iput-object p1, p0, Lcom/tendcloud/tenddata/br;->i:Landroid/net/wifi/WifiManager;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic a(Lcom/tendcloud/tenddata/br;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tendcloud/tenddata/br;->h:J

    return-wide v0
.end method

.method private a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/ba;
    .locals 10

    if-eqz p1, :cond_1

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 9
    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 10
    new-instance v9, Lcom/tendcloud/tenddata/ax;

    const-string v3, "SSID"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v3, "BSSID"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v3, "level"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    int-to-byte v6, v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/tendcloud/tenddata/ax;-><init>(Ljava/lang/String;Ljava/lang/String;BBB)V

    .line 11
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/ba;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/ba;-><init>()V

    .line 13
    invoke-virtual {p1, v0}, Lcom/tendcloud/tenddata/ba;->setBsslist(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method private a()V
    .locals 2

    .line 2
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string v1, "env"

    .line 3
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v1, "wifiUpdate"

    .line 4
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 5
    sget-object v1, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 6
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private b()Lcom/tendcloud/tenddata/ba;
    .locals 1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/br;->c:Lorg/json/JSONArray;

    .line 3
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/br;->a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/ba;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :catchall_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    return-object v0
.end method

.method static synthetic b(Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/ba;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/br;->b()Lcom/tendcloud/tenddata/ba;

    move-result-object p0

    return-object p0
.end method

.method private c()Lcom/tendcloud/tenddata/ba;
    .locals 5

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/br;->i:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/tendcloud/tenddata/br;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 3
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v1, 0x0

    .line 4
    :goto_0
    iget-object v2, p0, Lcom/tendcloud/tenddata/br;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 5
    iget-object v2, p0, Lcom/tendcloud/tenddata/br;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/ScanResult;

    iget v2, v2, Landroid/net/wifi/ScanResult;->level:I

    const/16 v3, -0x4b

    if-ge v2, v3, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "SSID"

    .line 7
    iget-object v4, p0, Lcom/tendcloud/tenddata/br;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/wifi/ScanResult;

    iget-object v4, v4, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "BSSID"

    .line 8
    iget-object v4, p0, Lcom/tendcloud/tenddata/br;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/wifi/ScanResult;

    iget-object v4, v4, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "level"

    .line 9
    iget-object v4, p0, Lcom/tendcloud/tenddata/br;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/wifi/ScanResult;

    iget v4, v4, Landroid/net/wifi/ScanResult;->level:I

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 10
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_1
    iput-object v0, p0, Lcom/tendcloud/tenddata/br;->c:Lorg/json/JSONArray;

    .line 12
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/br;->a(Lorg/json/JSONArray;)Lcom/tendcloud/tenddata/ba;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/br;->e:Lcom/tendcloud/tenddata/ba;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :catchall_0
    :cond_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/br;->e:Lcom/tendcloud/tenddata/ba;

    return-object v0
.end method

.method static synthetic c(Lcom/tendcloud/tenddata/br;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/br;->a()V

    return-void
.end method

.method static synthetic d(Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/ba;
    .locals 0

    invoke-direct {p0}, Lcom/tendcloud/tenddata/br;->c()Lcom/tendcloud/tenddata/ba;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    sget-object p1, Lcom/tendcloud/tenddata/bm;->a:Landroid/os/Handler;

    new-instance p2, Lcom/tendcloud/tenddata/br$1;

    invoke-direct {p2, p0}, Lcom/tendcloud/tenddata/br$1;-><init>(Lcom/tendcloud/tenddata/br;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
