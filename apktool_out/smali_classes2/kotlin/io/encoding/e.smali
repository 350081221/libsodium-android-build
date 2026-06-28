.class final Lkotlin/io/encoding/e;
.super Ljava/io/OutputStream;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\r\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0008\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0008\u0010\u0015\u001a\u00020\u000fH\u0002J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0008\u0010\u0017\u001a\u00020\u000fH\u0016J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkotlin/io/encoding/EncodeOutputStream;",
        "Ljava/io/OutputStream;",
        "output",
        "base64",
        "Lkotlin/io/encoding/Base64;",
        "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V",
        "byteBuffer",
        "",
        "byteBufferLength",
        "",
        "isClosed",
        "",
        "lineLength",
        "symbolBuffer",
        "checkOpen",
        "",
        "close",
        "copyIntoByteBuffer",
        "source",
        "startIndex",
        "endIndex",
        "encodeByteBufferIntoOutput",
        "encodeIntoOutput",
        "flush",
        "write",
        "offset",
        "length",
        "b",
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
.field private final a:Ljava/io/OutputStream;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:Lkotlin/io/encoding/a;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private c:Z

.field private d:I

.field private final e:[B
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final f:[B
    .annotation build Lp4/l;
    .end annotation
.end field

.field private g:I


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lkotlin/io/encoding/a;)V
    .locals 1
    .param p1    # Ljava/io/OutputStream;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/io/encoding/a;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "output"

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
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lkotlin/io/encoding/e;->a:Ljava/io/OutputStream;

    .line 15
    .line 16
    iput-object p2, p0, Lkotlin/io/encoding/e;->b:Lkotlin/io/encoding/a;

    .line 17
    .line 18
    invoke-virtual {p2}, Lkotlin/io/encoding/a;->D()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/16 p1, 0x4c

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, -0x1

    .line 28
    :goto_0
    iput p1, p0, Lkotlin/io/encoding/e;->d:I

    .line 29
    .line 30
    const/16 p1, 0x400

    .line 31
    .line 32
    new-array p1, p1, [B

    .line 33
    .line 34
    iput-object p1, p0, Lkotlin/io/encoding/e;->e:[B

    .line 35
    .line 36
    const/4 p1, 0x3

    .line 37
    new-array p1, p1, [B

    .line 38
    .line 39
    iput-object p1, p0, Lkotlin/io/encoding/e;->f:[B

    .line 40
    .line 41
    return-void
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

.method private final a()V
    .locals 2

    iget-boolean v0, p0, Lkotlin/io/encoding/e;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "The output stream is closed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final b([BII)I
    .locals 4

    .line 1
    iget v0, p0, Lkotlin/io/encoding/e;->g:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    rsub-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    sub-int/2addr p3, p2

    .line 7
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    iget-object v0, p0, Lkotlin/io/encoding/e;->f:[B

    .line 12
    .line 13
    iget v2, p0, Lkotlin/io/encoding/e;->g:I

    .line 14
    .line 15
    add-int v3, p2, p3

    .line 16
    .line 17
    invoke-static {p1, v0, v2, p2, v3}, Lkotlin/collections/l;->v0([B[BIII)[B

    .line 18
    .line 19
    .line 20
    iget p1, p0, Lkotlin/io/encoding/e;->g:I

    .line 21
    .line 22
    add-int/2addr p1, p3

    .line 23
    iput p1, p0, Lkotlin/io/encoding/e;->g:I

    .line 24
    .line 25
    if-ne p1, v1, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lkotlin/io/encoding/e;->c()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return p3
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

.method private final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlin/io/encoding/e;->f:[B

    .line 2
    .line 3
    iget v1, p0, Lkotlin/io/encoding/e;->g:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {p0, v0, v2, v1}, Lkotlin/io/encoding/e;->d([BII)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x4

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput v2, p0, Lkotlin/io/encoding/e;->g:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Check failed."

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
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

.method private final d([BII)I
    .locals 6

    .line 1
    iget-object v0, p0, Lkotlin/io/encoding/e;->b:Lkotlin/io/encoding/a;

    .line 2
    .line 3
    iget-object v2, p0, Lkotlin/io/encoding/e;->e:[B

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v1, p1

    .line 7
    move v4, p2

    .line 8
    move v5, p3

    .line 9
    invoke-virtual/range {v0 .. v5}, Lkotlin/io/encoding/a;->t([B[BIII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget p2, p0, Lkotlin/io/encoding/e;->d:I

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    if-nez p2, :cond_2

    .line 17
    .line 18
    iget-object p2, p0, Lkotlin/io/encoding/e;->a:Ljava/io/OutputStream;

    .line 19
    .line 20
    sget-object v0, Lkotlin/io/encoding/a;->c:Lkotlin/io/encoding/a$a;

    .line 21
    .line 22
    invoke-virtual {v0}, Lkotlin/io/encoding/a$a;->H()[B

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 27
    .line 28
    .line 29
    const/16 p2, 0x4c

    .line 30
    .line 31
    iput p2, p0, Lkotlin/io/encoding/e;->d:I

    .line 32
    .line 33
    if-gt p1, p2, :cond_0

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move p2, p3

    .line 38
    :goto_0
    if-eqz p2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "Check failed."

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    :goto_1
    iget-object p2, p0, Lkotlin/io/encoding/e;->a:Ljava/io/OutputStream;

    .line 54
    .line 55
    iget-object v0, p0, Lkotlin/io/encoding/e;->e:[B

    .line 56
    .line 57
    invoke-virtual {p2, v0, p3, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 58
    .line 59
    .line 60
    iget p2, p0, Lkotlin/io/encoding/e;->d:I

    .line 61
    .line 62
    sub-int/2addr p2, p1

    .line 63
    iput p2, p0, Lkotlin/io/encoding/e;->d:I

    .line 64
    .line 65
    return p1
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


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkotlin/io/encoding/e;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lkotlin/io/encoding/e;->c:Z

    .line 7
    .line 8
    iget v0, p0, Lkotlin/io/encoding/e;->g:I

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lkotlin/io/encoding/e;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lkotlin/io/encoding/e;->a:Ljava/io/OutputStream;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
    .line 21
.end method

.method public flush()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlin/io/encoding/e;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/io/encoding/e;->a:Ljava/io/OutputStream;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public write(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lkotlin/io/encoding/e;->a()V

    .line 2
    iget-object v0, p0, Lkotlin/io/encoding/e;->f:[B

    iget v1, p0, Lkotlin/io/encoding/e;->g:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lkotlin/io/encoding/e;->g:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    const/4 p1, 0x3

    if-ne v2, p1, :cond_0

    .line 3
    invoke-direct {p0}, Lkotlin/io/encoding/e;->c()V

    :cond_0
    return-void
.end method

.method public write([BII)V
    .locals 6
    .param p1    # [B
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lkotlin/io/encoding/e;->a()V

    if-ltz p2, :cond_8

    if-ltz p3, :cond_8

    add-int v0, p2, p3

    .line 5
    array-length v1, p1

    if-gt v0, v1, :cond_8

    if-nez p3, :cond_0

    return-void

    .line 6
    :cond_0
    iget p3, p0, Lkotlin/io/encoding/e;->g:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-ge p3, v3, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    const-string v5, "Check failed."

    if-eqz v4, :cond_7

    if-eqz p3, :cond_2

    .line 7
    invoke-direct {p0, p1, p2, v0}, Lkotlin/io/encoding/e;->b([BII)I

    move-result p3

    add-int/2addr p2, p3

    .line 8
    iget p3, p0, Lkotlin/io/encoding/e;->g:I

    if-eqz p3, :cond_2

    return-void

    :cond_2
    :goto_1
    add-int/lit8 p3, p2, 0x3

    if-gt p3, v0, :cond_6

    .line 9
    iget-object p3, p0, Lkotlin/io/encoding/e;->b:Lkotlin/io/encoding/a;

    invoke-virtual {p3}, Lkotlin/io/encoding/a;->D()Z

    move-result p3

    if-eqz p3, :cond_3

    iget p3, p0, Lkotlin/io/encoding/e;->d:I

    goto :goto_2

    :cond_3
    iget-object p3, p0, Lkotlin/io/encoding/e;->e:[B

    array-length p3, p3

    :goto_2
    div-int/lit8 p3, p3, 0x4

    sub-int v4, v0, p2

    .line 10
    div-int/2addr v4, v3

    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    move-result p3

    mul-int/lit8 v4, p3, 0x3

    add-int/2addr v4, p2

    .line 11
    invoke-direct {p0, p1, p2, v4}, Lkotlin/io/encoding/e;->d([BII)I

    move-result p2

    mul-int/lit8 p3, p3, 0x4

    if-ne p2, p3, :cond_4

    move p2, v1

    goto :goto_3

    :cond_4
    move p2, v2

    :goto_3
    if-eqz p2, :cond_5

    move p2, v4

    goto :goto_1

    .line 12
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_6
    iget-object p3, p0, Lkotlin/io/encoding/e;->f:[B

    invoke-static {p1, p3, v2, p2, v0}, Lkotlin/collections/l;->v0([B[BIII)[B

    sub-int/2addr v0, p2

    .line 14
    iput v0, p0, Lkotlin/io/encoding/e;->g:I

    return-void

    .line 15
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_8
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "offset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", length: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", source size: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
