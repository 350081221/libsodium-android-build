.class public Lcom/yuanqi/master/tools/guide/model/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yuanqi/master/tools/guide/model/b;


# instance fields
.field private a:Landroid/graphics/RectF;

.field private b:Lcom/yuanqi/master/tools/guide/model/b$a;

.field private c:I

.field private d:Lcom/yuanqi/master/tools/guide/model/c;


# direct methods
.method public constructor <init>(Landroid/graphics/RectF;Lcom/yuanqi/master/tools/guide/model/b$a;I)V
    .locals 0
    .param p1    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yuanqi/master/tools/guide/model/b$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/model/d;->a:Landroid/graphics/RectF;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/yuanqi/master/tools/guide/model/d;->b:Lcom/yuanqi/master/tools/guide/model/b$a;

    .line 7
    .line 8
    iput p3, p0, Lcom/yuanqi/master/tools/guide/model/d;->c:I

    .line 9
    .line 10
    return-void
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
    .line 89
    .line 90
.end method


# virtual methods
.method public a(Landroid/view/View;)Landroid/graphics/RectF;
    .locals 0

    iget-object p1, p0, Lcom/yuanqi/master/tools/guide/model/d;->a:Landroid/graphics/RectF;

    return-object p1
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/master/tools/guide/model/d;->c:I

    return v0
.end method

.method public c(Lcom/yuanqi/master/tools/guide/model/c;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/model/d;->d:Lcom/yuanqi/master/tools/guide/model/c;

    return-void
.end method

.method public getOptions()Lcom/yuanqi/master/tools/guide/model/c;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/d;->d:Lcom/yuanqi/master/tools/guide/model/c;

    return-object v0
.end method

.method public getRadius()F
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/d;->a:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v2, p0, Lcom/yuanqi/master/tools/guide/model/d;->a:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public getShape()Lcom/yuanqi/master/tools/guide/model/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/d;->b:Lcom/yuanqi/master/tools/guide/model/b$a;

    return-object v0
.end method
