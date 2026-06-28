.class public Lcom/uyumao/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uyumao/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/uyumao/d$e;
    }
.end annotation


# static fields
.field public static volatile a:Z = true

.field public static volatile b:Z = true

.field public static volatile c:Z = true

.field public static volatile d:Z = true

.field public static volatile e:Z = true

.field public static volatile f:Z = true

.field public static g:Landroid/content/Context; = null

.field public static h:Lorg/json/JSONObject; = null

.field public static i:Lorg/json/JSONObject; = null

.field public static j:Lorg/json/JSONObject; = null

.field public static k:Lorg/json/JSONObject; = null

.field public static volatile l:Z = false

.field public static m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static n:Landroid/location/LocationListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/uyumao/d;->m:Ljava/util/Map;

    .line 7
    .line 8
    const/16 v1, 0x65

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "col_wifi"

    .line 15
    .line 16
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lcom/uyumao/d;->m:Ljava/util/Map;

    .line 20
    .line 21
    const/16 v1, 0x66

    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "col_bs"

    .line 28
    .line 29
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object v0, Lcom/uyumao/d;->m:Ljava/util/Map;

    .line 33
    .line 34
    const/16 v1, 0x67

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "col_lbs"

    .line 41
    .line 42
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object v0, Lcom/uyumao/d;->m:Ljava/util/Map;

    .line 46
    .line 47
    const/16 v1, 0x68

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "col_apl"

    .line 54
    .line 55
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    new-instance v0, Lcom/uyumao/d$a;

    .line 59
    .line 60
    invoke-direct {v0}, Lcom/uyumao/d$a;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lcom/uyumao/d;->n:Landroid/location/LocationListener;

    .line 64
    .line 65
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 8

    const-string v0, "2G/3G"

    .line 10
    sget-object v1, Lcom/uyumao/d;->h:Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 11
    sget-object p0, Lcom/uyumao/d;->h:Lorg/json/JSONObject;

    return-object p0

    .line 12
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "os"

    const-string v3, "Android"

    .line 13
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "dm"

    .line 14
    :try_start_1
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "av"

    .line 15
    :try_start_2
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v2, "umid"

    .line 16
    :try_start_3
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getUMId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v2, "ov"

    .line 17
    :try_start_4
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v2, "chn"

    .line 18
    :try_start_5
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getActiveUser(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v3, ""

    const-string v4, "puid"

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    :try_start_6
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getActiveUser(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v2

    array-length v2, v2

    const/4 v6, 0x2

    if-ne v2, v6, :cond_1

    .line 20
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getActiveUser(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v5

    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_0
    const-string v2, "zid"

    .line 22
    :try_start_7
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getZid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v2, "sv"

    .line 23
    :try_start_8
    invoke-static {}, Lcom/uyumao/sdk/UYMManager;->getSdkVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const-string v2, "ak"

    .line 24
    :try_start_9
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const-string v2, "idfa"

    .line 25
    :try_start_a
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getIdfa(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    const-string v2, "db"

    .line 26
    :try_start_b
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    const-string v2, "aid"

    .line 27
    :try_start_c
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    const-string v2, "oaid"

    .line 28
    :try_start_d
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getOaid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    const-string v2, "imei"

    .line 29
    :try_start_e
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getImeiNew(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    const-string v2, "boa"

    .line 30
    :try_start_f
    sget-object v4, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    const-string v2, "mant"

    .line 31
    :try_start_10
    sget-wide v6, Landroid/os/Build;->TIME:J

    invoke-virtual {v1, v2, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 32
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getLocaleInfo(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    const-string v4, "ct"

    const/4 v6, 0x0

    .line 33
    :try_start_11
    aget-object v7, v2, v6

    invoke-virtual {v1, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    const-string v4, "lang"

    .line 34
    :try_start_12
    aget-object v2, v2, v5

    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    const-string v2, "tz"

    .line 35
    :try_start_13
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getTimeZone(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    const-string v2, "pkg"

    .line 36
    :try_start_14
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getPackageName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    const-string v2, "disn"

    .line 37
    :try_start_15
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getNetworkAccessMode(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    const-string v4, "Wi-Fi"

    .line 39
    :try_start_16
    aget-object v7, v2, v6

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    const-string v7, "ac"

    if-eqz v4, :cond_2

    :try_start_17
    const-string v0, "wifi"

    .line 40
    invoke-virtual {v1, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 41
    :cond_2
    aget-object v4, v2, v6

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 42
    invoke-virtual {v1, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_3
    const-string v0, "unknown"

    .line 43
    invoke-virtual {v1, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    :goto_1
    aget-object v0, v2, v5

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    if-nez v0, :cond_4

    const-string v0, "ast"

    .line 45
    :try_start_18
    aget-object v2, v2, v5

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    :cond_4
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getNetworkType(Landroid/content/Context;)I

    move-result v0

    const-string v2, "nt"

    .line 47
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 48
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getDeviceToken(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 49
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "device_token"

    .line 50
    invoke-virtual {v1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    :cond_5
    sput-object v1, Lcom/uyumao/d;->h:Lorg/json/JSONObject;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    .line 52
    :catchall_0
    sget-object p0, Lcom/uyumao/d;->h:Lorg/json/JSONObject;

    return-object p0
.end method

.method public static a(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 4

    const-string v0, "sdk"

    const-string v1, "hit_sdk"

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, ","

    .line 5
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 6
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x0

    .line 7
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_1

    .line 8
    aget-object v3, p1, v2

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic a(Z)Z
    .locals 0

    .line 1
    sput-boolean p0, Lcom/uyumao/d;->l:Z

    return p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "network"

    const-string v4, "gps"

    const/16 v5, 0xca

    const-string v6, "location"

    const-string v7, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v8, "android.permission.ACCESS_FINE_LOCATION"

    const/16 v9, 0xcb

    const/4 v10, 0x0

    if-eq v2, v5, :cond_15

    const-wide/16 v11, 0x0

    if-eq v2, v9, :cond_13

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    const-string v2, "recv Dispatch.CL_APL msg."

    const-string v3, "CCG"

    .line 53
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    sget-boolean v2, Lcom/uyumao/d;->f:Z

    if-nez v2, :cond_0

    const-string v1, "apl switch is off, ignore collect trigger."

    .line 55
    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-eqz v1, :cond_1a

    .line 56
    instance-of v2, v1, Lorg/json/JSONObject;

    if-eqz v2, :cond_1a

    .line 57
    :try_start_0
    check-cast v1, Lorg/json/JSONObject;

    .line 58
    sget-object v2, Lcom/uyumao/e;->c:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    .line 59
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;

    if-eqz v2, :cond_1

    .line 60
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_6

    .line 61
    :cond_1
    new-instance v2, Lcom/uyumao/r;

    invoke-direct {v2, v1}, Lcom/uyumao/r;-><init>(Lorg/json/JSONObject;)V

    invoke-static {v2}, Lcom/uyumao/s;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 62
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/uyumao/e;->c:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    goto/16 :goto_6

    .line 63
    :pswitch_1
    invoke-static {}, Lcom/uyumao/e;->b()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    if-eqz v1, :cond_1a

    .line 64
    instance-of v2, v1, Lorg/json/JSONObject;

    if-eqz v2, :cond_1a

    .line 65
    :try_start_1
    check-cast v1, Lorg/json/JSONObject;

    sput-object v1, Lcom/uyumao/d;->k:Lorg/json/JSONObject;

    .line 66
    sget-boolean v1, Lcom/uyumao/d;->b:Z

    if-eqz v1, :cond_3

    .line 67
    sget-object v1, Lcom/uyumao/d;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/uyumao/e;->b(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v1

    sput-object v1, Lcom/uyumao/d;->i:Lorg/json/JSONObject;

    .line 68
    :cond_3
    sget-boolean v1, Lcom/uyumao/d;->a:Z

    if-eqz v1, :cond_8

    .line 69
    sget-object v1, Lcom/uyumao/d;->g:Landroid/content/Context;

    sget-object v2, Lcom/uyumao/d;->n:Landroid/location/LocationListener;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    if-eqz v1, :cond_7

    if-nez v2, :cond_4

    goto :goto_1

    .line 70
    :cond_4
    :try_start_2
    invoke-static {v1, v8}, Lcom/uyumao/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 71
    invoke-static {v1, v7}, Lcom/uyumao/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 72
    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v5, 0x1

    .line 73
    invoke-virtual {v1, v5}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v5

    .line 74
    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object v3, v4

    goto :goto_0

    .line 75
    :cond_6
    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 76
    :goto_0
    invoke-virtual {v1, v3, v2, v10}, Landroid/location/LocationManager;->requestSingleUpdate(Ljava/lang/String;Landroid/location/LocationListener;Landroid/os/Looper;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    :catchall_0
    :cond_7
    :goto_1
    :try_start_3
    sget-object v11, Lcom/uyumao/d;->g:Landroid/content/Context;

    const/16 v13, 0xca

    .line 78
    sget-object v14, Lcom/uyumao/d$e;->a:Lcom/uyumao/d;

    .line 79
    sget-object v15, Lcom/uyumao/d;->k:Lorg/json/JSONObject;

    const-wide/16 v16, 0x7530

    const/16 v12, 0x100

    .line 80
    invoke-static/range {v11 .. v17}, Lcom/uyumao/g;->a(Landroid/content/Context;IILcom/uyumao/g$a;Ljava/lang/Object;J)V

    goto/16 :goto_6

    .line 81
    :cond_8
    sget-object v1, Lcom/uyumao/d;->g:Landroid/content/Context;

    .line 82
    sget-object v2, Lcom/uyumao/d$e;->a:Lcom/uyumao/d;

    .line 83
    sget-object v3, Lcom/uyumao/d;->k:Lorg/json/JSONObject;

    .line 84
    invoke-static {v1, v9, v2, v3}, Lcom/uyumao/g;->a(Landroid/content/Context;ILcom/uyumao/g$a;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    goto/16 :goto_6

    .line 85
    :pswitch_2
    invoke-static {}, Lcom/uyumao/e;->b()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_9

    return-void

    .line 86
    :cond_9
    sget-boolean v2, Lcom/uyumao/d;->e:Z

    if-nez v2, :cond_a

    return-void

    :cond_a
    if-eqz v1, :cond_1a

    .line 87
    instance-of v2, v1, Lorg/json/JSONObject;

    if-eqz v2, :cond_1a

    .line 88
    :try_start_4
    sget-object v2, Lcom/uyumao/d;->g:Landroid/content/Context;

    invoke-static {v2}, Lcom/uyumao/e;->a(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 89
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-gtz v3, :cond_b

    goto :goto_2

    .line 90
    :cond_b
    check-cast v1, Lorg/json/JSONObject;

    .line 91
    sget-object v3, Lcom/uyumao/d;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/uyumao/d;->a(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v3

    .line 92
    invoke-static {v3, v1}, Lcom/uyumao/d;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    const-string v1, "bs"

    .line 93
    :try_start_5
    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 94
    :try_start_6
    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-object v10, v4

    .line 95
    :catchall_2
    :try_start_7
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 96
    new-instance v2, Lcom/uyumao/d$c;

    invoke-direct {v2, v0, v1}, Lcom/uyumao/d$c;-><init>(Lcom/uyumao/d;Ljava/lang/String;)V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v11, v12, v1}, Lcom/uyumao/s;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    goto/16 :goto_6

    :cond_c
    :goto_2
    return-void

    .line 97
    :pswitch_3
    invoke-static {}, Lcom/uyumao/e;->b()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_d

    return-void

    :cond_d
    if-eqz v1, :cond_1a

    .line 98
    instance-of v2, v1, Lorg/json/JSONObject;

    if-eqz v2, :cond_1a

    .line 99
    :try_start_8
    sget-boolean v2, Lcom/uyumao/d;->c:Z

    if-eqz v2, :cond_e

    .line 100
    sget-object v2, Lcom/uyumao/d;->g:Landroid/content/Context;

    invoke-static {v2}, Lcom/uyumao/e;->e(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object v2

    goto :goto_3

    :cond_e
    move-object v2, v10

    .line 101
    :goto_3
    sget-boolean v3, Lcom/uyumao/d;->d:Z

    if-eqz v3, :cond_f

    .line 102
    sget-object v3, Lcom/uyumao/d;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/uyumao/e;->f(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object v3

    goto :goto_4

    :cond_f
    move-object v3, v10

    :goto_4
    if-nez v2, :cond_10

    if-nez v3, :cond_10

    return-void

    .line 103
    :cond_10
    check-cast v1, Lorg/json/JSONObject;

    .line 104
    sget-object v4, Lcom/uyumao/d;->g:Landroid/content/Context;

    invoke-static {v4}, Lcom/uyumao/d;->a(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v4

    .line 105
    invoke-static {v4, v1}, Lcom/uyumao/d;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    const-string v1, "wifi"

    const-string v5, "wifi_list"

    .line 106
    :try_start_9
    new-instance v6, Lorg/json/JSONObject;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    if-eqz v2, :cond_11

    .line 107
    :try_start_a
    invoke-virtual {v6, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_11
    if-eqz v3, :cond_12

    .line 108
    invoke-virtual {v6, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catchall_3
    :cond_12
    move-object v10, v6

    .line 109
    :catchall_4
    :try_start_b
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 110
    new-instance v2, Lcom/uyumao/d$b;

    invoke-direct {v2, v0, v1}, Lcom/uyumao/d$b;-><init>(Lcom/uyumao/d;Ljava/lang/String;)V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v11, v12, v1}, Lcom/uyumao/s;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    goto/16 :goto_6

    .line 111
    :cond_13
    sget-object v2, Lcom/uyumao/d;->i:Lorg/json/JSONObject;

    if-nez v2, :cond_14

    sget-object v2, Lcom/uyumao/d;->j:Lorg/json/JSONObject;

    if-nez v2, :cond_14

    return-void

    :cond_14
    if-eqz v1, :cond_1a

    .line 112
    instance-of v1, v1, Lorg/json/JSONObject;

    if-eqz v1, :cond_1a

    .line 113
    :try_start_c
    sget-object v1, Lcom/uyumao/d;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/uyumao/d;->a(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v1

    .line 114
    sget-object v2, Lcom/uyumao/d;->k:Lorg/json/JSONObject;

    invoke-static {v1, v2}, Lcom/uyumao/d;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 115
    sget-object v2, Lcom/uyumao/d;->i:Lorg/json/JSONObject;

    sget-object v3, Lcom/uyumao/d;->j:Lorg/json/JSONObject;

    invoke-static {v2, v3}, Lcom/uyumao/e;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    move-result-object v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    const-string v3, "lbs"

    .line 116
    :try_start_d
    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 117
    :try_start_e
    invoke-virtual {v4, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :catchall_5
    move-object v10, v4

    .line 118
    :catchall_6
    :try_start_f
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 119
    new-instance v2, Lcom/uyumao/d$d;

    invoke-direct {v2, v0, v1}, Lcom/uyumao/d$d;-><init>(Lcom/uyumao/d;Ljava/lang/String;)V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v11, v12, v1}, Lcom/uyumao/s;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    goto :goto_6

    .line 120
    :cond_15
    sget-boolean v1, Lcom/uyumao/d;->l:Z

    if-eqz v1, :cond_16

    return-void

    .line 121
    :cond_16
    sget-object v1, Lcom/uyumao/d;->g:Landroid/content/Context;

    sget-object v2, Lcom/uyumao/d;->n:Landroid/location/LocationListener;

    if-eqz v1, :cond_19

    if-nez v2, :cond_17

    goto :goto_5

    .line 122
    :cond_17
    :try_start_10
    invoke-static {v1, v8}, Lcom/uyumao/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 123
    invoke-static {v1, v7}, Lcom/uyumao/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 124
    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    if-nez v1, :cond_18

    goto :goto_5

    .line 125
    :cond_18
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 126
    :catchall_7
    :cond_19
    :goto_5
    sput-object v10, Lcom/uyumao/d;->j:Lorg/json/JSONObject;

    .line 127
    sget-object v1, Lcom/uyumao/d;->g:Landroid/content/Context;

    .line 128
    sget-object v2, Lcom/uyumao/d$e;->a:Lcom/uyumao/d;

    .line 129
    sget-object v3, Lcom/uyumao/d;->k:Lorg/json/JSONObject;

    .line 130
    invoke-static {v1, v9, v2, v3}, Lcom/uyumao/g;->a(Landroid/content/Context;ILcom/uyumao/g$a;Ljava/lang/Object;)V

    :catchall_8
    :cond_1a
    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
