.class public Lorg/osmdroid/views/overlay/milestones/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/util/PointAccepter;


# instance fields
.field private final a:Lorg/osmdroid/views/overlay/milestones/d;

.field private final b:Lorg/osmdroid/views/overlay/milestones/b;


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/overlay/milestones/d;Lorg/osmdroid/views/overlay/milestones/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/osmdroid/views/overlay/milestones/e;->a:Lorg/osmdroid/views/overlay/milestones/d;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/osmdroid/views/overlay/milestones/e;->b:Lorg/osmdroid/views/overlay/milestones/b;

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
.method public a(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/e;->b:Lorg/osmdroid/views/overlay/milestones/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/milestones/b;->c(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/e;->a:Lorg/osmdroid/views/overlay/milestones/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/milestones/d;->d()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lorg/osmdroid/views/overlay/milestones/k;

    .line 27
    .line 28
    iget-object v2, p0, Lorg/osmdroid/views/overlay/milestones/e;->b:Lorg/osmdroid/views/overlay/milestones/b;

    .line 29
    .line 30
    invoke-virtual {v2, p1, v1}, Lorg/osmdroid/views/overlay/milestones/b;->b(Landroid/graphics/Canvas;Lorg/osmdroid/views/overlay/milestones/k;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/e;->b:Lorg/osmdroid/views/overlay/milestones/b;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/milestones/b;->d(Landroid/graphics/Canvas;)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method public add(JJ)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/e;->a:Lorg/osmdroid/views/overlay/milestones/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/osmdroid/views/overlay/milestones/d;->add(JJ)V

    return-void
.end method

.method public b([D)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/e;->a:Lorg/osmdroid/views/overlay/milestones/d;

    invoke-virtual {v0, p1}, Lorg/osmdroid/views/overlay/milestones/d;->f([D)V

    return-void
.end method

.method public end()V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/e;->a:Lorg/osmdroid/views/overlay/milestones/d;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/milestones/d;->end()V

    return-void
.end method

.method public init()V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/milestones/e;->a:Lorg/osmdroid/views/overlay/milestones/d;

    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/milestones/d;->init()V

    return-void
.end method
