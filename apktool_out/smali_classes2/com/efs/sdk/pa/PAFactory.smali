.class public Lcom/efs/sdk/pa/PAFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/pa/PAFactory$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_TIME_OUT_TIME:J = 0x7d0L

.field private static final INVALID_TIME_OUT_TIME:J = 0x0L

.field private static final MAX_TIME_OUT_TIME:J = 0xfa0L

.field private static final TAG:Ljava/lang/String; = "pafactory"

.field static final sThreadLocal:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/efs/sdk/pa/PA;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mConfigManager:Lcom/efs/sdk/pa/config/ConfigManager;

.field private mContext:Landroid/content/Context;

.field private mExtend:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mPaClient:Lcom/efs/sdk/pa/IPaClient;

.field private mReporter:Lcom/efs/sdk/base/EfsReporter;

.field private mReporterFactory:Lcom/efs/sdk/pa/config/IEfsReporter;

.field private mSerial:Ljava/lang/String;

.field private mSver:Ljava/lang/String;

.field private mTimeOutTime:J

.field private mTraceListener:Lcom/efs/sdk/pa/PATraceListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/efs/sdk/pa/PAFactory;->sThreadLocal:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/PackageLevel;Lcom/efs/sdk/pa/config/IEfsReporter;ZLjava/lang/String;Ljava/util/HashMap;Ljava/lang/String;JLcom/efs/sdk/pa/PATraceListener;Lcom/efs/sdk/pa/IPaClient;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/efs/sdk/pa/config/PackageLevel;",
            "Lcom/efs/sdk/pa/config/IEfsReporter;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "J",
            "Lcom/efs/sdk/pa/PATraceListener;",
            "Lcom/efs/sdk/pa/IPaClient;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p3, p0, Lcom/efs/sdk/pa/PAFactory;->mReporterFactory:Lcom/efs/sdk/pa/config/IEfsReporter;

    .line 4
    iput-object p5, p0, Lcom/efs/sdk/pa/PAFactory;->mSerial:Ljava/lang/String;

    .line 5
    iput-object p6, p0, Lcom/efs/sdk/pa/PAFactory;->mExtend:Ljava/util/HashMap;

    .line 6
    iput-object p7, p0, Lcom/efs/sdk/pa/PAFactory;->mSver:Ljava/lang/String;

    .line 7
    iput-object p1, p0, Lcom/efs/sdk/pa/PAFactory;->mContext:Landroid/content/Context;

    .line 8
    iput-object p10, p0, Lcom/efs/sdk/pa/PAFactory;->mTraceListener:Lcom/efs/sdk/pa/PATraceListener;

    .line 9
    iput-object p11, p0, Lcom/efs/sdk/pa/PAFactory;->mPaClient:Lcom/efs/sdk/pa/IPaClient;

    .line 10
    iput-wide p8, p0, Lcom/efs/sdk/pa/PAFactory;->mTimeOutTime:J

    .line 11
    new-instance p5, Lcom/efs/sdk/pa/config/ConfigManager;

    invoke-direct {p5, p1, p2, p3, p4}, Lcom/efs/sdk/pa/config/ConfigManager;-><init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/PackageLevel;Lcom/efs/sdk/pa/config/IEfsReporter;Z)V

    iput-object p5, p0, Lcom/efs/sdk/pa/PAFactory;->mConfigManager:Lcom/efs/sdk/pa/config/ConfigManager;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/PackageLevel;Lcom/efs/sdk/pa/config/IEfsReporter;ZLjava/lang/String;Ljava/util/HashMap;Ljava/lang/String;JLcom/efs/sdk/pa/PATraceListener;Lcom/efs/sdk/pa/IPaClient;Lcom/efs/sdk/pa/PAFactory$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lcom/efs/sdk/pa/PAFactory;-><init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/PackageLevel;Lcom/efs/sdk/pa/config/IEfsReporter;ZLjava/lang/String;Ljava/util/HashMap;Ljava/lang/String;JLcom/efs/sdk/pa/PATraceListener;Lcom/efs/sdk/pa/IPaClient;)V

    return-void
.end method


# virtual methods
.method public getConfigManager()Lcom/efs/sdk/pa/config/ConfigManager;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mConfigManager:Lcom/efs/sdk/pa/config/ConfigManager;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getExtend()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mExtend:Ljava/util/HashMap;

    return-object v0
.end method

.method public getPaClient()Lcom/efs/sdk/pa/IPaClient;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mPaClient:Lcom/efs/sdk/pa/IPaClient;

    return-object v0
.end method

.method public declared-synchronized getPaInstance()Lcom/efs/sdk/pa/PA;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/efs/sdk/pa/PAFactory;->sThreadLocal:Ljava/lang/ThreadLocal;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lcom/efs/sdk/pa/PA;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/efs/sdk/pa/a/c;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/efs/sdk/pa/PAFactory;->mConfigManager:Lcom/efs/sdk/pa/config/ConfigManager;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/efs/sdk/pa/config/ConfigManager;->enableTracer()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v1, v2}, Lcom/efs/sdk/pa/a/c;-><init>(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lcom/efs/sdk/pa/PAFactory;->mContext:Landroid/content/Context;

    .line 24
    .line 25
    new-instance v3, Lcom/efs/sdk/pa/a;

    .line 26
    .line 27
    invoke-direct {v3, p0}, Lcom/efs/sdk/pa/a;-><init>(Lcom/efs/sdk/pa/PAFactory;)V

    .line 28
    .line 29
    .line 30
    iget-wide v4, p0, Lcom/efs/sdk/pa/PAFactory;->mTimeOutTime:J

    .line 31
    .line 32
    invoke-interface {v1, v2, v3, v4, v5}, Lcom/efs/sdk/pa/PA;->registerPAANRListener(Landroid/content/Context;Lcom/efs/sdk/pa/PAANRListener;J)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :cond_0
    monitor-exit p0

    .line 39
    return-object v1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    monitor-exit p0

    .line 42
    throw v0
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
.end method

.method public getReporter()Lcom/efs/sdk/base/EfsReporter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mReporter:Lcom/efs/sdk/base/EfsReporter;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mReporterFactory:Lcom/efs/sdk/pa/config/IEfsReporter;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/efs/sdk/pa/config/IEfsReporter;->getReporter()Lcom/efs/sdk/base/EfsReporter;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iput-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mReporter:Lcom/efs/sdk/base/EfsReporter;

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mReporter:Lcom/efs/sdk/base/EfsReporter;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public getSerial()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mSerial:Ljava/lang/String;

    return-object v0
.end method

.method public getSver()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mSver:Ljava/lang/String;

    return-object v0
.end method

.method public getTraceListener()Lcom/efs/sdk/pa/PATraceListener;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/pa/PAFactory;->mTraceListener:Lcom/efs/sdk/pa/PATraceListener;

    return-object v0
.end method
