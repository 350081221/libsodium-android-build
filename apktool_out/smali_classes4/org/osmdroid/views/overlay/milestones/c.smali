.class public Lorg/osmdroid/views/overlay/milestones/c;
.super Lorg/osmdroid/views/overlay/milestones/b;
.source "SourceFile"


# instance fields
.field private c:Z

.field private d:J

.field private e:J

.field private final f:Lorg/osmdroid/views/overlay/LineDrawer;


# direct methods
.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0, v0, v1, v2}, Lorg/osmdroid/views/overlay/milestones/b;-><init>(DZ)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/milestones/c;->c:Z

    .line 9
    .line 10
    new-instance v0, Lorg/osmdroid/views/overlay/milestones/c$a;

    .line 11
    .line 12
    const/16 v1, 0x100

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lorg/osmdroid/views/overlay/milestones/c$a;-><init>(Lorg/osmdroid/views/overlay/milestones/c;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lorg/osmdroid/views/overlay/milestones/c;->f:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/LineDrawer;->setPaint(Landroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method static synthetic e(Lorg/osmdroid/views/overlay/milestones/c;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/milestones/c;->c:Z

    return p1
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public b(Landroid/graphics/Canvas;Lorg/osmdroid/views/overlay/milestones/k;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/milestones/k;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/milestones/k;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/milestones/c;->c:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-boolean v2, p0, Lorg/osmdroid/views/overlay/milestones/c;->c:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-wide v2, p0, Lorg/osmdroid/views/overlay/milestones/c;->d:J

    .line 18
    .line 19
    cmp-long v4, v2, v0

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    iget-wide v4, p0, Lorg/osmdroid/views/overlay/milestones/c;->e:J

    .line 24
    .line 25
    cmp-long v4, v4, p1

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    :cond_1
    iget-object v4, p0, Lorg/osmdroid/views/overlay/milestones/c;->f:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 30
    .line 31
    iget-wide v5, p0, Lorg/osmdroid/views/overlay/milestones/c;->e:J

    .line 32
    .line 33
    invoke-virtual {v4, v2, v3, v5, v6}, Lorg/osmdroid/util/LineBuilder;->add(JJ)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lorg/osmdroid/views/overlay/milestones/c;->f:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 37
    .line 38
    invoke-virtual {v2, v0, v1, p1, p2}, Lorg/osmdroid/util/LineBuilder;->add(JJ)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/c;->d:J

    .line 42
    .line 43
    iput-wide p1, p0, Lorg/osmdroid/views/overlay/milestones/c;->e:J

    .line 44
    .line 45
    return-void
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

.method public c(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/c;->f:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/osmdroid/util/LineBuilder;->init()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/c;->f:Lorg/osmdroid/views/overlay/LineDrawer;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/LineDrawer;->setCanvas(Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/milestones/c;->c:Z

    .line 13
    .line 14
    return-void
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
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 0

    iget-object p1, p0, Lorg/osmdroid/views/overlay/milestones/c;->f:Lorg/osmdroid/views/overlay/LineDrawer;

    invoke-virtual {p1}, Lorg/osmdroid/util/LineBuilder;->end()V

    return-void
.end method
