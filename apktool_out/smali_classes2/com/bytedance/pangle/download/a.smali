.class public Lcom/bytedance/pangle/download/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lcom/bytedance/pangle/download/a;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/pangle/download/a;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/bytedance/pangle/download/a$1;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/bytedance/pangle/download/a$1;-><init>(Lcom/bytedance/pangle/download/a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
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
.end method

.method public static a()Lcom/bytedance/pangle/download/a;
    .locals 2

    .line 2
    sget-object v0, Lcom/bytedance/pangle/download/a;->b:Lcom/bytedance/pangle/download/a;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/bytedance/pangle/download/a;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/bytedance/pangle/download/a;->b:Lcom/bytedance/pangle/download/a;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/bytedance/pangle/download/a;

    invoke-direct {v1}, Lcom/bytedance/pangle/download/a;-><init>()V

    sput-object v1, Lcom/bytedance/pangle/download/a;->b:Lcom/bytedance/pangle/download/a;

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
    sget-object v0, Lcom/bytedance/pangle/download/a;->b:Lcom/bytedance/pangle/download/a;

    return-object v0
.end method

.method static synthetic a(Lcom/bytedance/pangle/download/a;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/pangle/download/a;->a:Ljava/util/List;

    return-object p0
.end method
