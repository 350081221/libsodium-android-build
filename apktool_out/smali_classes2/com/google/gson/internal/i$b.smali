.class final Lcom/google/gson/internal/i$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/gson/internal/i$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/internal/i$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/google/gson/internal/i$g;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/internal/i$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p1, Lcom/google/gson/internal/i$g;->c:Lcom/google/gson/internal/i$g;

    .line 3
    .line 4
    iput-object v0, p1, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 5
    .line 6
    iput-object v0, p1, Lcom/google/gson/internal/i$g;->b:Lcom/google/gson/internal/i$g;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput v0, p1, Lcom/google/gson/internal/i$g;->i:I

    .line 10
    .line 11
    iget v1, p0, Lcom/google/gson/internal/i$b;->b:I

    .line 12
    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    iget v2, p0, Lcom/google/gson/internal/i$b;->d:I

    .line 16
    .line 17
    and-int/lit8 v3, v2, 0x1

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    iput v2, p0, Lcom/google/gson/internal/i$b;->d:I

    .line 23
    .line 24
    sub-int/2addr v1, v0

    .line 25
    iput v1, p0, Lcom/google/gson/internal/i$b;->b:I

    .line 26
    .line 27
    iget v1, p0, Lcom/google/gson/internal/i$b;->c:I

    .line 28
    .line 29
    add-int/2addr v1, v0

    .line 30
    iput v1, p0, Lcom/google/gson/internal/i$b;->c:I

    .line 31
    .line 32
    :cond_0
    iget-object v1, p0, Lcom/google/gson/internal/i$b;->a:Lcom/google/gson/internal/i$g;

    .line 33
    .line 34
    iput-object v1, p1, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/google/gson/internal/i$b;->a:Lcom/google/gson/internal/i$g;

    .line 37
    .line 38
    iget p1, p0, Lcom/google/gson/internal/i$b;->d:I

    .line 39
    .line 40
    add-int/2addr p1, v0

    .line 41
    iput p1, p0, Lcom/google/gson/internal/i$b;->d:I

    .line 42
    .line 43
    iget v1, p0, Lcom/google/gson/internal/i$b;->b:I

    .line 44
    .line 45
    if-lez v1, :cond_1

    .line 46
    .line 47
    and-int/lit8 v2, p1, 0x1

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    add-int/2addr p1, v0

    .line 52
    iput p1, p0, Lcom/google/gson/internal/i$b;->d:I

    .line 53
    .line 54
    sub-int/2addr v1, v0

    .line 55
    iput v1, p0, Lcom/google/gson/internal/i$b;->b:I

    .line 56
    .line 57
    iget p1, p0, Lcom/google/gson/internal/i$b;->c:I

    .line 58
    .line 59
    add-int/2addr p1, v0

    .line 60
    iput p1, p0, Lcom/google/gson/internal/i$b;->c:I

    .line 61
    .line 62
    :cond_1
    const/4 p1, 0x4

    .line 63
    :goto_0
    iget v1, p0, Lcom/google/gson/internal/i$b;->d:I

    .line 64
    .line 65
    add-int/lit8 v2, p1, -0x1

    .line 66
    .line 67
    and-int/2addr v1, v2

    .line 68
    if-ne v1, v2, :cond_5

    .line 69
    .line 70
    iget v1, p0, Lcom/google/gson/internal/i$b;->c:I

    .line 71
    .line 72
    if-nez v1, :cond_2

    .line 73
    .line 74
    iget-object v1, p0, Lcom/google/gson/internal/i$b;->a:Lcom/google/gson/internal/i$g;

    .line 75
    .line 76
    iget-object v2, v1, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 77
    .line 78
    iget-object v3, v2, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 79
    .line 80
    iget-object v4, v3, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 81
    .line 82
    iput-object v4, v2, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 83
    .line 84
    iput-object v2, p0, Lcom/google/gson/internal/i$b;->a:Lcom/google/gson/internal/i$g;

    .line 85
    .line 86
    iput-object v3, v2, Lcom/google/gson/internal/i$g;->b:Lcom/google/gson/internal/i$g;

    .line 87
    .line 88
    iput-object v1, v2, Lcom/google/gson/internal/i$g;->c:Lcom/google/gson/internal/i$g;

    .line 89
    .line 90
    iget v4, v1, Lcom/google/gson/internal/i$g;->i:I

    .line 91
    .line 92
    add-int/2addr v4, v0

    .line 93
    iput v4, v2, Lcom/google/gson/internal/i$g;->i:I

    .line 94
    .line 95
    iput-object v2, v3, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 96
    .line 97
    iput-object v2, v1, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    const/4 v2, 0x0

    .line 101
    if-ne v1, v0, :cond_3

    .line 102
    .line 103
    iget-object v1, p0, Lcom/google/gson/internal/i$b;->a:Lcom/google/gson/internal/i$g;

    .line 104
    .line 105
    iget-object v3, v1, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 106
    .line 107
    iput-object v3, p0, Lcom/google/gson/internal/i$b;->a:Lcom/google/gson/internal/i$g;

    .line 108
    .line 109
    iput-object v1, v3, Lcom/google/gson/internal/i$g;->c:Lcom/google/gson/internal/i$g;

    .line 110
    .line 111
    iget v4, v1, Lcom/google/gson/internal/i$g;->i:I

    .line 112
    .line 113
    add-int/2addr v4, v0

    .line 114
    iput v4, v3, Lcom/google/gson/internal/i$g;->i:I

    .line 115
    .line 116
    iput-object v3, v1, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 117
    .line 118
    iput v2, p0, Lcom/google/gson/internal/i$b;->c:I

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    const/4 v3, 0x2

    .line 122
    if-ne v1, v3, :cond_4

    .line 123
    .line 124
    iput v2, p0, Lcom/google/gson/internal/i$b;->c:I

    .line 125
    .line 126
    :cond_4
    :goto_1
    mul-int/lit8 p1, p1, 0x2

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_5
    return-void
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
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method

.method b(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    sub-int/2addr v0, p1

    .line 10
    iput v0, p0, Lcom/google/gson/internal/i$b;->b:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/google/gson/internal/i$b;->d:I

    .line 14
    .line 15
    iput p1, p0, Lcom/google/gson/internal/i$b;->c:I

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lcom/google/gson/internal/i$b;->a:Lcom/google/gson/internal/i$g;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method c()Lcom/google/gson/internal/i$g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/gson/internal/i$g<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/i$b;->a:Lcom/google/gson/internal/i$g;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/gson/internal/i$g;->a:Lcom/google/gson/internal/i$g;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
