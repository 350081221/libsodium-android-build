.class public Lh3/b;
.super Landroid/text/style/ImageSpan;
.source "SourceFile"

# interfaces
.implements Lh3/d;


# instance fields
.field private a:F

.field private final b:I

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Le3/j;

.field private final e:Le3/i;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lh3/b;Le3/i;Le3/j;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lh3/b;->getSource()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    .line 2
    iget-object p1, p2, Lh3/b;->c:Ljava/util/List;

    iput-object p1, p0, Lh3/b;->c:Ljava/util/List;

    .line 3
    iget p1, p2, Lh3/b;->b:I

    iput p1, p0, Lh3/b;->b:I

    .line 4
    iput-object p3, p0, Lh3/b;->e:Le3/i;

    .line 5
    iput-object p4, p0, Lh3/b;->d:Le3/j;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;Ljava/util/List;ILe3/i;Le3/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Le3/i;",
            "Le3/j;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    .line 7
    iput-object p2, p0, Lh3/b;->c:Ljava/util/List;

    .line 8
    iput p3, p0, Lh3/b;->b:I

    .line 9
    iput-object p4, p0, Lh3/b;->e:Le3/i;

    .line 10
    iput-object p5, p0, Lh3/b;->d:Le3/j;

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/text/style/DynamicDrawableSpan;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    int-to-float p1, p1

    .line 12
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 13
    .line 14
    int-to-float v1, v1

    .line 15
    iget v2, p0, Lh3/b;->a:F

    .line 16
    .line 17
    add-float/2addr v1, v2

    .line 18
    cmpg-float v1, p1, v1

    .line 19
    .line 20
    if-gtz v1, :cond_0

    .line 21
    .line 22
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    int-to-float v0, v0

    .line 25
    add-float/2addr v0, v2

    .line 26
    cmpl-float p1, p1, v0

    .line 27
    .line 28
    if-ltz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    return p1
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
.end method

.method public b()Lh3/b;
    .locals 7

    new-instance v6, Lh3/b;

    const/4 v1, 0x0

    iget-object v2, p0, Lh3/b;->c:Ljava/util/List;

    iget v3, p0, Lh3/b;->b:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lh3/b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/util/List;ILe3/i;Le3/j;)V

    return-object v6
.end method

.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p9}, Landroid/text/style/DynamicDrawableSpan;->draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V

    .line 2
    .line 3
    .line 4
    iput p5, p0, Lh3/b;->a:F

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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
.end method

.method public getSource()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh3/b;->c:Ljava/util/List;

    iget v1, p0, Lh3/b;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lh3/b;->e:Le3/i;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh3/b;->c:Ljava/util/List;

    .line 6
    .line 7
    iget v1, p0, Lh3/b;->b:I

    .line 8
    .line 9
    invoke-interface {p1, v0, v1}, Le3/i;->a(Ljava/util/List;I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object p1, p0, Lh3/b;->d:Le3/j;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lh3/b;->c:Ljava/util/List;

    iget v1, p0, Lh3/b;->b:I

    invoke-interface {p1, v0, v1}, Le3/j;->a(Ljava/util/List;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
