.class public Landroidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy;
.super Landroidx/emoji2/text/FontRequestEmojiCompatConfig$RetryPolicy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/FontRequestEmojiCompatConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExponentialBackoffRetryPolicy"
.end annotation


# instance fields
.field private mRetryOrigin:J

.field private final mTotalMs:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/emoji2/text/FontRequestEmojiCompatConfig$RetryPolicy;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy;->mTotalMs:J

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
.end method


# virtual methods
.method public getRetryDelay()J
    .locals 6

    .line 1
    iget-wide v0, p0, Landroidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy;->mRetryOrigin:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Landroidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy;->mRetryOrigin:J

    .line 14
    .line 15
    return-wide v2

    .line 16
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-wide v2, p0, Landroidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy;->mRetryOrigin:J

    .line 21
    .line 22
    sub-long/2addr v0, v2

    .line 23
    iget-wide v2, p0, Landroidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy;->mTotalMs:J

    .line 24
    .line 25
    cmp-long v2, v0, v2

    .line 26
    .line 27
    if-lez v2, :cond_1

    .line 28
    .line 29
    const-wide/16 v0, -0x1

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_1
    const-wide/16 v2, 0x3e8

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    iget-wide v4, p0, Landroidx/emoji2/text/FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy;->mTotalMs:J

    .line 39
    .line 40
    sub-long/2addr v4, v0

    .line 41
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    return-wide v0
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
