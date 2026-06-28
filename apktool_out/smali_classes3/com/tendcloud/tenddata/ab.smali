.class public Lcom/tendcloud/tenddata/ab;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ab$b;,
        Lcom/tendcloud/tenddata/ab$c;,
        Lcom/tendcloud/tenddata/ab$a;
    }
.end annotation


# static fields
.field public static final A:Ljava/lang/String; = "TD_sdk_last_send_time_wifi"

.field public static final B:Ljava/lang/String; = "TD_sdk_last_send_time_mobile_data"

.field public static final C:Ljava/lang/String; = "TD_sdk_last_send_url"

.field public static final D:Ljava/lang/String; = "TD_sdk_last_send_host"

.field public static final E:Ljava/lang/String; = "isDeveloper"

.field public static F:Ljava/lang/String; = null

.field public static G:Ljava/lang/String; = null

.field public static H:Z = false

.field public static I:Ljava/lang/String; = null

.field public static J:Z = false

.field public static final K:I = 0x6400000

.field static final L:Ljava/lang/String; = "WiFi"

.field static final M:Ljava/lang/String; = "All"

.field static N:Ljava/lang/String; = null

.field public static final O:Ljava/lang/String; = "v1.0.0"

.field public static P:Z = false

.field public static Q:Z = false

.field public static R:Z = false

.field public static S:Z = false

.field public static T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig; = null

.field public static final U:Ljava/lang/String; = "Android+TD+V5.0.28 gp"

.field static V:J = 0x0L

.field public static W:I = 0x0

.field public static X:Ljava/util/concurrent/atomic/AtomicInteger; = null

.field public static final Y:I = 0x1b7740

.field public static final Z:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final a:Z = false

.field public static final aa:J = 0x7530L

.field public static final ab:I = 0x64

.field public static final ac:Ljava/lang/String; = "TD_APP_ID"

.field public static final ad:Ljava/lang/String; = "TD_CHANNEL_ID"

.field private static ae:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final af:Ljava/lang/String; = "+V"

.field private static final ag:I = 0x78

.field private static final ah:I = 0x1e

.field private static final ai:I = 0x3e8

.field public static b:Z = false

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static e:Z = false

.field public static f:J = 0x0L

.field public static g:Landroid/content/Context; = null

.field public static h:Landroid/os/Handler; = null

.field public static final i:I = 0x1

.field public static final j:Ljava/lang/String; = "Android+"

.field public static k:Ljava/nio/channels/FileChannel; = null

.field public static l:J = 0x0L

.field public static m:Z = false

.field public static n:I = 0x0

.field public static o:Z = false

.field public static p:Z = false

.field public static q:J = 0x0L

.field public static r:Ljava/lang/String; = null

.field public static final s:Ljava/lang/String; = "TD"

.field public static final t:Ljava/lang/String; = "TDLog"

.field public static u:Lcom/tendcloud/tenddata/TalkingDataSharingFilter; = null

.field public static final v:Ljava/lang/String; = "2596"

.field public static final w:Ljava/lang/String; = "TD_app_pefercen_profile"

.field public static final x:Ljava/lang/String; = "TD_appId_"

.field public static final y:Ljava/lang/String; = "TD_channelId"

