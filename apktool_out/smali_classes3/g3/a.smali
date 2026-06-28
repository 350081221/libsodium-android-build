.class public Lg3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg3/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/text/SpannableStringBuilder;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-class v1, Lg3/a$a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [Lg3/a$a;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    array-length v1, v0

    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    aget-object v3, v0, v2

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
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
.end method

.method private b(Landroid/text/SpannableStringBuilder;Lcom/zzhoujay/richtext/g;Z)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    const-class v1, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;

    .line 9
    .line 10
    invoke-virtual {p1, v0, p3, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    check-cast p3, [Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;

    .line 15
    .line 16
    if-eqz p3, :cond_4

    .line 17
    .line 18
    array-length v1, p3

    .line 19
    if-lez v1, :cond_4

    .line 20
    .line 21
    array-length v1, p3

    .line 22
    :goto_0
    if-ge v0, v1, :cond_4

    .line 23
    .line 24
    aget-object v2, p3, v0

    .line 25
    .line 26
    invoke-direct {p0, p1, p2, v2}, Lg3/a;->f(Landroid/text/SpannableStringBuilder;Lcom/zzhoujay/richtext/g;Landroid/text/style/URLSpan;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget p3, p2, Lcom/zzhoujay/richtext/g;->m:I

    .line 33
    .line 34
    const-class v1, Landroid/text/style/URLSpan;

    .line 35
    .line 36
    if-ltz p3, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    invoke-virtual {p1, v0, p3, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    check-cast p3, [Landroid/text/style/URLSpan;

    .line 47
    .line 48
    if-nez p3, :cond_1

    .line 49
    .line 50
    move v1, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    array-length v1, p3

    .line 53
    :goto_1
    if-ge v0, v1, :cond_4

    .line 54
    .line 55
    aget-object v2, p3, v0

    .line 56
    .line 57
    invoke-direct {p0, p1, p2, v2}, Lg3/a;->f(Landroid/text/SpannableStringBuilder;Lcom/zzhoujay/richtext/g;Landroid/text/style/URLSpan;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {p1, v0, p2, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, [Landroid/text/style/URLSpan;

    .line 72
    .line 73
    if-nez p2, :cond_3

    .line 74
    .line 75
    move p3, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    array-length p3, p2

    .line 78
    :goto_2
    if-ge v0, p3, :cond_4

    .line 79
    .line 80
    aget-object v1, p2, v0

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    return-void
    .line 89
    .line 90
.end method

.method private c(Landroid/text/SpannableStringBuilder;Lg3/c;Lcom/zzhoujay/richtext/g;Z)I
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/16 v3, 0x21

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz p4, :cond_3

    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    const-class v7, Lh3/b;

    .line 17
    .line 18
    invoke-virtual {v0, v5, v6, v7}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    check-cast v6, [Lh3/b;

    .line 23
    .line 24
    if-eqz v6, :cond_8

    .line 25
    .line 26
    array-length v7, v6

    .line 27
    if-lez v7, :cond_8

    .line 28
    .line 29
    array-length v7, v6

    .line 30
    move v8, v5

    .line 31
    :goto_0
    if-ge v8, v7, :cond_2

    .line 32
    .line 33
    aget-object v9, v6, v8

    .line 34
    .line 35
    invoke-virtual {v0, v9}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    invoke-virtual {v0, v9}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    invoke-virtual {v0, v9}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget v12, v2, Lcom/zzhoujay/richtext/g;->m:I

    .line 47
    .line 48
    if-lez v12, :cond_0

    .line 49
    .line 50
    iget-object v12, v2, Lcom/zzhoujay/richtext/g;->n:Le3/i;

    .line 51
    .line 52
    iget-object v13, v2, Lcom/zzhoujay/richtext/g;->p:Le3/j;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    :goto_1
    invoke-virtual {v9}, Lh3/b;->getSource()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    invoke-interface {v1, v14}, Lg3/c;->getDrawable(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    .line 64
    move-result-object v14

    .line 65
    if-nez v14, :cond_1

    .line 66
    .line 67
    new-instance v14, Landroid/graphics/drawable/ColorDrawable;

    .line 68
    .line 69
    invoke-direct {v14, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 70
    .line 71
    .line 72
    :cond_1
    new-instance v15, Lh3/b;

    .line 73
    .line 74
    invoke-direct {v15, v14, v9, v12, v13}, Lh3/b;-><init>(Landroid/graphics/drawable/Drawable;Lh3/b;Le3/i;Le3/j;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v15, v10, v11, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    array-length v0, v6

    .line 84
    return v0

    .line 85
    :cond_3
    iget-boolean v6, v2, Lcom/zzhoujay/richtext/g;->l:Z

    .line 86
    .line 87
    if-nez v6, :cond_8

    .line 88
    .line 89
    invoke-virtual/range {p1 .. p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const-class v7, Landroid/text/style/ImageSpan;

    .line 94
    .line 95
    invoke-virtual {v0, v5, v6, v7}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    check-cast v6, [Landroid/text/style/ImageSpan;

    .line 100
    .line 101
    if-eqz v6, :cond_8

    .line 102
    .line 103
    array-length v7, v6

    .line 104
    if-lez v7, :cond_8

    .line 105
    .line 106
    new-instance v7, Ljava/util/ArrayList;

    .line 107
    .line 108
    array-length v8, v6

    .line 109
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    .line 111
    .line 112
    move v14, v5

    .line 113
    :goto_2
    array-length v8, v6

    .line 114
    if-ge v14, v8, :cond_7

    .line 115
    .line 116
    aget-object v15, v6, v14

    .line 117
    .line 118
    invoke-virtual {v15}, Landroid/text/style/ImageSpan;->getSource()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v15}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    invoke-virtual {v0, v15}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    const-class v9, Landroid/text/style/ClickableSpan;

    .line 134
    .line 135
    invoke-virtual {v0, v13, v12, v9}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    check-cast v9, [Landroid/text/style/ClickableSpan;

    .line 140
    .line 141
    if-eqz v9, :cond_4

    .line 142
    .line 143
    array-length v10, v9

    .line 144
    if-eqz v10, :cond_4

    .line 145
    .line 146
    array-length v10, v9

    .line 147
    move v11, v5

    .line 148
    :goto_3
    if-ge v11, v10, :cond_4

    .line 149
    .line 150
    aget-object v4, v9, v11

    .line 151
    .line 152
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v11, v11, 0x1

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_4
    iget v4, v2, Lcom/zzhoujay/richtext/g;->m:I

    .line 159
    .line 160
    if-lez v4, :cond_5

    .line 161
    .line 162
    iget-object v4, v2, Lcom/zzhoujay/richtext/g;->n:Le3/i;

    .line 163
    .line 164
    iget-object v9, v2, Lcom/zzhoujay/richtext/g;->p:Le3/j;

    .line 165
    .line 166
    move-object/from16 v16, v9

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_5
    const/4 v4, 0x0

    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    :goto_4
    invoke-interface {v1, v8}, Lg3/c;->getDrawable(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    if-nez v8, :cond_6

    .line 177
    .line 178
    new-instance v8, Landroid/graphics/drawable/ColorDrawable;

    .line 179
    .line 180
    invoke-direct {v8, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 181
    .line 182
    .line 183
    :cond_6
    move-object v9, v8

    .line 184
    new-instance v11, Lh3/b;

    .line 185
    .line 186
    move-object v8, v11

    .line 187
    move-object v10, v7

    .line 188
    move-object v5, v11

    .line 189
    move v11, v14

    .line 190
    move v1, v12

    .line 191
    move-object v12, v4

    .line 192
    move v4, v13

    .line 193
    move-object/from16 v13, v16

    .line 194
    .line 195
    invoke-direct/range {v8 .. v13}, Lh3/b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/util/List;ILe3/i;Le3/j;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v15}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v5, v4, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 202
    .line 203
    .line 204
    add-int/lit8 v14, v14, 0x1

    .line 205
    .line 206
    move-object/from16 v1, p2

    .line 207
    .line 208
    const/4 v5, 0x0

    .line 209
    goto :goto_2

    .line 210
    :cond_7
    array-length v0, v6

    .line 211
    return v0

    .line 212
    :cond_8
    move v0, v5

    .line 213
    return v0
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
.end method

.method private d(Landroid/text/SpannableStringBuilder;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-class v1, Lg3/a$a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, [Lg3/a$a;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    array-length p1, p1

    .line 17
    if-lez p1, :cond_0

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    :cond_0
    return v2
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private f(Landroid/text/SpannableStringBuilder;Lcom/zzhoujay/richtext/g;Landroid/text/style/URLSpan;)V
    .locals 4

    .line 1
    invoke-virtual {p1, p3}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, p3}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1, p3}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lcom/zzhoujay/richtext/d;

    .line 13
    .line 14
    invoke-virtual {p3}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-direct {v2, p3}, Lcom/zzhoujay/richtext/d;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p3, p2, Lcom/zzhoujay/richtext/g;->k:Le3/h;

    .line 22
    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    invoke-interface {p3, v2}, Le3/h;->a(Lcom/zzhoujay/richtext/d;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance p3, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;

    .line 29
    .line 30
    iget-object v3, p2, Lcom/zzhoujay/richtext/g;->o:Le3/k;

    .line 31
    .line 32
    iget-object p2, p2, Lcom/zzhoujay/richtext/g;->q:Le3/l;

    .line 33
    .line 34
    invoke-direct {p3, v2, v3, p2}, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;-><init>(Lcom/zzhoujay/richtext/d;Le3/k;Le3/l;)V

    .line 35
    .line 36
    .line 37
    const/16 p2, 0x21

    .line 38
    .line 39
    invoke-virtual {p1, p3, v0, v1, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 40
    .line 41
    .line 42
    return-void
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
.method public e(Landroid/text/SpannableStringBuilder;Lg3/c;Lcom/zzhoujay/richtext/g;)I
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lg3/a;->d(Landroid/text/SpannableStringBuilder;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p1, p3, v0}, Lg3/a;->b(Landroid/text/SpannableStringBuilder;Lcom/zzhoujay/richtext/g;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p2, p3, v0}, Lg3/a;->c(Landroid/text/SpannableStringBuilder;Lg3/c;Lcom/zzhoujay/richtext/g;Z)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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
