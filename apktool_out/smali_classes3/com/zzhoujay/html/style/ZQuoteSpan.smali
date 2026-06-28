.class public Lcom/zzhoujay/html/style/ZQuoteSpan;
.super Landroid/text/style/QuoteSpan;
.source "SourceFile"


# static fields
.field private static final a:I = 0xf

.field private static final b:I = 0x28


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, -0x333334

    .line 1
    invoke-direct {p0, v0}, Lcom/zzhoujay/html/style/ZQuoteSpan;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroid/text/style/QuoteSpan;-><init>(I)V

    return-void
.end method


# virtual methods
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 7

    .line 1
    move-object v0, p2

    .line 2
    move v1, p3

    .line 3
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/text/style/QuoteSpan;->getColor()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    int-to-float v4, v1

    .line 24
    move v5, p5

    .line 25
    int-to-float v5, v5

    .line 26
    mul-int/lit8 v6, p4, 0xf

    .line 27
    .line 28
    add-int/2addr v1, v6

    .line 29
    int-to-float v1, v1

    .line 30
    move v6, p7

    .line 31
    int-to-float v6, v6

    .line 32
    move-object p3, p1

    .line 33
    move p4, v4

    .line 34
    move p5, v5

    .line 35
    move p6, v1

    .line 36
    move p7, v6

    .line 37
    move-object p8, p2

    .line 38
    invoke-virtual/range {p3 .. p8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 45
    .line 46
    .line 47
    return-void
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
.end method

.method public getLeadingMargin(Z)I
    .locals 0

    const/16 p1, 0x37

    return p1
.end method