.field public static final z:Ljava/lang/String; = "TD_init_custom"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/tendcloud/tenddata/ab;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/tendcloud/tenddata/ab;->d:Ljava/util/Map;

    .line 15
    .line 16
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->e:Z

    .line 17
    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    sput-wide v2, Lcom/tendcloud/tenddata/ab;->f:J

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    sput-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 24
    .line 25
    sput-object v0, Lcom/tendcloud/tenddata/ab;->h:Landroid/os/Handler;

    .line 26
    .line 27
    sput-wide v2, Lcom/tendcloud/tenddata/ab;->l:J

    .line 28
    .line 29
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->m:Z

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    sput v2, Lcom/tendcloud/tenddata/ab;->n:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    sput-boolean v2, Lcom/tendcloud/tenddata/ab;->o:Z

    .line 36
    .line 37
    sput-boolean v2, Lcom/tendcloud/tenddata/ab;->p:Z

    .line 38
    .line 39
    const-wide/16 v2, 0x1388

    .line 40
    .line 41
    sput-wide v2, Lcom/tendcloud/tenddata/ab;->q:J

    .line 42
    .line 43
    sget-object v2, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;->SHARE:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    .line 44
    .line 45
    sput-object v2, Lcom/tendcloud/tenddata/ab;->u:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    .line 46
    .line 47
    new-instance v2, Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    sput-object v2, Lcom/tendcloud/tenddata/ab;->ae:Ljava/util/HashMap;

    .line 53
    .line 54
    const-string v2, "Default"

    .line 55
    .line 56
    sput-object v2, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    .line 57
    .line 58
    const-string v2, ""

    .line 59
    .line 60
    sput-object v2, Lcom/tendcloud/tenddata/ab;->G:Ljava/lang/String;

    .line 61
    .line 62
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->H:Z

    .line 63
    .line 64
    sput-object v0, Lcom/tendcloud/tenddata/ab;->I:Ljava/lang/String;

    .line 65
    .line 66
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->J:Z

    .line 67
    .line 68
    const-string v0, "WiFi"

    .line 69
    .line 70
    sput-object v0, Lcom/tendcloud/tenddata/ab;->N:Ljava/lang/String;

    .line 71
    .line 72
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->P:Z

    .line 73
    .line 74
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 75
    .line 76
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->R:Z

    .line 77
    .line 78
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->S:Z

    .line 79
    .line 80
    new-instance v0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    .line 81
    .line 82
    invoke-direct {v0}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;-><init>()V

    .line 83
    .line 84
    .line 85
    sput-object v0, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    .line 86
    .line 87
    const/4 v0, 0x2

    .line 88
    sput v0, Lcom/tendcloud/tenddata/ab;->W:I

    .line 89
    .line 90
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    .line 92
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/tendcloud/tenddata/ab;->X:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    .line 97
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 100
    .line 101
    .line 102
    sput-object v0, Lcom/tendcloud/tenddata/ab;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 103
    .line 104
    return-void
    .line 105
    .line 106
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->ae:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2
    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    .line 3
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TD_appId_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TD_app_pefercen_profile"

    invoke-static {p0, v1, p1, v0}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const-string p0, "Context or Service is null"

    .line 4
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    return-object v0
.end method

