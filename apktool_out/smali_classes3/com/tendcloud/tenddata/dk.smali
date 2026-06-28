.class public Lcom/tendcloud/tenddata/dk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/tendcloud/tenddata/cw;

.field private static d:Lcom/tendcloud/tenddata/cz;

.field private static e:Lcom/tendcloud/tenddata/dd;

.field private static f:Lcom/tendcloud/tenddata/da;

.field private static volatile h:Lcom/tendcloud/tenddata/dk;


# instance fields
.field public a:Lorg/json/JSONObject;

.field public b:Lorg/json/JSONObject;

.field private g:Lcom/tendcloud/tenddata/dh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/dd;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tendcloud/tenddata/dd;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/dk;->e:Lcom/tendcloud/tenddata/dd;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lcom/tendcloud/tenddata/dk;->f:Lcom/tendcloud/tenddata/da;

    .line 10
    .line 11
    sput-object v0, Lcom/tendcloud/tenddata/dk;->h:Lcom/tendcloud/tenddata/dk;

    .line 12
    .line 13
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/dk;->a:Lorg/json/JSONObject;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tendcloud/tenddata/dk;->b:Lorg/json/JSONObject;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/tenddata/dk;->g:Lcom/tendcloud/tenddata/dh;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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
.end method

.method public static b()Lcom/tendcloud/tenddata/dk;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/dk;->h:Lcom/tendcloud/tenddata/dk;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/tendcloud/tenddata/dk;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/dk;->h:Lcom/tendcloud/tenddata/dk;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/tendcloud/tenddata/dk;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/tendcloud/tenddata/dk;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/tendcloud/tenddata/dk;->h:Lcom/tendcloud/tenddata/dk;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lcom/tendcloud/tenddata/dk;->h:Lcom/tendcloud/tenddata/dk;

    .line 25
    .line 26
    return-object v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method


