.class public abstract Lorg/osmdroid/views/overlay/milestones/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/util/PointAccepter;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/milestones/k;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lorg/osmdroid/util/PointL;

.field private c:Z

.field private d:[D


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->a:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Lorg/osmdroid/util/PointL;

    .line 12
    .line 13
    invoke-direct {v0}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->b:Lorg/osmdroid/util/PointL;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method

.method public static e(JJJJ)D
    .locals 1

    cmp-long v0, p0, p4

    if-nez v0, :cond_2

    cmp-long p0, p2, p6

    if-nez p0, :cond_0

    const-wide/16 p0, 0x0

    return-wide p0

    :cond_0
    if-lez p0, :cond_1

    const-wide p0, -0x3fa9800000000000L    # -90.0

    return-wide p0

    :cond_1
    const-wide p0, 0x4056800000000000L    # 90.0

    return-wide p0

    :cond_2
    sub-long/2addr p6, p2

    long-to-double p2, p6

    sub-long p6, p4, p0

    long-to-double p6, p6

    div-double/2addr p2, p6

    cmp-long p0, p4, p0

    const/4 p1, 0x0

    if-gez p0, :cond_3

    const/4 p0, 0x1

    goto :goto_0

    :cond_3
    move p0, p1

    :goto_0
    const-wide p4, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    invoke-static {p2, p3}, Ljava/lang/Math;->atan(D)D

    move-result-wide p2

    mul-double/2addr p2, p4

    if-eqz p0, :cond_4

    const/16 p1, 0xb4

    :cond_4
    int-to-double p0, p1

    add-double/2addr p2, p0

    return-wide p2
.end method


# virtual methods
.method protected abstract a(JJJJ)V
.end method

.method public add(JJ)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->b:Lorg/osmdroid/util/PointL;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/osmdroid/util/PointL;->set(JJ)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->b:Lorg/osmdroid/util/PointL;

    .line 15
    .line 16
    iget-wide v2, v0, Lorg/osmdroid/util/PointL;->x:J

    .line 17
    .line 18
    iget-wide v4, v0, Lorg/osmdroid/util/PointL;->y:J

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    move-wide v6, p1

    .line 22
    move-wide v8, p3

    .line 23
    invoke-virtual/range {v1 .. v9}, Lorg/osmdroid/views/overlay/milestones/d;->a(JJJJ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->b:Lorg/osmdroid/util/PointL;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/osmdroid/util/PointL;->set(JJ)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void
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
.end method

.method protected b(Lorg/osmdroid/views/overlay/milestones/k;)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected c(I)D
    .locals 3

    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->d:[D

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/milestones/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->a:Ljava/util/List;

    return-object v0
.end method

.method public end()V
    .locals 0

    return-void
.end method

.method public f([D)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/milestones/d;->d:[D

    return-void
.end method

.method public init()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/milestones/d;->c:Z

    .line 8
    .line 9
    return-void
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
.end method
