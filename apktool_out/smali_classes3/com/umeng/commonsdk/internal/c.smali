.class public Lcom/umeng/commonsdk/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/framework/UMLogDataProtocol;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String; = "preInitInvokedFlag"

.field public static final c:Ljava/lang/String; = "policyGrantInvokedFlag"

.field public static final d:Ljava/lang/String; = "policyGrantResult"

.field private static f:I = 0x1

.field private static g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static h:Ljava/lang/reflect/Method;

.field private static i:Ljava/lang/reflect/Method;

.field private static j:Ljava/lang/reflect/Method;

.field private static volatile k:Ljava/lang/String;

.field private static volatile l:Ljava/lang/String;

.field private static m:Z


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/au;->b()Lcom/umeng/analytics/pro/au;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "upg"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/au;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->a:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->g:Ljava/lang/Class;

    .line 15
    .line 16
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->h:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->j:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->k:Ljava/lang/String;

    .line 25
    .line 26
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->l:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    sput-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    .line 30
    .line 31
    invoke-static {}, Lcom/umeng/commonsdk/internal/c;->c()V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 11
    .line 12
    :cond_0
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic a(Lcom/umeng/commonsdk/internal/c;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    return-object p0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 21
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .line 8
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "appkey"

    .line 9
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/service/UMGlobalContext;

    move-result-object v2

    invoke-virtual {v2}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppkey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "app_version"

    .line 10
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/service/UMGlobalContext;

    move-result-object v2

    invoke-virtual {v2}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "os"

    .line 11
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Android"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    sget-object v1, Lcom/umeng/commonsdk/statistics/UMServerURL;->ZCFG_PATH:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->buildZeroEnvelopeWithExtHeader(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "MobclickRT"

    if-eqz p1, :cond_0

    :try_start_1
    const-string v1, "exception"

    .line 13
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587\u5931\u8d25."

    .line 14
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587 \u6210\u529f!!!"

    .line 15
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 19
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/umeng/commonsdk/internal/c$2;

    invoke-direct {v1, p0, p1}, Lcom/umeng/commonsdk/internal/c$2;-><init>(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 20
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 2

    .line 16
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/umeng/commonsdk/internal/c$1;

    invoke-direct {v1, p0, p1}, Lcom/umeng/commonsdk/internal/c$1;-><init>(Landroid/content/Context;Z)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->l:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->g:Ljava/lang/Class;

    const-string v1, ""

    if-eqz v0, :cond_1

    sget-object v2, Lcom/umeng/commonsdk/internal/c;->h:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    sget-object v3, Lcom/umeng/commonsdk/internal/c;->j:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    :try_start_0
    new-array v4, v3, [Ljava/lang/Object;

    .line 4
    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    sget-object v2, Lcom/umeng/commonsdk/internal/c;->j:Ljava/lang/reflect/Method;

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->l:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-object v1, v0

    :catchall_1
    :cond_1
    return-object v1
.end method

.method private b(Landroid/content/Context;)V
    .locals 5

    const-string v0, "umid"

    :try_start_0
    const-string v1, ""

    .line 7
    invoke-static {p1, v0, v1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "appkey"

    .line 9
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/service/UMGlobalContext;

    move-result-object v4

    invoke-virtual {v4}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppkey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->SILENT_HEART_BEAT:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, v2, v1, v0}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->buildSilentEnvelopeWithExtHeader(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "MobclickRT"

    if-eqz p1, :cond_0

    :try_start_1
    const-string v1, "exception"

    .line 12
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "--->>> \u6784\u5efa\u5fc3\u8df3\u62a5\u6587\u5931\u8d25."

    .line 13
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "--->>> \u6784\u5efa\u5fc3\u8df3\u62a5\u6587 \u6210\u529f!!!"

    .line 14
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method private static c()V
    .locals 5

    .line 1
    :try_start_0
    const-class v0, Lcom/umeng/umzid/ZIDManager;

    .line 2
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->g:Ljava/lang/Class;

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    .line 3
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->h:Ljava/lang/reflect/Method;

    .line 5
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->g:Ljava/lang/Class;

    const-string v1, "getZID"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const-class v4, Landroid/content/Context;

    aput-object v4, v3, v2

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/reflect/Method;

    .line 7
    :cond_1
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->g:Ljava/lang/Class;

    const-string v1, "getSDKVersion"

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->j:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method

.method private static c(Landroid/content/Context;)V
    .locals 1

    const-string v0, "header_device_oaid"

    .line 9
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    new-instance v0, Lcom/umeng/commonsdk/internal/c$3;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/internal/c$3;-><init>(Landroid/content/Context;)V

    .line 11
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/c;->a(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V

    :cond_0
    return-void
.end method

.method private d()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/bk;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/bk;

    move-result-object v0

    const-string v1, "stf"

    .line 2
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/bk;->a(Ljava/lang/String;)Lcom/umeng/analytics/pro/bl;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u6210\u771f\u6b63\u4fe1\u5c01\u3002"

    const-string v4, "MobclickRT"

    .line 3
    invoke-static {v4, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :try_start_0
    iget-object v3, v2, Lcom/umeng/analytics/pro/bl;->a:Ljava/lang/String;

    .line 5
    iget-object v10, v2, Lcom/umeng/analytics/pro/bl;->b:Ljava/lang/String;

    .line 6
    new-instance v7, Lorg/json/JSONObject;

    iget-object v5, v2, Lcom/umeng/analytics/pro/bl;->c:Ljava/lang/String;

    invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 7
    new-instance v8, Lorg/json/JSONObject;

    iget-object v5, v2, Lcom/umeng/analytics/pro/bl;->d:Ljava/lang/String;

    invoke-direct {v8, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 8
    iget-object v9, v2, Lcom/umeng/analytics/pro/bl;->e:Ljava/lang/String;

    .line 9
    iget-object v11, v2, Lcom/umeng/analytics/pro/bl;->f:Ljava/lang/String;

    .line 10
    new-instance v5, Lcom/umeng/commonsdk/statistics/b;

    invoke-direct {v5}, Lcom/umeng/commonsdk/statistics/b;-><init>()V

    .line 11
    iget-object v2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual/range {v5 .. v11}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v5, "exception"

    .line 12
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u771f\u6b63\u4fe1\u5c01 \u5931\u8d25\u3002\u5220\u9664\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55"

    .line 13
    invoke-static {v4, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v2, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u771f\u6b63\u4fe1\u5c01 \u6210\u529f! \u5220\u9664\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u3002"

    .line 14
    invoke-static {v4, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    :goto_0
    invoke-virtual {v0, v1, v3}, Lcom/umeng/analytics/pro/bk;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/bk;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 10

    if-nez p1, :cond_0

    return-void

    .line 17
    :cond_0
    sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->RTD_SP_FILE:Ljava/lang/String;

    const-string v1, "debugkey"

    invoke-static {p1, v0, v1}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "startTime"

    .line 19
    invoke-static {p1, v0, v3}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "period"

    .line 20
    invoke-static {p1, v0, v4}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const-wide/16 v5, 0x0

    if-nez v4, :cond_1

    .line 22
    :try_start_0
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :cond_1
    move-wide v3, v5

    .line 23
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 24
    :try_start_1
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    :cond_2
    move-wide v7, v5

    :goto_1
    cmp-long v0, v3, v5

    const-string v9, "MobclickRT"

    if-eqz v0, :cond_5

    cmp-long v0, v7, v5

    if-nez v0, :cond_3

    goto :goto_2

    .line 25
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v3

    const-wide/16 v3, 0x3c

    mul-long/2addr v7, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v7, v3

    cmp-long v0, v5, v7

    if-lez v0, :cond_4

    const-string v0, "--->>> [RTD]\u672c\u5730\u7f13\u5b58dk\u503c\u5df2\u7ecf\u8d85\u65f6\uff0c\u6e05\u9664\u7f13\u5b58\u6570\u636e\u3002"

    .line 26
    invoke-static {v9, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->RTD_SP_FILE:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 28
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 29
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->turnOffRealTimeDebug()V

    goto :goto_3

    .line 30
    :cond_4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 31
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "--->>> [RTD]\u672c\u5730\u7f13\u5b58dk\u503c\u5728\u6709\u6548\u671f\u5185\uff0c\u5207\u6362\u5230\u57cb\u70b9\u9a8c\u8bc1\u6a21\u5f0f\u3002"

    .line 33
    invoke-static {v9, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-static {p1}, Lcom/umeng/analytics/AnalyticsConfig;->turnOnRealTimeDebug(Ljava/util/Map;)V

    goto :goto_3

    :cond_5
    :goto_2
    const-string v0, "--->>> [RTD]\u672c\u5730\u7f13\u5b58startTime\u6216\u8005duration\u503c\u65e0\u6548\uff0c\u6e05\u9664\u7f13\u5b58\u6570\u636e"

    .line 35
    invoke-static {v9, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    sget-object v0, Lcom/umeng/analytics/AnalyticsConfig;->RTD_SP_FILE:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_6
    :goto_3
    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    const-string v1, "header_device_oaid"

    if-nez v0, :cond_0

    .line 2
    invoke-static {v1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 3
    sput-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    .line 4
    new-instance v0, Lcom/umeng/commonsdk/internal/c$4;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/internal/c$4;-><init>(Lcom/umeng/commonsdk/internal/c;)V

    .line 5
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/c;->a(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 7
    sput-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    :cond_1
    :goto_0
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 10

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 9
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    const-string v1, "com.umeng.umzid.ZIDManager"

    .line 10
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/c;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getInstance"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    .line 11
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_0

    new-array v4, v3, [Ljava/lang/Object;

    .line 12
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v4, "com.umeng.umzid.IZIDCompletionCallback"

    .line 13
    invoke-static {v4}, Lcom/umeng/commonsdk/internal/c;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "init"

    const/4 v6, 0x3

    new-array v7, v6, [Ljava/lang/Class;

    .line 14
    const-class v8, Landroid/content/Context;

    aput-object v8, v7, v3

    const-class v8, Ljava/lang/String;

    const/4 v9, 0x1

    aput-object v8, v7, v9

    const/4 v8, 0x2

    aput-object v4, v7, v8

    invoke-virtual {v1, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_0

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v3

    aput-object p1, v4, v9

    const/4 p1, 0x0

    aput-object p1, v4, v8

    .line 15
    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private f()V
    .locals 3

    const-string v0, "header_device_oaid"

    .line 1
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    .line 3
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigureImpl;->registerInterruptFlag()V

    .line 4
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/UMConfigureImpl;->init(Landroid/content/Context;)V

    .line 5
    sget v1, Lcom/umeng/commonsdk/internal/c;->f:I

    add-int/2addr v1, v0

    sput v1, Lcom/umeng/commonsdk/internal/c;->f:I

    const-string v1, "MobclickRT"

    const-string v2, "--->>> \u8981\u8bfb\u53d6 oaid\uff0c\u9700\u7b49\u5f85\u8bfb\u53d6\u7ed3\u679c."

    .line 6
    invoke-static {v1, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    new-instance v1, Lcom/umeng/commonsdk/internal/c$5;

    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/internal/c$5;-><init>(Lcom/umeng/commonsdk/internal/c;)V

    .line 8
    invoke-static {v1}, Lcom/umeng/commonsdk/UMConfigureImpl;->registerMessageSendListener(Lcom/umeng/commonsdk/utils/onMessageSendListener;)V

    .line 9
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/c;->a(Landroid/content/Context;Z)V

    :cond_0
    return-void
.end method

.method private static f(Landroid/content/Context;)V
    .locals 2

    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    .line 11
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Lcom/umeng/analytics/pro/bm;->l:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    .line 13
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    .line 1
    sget v0, Lcom/umeng/commonsdk/internal/c;->f:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->h()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/internal/c;->e(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    :cond_0
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

.method private h()V
    .locals 7

    .line 1
    const-string v0, "MobclickRT"

    .line 2
    .line 3
    const-string v1, "--->>> \u771f\u5b9e\u6784\u5efa\u6761\u4ef6\u6ee1\u8db3\uff0c\u5f00\u59cb\u6784\u5efa\u4e1a\u52a1\u4fe1\u5c01\u3002"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/c;->f(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/umeng/commonsdk/UMInnerManager;->sendInnerPackage(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "ccg_switch"

    .line 27
    .line 28
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    sget v0, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 47
    .line 48
    const v2, 0x8025

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const/4 v4, 0x0

    .line 60
    const-wide/16 v5, 0x1388

    .line 61
    .line 62
    invoke-static/range {v1 .. v6}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    .line 63
    .line 64
    .line 65
    :cond_0
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 66
    .line 67
    const/16 v1, 0x2010

    .line 68
    .line 69
    invoke-static {v0}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-static {v0, v1, v2, v3}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const v2, 0x8011

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v2, v1, v3}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    return-void
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
.method public a()Ljava/lang/String;
    .locals 6

    .line 2
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->k:Ljava/lang/String;

    return-object v0

    .line 4
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->g:Ljava/lang/Class;

    const-string v1, ""

    if-eqz v0, :cond_1

    sget-object v2, Lcom/umeng/commonsdk/internal/c;->h:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    sget-object v3, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    :try_start_0
    new-array v4, v3, [Ljava/lang/Object;

    .line 5
    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    sget-object v2, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/reflect/Method;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    aput-object v5, v4, v3

    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    :try_start_1
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->k:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-object v1, v0

    :catchall_1
    :cond_1
    return-object v1
.end method

.method public removeCacheData(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public setupReportData(J)Lorg/json/JSONObject;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public workEvent(Ljava/lang/Object;I)V
    .locals 12

    .line 1
    const-string v0, "cl_count"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "[internal] workEvent"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    aput-object v3, v2, v4

    .line 10
    .line 11
    const-string v3, "walle"

    .line 12
    .line 13
    invoke-static {v3, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/umeng/commonsdk/utils/c;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-string v5, "MobclickRT"

    .line 21
    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    const p1, 0x8022

    .line 25
    .line 26
    .line 27
    if-ne p1, p2, :cond_2

    .line 28
    .line 29
    const-string p1, "--->>> \u9759\u9ed8\u6a21\u5f0f\uff1a\u8fdb\u5165\u5fc3\u8df3\u5904\u7406\u903b\u8f91!"

    .line 30
    .line 31
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/umeng/commonsdk/utils/c;->b(Landroid/content/Context;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    iget-object v2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {v2}, Lcom/umeng/commonsdk/utils/c;->e(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iget-object v3, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 51
    .line 52
    invoke-static {v3}, Lcom/umeng/commonsdk/utils/c;->a(Landroid/content/Context;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v0, v1, p1, p2, v3}, Lcom/umeng/commonsdk/utils/c;->a(JJI)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 63
    .line 64
    sget-object p2, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_Silent:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    .line 65
    .line 66
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/framework/UMFrUtils;->hasEnvelopeFile(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_0

    .line 71
    .line 72
    const-string p1, "--->>> \u6784\u5efa\u9759\u9ed8\u5fc3\u8df3\u4fe1\u5c01."

    .line 73
    .line 74
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 78
    .line 79
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/c;->b(Landroid/content/Context;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const-string p1, "--->>> \u9759\u9ed8\u5fc3\u8df3\u4fe1\u5c01\u6587\u4ef6\u5df2\u5b58\u5728\uff0c\u5c1d\u8bd5\u53d1\u9001\u4e4b!"

    .line 84
    .line 85
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 89
    .line 90
    invoke-static {p1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->registerNetReceiver(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    if-nez v2, :cond_2

    .line 94
    .line 95
    const-string p1, "--->>> send REBUILD_DB msg in silent mode."

    .line 96
    .line 97
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v6, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 101
    .line 102
    const/16 v7, 0x1105

    .line 103
    .line 104
    invoke-static {v6}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const/4 v9, 0x0

    .line 109
    const-wide/16 v10, 0x7d0

    .line 110
    .line 111
    invoke-static/range {v6 .. v11}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    .line 112
    .line 113
    .line 114
    :cond_2
    return-void

    .line 115
    :cond_3
    const-class v2, Ljava/lang/String;

    .line 116
    .line 117
    const-string v6, "[internal] workEvent send envelope"

    .line 118
    .line 119
    const-string v7, "policyGrantResult"

    .line 120
    .line 121
    const-class v8, Landroid/content/Context;

    .line 122
    .line 123
    const/4 v9, 0x2

    .line 124
    packed-switch p2, :pswitch_data_0

    .line 125
    .line 126
    .line 127
    :pswitch_0
    goto/16 :goto_2

    .line 128
    .line 129
    :pswitch_1
    const-string p1, "recv CLOUD_CONFIG_TRIGGER msg."

    .line 130
    .line 131
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    new-instance p1, Lcom/umeng/commonsdk/internal/c$6;

    .line 135
    .line 136
    invoke-direct {p1, p0}, Lcom/umeng/commonsdk/internal/c$6;-><init>(Lcom/umeng/commonsdk/internal/c;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Lcom/umeng/ccg/CcgAgent;->registerConfigListener(Lcom/umeng/ccg/ConfigListener;)V

    .line 140
    .line 141
    .line 142
    :try_start_0
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 143
    .line 144
    invoke-static {p1}, Lcom/umeng/analytics/pro/ar;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-eqz p1, :cond_5

    .line 149
    .line 150
    const-wide/16 v1, 0x0

    .line 151
    .line 152
    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v1

    .line 156
    const-wide v3, 0x7fffffffffffffffL

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    cmp-long p2, v1, v3

    .line 162
    .line 163
    if-gez p2, :cond_4

    .line 164
    .line 165
    const-wide/16 v3, 0x1

    .line 166
    .line 167
    add-long/2addr v1, v3

    .line 168
    :cond_4
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 177
    .line 178
    .line 179
    :cond_5
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 180
    .line 181
    invoke-static {p1}, Lcom/umeng/ccg/CcgAgent;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 182
    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :pswitch_2
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 187
    .line 188
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/c;->d(Landroid/content/Context;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_2

    .line 192
    .line 193
    :pswitch_3
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 194
    .line 195
    const-string p2, "connectivity"

    .line 196
    .line 197
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 202
    .line 203
    if-eqz p1, :cond_8

    .line 204
    .line 205
    :try_start_1
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-eqz p1, :cond_7

    .line 210
    .line 211
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-eqz p1, :cond_6

    .line 216
    .line 217
    const-string p1, "--->>> network state changed: Available"

    .line 218
    .line 219
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 223
    .line 224
    .line 225
    invoke-static {v1}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V

    .line 226
    .line 227
    .line 228
    goto/16 :goto_2

    .line 229
    .line 230
    :cond_6
    const-string p1, "--->>> network state changed: unAvailable"

    .line 231
    .line 232
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v4}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 236
    .line 237
    .line 238
    invoke-static {v4}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_2

    .line 242
    .line 243
    :cond_7
    const-string p1, "--->>> NetworkInfo is null!"

    .line 244
    .line 245
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v4}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 249
    .line 250
    .line 251
    invoke-static {v4}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 252
    .line 253
    .line 254
    goto/16 :goto_2

    .line 255
    .line 256
    :catchall_0
    invoke-static {v4}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 257
    .line 258
    .line 259
    invoke-static {v4}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :cond_8
    const-string p1, "--->>> ConnectivityManager is null!"

    .line 265
    .line 266
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v4}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 270
    .line 271
    .line 272
    invoke-static {v4}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_2

    .line 276
    .line 277
    :pswitch_4
    :try_start_2
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 278
    .line 279
    invoke-static {p1}, Lcom/umeng/commonsdk/debug/SelfChecker;->doCheck(Landroid/content/Context;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 280
    .line 281
    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :pswitch_5
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 285
    .line 286
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    new-instance p2, Ljava/io/File;

    .line 291
    .line 292
    new-instance v0, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    sget-object p1, Lcom/umeng/analytics/pro/bm;->m:Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-eqz p1, :cond_12

    .line 326
    .line 327
    :try_start_3
    invoke-virtual {p2}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 328
    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :pswitch_6
    const-string p2, "--->>> \u4fdd\u5b58preInit\u6267\u884c\u7ed3\u679c\u53ca\u6388\u6743API\u662f\u5426\u8c03\u7528\u7ed3\u679c."

    .line 333
    .line 334
    invoke-static {v5, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    instance-of p2, p1, Lorg/json/JSONObject;

    .line 338
    .line 339
    if-eqz p2, :cond_12

    .line 340
    .line 341
    check-cast p1, Lorg/json/JSONObject;

    .line 342
    .line 343
    const-string p2, "preInitInvoked"

    .line 344
    .line 345
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_12

    .line 350
    .line 351
    :try_start_4
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 352
    .line 353
    .line 354
    move-result p2

    .line 355
    const-string v0, "policyGrantInvoked"

    .line 356
    .line 357
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 366
    .line 367
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    sget-object v2, Lcom/umeng/commonsdk/internal/c;->a:Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    if-eqz v1, :cond_9

    .line 378
    .line 379
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    if-eqz v1, :cond_9

    .line 384
    .line 385
    const-string v2, "preInitInvokedFlag"

    .line 386
    .line 387
    invoke-interface {v1, v2, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 388
    .line 389
    .line 390
    const-string p2, "policyGrantInvokedFlag"

    .line 391
    .line 392
    invoke-interface {v1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 393
    .line 394
    .line 395
    invoke-interface {v1, v7, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 396
    .line 397
    .line 398
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 399
    .line 400
    .line 401
    :cond_9
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 402
    .line 403
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    new-instance p2, Ljava/io/File;

    .line 408
    .line 409
    new-instance v0, Ljava/lang/StringBuilder;

    .line 410
    .line 411
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    sget-object p1, Lcom/umeng/analytics/pro/bm;->m:Ljava/lang/String;

    .line 427
    .line 428
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 439
    .line 440
    .line 441
    move-result p1

    .line 442
    if-nez p1, :cond_12

    .line 443
    .line 444
    invoke-virtual {p2}, Ljava/io/File;->createNewFile()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 445
    .line 446
    .line 447
    goto/16 :goto_2

    .line 448
    .line 449
    :pswitch_7
    const-string p2, "--->>> \u4fdd\u5b58\u9690\u79c1\u6388\u6743\u7ed3\u679c."

    .line 450
    .line 451
    invoke-static {v5, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    :try_start_5
    instance-of p2, p1, Ljava/lang/Integer;

    .line 455
    .line 456
    if-eqz p2, :cond_12

    .line 457
    .line 458
    check-cast p1, Ljava/lang/Integer;

    .line 459
    .line 460
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 461
    .line 462
    .line 463
    move-result p1

    .line 464
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 465
    .line 466
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 467
    .line 468
    .line 469
    move-result-object p2

    .line 470
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->a:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {p2, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 473
    .line 474
    .line 475
    move-result-object p2

    .line 476
    if-eqz p2, :cond_12

    .line 477
    .line 478
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 479
    .line 480
    .line 481
    move-result-object p2

    .line 482
    invoke-interface {p2, v7, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 487
    .line 488
    .line 489
    goto/16 :goto_2

    .line 490
    .line 491
    :pswitch_8
    const-string p1, "--->>> \u6b63\u5e38\u51b7\u542f\u52a8\u6d41\u7a0b\uff0c\u63a5\u6536\u5230\u4e91\u63a7\u914d\u7f6e\u52a0\u8f7d\u6210\u529f\u901a\u77e5\u3002"

    .line 492
    .line 493
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 497
    .line 498
    invoke-static {p1}, Lcom/umeng/commonsdk/UMInnerManager;->sendInnerPackage(Landroid/content/Context;)V

    .line 499
    .line 500
    .line 501
    const-string p1, "ccg_switch"

    .line 502
    .line 503
    invoke-static {p1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    .line 504
    .line 505
    .line 506
    move-result p1

    .line 507
    if-nez p1, :cond_a

    .line 508
    .line 509
    sget p1, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    .line 510
    .line 511
    if-nez p1, :cond_a

    .line 512
    .line 513
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 514
    .line 515
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 516
    .line 517
    .line 518
    move-result p1

    .line 519
    if-eqz p1, :cond_a

    .line 520
    .line 521
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 522
    .line 523
    const v1, 0x8025

    .line 524
    .line 525
    .line 526
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    invoke-virtual {p1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    const/4 v3, 0x0

    .line 535
    const-wide/16 v4, 0x1388

    .line 536
    .line 537
    invoke-static/range {v0 .. v5}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    .line 538
    .line 539
    .line 540
    :cond_a
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 541
    .line 542
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/c;->e(Landroid/content/Context;)V

    .line 543
    .line 544
    .line 545
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->saveSDKComponent()V

    .line 546
    .line 547
    .line 548
    goto/16 :goto_2

    .line 549
    .line 550
    :pswitch_9
    const-string p1, "--->>> \u6210\u529f\u63a5\u6536\u5230(OAID)\u8bfb\u53d6\u7ed3\u675f\u901a\u77e5\u3002"

    .line 551
    .line 552
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    sget p1, Lcom/umeng/commonsdk/internal/c;->f:I

    .line 556
    .line 557
    sub-int/2addr p1, v1

    .line 558
    sput p1, Lcom/umeng/commonsdk/internal/c;->f:I

    .line 559
    .line 560
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->g()V

    .line 561
    .line 562
    .line 563
    goto/16 :goto_2

    .line 564
    .line 565
    :pswitch_a
    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0\uff0c\u89e6\u53d1 \u4f2a\u51b7\u542f\u52a8\u3002"

    .line 566
    .line 567
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    invoke-static {}, Lcom/umeng/commonsdk/statistics/b;->a()V

    .line 571
    .line 572
    .line 573
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->e()V

    .line 574
    .line 575
    .line 576
    const-string p1, "header_foreground_count"

    .line 577
    .line 578
    invoke-static {p1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    .line 579
    .line 580
    .line 581
    move-result p1

    .line 582
    if-eqz p1, :cond_b

    .line 583
    .line 584
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->eventHasExist()Z

    .line 585
    .line 586
    .line 587
    move-result p1

    .line 588
    if-nez p1, :cond_b

    .line 589
    .line 590
    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0 \u524d\u53f0\u8ba1\u6570\u5668\u529f\u80fd \u6253\u5f00\uff0c\u89e6\u53d1 5\u79d2\u5468\u671f\u68c0\u67e5\u673a\u5236"

    .line 591
    .line 592
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    iget-object v6, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 596
    .line 597
    const/16 v7, 0x2015

    .line 598
    .line 599
    invoke-static {v6}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    .line 600
    .line 601
    .line 602
    move-result-object v8

    .line 603
    const/4 v9, 0x0

    .line 604
    const-wide/16 v10, 0x1388

    .line 605
    .line 606
    invoke-static/range {v6 .. v11}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEventEx(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    .line 607
    .line 608
    .line 609
    :cond_b
    const-string p1, "header_first_resume"

    .line 610
    .line 611
    invoke-static {p1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    .line 612
    .line 613
    .line 614
    move-result p1

    .line 615
    if-eqz p1, :cond_12

    .line 616
    .line 617
    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0 FirstResume\u529f\u80fd \u6253\u5f00\uff0c\u89e6\u53d1 trigger"

    .line 618
    .line 619
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 623
    .line 624
    invoke-static {p1}, Lcom/umeng/analytics/pro/l;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/l;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 629
    .line 630
    invoke-virtual {p1, p2}, Lcom/umeng/analytics/pro/l;->b(Landroid/content/Context;)V

    .line 631
    .line 632
    .line 633
    goto/16 :goto_2

    .line 634
    .line 635
    :pswitch_b
    :try_start_6
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\u52a8\u4f5c\u3002"

    .line 636
    .line 637
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 641
    .line 642
    invoke-static {p1, v4}, Lcom/umeng/commonsdk/stateless/d;->a(Landroid/content/Context;Z)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object p1

    .line 646
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 647
    .line 648
    invoke-static {p2, v1}, Lcom/umeng/commonsdk/stateless/d;->a(Landroid/content/Context;Z)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object p2

    .line 652
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-nez v0, :cond_c

    .line 657
    .line 658
    new-instance v0, Ljava/io/File;

    .line 659
    .line 660
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 664
    .line 665
    .line 666
    move-result p1

    .line 667
    if-eqz p1, :cond_c

    .line 668
    .line 669
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 670
    .line 671
    .line 672
    move-result p1

    .line 673
    if-eqz p1, :cond_c

    .line 674
    .line 675
    move v4, v1

    .line 676
    :cond_c
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 677
    .line 678
    .line 679
    move-result p1

    .line 680
    if-nez p1, :cond_d

    .line 681
    .line 682
    new-instance p1, Ljava/io/File;

    .line 683
    .line 684
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 688
    .line 689
    .line 690
    move-result p2

    .line 691
    if-eqz p2, :cond_d

    .line 692
    .line 693
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 694
    .line 695
    .line 696
    move-result p1

    .line 697
    if-eqz p1, :cond_d

    .line 698
    .line 699
    goto :goto_1

    .line 700
    :cond_d
    move v1, v4

    .line 701
    :goto_1
    if-eqz v1, :cond_f

    .line 702
    .line 703
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->a()Z

    .line 704
    .line 705
    .line 706
    move-result p1

    .line 707
    if-nez p1, :cond_e

    .line 708
    .line 709
    new-instance p1, Lcom/umeng/commonsdk/stateless/b;

    .line 710
    .line 711
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 712
    .line 713
    invoke-direct {p1, p2}, Lcom/umeng/commonsdk/stateless/b;-><init>(Landroid/content/Context;)V

    .line 714
    .line 715
    .line 716
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->b()V

    .line 717
    .line 718
    .line 719
    goto/16 :goto_2

    .line 720
    .line 721
    :cond_e
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\uff0cSender\u5df2\u521b\u5efa\uff0c\u4e0d\u9700\u8981\u5904\u7406\u3002"

    .line 722
    .line 723
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    goto/16 :goto_2

    .line 727
    .line 728
    :cond_f
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\uff0c\u6ca1\u6709\u9700\u8981\u5904\u7406\u7684\u76ee\u5f55\uff0c\u4e0d\u9700\u8981\u5904\u7406\u3002"

    .line 729
    .line 730
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 731
    .line 732
    .line 733
    goto/16 :goto_2

    .line 734
    .line 735
    :pswitch_c
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 736
    .line 737
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->buildEnvelope(Landroid/content/Context;Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    goto/16 :goto_2

    .line 741
    .line 742
    :pswitch_d
    const-string p1, "--->>> [\u6709\u72b6\u6001]\u63a5\u6536\u5230\u6d88\u8d39\u4e8c\u7ea7\u7f13\u5b58\u6570\u636e\u901a\u77e5."

    .line 743
    .line 744
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 748
    .line 749
    invoke-static {p1}, Lcom/umeng/analytics/pro/bk;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/bk;

    .line 750
    .line 751
    .line 752
    move-result-object p1

    .line 753
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bk;->c()Z

    .line 754
    .line 755
    .line 756
    move-result p1

    .line 757
    if-eqz p1, :cond_10

    .line 758
    .line 759
    const-string p1, "--->>> [\u6709\u72b6\u6001]\u5df2\u6d88\u8d39\u5b8c\u6bd5,\u4e8c\u7ea7\u7f13\u5b58\u6570\u636e\u5e93\u4e3a\u7a7a."

    .line 760
    .line 761
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    return-void

    .line 765
    :cond_10
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->d()V

    .line 766
    .line 767
    .line 768
    const p1, 0x8011

    .line 769
    .line 770
    .line 771
    invoke-static {p1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->eventHasExist(I)Z

    .line 772
    .line 773
    .line 774
    move-result p2

    .line 775
    if-nez p2, :cond_12

    .line 776
    .line 777
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 778
    .line 779
    invoke-static {p2}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v0}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    const/4 v1, 0x0

    .line 788
    invoke-static {p2, p1, v0, v1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    goto/16 :goto_2

    .line 792
    .line 793
    :pswitch_e
    const-string p1, "--->>> \u96f6\u53f7\u62a5\u6587\u6d41\u7a0b\uff0c\u63a5\u6536\u5230\u4e91\u63a7\u914d\u7f6e\u52a0\u8f7d\u6210\u529f\u901a\u77e5(\u6210\u529f\u6536\u5230\u96f6\u53f7\u62a5\u6587\u5e94\u7b54)\u3002"

    .line 794
    .line 795
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->f()V

    .line 799
    .line 800
    .line 801
    sget p1, Lcom/umeng/commonsdk/internal/c;->f:I

    .line 802
    .line 803
    sub-int/2addr p1, v1

    .line 804
    sput p1, Lcom/umeng/commonsdk/internal/c;->f:I

    .line 805
    .line 806
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->g()V

    .line 807
    .line 808
    .line 809
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->saveSDKComponent()V

    .line 810
    .line 811
    .line 812
    goto/16 :goto_2

    .line 813
    .line 814
    :pswitch_f
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 815
    .line 816
    sget-object p2, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_ZeroEnv:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    .line 817
    .line 818
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/framework/UMFrUtils;->hasEnvelopeFile(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    .line 819
    .line 820
    .line 821
    move-result p1

    .line 822
    if-nez p1, :cond_11

    .line 823
    .line 824
    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587"

    .line 825
    .line 826
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 830
    .line 831
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/c;->a(Landroid/content/Context;)V

    .line 832
    .line 833
    .line 834
    goto/16 :goto_2

    .line 835
    .line 836
    :cond_11
    const-string p1, "--->>> \u96f6\u53f7\u62a5\u6587\u4fe1\u5c01\u6587\u4ef6\u5df2\u5b58\u5728\uff0c\u5c1d\u8bd5\u53d1\u9001\u4e4b!"

    .line 837
    .line 838
    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    goto/16 :goto_2

    .line 842
    .line 843
    :pswitch_10
    check-cast p1, Lcom/umeng/commonsdk/vchannel/b;

    .line 844
    .line 845
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 846
    .line 847
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/vchannel/Sender;->handleEvent(Landroid/content/Context;Lcom/umeng/commonsdk/vchannel/b;)V

    .line 848
    .line 849
    .line 850
    goto/16 :goto_2

    .line 851
    .line 852
    :pswitch_11
    :try_start_7
    new-array p1, v1, [Ljava/lang/Object;

    .line 853
    .line 854
    aput-object v6, p1, v4

    .line 855
    .line 856
    invoke-static {v3, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    .line 858
    .line 859
    new-instance p1, Lorg/json/JSONObject;

    .line 860
    .line 861
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 862
    .line 863
    .line 864
    const-string p2, "i_sdk_v"

    .line 865
    .line 866
    const-string v0, "1.2.0"

    .line 867
    .line 868
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 869
    .line 870
    .line 871
    new-instance p2, Lorg/json/JSONObject;

    .line 872
    .line 873
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 874
    .line 875
    .line 876
    new-instance v0, Lorg/json/JSONObject;

    .line 877
    .line 878
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 879
    .line 880
    .line 881
    const-string v2, "inner"

    .line 882
    .line 883
    invoke-virtual {p2, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 884
    .line 885
    .line 886
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 887
    .line 888
    invoke-static {v0, p1, p2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->buildEnvelopeWithExtHeader(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 889
    .line 890
    .line 891
    move-result-object p1

    .line 892
    if-eqz p1, :cond_12

    .line 893
    .line 894
    const-string p2, "exception"

    .line 895
    .line 896
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 897
    .line 898
    .line 899
    move-result p1

    .line 900
    if-nez p1, :cond_12

    .line 901
    .line 902
    new-array p1, v1, [Ljava/lang/Object;

    .line 903
    .line 904
    const-string p2, "[internal] workEvent send envelope back, result is ok"

    .line 905
    .line 906
    aput-object p2, p1, v4

    .line 907
    .line 908
    invoke-static {v3, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 909
    .line 910
    .line 911
    goto/16 :goto_2

    .line 912
    .line 913
    :pswitch_12
    :try_start_8
    const-class p2, Lcom/umeng/commonsdk/internal/utils/InfoPreferenceAgent;

    .line 914
    .line 915
    const-string v0, "saveUA"

    .line 916
    .line 917
    new-array v3, v9, [Ljava/lang/Class;

    .line 918
    .line 919
    aput-object v8, v3, v4

    .line 920
    .line 921
    aput-object v2, v3, v1

    .line 922
    .line 923
    invoke-virtual {p2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    check-cast p1, Ljava/lang/String;

    .line 928
    .line 929
    new-array v2, v9, [Ljava/lang/Object;

    .line 930
    .line 931
    iget-object v3, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 932
    .line 933
    aput-object v3, v2, v4

    .line 934
    .line 935
    aput-object p1, v2, v1

    .line 936
    .line 937
    invoke-virtual {v0, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 938
    .line 939
    .line 940
    goto/16 :goto_2

    .line 941
    .line 942
    :pswitch_13
    if-eqz p1, :cond_12

    .line 943
    .line 944
    instance-of p2, p1, Lcom/umeng/commonsdk/internal/utils/b;

    .line 945
    .line 946
    if-eqz p2, :cond_12

    .line 947
    .line 948
    new-instance p2, Lorg/json/JSONObject;

    .line 949
    .line 950
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 951
    .line 952
    .line 953
    check-cast p1, Lcom/umeng/commonsdk/internal/utils/b;

    .line 954
    .line 955
    :try_start_9
    const-string v0, "le"

    .line 956
    .line 957
    iget v3, p1, Lcom/umeng/commonsdk/internal/utils/b;->a:I

    .line 958
    .line 959
    invoke-virtual {p2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 960
    .line 961
    .line 962
    const-string v0, "vol"

    .line 963
    .line 964
    iget v3, p1, Lcom/umeng/commonsdk/internal/utils/b;->b:I

    .line 965
    .line 966
    invoke-virtual {p2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 967
    .line 968
    .line 969
    const-string v0, "temp"

    .line 970
    .line 971
    iget v3, p1, Lcom/umeng/commonsdk/internal/utils/b;->c:I

    .line 972
    .line 973
    invoke-virtual {p2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 974
    .line 975
    .line 976
    const-string v0, "st"

    .line 977
    .line 978
    iget v3, p1, Lcom/umeng/commonsdk/internal/utils/b;->d:I

    .line 979
    .line 980
    invoke-virtual {p2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 981
    .line 982
    .line 983
    const-string v0, "ct"

    .line 984
    .line 985
    iget v3, p1, Lcom/umeng/commonsdk/internal/utils/b;->e:I

    .line 986
    .line 987
    invoke-virtual {p2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 988
    .line 989
    .line 990
    const-string v0, "ts"

    .line 991
    .line 992
    iget-wide v6, p1, Lcom/umeng/commonsdk/internal/utils/b;->f:J

    .line 993
    .line 994
    invoke-virtual {p2, v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 995
    .line 996
    .line 997
    :catchall_1
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object p1

    .line 1001
    new-instance p2, Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1004
    .line 1005
    .line 1006
    const-string v0, "battery info: "

    .line 1007
    .line 1008
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object p2

    .line 1018
    invoke-static {v5, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    :try_start_a
    const-class p2, Lcom/umeng/commonsdk/internal/utils/UMInternalUtilsAgent;

    .line 1022
    .line 1023
    const-string v0, "saveBattery"

    .line 1024
    .line 1025
    new-array v3, v9, [Ljava/lang/Class;

    .line 1026
    .line 1027
    aput-object v8, v3, v4

    .line 1028
    .line 1029
    aput-object v2, v3, v1

    .line 1030
    .line 1031
    invoke-virtual {p2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    new-array v2, v9, [Ljava/lang/Object;

    .line 1036
    .line 1037
    iget-object v3, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 1038
    .line 1039
    aput-object v3, v2, v4

    .line 1040
    .line 1041
    aput-object p1, v2, v1

    .line 1042
    .line 1043
    invoke-virtual {v0, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 1044
    .line 1045
    .line 1046
    goto :goto_2

    .line 1047
    :pswitch_14
    :try_start_b
    new-array p1, v1, [Ljava/lang/Object;

    .line 1048
    .line 1049
    aput-object v6, p1, v4

    .line 1050
    .line 1051
    invoke-static {v3, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 1052
    .line 1053
    .line 1054
    :try_start_c
    const-class p1, Lcom/umeng/commonsdk/internal/UMInternalManagerAgent;

    .line 1055
    .line 1056
    const-string p2, "sendInternalEnvelopeByStateful2"

    .line 1057
    .line 1058
    new-array v0, v1, [Ljava/lang/Class;

    .line 1059
    .line 1060
    aput-object v8, v0, v4

    .line 1061
    .line 1062
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1063
    .line 1064
    .line 1065
    move-result-object p2

    .line 1066
    new-array v0, v1, [Ljava/lang/Object;

    .line 1067
    .line 1068
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 1069
    .line 1070
    aput-object v1, v0, v4

    .line 1071
    .line 1072
    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1073
    .line 1074
    .line 1075
    :catch_0
    :catchall_2
    :cond_12
    :goto_2
    return-void

    .line 1076
    nop

    .line 1077
    :pswitch_data_0
    .packed-switch 0x8001
        :pswitch_14
        :pswitch_0
        :pswitch_13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_0
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
.end method
