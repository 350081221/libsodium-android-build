.class final Lkotlin/io/encoding/d;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u000f\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0008\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0008\u0010 \u001a\u00020\tH\u0002J\u0008\u0010!\u001a\u00020\u0014H\u0002J\u0008\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lkotlin/io/encoding/DecodeInputStream;",
        "Ljava/io/InputStream;",
        "input",
        "base64",
        "Lkotlin/io/encoding/Base64;",
        "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V",
        "byteBuffer",
        "",
        "byteBufferEndIndex",
        "",
        "byteBufferLength",
        "getByteBufferLength",
        "()I",
        "byteBufferStartIndex",
        "isClosed",
        "",
        "isEOF",
        "singleByteBuffer",
        "symbolBuffer",
        "close",
        "",
        "copyByteBufferInto",
        "dst",
        "dstOffset",
        "length",
        "decodeSymbolBufferInto",
        "dstEndIndex",
        "symbolBufferLength",
        "handlePaddingSymbol",
        "read",
        "destination",
        "offset",
        "readNextSymbol",
        "resetByteBufferIfEmpty",
        "shiftByteBufferToStartIfNeeded",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/io/encoding/f;
.end annotation


# instance fields
.field private final a:Ljava/io/InputStream;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:Lkotlin/io/encoding/a;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private c:Z

.field private d:Z