.method private static a(I)V
    .locals 1

    .line 20
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/cz;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/cz;-><init>()V

    packed-switch p0, :pswitch_data_0

    const-string p0, "Native"

    goto :goto_0

    :pswitch_0
    const-string p0, "Flutter"

    .line 21
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_1
    const-string p0, "ReactNative"

    .line 22
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_2
    const-string p0, "Hybrid"

    .line 23
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_3
    const-string p0, "APICloud"

    .line 24
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_4
    const-string p0, "PhoneGap"

    .line 25
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_5
    const-string p0, "AIR"

    .line 26
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_6
    const-string p0, "Unity"

    .line 27
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_7
    const-string p0, "Cocos2d"

    .line 28
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    .line 29
    :goto_0
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 5
    sget-object v0, Lcom/tendcloud/tenddata/ab;->ae:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TD_appId_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TD_app_pefercen_profile"

    invoke-static {v0, v1, p1, p0}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 8
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 9
    new-instance v0, Landroid/os/Handler;

    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/tendcloud/tenddata/ab;->h:Landroid/os/Handler;

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/tendcloud/tenddata/ab;->f:J

    if-eqz p0, :cond_1

    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "-"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 12
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aget-object p0, p0, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 14
    sput-object p1, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    .line 15
    :cond_2
    invoke-static {p0, p2}, Lcom/tendcloud/tenddata/ab;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    .line 16
    sget-object p1, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    .line 17
    invoke-static {}, Lcom/tendcloud/tenddata/cw;->a()Lcom/tendcloud/tenddata/cw;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Lcom/tendcloud/tenddata/cw;->a(Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    .line 18
    invoke-static {}, Lcom/tendcloud/tenddata/cw;->a()Lcom/tendcloud/tenddata/cw;

    move-result-object p0

    sget-object p1, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/cw;->b(Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    .line 19
    sget p0, Lcom/tendcloud/tenddata/dz;->a:I

    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->a(I)V

    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 5

    const/4 v0, 0x0

    .line 43
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/g;->a()Lcom/tendcloud/tenddata/g;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/tendcloud/tenddata/g;->d(Landroid/content/Context;)J

    move-result-wide v1

    .line 44
    invoke-static {}, Lcom/tendcloud/tenddata/g;->a()Lcom/tendcloud/tenddata/g;

    move-result-object v3

    invoke-virtual {v3, p0}, Lcom/tendcloud/tenddata/g;->e(Landroid/content/Context;)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p0, v1, v3

    if-nez p0, :cond_0

    const/4 p0, 0x1

    move v0, p0

    :catchall_0
    :cond_0
    return v0
.end method

.method public static a(Lcom/tendcloud/tenddata/a;)Z
    .locals 11

    const/4 v0, 0x0

    .line 30
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-nez v1, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_1

    return v0

    .line 31
    :cond_1
    invoke-static {v1}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;)Z

    move-result v1

    const-wide/16 v2, 0x1

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    .line 32
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->e(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v5

    cmp-long p0, v5, v2

    if-nez p0, :cond_2

    move v0, v4

    :cond_2
    return v0

    .line 33
    :cond_3
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->e(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v5

    cmp-long v1, v5, v2

    if-nez v1, :cond_9

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 35
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v5

    sub-long v5, v1, v5

    sget-wide v7, Lcom/tendcloud/tenddata/ab;->q:J

    const-wide/16 v9, 0x4

    mul-long/2addr v7, v9

    cmp-long v3, v5, v7

    if-gtz v3, :cond_8

    .line 36
    invoke-static {}, Lcom/tendcloud/tenddata/i;->e()J

    move-result-wide v5

    sub-long/2addr v1, v5

    sget-wide v5, Lcom/tendcloud/tenddata/ab;->q:J

    mul-long/2addr v5, v9

    cmp-long v1, v1, v5

    if-gtz v1, :cond_4

    .line 37
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v1, p0}, Lcom/tendcloud/tenddata/ab;->d(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Z

    move-result p0

    return p0

    .line 38
    :cond_4
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->c(Lcom/tendcloud/tenddata/a;)Z

    move-result v1

    if-eqz v1, :cond_5

    return v4

    .line 39
    :cond_5
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->e(Lcom/tendcloud/tenddata/a;)Z

    move-result v1

    if-eqz v1, :cond_6

    return v4

    .line 40
    :cond_6
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->d(Lcom/tendcloud/tenddata/a;)Z

    move-result v1

    if-eqz v1, :cond_7

    return v4

    .line 41
    :cond_7
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->b(Lcom/tendcloud/tenddata/a;)Z

    move-result p0

    if-eqz p0, :cond_9

    return v4

    .line 42
    :cond_8
    invoke-static {v0, p0}, Lcom/tendcloud/tenddata/i;->a(ZLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_9
    return v0
.end method

.method public static a()[I
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 7
    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x1d4c0
        0x7530
    .end array-data
.end method

.method public static b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Default"

    if-nez v0, :cond_0

    sget-object v0, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TD_channelId"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TD_app_pefercen_profile"

    invoke-static {p0, v0, p1, v1}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    .line 3
    :cond_1
    sget-object p0, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    return-object p0
.end method

.method public static b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 3

    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TD_channelId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TD_app_pefercen_profile"

    invoke-static {v0, v1, p1, p0}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b()Z
    .locals 6

    const/4 v0, 0x0

    .line 5
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v2, "TD_app_pefercen_profile"

    const-string v3, "isDeveloper"

    const-wide/16 v4, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v1, v1, v4

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :catchall_0
    :cond_0
    return v0
.end method

.method private static b(Lcom/tendcloud/tenddata/a;)Z
    .locals 9

    const-string v0, "td_database3SaaS"

    const-string v1, "td_database1SaaS"

    const-string v2, "td_database0SaaS"

    .line 6
    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p0

    const-string v3, "SDK"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 7
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    .line 8
    :try_start_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 9
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    new-instance v7, Ljava/io/File;

    const-string v8, "__database_reborn_January_one__"

    invoke-direct {v7, p0, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v7, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v7, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v7, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 16
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    move v4, p0

    nop

    :catchall_0
    :cond_2
    :goto_0
    return v4
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 5
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/cz;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/cz;-><init>()V

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cz;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string v0, "Native"

    :goto_0
    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->G:Ljava/lang/String;

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "TD_app_pefercen_profile"

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TD_init_custom"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    invoke-static {p0, v0, p1, v1}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/tendcloud/tenddata/ab;->G:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :catchall_0
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->G:Ljava/lang/String;

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 4

    .line 4
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v1, "TD_app_pefercen_profile"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TD_init_custom"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1, p0}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static c(Lcom/tendcloud/tenddata/a;)Z
    .locals 7

    const-string v0, "td_database0SaaS"

    const-string v1, "td_database3SaaS"

    .line 6
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p0

    const-string v2, "TRACKING"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 7
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    .line 8
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 9
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    new-instance v5, Ljava/io/File;

    const-string v6, "__database_reborn_January_one__"

    invoke-direct {v5, p0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    move v3, p0

    :catchall_0
    :cond_1
    return v3
.end method

.method private static d(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Z
    .locals 3

    .line 9
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TRACKING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "talkingdata_file_prefence"

    const-string v1, "actived"

    const/4 v2, 0x0

    .line 10
    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 11
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 12
    invoke-static {v2, p1}, Lcom/tendcloud/tenddata/i;->a(ZLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    :catchall_0
    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private static d(Lcom/tendcloud/tenddata/a;)Z
    .locals 7

    const-string v0, "td_database1SaaS"

    const-string v1, "td_database3SaaS"

    .line 1
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p0

    const-string v2, "APP"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 2
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    .line 3
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    new-instance v5, Ljava/io/File;

    const-string v6, "__database_reborn_January_one__"

    invoke-direct {v5, p0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 7
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    move v3, p0

    :catchall_0
    :cond_1
    return v3
.end method

.method private static e(Lcom/tendcloud/tenddata/a;)Z
    .locals 7

    .line 1
    const-string v0, "td_database1SaaS"

    .line 2
    .line 3
    const-string v1, "td_database0SaaS"

    .line 4
    .line 5
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v2, "GAME"

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 29
    .line 30
    invoke-direct {v2, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Ljava/io/File;

    .line 34
    .line 35
    invoke-direct {v4, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Ljava/io/File;

    .line 39
    .line 40
    const-string v6, "__database_reborn_January_one__"

    .line 41
    .line 42
    invoke-direct {v5, p0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance p0, Ljava/io/File;

    .line 46
    .line 47
    invoke-direct {p0, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Ljava/io/File;

    .line 51
    .line 52
    invoke-direct {v1, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_0

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 74
    .line 75
    .line 76
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    if-eqz p0, :cond_1

    .line 78
    .line 79
    :cond_0
    const/4 p0, 0x1

    .line 80
    move v3, p0

    .line 81
    :catchall_0
    :cond_1
    return v3
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public static setCofig(Lcom/tendcloud/tenddata/TalkingDataSDKConfig;)V
    .locals 0

    if-eqz p0, :cond_0

    sput-object p0, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    :cond_0
    return-void
.end method

.method public static setConfigurationDisable(I)V
    .locals 3

    .line 1
    and-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    :try_start_0
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->P:Z

    .line 11
    .line 12
    and-int/lit8 v0, p0, 0x2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_1
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 20
    .line 21
    and-int/lit8 v0, p0, 0x4

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move v0, v1

    .line 28
    :goto_2
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->R:Z

    .line 29
    .line 30
    and-int/lit8 p0, p0, 0x8

    .line 31
    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    move v1, v2

    .line 35
    :cond_3
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->S:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    :catchall_0
    return-void
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
.end method

.method public static setDeveloperMode(Z)V
    .locals 5

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v1, "TD_app_pefercen_profile"

    const-string v2, "isDeveloper"

    if-eqz p0, :cond_0

    const-wide/16 v3, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    :goto_0
    invoke-static {v0, v1, v2, v3, v4}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
