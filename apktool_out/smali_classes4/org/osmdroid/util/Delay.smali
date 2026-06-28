.class public Lorg/osmdroid/util/Delay;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mDuration:J

.field private final mDurations:[J

.field private mIndex:I

.field private mNextTime:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/osmdroid/util/Delay;->mDurations:[J

    .line 3
    iput-wide p1, p0, Lorg/osmdroid/util/Delay;->mDuration:J

    .line 4
    invoke-virtual {p0}, Lorg/osmdroid/util/Delay;->next()J

    return-void
.end method

.method public constructor <init>([J)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 6
    array-length v0, p1

    if-eqz v0, :cond_0

    .line 7
    iput-object p1, p0, Lorg/osmdroid/util/Delay;->mDurations:[J

    .line 8
    invoke-virtual {p0}, Lorg/osmdroid/util/Delay;->next()J

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method private now()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public next()J
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/Delay;->mDurations:[J

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lorg/osmdroid/util/Delay;->mDuration:J

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v1, p0, Lorg/osmdroid/util/Delay;->mIndex:I

    .line 9
    .line 10
    aget-wide v2, v0, v1

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    iput v1, p0, Lorg/osmdroid/util/Delay;->mIndex:I

    .line 20
    .line 21
    :cond_1
    move-wide v0, v2

    .line 22
    :goto_0
    invoke-direct {p0}, Lorg/osmdroid/util/Delay;->now()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    add-long/2addr v2, v0

    .line 27
    iput-wide v2, p0, Lorg/osmdroid/util/Delay;->mNextTime:J

    .line 28
    .line 29
    return-wide v0
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
.end method

.method public shouldWait()Z
    .locals 4

    invoke-direct {p0}, Lorg/osmdroid/util/Delay;->now()J

    move-result-wide v0

    iget-wide v2, p0, Lorg/osmdroid/util/Delay;->mNextTime:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