# virtual methods
.method public declared-synchronized a(Lcom/tendcloud/tenddata/cv;Z)Lorg/json/JSONObject;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/dk;->a(Lcom/tendcloud/tenddata/cv;ZLcom/tendcloud/tenddata/a;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Lcom/tendcloud/tenddata/cv;ZLcom/tendcloud/tenddata/a;)Lorg/json/JSONObject;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/tendcloud/tenddata/dk;->a(Lcom/tendcloud/tenddata/cv;ZLcom/tendcloud/tenddata/a;Landroid/util/Pair;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Lcom/tendcloud/tenddata/cv;ZLcom/tendcloud/tenddata/a;Landroid/util/Pair;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/cv;",
            "Z",
            "Lcom/tendcloud/tenddata/a;",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Lorg/json/JSONArray;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_8

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_0

    goto/16 :goto_0

    .line 4
    :cond_0
    const-class p4, Landroid/util/EventLogTags;

    monitor-enter p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 5
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 6
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iput-object v1, p0, Lcom/tendcloud/tenddata/dk;->a:Lorg/json/JSONObject;

    .line 7
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iput-object v1, p0, Lcom/tendcloud/tenddata/dk;->b:Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 8
    :try_start_3
    sget-object v1, Lcom/tendcloud/tenddata/dk;->c:Lcom/tendcloud/tenddata/cw;

    if-nez v1, :cond_1

    .line 9
    invoke-static {}, Lcom/tendcloud/tenddata/cw;->a()Lcom/tendcloud/tenddata/cw;

    move-result-object v1

    sput-object v1, Lcom/tendcloud/tenddata/dk;->c:Lcom/tendcloud/tenddata/cw;

    .line 10
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 11
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/tendcloud/tenddata/dj;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    sget-object v2, Lcom/tendcloud/tenddata/dk;->c:Lcom/tendcloud/tenddata/cw;

    invoke-virtual {v2, v1}, Lcom/tendcloud/tenddata/cw;->setUniqueId(Ljava/lang/String;)V

    .line 13
    :cond_1
    sget-object v1, Lcom/tendcloud/tenddata/dk;->c:Lcom/tendcloud/tenddata/cw;

    invoke-virtual {v1, p3}, Lcom/tendcloud/tenddata/cw;->setSubmitAppId(Lcom/tendcloud/tenddata/a;)V

    .line 14
    sget-object v1, Lcom/tendcloud/tenddata/dk;->c:Lcom/tendcloud/tenddata/cw;

    invoke-virtual {v1, p3}, Lcom/tendcloud/tenddata/cw;->setSubmitChannelId(Lcom/tendcloud/tenddata/a;)V

    .line 15
    sget-object p3, Lcom/tendcloud/tenddata/dk;->e:Lcom/tendcloud/tenddata/dd;

    if-nez p3, :cond_2

    .line 16
    new-instance p3, Lcom/tendcloud/tenddata/dd;

    invoke-direct {p3}, Lcom/tendcloud/tenddata/dd;-><init>()V

    sput-object p3, Lcom/tendcloud/tenddata/dk;->e:Lcom/tendcloud/tenddata/dd;

    .line 17
    :cond_2
    sget-object p3, Lcom/tendcloud/tenddata/dd;->a:Lcom/tendcloud/tenddata/dc;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/dc;->a()V

    .line 18
    sget-object p3, Lcom/tendcloud/tenddata/dk;->e:Lcom/tendcloud/tenddata/dd;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/dd;->c()Lcom/tendcloud/tenddata/db;

    move-result-object p3

    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/tendcloud/tenddata/o;->B(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p3, v1}, Lcom/tendcloud/tenddata/db;->setSlots(I)V

    .line 19
    sget-object p3, Lcom/tendcloud/tenddata/dk;->d:Lcom/tendcloud/tenddata/cz;

    if-nez p3, :cond_3

    .line 20
    new-instance p3, Lcom/tendcloud/tenddata/cz;

    invoke-direct {p3}, Lcom/tendcloud/tenddata/cz;-><init>()V

    sput-object p3, Lcom/tendcloud/tenddata/dk;->d:Lcom/tendcloud/tenddata/cz;

    .line 21
    :cond_3
    sget-object p3, Lcom/tendcloud/tenddata/dk;->d:Lcom/tendcloud/tenddata/cz;

    sget-object v1, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->getRules()I

    move-result v1

    invoke-virtual {p3, v1}, Lcom/tendcloud/tenddata/cz;->setRule(I)V

    .line 22
    sget-object p3, Lcom/tendcloud/tenddata/dk;->f:Lcom/tendcloud/tenddata/da;

    if-nez p3, :cond_4

    .line 23
    new-instance p3, Lcom/tendcloud/tenddata/da;

    invoke-direct {p3}, Lcom/tendcloud/tenddata/da;-><init>()V

    sput-object p3, Lcom/tendcloud/tenddata/dk;->f:Lcom/tendcloud/tenddata/da;

    .line 24
    invoke-virtual {p3}, Lcom/tendcloud/tenddata/da;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    :cond_4
    :try_start_4
    const-string p3, "version"

    const-string v1, "2.0"

    .line 25
    invoke-virtual {v0, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "action"

    .line 26
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "device"

    .line 27
    sget-object p3, Lcom/tendcloud/tenddata/dk;->e:Lcom/tendcloud/tenddata/dd;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "app"

    .line 28
    sget-object p3, Lcom/tendcloud/tenddata/dk;->c:Lcom/tendcloud/tenddata/cw;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "sdk"

    .line 29
    sget-object p3, Lcom/tendcloud/tenddata/dk;->d:Lcom/tendcloud/tenddata/cz;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "appContext"

    .line 30
    invoke-static {}, Lcom/tendcloud/tenddata/ct;->a()Lcom/tendcloud/tenddata/ct;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/ct;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "user"

    .line 31
    sget-object p3, Lcom/tendcloud/tenddata/dk;->f:Lcom/tendcloud/tenddata/da;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "sharingFilterPermission"

    .line 32
    sget-object p3, Lcom/tendcloud/tenddata/ab;->u:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-string p1, "ts"

    .line 34
    invoke-virtual {v0, p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 35
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    sget-object p3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 36
    invoke-static {p3}, Lcom/tendcloud/tenddata/dj;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lcom/tendcloud/tenddata/dk;->e:Lcom/tendcloud/tenddata/dd;

    .line 37
    invoke-virtual {p3}, Lcom/tendcloud/tenddata/dd;->a()Lcom/tendcloud/tenddata/de;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/de;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lcom/tendcloud/tenddata/dk;->e:Lcom/tendcloud/tenddata/dd;

    .line 38
    invoke-virtual {p3}, Lcom/tendcloud/tenddata/dd;->a()Lcom/tendcloud/tenddata/de;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/de;->c()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "fingerprint"

    .line 40
    invoke-virtual {v0, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_7

    .line 41
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 42
    new-instance p2, Lcom/tendcloud/tenddata/dh;

    sget-object p3, Lcom/tendcloud/tenddata/di;->a:Lcom/tendcloud/tenddata/di;

    invoke-direct {p2, p3}, Lcom/tendcloud/tenddata/dh;-><init>(Lcom/tendcloud/tenddata/di;)V

    .line 43
    invoke-virtual {p2}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 44
    iget-object p2, p0, Lcom/tendcloud/tenddata/dk;->g:Lcom/tendcloud/tenddata/dh;

    if-nez p2, :cond_5

    .line 45
    new-instance p2, Lcom/tendcloud/tenddata/dh;

    sget-object p3, Lcom/tendcloud/tenddata/di;->b:Lcom/tendcloud/tenddata/di;

    invoke-direct {p2, p3}, Lcom/tendcloud/tenddata/dh;-><init>(Lcom/tendcloud/tenddata/di;)V

    iput-object p2, p0, Lcom/tendcloud/tenddata/dk;->g:Lcom/tendcloud/tenddata/dh;

    .line 46
    :cond_5
    iget-object p2, p0, Lcom/tendcloud/tenddata/dk;->g:Lcom/tendcloud/tenddata/dh;

    invoke-virtual {p2}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 47
    :try_start_5
    sget-object p2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string p3, "android.permission.BLUETOOTH"

    invoke-static {p2, p3}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 48
    new-instance p2, Lcom/tendcloud/tenddata/dh;

    sget-object p3, Lcom/tendcloud/tenddata/di;->c:Lcom/tendcloud/tenddata/di;

    invoke-direct {p2, p3}, Lcom/tendcloud/tenddata/dh;-><init>(Lcom/tendcloud/tenddata/di;)V

    .line 49
    invoke-virtual {p2}, Lcom/tendcloud/tenddata/cy;->b()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    :cond_6
    :try_start_6
    const-string p2, "networks"

    .line 50
    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    new-instance p1, Lcom/tendcloud/tenddata/cx;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/cx;-><init>()V

    const-string p2, "locations"

    .line 52
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/cx;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 53
    :catchall_2
    :cond_7
    :try_start_7
    monitor-exit p4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    monitor-exit p0

    return-object v0

    :catchall_3
    move-exception p1

    .line 54
    :try_start_8
    monitor-exit p4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    move-exception p1

    monitor-exit p0

    throw p1

    .line 55
    :cond_8
    :goto_0
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 56
    sget-object v0, Lcom/tendcloud/tenddata/dk;->f:Lcom/tendcloud/tenddata/da;

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/da;->c()V

    :cond_0
    return-void
.end method
