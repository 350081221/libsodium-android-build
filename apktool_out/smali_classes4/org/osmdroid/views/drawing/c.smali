.class public Lorg/osmdroid/views/drawing/c;
.super Landroid/graphics/BitmapShader;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final d:Lorg/osmdroid/util/PointL;


# instance fields
.field private final a:Landroid/graphics/Matrix;

.field private b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/osmdroid/util/PointL;

    invoke-direct {v0}, Lorg/osmdroid/util/PointL;-><init>()V

    sput-object v0, Lorg/osmdroid/views/drawing/c;->d:Lorg/osmdroid/util/PointL;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lorg/osmdroid/views/drawing/c;->a:Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iput p2, p0, Lorg/osmdroid/views/drawing/c;->b:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lorg/osmdroid/views/drawing/c;->c:I

    .line 22
    .line 23
    return-void
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
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
.end method


# virtual methods
.method public a(Lorg/osmdroid/views/Projection;)V
    .locals 6

    .line 1
    sget-object v0, Lorg/osmdroid/views/drawing/c;->d:Lorg/osmdroid/util/PointL;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v1, v1, v0}, Lorg/osmdroid/views/Projection;->toMercatorPixels(IILorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lorg/osmdroid/views/drawing/c;->a:Landroid/graphics/Matrix;

    .line 8
    .line 9
    iget-wide v1, v0, Lorg/osmdroid/util/PointL;->x:J

    .line 10
    .line 11
    neg-long v1, v1

    .line 12
    iget v3, p0, Lorg/osmdroid/views/drawing/c;->b:I

    .line 13
    .line 14
    int-to-long v3, v3

    .line 15
    rem-long/2addr v1, v3

    .line 16
    long-to-float v1, v1

    .line 17
    iget-wide v2, v0, Lorg/osmdroid/util/PointL;->y:J

    .line 18
    .line 19
    neg-long v2, v2

    .line 20
    iget v0, p0, Lorg/osmdroid/views/drawing/c;->c:I

    .line 21
    .line 22
    int-to-long v4, v0

    .line 23
    rem-long/2addr v2, v4

    .line 24
    long-to-float v0, v2

    .line 25
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lorg/osmdroid/views/drawing/c;->a:Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 31
    .line 32
    .line 33
    return-void
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
