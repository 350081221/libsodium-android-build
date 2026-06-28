.class final Lcom/umeng/umcrash/UMCrash$4;
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


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/umcrash/UMCrash$4;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lcom/efs/sdk/pa/PAFactory$Builder;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/umeng/umcrash/UMCrash$4;->val$context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/umeng/umcrash/UMCrash$4$1;

    .line 10
    .line 11
    invoke-direct {v2, p0}, Lcom/umeng/umcrash/UMCrash$4$1;-><init>(Lcom/umeng/umcrash/UMCrash$4;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lcom/efs/sdk/pa/PAFactory$Builder;-><init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/IEfsReporter;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lcom/efs/sdk/pa/config/PackageLevel;->RELEASE:Lcom/efs/sdk/pa/config/PackageLevel;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/efs/sdk/pa/PAFactory$Builder;->packageLevel(Lcom/efs/sdk/pa/config/PackageLevel;)Lcom/efs/sdk/pa/PAFactory$Builder;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/umeng/umcrash/UMCrash;->access$1100()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-virtual {v0, v1, v2}, Lcom/efs/sdk/pa/PAFactory$Builder;->timeoutTime(J)Lcom/efs/sdk/pa/PAFactory$Builder;

    .line 27
    .line 28
    .line 29
    new-instance v1, Lcom/umeng/umcrash/UMCrash$PaClientImpl;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, v2}, Lcom/umeng/umcrash/UMCrash$PaClientImpl;-><init>(Lcom/umeng/umcrash/UMCrash$1;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/efs/sdk/pa/PAFactory$Builder;->setPaClient(Lcom/efs/sdk/pa/IPaClient;)Lcom/efs/sdk/pa/PAFactory$Builder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/efs/sdk/pa/PAFactory$Builder;->build()Lcom/efs/sdk/pa/PAFactory;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/efs/sdk/pa/PAFactory;->getPaInstance()Lcom/efs/sdk/pa/PA;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Lcom/efs/sdk/pa/PA;->start()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/efs/sdk/pa/PAFactory;->getConfigManager()Lcom/efs/sdk/pa/config/ConfigManager;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/efs/sdk/pa/config/ConfigManager;->enableTracer()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0}, Lcom/umeng/umcrash/UMCrash;->access$1302(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 63
    .line 64
    .line 65
    :goto_0
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
