.class public abstract Lcom/bytedance/pangle/ZeusPluginStateListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field public static final EVENT_DOWNLOAD_FAILED:I = 0x4

.field public static final EVENT_DOWNLOAD_PROGRESS:I = 0x2

.field public static final EVENT_DOWNLOAD_START:I = 0x1

.field public static final EVENT_DOWNLOAD_SUCCESS:I = 0x3

.field public static final EVENT_INSTALL_FAILED:I = 0x7

.field public static final EVENT_INSTALL_START:I = 0x5

.field public static final EVENT_INSTALL_SUCCESS:I = 0x6

.field public static final EVENT_LOAD_FAILED:I = 0xa

.field public static final EVENT_LOAD_START:I = 0x8

.field public static final EVENT_LOAD_SUCCESS:I = 0x9

.field public static final EVENT_REQUEST_FINISH:I

.field private static final mHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/bytedance/pangle/ZeusPluginStateListener;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs postStateChange(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/bytedance/pangle/ZeusPluginStateListener;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lcom/bytedance/pangle/ZeusPluginStateListener$1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lcom/bytedance/pangle/ZeusPluginStateListener$1;-><init>(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/bytedance/pangle/i;->a()Lcom/bytedance/pangle/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Lcom/bytedance/pangle/i;->b:Ljava/util/List;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-lez v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lcom/bytedance/pangle/ZeusPluginStateListener;

    .line 40
    .line 41
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    const-string v2, "UNKNOWN"

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move-object v2, p0

    .line 51
    :goto_1
    invoke-virtual {v1, v2, p1, p2}, Lcom/bytedance/pangle/ZeusPluginStateListener;->onStateChangeOnCurThread(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public varargs onPluginStateChange(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public varargs onStateChangeOnCurThread(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
