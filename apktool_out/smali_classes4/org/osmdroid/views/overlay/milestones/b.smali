.class public abstract Lorg/osmdroid/views/overlay/milestones/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:D

.field private final b:Z


# direct methods
.method public constructor <init>(DZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/osmdroid/views/overlay/milestones/b;->a:D

    .line 5
    .line 6
    iput-boolean p3, p0, Lorg/osmdroid/views/overlay/milestones/b;->b:Z

    .line 7
    .line 8
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method protected abstract a(Landroid/graphics/Canvas;Ljava/lang/Object;)V
.end method

.method public b(Landroid/graphics/Canvas;Lorg/osmdroid/views/overlay/milestones/k;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/osmdroid/views/overlay/milestones/b;->a:D

    .line 2
    .line 3
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/milestones/b;->b:Z

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/milestones/k;->b()D

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    :goto_0
    add-double/2addr v0, v2

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 16
    .line 17
    .line 18
    double-to-float v0, v0

    .line 19
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/milestones/k;->c()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    long-to-float v1, v1

    .line 24
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/milestones/k;->d()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    long-to-float v2, v2

    .line 29
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/milestones/k;->c()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    long-to-float v0, v0

    .line 37
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/milestones/k;->d()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    long-to-float v1, v1

    .line 42
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Lorg/osmdroid/views/overlay/milestones/k;->a()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/views/overlay/milestones/b;->a(Landroid/graphics/Canvas;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 53
    .line 54
    .line 55
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
.end method

.method public c(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method
