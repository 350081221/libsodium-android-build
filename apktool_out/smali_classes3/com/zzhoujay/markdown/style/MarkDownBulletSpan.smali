.class public Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;
.super Landroid/text/style/BulletSpan;
.source "SourceFile"


# static fields
.field private static final g:I = 0x28

.field private static final h:I = 0x28

.field private static final i:I = 0x6

.field private static j:Landroid/graphics/Path;

.field private static k:Landroid/graphics/Path;


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(III)V
    .locals 2

    const/16 v0, 0x28

    .line 10
    invoke-direct {p0, v0, p2}, Landroid/text/style/BulletSpan;-><init>(II)V

    .line 11
    iput p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->d:I

    const/4 v0, 0x1

    if-lez p3, :cond_2

    if-ne p1, v0, :cond_0

    .line 12
    invoke-static {p3}, Ld3/b;->b(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-lt p1, v1, :cond_1

    sub-int/2addr p3, v0

    .line 13
    invoke-static {p3}, Ld3/b;->a(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    goto :goto_0

    .line 14
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    .line 16
    :goto_0
    iput-boolean v0, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->a:Z

    .line 17
    iput p2, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->b:I

    return-void
.end method

.method public constructor <init>(IIILandroid/widget/TextView;)V
    .locals 2

    const/16 v0, 0x28

    .line 1
    invoke-direct {p0, v0, p2}, Landroid/text/style/BulletSpan;-><init>(II)V

    .line 2
    iput p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->d:I

    const/4 v0, 0x1

    if-lez p3, :cond_2

    if-ne p1, v0, :cond_0

    .line 3
    invoke-static {p3}, Ld3/b;->b(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-lt p1, v1, :cond_1

    sub-int/2addr p3, v0

    .line 4
    invoke-static {p3}, Ld3/b;->a(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    goto :goto_0

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    .line 7
    :goto_0
    iput-boolean v0, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->a:Z

    .line 8
    iput p2, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->b:I

    .line 9
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->f:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 14
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    .line 1
    move-object/from16 v4, p8

    check-cast v4, Landroid/text/Spanned;

    invoke-interface {v4, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    move/from16 v5, p9

    if-ne v4, v5, :cond_7

    .line 2
    iget-boolean v4, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->a:Z

    if-eqz v4, :cond_0

    .line 3
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Paint;->getColor()I

    move-result v4

    .line 4
    iget v5, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->b:I

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 5
    :goto_0
    iget-object v5, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 6
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x2e

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    int-to-float v3, v3

    iget-object v6, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    sub-float/2addr v3, v6

    iget v6, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->e:I

    int-to-float v6, v6

    add-float/2addr v3, v6

    const/high16 v6, 0x42200000    # 40.0f

    sub-float/2addr v3, v6

    move/from16 v6, p6

    int-to-float v6, v6

    invoke-virtual {p1, v5, v3, v6, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto/16 :goto_4

    .line 7
    :cond_1
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v5

    .line 8
    iget v6, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->d:I

    const/4 v7, 0x1

    if-ne v6, v7, :cond_2

    .line 9
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_1

    .line 10
    :cond_2
    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 11
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v6

    const/high16 v7, 0x40000000    # 2.0f

    if-eqz v6, :cond_6

    .line 12
    iget v6, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->d:I

    const/4 v8, 0x2

    if-lt v6, v8, :cond_4

    .line 13
    sget-object v6, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->k:Landroid/graphics/Path;

    if-nez v6, :cond_3

    .line 14
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    sput-object v8, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->k:Landroid/graphics/Path;

    const v10, -0x3f199999    # -7.2000003f

    .line 15
    sget-object v13, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    const v12, 0x40e66667    # 7.2000003f

    move v9, v10

    move v11, v12

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 16
    :cond_3
    sget-object v6, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->k:Landroid/graphics/Path;

    goto :goto_2

    .line 17
    :cond_4
    sget-object v6, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->j:Landroid/graphics/Path;

    if-nez v6, :cond_5

    .line 18
    new-instance v6, Landroid/graphics/Path;

    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    sput-object v6, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->j:Landroid/graphics/Path;

    const v8, 0x40e66667    # 7.2000003f

    .line 19
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    const/4 v10, 0x0

    invoke-virtual {v6, v10, v10, v8, v9}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 20
    :cond_5
    sget-object v6, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->j:Landroid/graphics/Path;

    .line 21
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 22
    iget v8, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->e:I

    add-int/2addr v3, v8

    add-int/lit8 v3, v3, -0x28

    int-to-float v3, v3

    add-int v8, p5, p7

    int-to-float v8, v8

    div-float/2addr v8, v7

    invoke-virtual {p1, v3, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 23
    invoke-virtual {p1, v6, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 24
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_3

    .line 25
    :cond_6
    iget v6, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->e:I

    add-int/2addr v3, v6

    add-int/lit8 v3, v3, -0x28

    int-to-float v3, v3

    add-int v6, p5, p7

    int-to-float v6, v6

    div-float/2addr v6, v7

    const/high16 v7, 0x40c00000    # 6.0f

    invoke-virtual {p1, v3, v6, v7, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 26
    :goto_3
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    :goto_4
    iget-boolean v1, v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->a:Z

    if-eqz v1, :cond_7

    .line 28
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    :cond_7
    return-void
.end method

.method public getLeadingMargin(Z)I
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->f:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/widget/TextView;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    iget-object v0, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/high16 v0, 0x42200000    # 40.0f

    .line 30
    .line 31
    add-float/2addr p1, v0

    .line 32
    iget v1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->d:I

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    int-to-float v1, v1

    .line 37
    mul-float/2addr p1, v1

    .line 38
    add-float/2addr p1, v0

    .line 39
    float-to-int p1, p1

    .line 40
    iput p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->e:I

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->d:I

    .line 44
    .line 45
    add-int/lit8 p1, p1, 0x1

    .line 46
    .line 47
    mul-int/lit8 p1, p1, 0x34

    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x28

    .line 50
    .line 51
    iput p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->e:I

    .line 52
    .line 53
    :goto_1
    iget p1, p0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;->e:I

    .line 54
    .line 55
    return p1
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
.end method
