.class public Lcom/zzhoujay/html/style/ZBulletSpan;
.super Landroid/text/style/BulletSpan;
.source "SourceFile"


# static fields
.field public static final d:I = 0xf

.field private static final e:I = 0x5

.field private static f:Landroid/graphics/Path;


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/text/style/BulletSpan;-><init>()V

    const/16 v0, 0xf

    .line 2
    iput v0, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->a:I

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->b:Z

    .line 4
    iput v0, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->c:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/text/style/BulletSpan;-><init>(I)V

    .line 6
    iput p1, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->a:I

    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->b:Z

    .line 8
    iput p1, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->c:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/text/style/BulletSpan;-><init>(II)V

    .line 10
    iput p1, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->a:I

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->b:Z

    .line 12
    iput p2, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->c:I

    return-void
.end method


# virtual methods
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 1

    .line 1
    check-cast p8, Landroid/text/Spanned;

    .line 2
    .line 3
    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p6

    .line 7
    if-ne p6, p9, :cond_4

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    .line 12
    move-result-object p6

    .line 13
    iget-boolean p8, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->b:Z

    .line 14
    .line 15
    if-eqz p8, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 18
    .line 19
    .line 20
    move-result p8

    .line 21
    iget p9, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->c:I

    .line 22
    .line 23
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p8, 0x0

    .line 28
    :goto_0
    sget-object p9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 29
    .line 30
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 34
    .line 35
    .line 36
    move-result p9

    .line 37
    const/high16 p10, 0x40000000    # 2.0f

    .line 38
    .line 39
    if-eqz p9, :cond_2

    .line 40
    .line 41
    sget-object p9, Lcom/zzhoujay/html/style/ZBulletSpan;->f:Landroid/graphics/Path;

    .line 42
    .line 43
    if-nez p9, :cond_1

    .line 44
    .line 45
    new-instance p9, Landroid/graphics/Path;

    .line 46
    .line 47
    invoke-direct {p9}, Landroid/graphics/Path;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object p9, Lcom/zzhoujay/html/style/ZBulletSpan;->f:Landroid/graphics/Path;

    .line 51
    .line 52
    const/high16 p11, 0x40c00000    # 6.0f

    .line 53
    .line 54
    sget-object p12, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-virtual {p9, v0, v0, p11, p12}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 61
    .line 62
    .line 63
    mul-int/lit8 p4, p4, 0x5

    .line 64
    .line 65
    add-int/2addr p3, p4

    .line 66
    int-to-float p3, p3

    .line 67
    add-int/2addr p5, p7

    .line 68
    int-to-float p4, p5

    .line 69
    div-float/2addr p4, p10

    .line 70
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 71
    .line 72
    .line 73
    sget-object p3, Lcom/zzhoujay/html/style/ZBulletSpan;->f:Landroid/graphics/Path;

    .line 74
    .line 75
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    mul-int/lit8 p4, p4, 0x5

    .line 83
    .line 84
    add-int/2addr p3, p4

    .line 85
    int-to-float p3, p3

    .line 86
    add-int/2addr p5, p7

    .line 87
    int-to-float p4, p5

    .line 88
    div-float/2addr p4, p10

    .line 89
    const/high16 p5, 0x40a00000    # 5.0f

    .line 90
    .line 91
    invoke-virtual {p1, p3, p4, p5, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    iget-boolean p1, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->b:Z

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-virtual {p2, p8}, Landroid/graphics/Paint;->setColor(I)V

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-virtual {p2, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    return-void
.end method

.method public getLeadingMargin(Z)I
    .locals 0

    iget p1, p0, Lcom/zzhoujay/html/style/ZBulletSpan;->a:I

    add-int/lit8 p1, p1, 0xa

    return p1
.end method
