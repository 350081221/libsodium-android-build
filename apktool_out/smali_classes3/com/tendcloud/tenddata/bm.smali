.class public final Lcom/tendcloud/tenddata/bm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Landroid/os/Handler; = null

.field static b:Landroid/os/HandlerThread; = null

.field private static final c:Ljava/lang/String; = "check_wifi_permission"

.field private static final d:Ljava/lang/String; = "check_bs_permission"

.field private static final e:Ljava/lang/String; = "check_gps_permission"

.field private static final f:I = 0x1

.field private static final g:I = 0x2

.field private static final h:I = 0x3

.field private static final i:I = 0x4

.field private static final j:J = 0x927c0L

.field private static volatile k:Lcom/tendcloud/tenddata/bm;

.field private static l:Landroid/net/wifi/WifiManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/bm;->a()Lcom/tendcloud/tenddata/bm;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance v0, Landroid/os/HandlerThread;

    .line 5
    .line 6
    const-string v1, "locHandlerThread"

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/tendcloud/tenddata/bm;->b:Landroid/os/HandlerThread;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/tendcloud/tenddata/bm$1;

    .line 19
    .line 20
    sget-object v1, Lcom/tendcloud/tenddata/bm;->b:Landroid/os/HandlerThread;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, p0, v1}, Lcom/tendcloud/tenddata/bm$1;-><init>(Lcom/tendcloud/tenddata/bm;Landroid/os/Looper;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/tendcloud/tenddata/bm;->a:Landroid/os/Handler;

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    const-wide/16 v1, 0x0

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2}, Lcom/tendcloud/tenddata/bm;->a(IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
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

.method public static a()Lcom/tendcloud/tenddata/bm;
    .locals 2

    .line 2
    sget-object v0, Lcom/tendcloud/tenddata/bm;->k:Lcom/tendcloud/tenddata/bm;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/tendcloud/tenddata/bm;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/bm;->k:Lcom/tendcloud/tenddata/bm;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tendcloud/tenddata/bm;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/bm;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/bm;->k:Lcom/tendcloud/tenddata/bm;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_0
    sget-object v0, Lcom/tendcloud/tenddata/bm;->k:Lcom/tendcloud/tenddata/bm;

    return-object v0
.end method

.method static synthetic a(Lcom/tendcloud/tenddata/bm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bm;->c()V

    return-void
.end method

.method private b()V
    .locals 4

    :try_start_0
    const-string v0, "check_wifi_permission"

    .line 2
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/bm;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const-wide/32 v1, 0x2bf20

    .line 3
    invoke-virtual {p0, v0, v1, v2}, Lcom/tendcloud/tenddata/bm;->a(IJ)V

    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    sput-object v0, Lcom/tendcloud/tenddata/bm;->l:Landroid/net/wifi/WifiManager;

    .line 5
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Lcom/tendcloud/tenddata/br;

    sget-object v1, Lcom/tendcloud/tenddata/bm;->l:Landroid/net/wifi/WifiManager;

    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/br;-><init>(Landroid/net/wifi/WifiManager;)V

    .line 7
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.wifi.SCAN_RESULTS"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/tendcloud/tenddata/bm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bm;->b()V

    return-void
.end method

.method private c()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 1
    :try_start_0
    const-string v0, "check_bs_permission"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/bm;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    const-wide/32 v1, 0x2bf20

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, v2}, Lcom/tendcloud/tenddata/bm;->a(IJ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v1, "phone"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimState()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x5

    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    .line 37
    .line 38
    .line 39
    new-instance v1, Lcom/tendcloud/tenddata/bq;

    .line 40
    .line 41
    invoke-direct {v1}, Lcom/tendcloud/tenddata/bq;-><init>()V

    .line 42
    .line 43
    .line 44
    const/16 v2, 0x10

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/telephony/CellLocation;->requestLocationUpdate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :catchall_0
    :cond_1
    return-void
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
.method protected a(IJ)V
    .locals 1

    .line 8
    :try_start_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 9
    iput p1, v0, Landroid/os/Message;->what:I

    .line 10
    sget-object p1, Lcom/tendcloud/tenddata/bm;->a:Landroid/os/Handler;

    invoke-virtual {p1, v0, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method protected a(Ljava/lang/String;)Z
    .locals 8

    const/4 v0, 0x0

    .line 11
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 12
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v2, v3}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v4, "android.permission.ACCESS_FINE_LOCATION"

    .line 13
    invoke-static {v2, v4}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v3

    .line 14
    :goto_1
    sget-object v4, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v5, "android.permission.ACCESS_WIFI_STATE"

    invoke-static {v4, v5}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, -0x486dd47a

    const/4 v7, 0x2

    if-eq v5, v6, :cond_4

    const v6, 0x48b5c802

    if-eq v5, v6, :cond_3

    const v6, 0x50d1349b

    if-eq v5, v6, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "check_gps_permission"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    move p1, v3

    goto :goto_3

    :cond_3
    const-string v5, "check_wifi_permission"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    move p1, v7

    goto :goto_3

    :cond_4
    const-string v5, "check_bs_permission"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    move p1, v0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 p1, -0x1

    :goto_3
    if-eqz p1, :cond_a

    if-eq p1, v3, :cond_9

    if-eq p1, v7, :cond_6

    goto :goto_4

    :cond_6
    const/16 p1, 0x17

    .line 16
    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_8

    if-eqz v4, :cond_7

    if-eqz v2, :cond_7

    move v0, v3

    :cond_7
    return v0

    :cond_8
    return v4

    :cond_9
    return v2

    :cond_a
    if-eqz v2, :cond_b

    if-eqz v1, :cond_b

    move v0, v3

    :catchall_0
    :cond_b
    :goto_4
    return v0
.end method

.method public final onTDEBEventLocationEvent(Lcom/tendcloud/tenddata/bs;)V
    .locals 0

    return-void
.end method