.field private final e:[B
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final f:[B
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final g:[B
    .annotation build Lp4/l;
    .end annotation
.end field

.field private h:I

.field private i:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lkotlin/io/encoding/a;)V
    .locals 1
    .param p1    # Ljava/io/InputStream;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/io/encoding/a;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "base64"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lkotlin/io/encoding/d;->a:Ljava/io/InputStream;

    .line 15
    .line 16
    iput-object p2, p0, Lkotlin/io/encoding/d;->b:Lkotlin/io/encoding/a;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    new-array p1, p1, [B

    .line 20
    .line 21
    iput-object p1, p0, Lkotlin/io/encoding/d;->e:[B

    .line 22
    .line 23
    const/16 p1, 0x400

    .line 24
    .line 25
    new-array p2, p1, [B

    .line 26
    .line 27
    iput-object p2, p0, Lkotlin/io/encoding/d;->f:[B

    .line 28
    .line 29
    new-array p1, p1, [B

    .line 30
    .line 31
    iput-object p1, p0, Lkotlin/io/encoding/d;->g:[B

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
.end method

.method private final a([BII)V
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlin/io/encoding/d;->g:[B

    .line 2
    .line 3
    iget v1, p0, Lkotlin/io/encoding/d;->h:I

    .line 4
    .line 5
    add-int v2, v1, p3

    .line 6
    .line 7
    invoke-static {v0, p1, p2, v1, v2}, Lkotlin/collections/l;->v0([B[BIII)[B

    .line 8
    .line 9
    .line 10
    iget p1, p0, Lkotlin/io/encoding/d;->h:I

    .line 11
    .line 12
    add-int/2addr p1, p3

    .line 13
    iput p1, p0, Lkotlin/io/encoding/d;->h:I

    .line 14
    .line 15
    invoke-direct {p0}, Lkotlin/io/encoding/d;->j()V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method

.method private final b([BIII)I
    .locals 7

    .line 1
    iget v6, p0, Lkotlin/io/encoding/d;->i:I

    .line 2
    .line 3
    iget-object v0, p0, Lkotlin/io/encoding/d;->b:Lkotlin/io/encoding/a;

    .line 4
    .line 5
    iget-object v1, p0, Lkotlin/io/encoding/d;->f:[B

    .line 6
    .line 7
    iget-object v2, p0, Lkotlin/io/encoding/d;->g:[B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    move v3, v6

    .line 11
    move v5, p4

    .line 12
    invoke-virtual/range {v0 .. v5}, Lkotlin/io/encoding/a;->n([B[BIII)I

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    add-int/2addr v6, p4

    .line 17
    iput v6, p0, Lkotlin/io/encoding/d;->i:I

    .line 18
    .line 19
    invoke-direct {p0}, Lkotlin/io/encoding/d;->c()I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    sub-int/2addr p3, p2

    .line 24
    invoke-static {p4, p3}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lkotlin/io/encoding/d;->a([BII)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lkotlin/io/encoding/d;->m()V

    .line 32
    .line 33
    .line 34
    return p3
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
.end method

.method private final c()I
    .locals 2

    iget v0, p0, Lkotlin/io/encoding/d;->i:I

    iget v1, p0, Lkotlin/io/encoding/d;->h:I

    sub-int/2addr v0, v1

    return v0
.end method

.method private final d(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lkotlin/io/encoding/d;->f:[B

    .line 2
    .line 3
    const/16 v1, 0x3d

    .line 4
    .line 5
    aput-byte v1, v0, p1

    .line 6
    .line 7
    and-int/lit8 v0, p1, 0x3

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    invoke-direct {p0}, Lkotlin/io/encoding/d;->h()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ltz v0, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lkotlin/io/encoding/d;->f:[B

    .line 19
    .line 20
    add-int/lit8 v3, p1, 0x1

    .line 21
    .line 22
    int-to-byte v0, v0

    .line 23
    aput-byte v0, v2, v3

    .line 24
    .line 25
    :cond_0
    add-int/2addr p1, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    :goto_0
    return p1
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
.end method

.method private final h()I
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlin/io/encoding/d;->b:Lkotlin/io/encoding/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlin/io/encoding/a;->D()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lkotlin/io/encoding/d;->a:Ljava/io/InputStream;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    iget-object v0, p0, Lkotlin/io/encoding/d;->a:Ljava/io/InputStream;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, -0x1

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/io/encoding/c;->i(I)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    :cond_1
    return v0
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
.end method

.method private final j()V
    .locals 2

    .line 1
    iget v0, p0, Lkotlin/io/encoding/d;->h:I

    .line 2
    .line 3
    iget v1, p0, Lkotlin/io/encoding/d;->i:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lkotlin/io/encoding/d;->h:I

    .line 9
    .line 10
    iput v0, p0, Lkotlin/io/encoding/d;->i:I

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
.end method

.method private final m()V
    .locals 4

    .line 1
    iget-object v0, p0, Lkotlin/io/encoding/d;->g:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget v2, p0, Lkotlin/io/encoding/d;->i:I

    .line 5
    .line 6
    sub-int/2addr v1, v2

    .line 7
    iget-object v3, p0, Lkotlin/io/encoding/d;->f:[B

    .line 8
    .line 9
    array-length v3, v3

    .line 10
    div-int/lit8 v3, v3, 0x4

    .line 11
    .line 12
    mul-int/lit8 v3, v3, 0x3

    .line 13
    .line 14
    if-le v3, v1, :cond_0

    .line 15
    .line 16
    iget v1, p0, Lkotlin/io/encoding/d;->h:I

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {v0, v0, v3, v1, v2}, Lkotlin/collections/l;->v0([B[BIII)[B

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lkotlin/io/encoding/d;->i:I

    .line 23
    .line 24
    iget v1, p0, Lkotlin/io/encoding/d;->h:I

    .line 25
    .line 26
    sub-int/2addr v0, v1

    .line 27
    iput v0, p0, Lkotlin/io/encoding/d;->i:I

    .line 28
    .line 29
    iput v3, p0, Lkotlin/io/encoding/d;->h:I

    .line 30
    .line 31
    :cond_0
    return-void
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
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlin/io/encoding/d;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lkotlin/io/encoding/d;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, Lkotlin/io/encoding/d;->a:Ljava/io/InputStream;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public read()I
    .locals 4

    .line 1
    iget v0, p0, Lkotlin/io/encoding/d;->h:I

    iget v1, p0, Lkotlin/io/encoding/d;->i:I

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lkotlin/io/encoding/d;->g:[B

    aget-byte v1, v1, v0

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v2

    .line 3
    iput v0, p0, Lkotlin/io/encoding/d;->h:I

    .line 4
    invoke-direct {p0}, Lkotlin/io/encoding/d;->j()V

    return v1

    .line 5
    :cond_0
    iget-object v0, p0, Lkotlin/io/encoding/d;->e:[B

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lkotlin/io/encoding/d;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_2

    if-ne v0, v2, :cond_1

    .line 6
    iget-object v0, p0, Lkotlin/io/encoding/d;->e:[B

    aget-byte v0, v0, v1

    and-int/lit16 v3, v0, 0xff

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unreachable"

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return v3
.end method

.method public read([BII)I
    .locals 9
    .param p1    # [B
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_c

    if-ltz p3, :cond_c

    add-int v0, p2, p3

    .line 8
    array-length v1, p1

    if-gt v0, v1, :cond_c

    .line 9
    iget-boolean v1, p0, Lkotlin/io/encoding/d;->c:Z

    if-nez v1, :cond_b

    .line 10
    iget-boolean v1, p0, Lkotlin/io/encoding/d;->d:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x0

    if-nez p3, :cond_1

    return v1

    .line 11
    :cond_1
    invoke-direct {p0}, Lkotlin/io/encoding/d;->c()I

    move-result v3

    if-lt v3, p3, :cond_2

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lkotlin/io/encoding/d;->a([BII)V

    return p3

    .line 13
    :cond_2
    invoke-direct {p0}, Lkotlin/io/encoding/d;->c()I

    move-result v3

    sub-int/2addr p3, v3

    add-int/lit8 p3, p3, 0x3

    const/4 v3, 0x1

    sub-int/2addr p3, v3

    .line 14
    div-int/lit8 p3, p3, 0x3

    mul-int/lit8 p3, p3, 0x4

    move v4, p2

    .line 15
    :goto_0
    iget-boolean v5, p0, Lkotlin/io/encoding/d;->d:Z

    if-nez v5, :cond_9

    if-lez p3, :cond_9

    .line 16
    iget-object v5, p0, Lkotlin/io/encoding/d;->f:[B

    array-length v5, v5

    invoke-static {v5, p3}, Ljava/lang/Math;->min(II)I

    move-result v5

    move v6, v1

    .line 17
    :goto_1
    iget-boolean v7, p0, Lkotlin/io/encoding/d;->d:Z

    if-nez v7, :cond_5

    if-ge v6, v5, :cond_5

    .line 18
    invoke-direct {p0}, Lkotlin/io/encoding/d;->h()I

    move-result v7

    if-eq v7, v2, :cond_4

    const/16 v8, 0x3d

    if-eq v7, v8, :cond_3

    .line 19
    iget-object v8, p0, Lkotlin/io/encoding/d;->f:[B

    int-to-byte v7, v7

    aput-byte v7, v8, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 20
    :cond_3
    invoke-direct {p0, v6}, Lkotlin/io/encoding/d;->d(I)I

    move-result v6

    .line 21
    iput-boolean v3, p0, Lkotlin/io/encoding/d;->d:Z

    goto :goto_1

    .line 22
    :cond_4
    iput-boolean v3, p0, Lkotlin/io/encoding/d;->d:Z

    goto :goto_1

    :cond_5
    if-nez v7, :cond_7

    if-ne v6, v5, :cond_6

    goto :goto_2

    :cond_6
    move v5, v1

    goto :goto_3

    :cond_7
    :goto_2
    move v5, v3

    :goto_3
    if-eqz v5, :cond_8

    sub-int/2addr p3, v6

    .line 23
    invoke-direct {p0, p1, v4, v0, v6}, Lkotlin/io/encoding/d;->b([BIII)I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_0

    .line 24
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    if-ne v4, p2, :cond_a

    if-eqz v5, :cond_a

    goto :goto_4

    :cond_a
    sub-int v2, v4, p2

    :goto_4
    return v2

    .line 25
    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string p2, "The input stream is closed."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_c
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "offset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", length: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", buffer size: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
