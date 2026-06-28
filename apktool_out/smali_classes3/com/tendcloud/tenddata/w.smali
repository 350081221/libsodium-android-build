.class public final Lcom/tendcloud/tenddata/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I = 0x1e

.field private static final f:Ljava/util/concurrent/ThreadFactory;

.field private static final g:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sput v0, Lcom/tendcloud/tenddata/w;->b:I

    .line 10
    .line 11
    add-int/lit8 v1, v0, -0x1

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    sput v4, Lcom/tendcloud/tenddata/w;->c:I

    .line 24
    .line 25
    mul-int/2addr v0, v2

    .line 26
    const/4 v1, 0x1

    .line 27
    add-int/lit8 v5, v0, 0x1

    .line 28
    .line 29
    sput v5, Lcom/tendcloud/tenddata/w;->d:I

    .line 30
    .line 31
    new-instance v10, Lcom/tendcloud/tenddata/w$1;

    .line 32
    .line 33
    invoke-direct {v10}, Lcom/tendcloud/tenddata/w$1;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v10, Lcom/tendcloud/tenddata/w;->f:Ljava/util/concurrent/ThreadFactory;

    .line 37
    .line 38
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 39
    .line 40
    const/16 v0, 0x80

    .line 41
    .line 42
    invoke-direct {v9, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 43
    .line 44
    .line 45
    sput-object v9, Lcom/tendcloud/tenddata/w;->g:Ljava/util/concurrent/BlockingQueue;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 48
    .line 49
    const-wide/16 v6, 0x1e

    .line 50
    .line 51
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 52
    .line 53
    move-object v3, v0

    .line 54
    invoke-direct/range {v3 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lcom/tendcloud/tenddata/w;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 61
    .line 62
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
