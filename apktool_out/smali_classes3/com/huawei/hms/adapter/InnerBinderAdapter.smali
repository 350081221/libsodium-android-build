.class public Lcom/huawei/hms/adapter/InnerBinderAdapter;
.super Lcom/huawei/hms/adapter/BinderAdapter;
.source "SourceFile"


# static fields
.field private static final INNER_MSG_CONN_TIMEOUT:I = 0x7d1

.field private static final INNER_MSG_DELAY_DISCONNECT:I = 0x7d2

.field private static final LOCK_OBJECT_INIT:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String; = "InnerBinderAdapter"

.field private static innerAdapter:Lcom/huawei/hms/adapter/BinderAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hms/adapter/InnerBinderAdapter;->LOCK_OBJECT_INIT:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/adapter/BinderAdapter;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/adapter/BinderAdapter;
    .locals 2

    .line 1
    const-string v0, "InnerBinderAdapter"

    .line 2
    .line 3
    const-string v1, "InnerBinderAdapter getInstance."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/huawei/hms/adapter/InnerBinderAdapter;->LOCK_OBJECT_INIT:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lcom/huawei/hms/adapter/InnerBinderAdapter;->innerAdapter:Lcom/huawei/hms/adapter/BinderAdapter;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/huawei/hms/adapter/InnerBinderAdapter;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/adapter/InnerBinderAdapter;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/huawei/hms/adapter/InnerBinderAdapter;->innerAdapter:Lcom/huawei/hms/adapter/BinderAdapter;

    .line 21
    .line 22
    :cond_0
    sget-object p0, Lcom/huawei/hms/adapter/InnerBinderAdapter;->innerAdapter:Lcom/huawei/hms/adapter/BinderAdapter;

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object p0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p0
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
.end method


# virtual methods
.method protected getConnTimeOut()I
    .locals 1

    const/16 v0, 0x7d1

    return v0
.end method

.method protected getMsgDelayDisconnect()I
    .locals 1

    const/16 v0, 0x7d2

    return v0
.end method
