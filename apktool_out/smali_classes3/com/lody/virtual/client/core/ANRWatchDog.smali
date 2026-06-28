.class public Lcom/lody/virtual/client/core/ANRWatchDog;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/core/ANRWatchDog$ANRException;
    }
.end annotation


# static fields
.field private static final ANR_TIMEOUT:I = 0x1388

.field private static final MESSAGE_WATCHDOG_TIME_TICK:I = 0x0

.field private static lastTimeTick:I = -0x1

.field private static timeTick:I


# instance fields
.field private makeCrash:Z

.field private final watchDogHandler:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/lody/virtual/client/core/ANRWatchDog;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    new-instance v0, Lcom/lody/virtual/client/core/ANRWatchDog$1;

    invoke-direct {v0, p0}, Lcom/lody/virtual/client/core/ANRWatchDog$1;-><init>(Lcom/lody/virtual/client/core/ANRWatchDog;)V

    iput-object v0, p0, Lcom/lody/virtual/client/core/ANRWatchDog;->watchDogHandler:Landroid/os/Handler;

    .line 3
    iput-boolean p1, p0, Lcom/lody/virtual/client/core/ANRWatchDog;->makeCrash:Z

    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    sget v0, Lcom/lody/virtual/client/core/ANRWatchDog;->timeTick:I

    return v0
.end method

.method static synthetic access$002(I)I
    .locals 0

    sput p0, Lcom/lody/virtual/client/core/ANRWatchDog;->timeTick:I

    return p0
.end method

.method static synthetic access$008()I
    .locals 2

    sget v0, Lcom/lody/virtual/client/core/ANRWatchDog;->timeTick:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/lody/virtual/client/core/ANRWatchDog;->timeTick:I

    return v0
.end method

.method private triggerANR()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/client/core/ANRWatchDog;->makeCrash:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/lody/virtual/client/core/ANRWatchDog$ANRException;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/lody/virtual/client/core/ANRWatchDog$ANRException;-><init>()V

    .line 8
    .line 9
    .line 10
    throw v0

    .line 11
    :cond_0
    :try_start_0
    new-instance v0, Lcom/lody/virtual/client/core/ANRWatchDog$ANRException;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/lody/virtual/client/core/ANRWatchDog$ANRException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw v0
    :try_end_0
    .catch Lcom/lody/virtual/client/core/ANRWatchDog$ANRException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/lody/virtual/client/core/ANRWatchDog;->watchDogHandler:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x1388

    .line 8
    .line 9
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_1

    .line 13
    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    :goto_1
    sget v0, Lcom/lody/virtual/client/core/ANRWatchDog;->timeTick:I

    .line 18
    .line 19
    sget v1, Lcom/lody/virtual/client/core/ANRWatchDog;->lastTimeTick:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/lody/virtual/client/core/ANRWatchDog;->triggerANR()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sput v0, Lcom/lody/virtual/client/core/ANRWatchDog;->lastTimeTick:I

    .line 28
    .line 29
    goto :goto_0
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
