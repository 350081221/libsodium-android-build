.class final Lcom/umeng/umcrash/UMCrash$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/umcrash/UMCrash;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/uc/crashsdk/export/CrashApi;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/umcrash/UMCrash$3;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    const-string v0, "2G/3G"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/umeng/umcrash/UMCrash$3;->val$context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/NetworkUtil;->getNetworkAccessMode(Landroid/content/Context;)[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "Wi-Fi"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aget-object v4, v1, v3

    .line 13
    .line 14
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    const-string v4, "um_access"

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    :try_start_1
    iget-object v0, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    .line 23
    .line 24
    const-string v2, "wifi"

    .line 25
    .line 26
    invoke-virtual {v0, v4, v2}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    aget-object v2, v1, v3

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    .line 39
    .line 40
    invoke-virtual {v2, v4, v0}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    .line 45
    .line 46
    const-string v2, "unknow"

    .line 47
    .line 48
    invoke-virtual {v0, v4, v2}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    const-string v0, ""

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    aget-object v3, v1, v2

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    iget-object v0, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    .line 63
    .line 64
    const-string v3, "um_access_subtype"

    .line 65
    .line 66
    aget-object v1, v1, v2

    .line 67
    .line 68
    invoke-virtual {v0, v3, v1}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    return-void
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
