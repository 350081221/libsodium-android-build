.class final Lokio/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/l1;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lokio/OutputStreamSink;",
        "Lokio/Sink;",
        "out",
        "Ljava/io/OutputStream;",
        "timeout",
        "Lokio/Timeout;",
        "(Ljava/io/OutputStream;Lokio/Timeout;)V",
        "close",
        "",
        "flush",
        "toString",
        "",
        "write",
        "source",
        "Lokio/Buffer;",
        "byteCount",
        "",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"
    }
.end annotation


# instance fields
.field private final a:Ljava/io/OutputStream;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:Lokio/p1;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lokio/p1;)V
    .locals 1
    .param p1    # Ljava/io/OutputStream;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lokio/p1;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "out"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lokio/c1;->a:Ljava/io/OutputStream;

    .line 15
    .line 16
    iput-object p2, p0, Lokio/c1;->b:Lokio/p1;

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
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lokio/c1;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lokio/c1;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public timeout()Lokio/p1;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lokio/c1;->b:Lokio/p1;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sink("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lokio/c1;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Lokio/l;J)V
    .locals 7
    .param p1    # Lokio/l;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lokio/l;->M0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    move-wide v5, p2

    .line 13
    invoke-static/range {v1 .. v6}, Lokio/i;->e(JJJ)V

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long v0, p2, v0

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lokio/c1;->b:Lokio/p1;

    .line 23
    .line 24
    invoke-virtual {v0}, Lokio/p1;->throwIfReached()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p1, Lokio/l;->a:Lokio/i1;

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget v1, v0, Lokio/i1;->c:I

    .line 33
    .line 34
    iget v2, v0, Lokio/i1;->b:I

    .line 35
    .line 36
    sub-int/2addr v1, v2

    .line 37
    int-to-long v1, v1

    .line 38
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    long-to-int v1, v1

    .line 43
    iget-object v2, p0, Lokio/c1;->a:Ljava/io/OutputStream;

    .line 44
    .line 45
    iget-object v3, v0, Lokio/i1;->a:[B

    .line 46
    .line 47
    iget v4, v0, Lokio/i1;->b:I

    .line 48
    .line 49
    invoke-virtual {v2, v3, v4, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 50
    .line 51
    .line 52
    iget v2, v0, Lokio/i1;->b:I

    .line 53
    .line 54
    add-int/2addr v2, v1

    .line 55
    iput v2, v0, Lokio/i1;->b:I

    .line 56
    .line 57
    int-to-long v1, v1

    .line 58
    sub-long/2addr p2, v1

    .line 59
    invoke-virtual {p1}, Lokio/l;->M0()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    sub-long/2addr v3, v1

    .line 64
    invoke-virtual {p1, v3, v4}, Lokio/l;->I0(J)V

    .line 65
    .line 66
    .line 67
    iget v1, v0, Lokio/i1;->b:I

    .line 68
    .line 69
    iget v2, v0, Lokio/i1;->c:I

    .line 70
    .line 71
    if-ne v1, v2, :cond_0

    .line 72
    .line 73
    invoke-virtual {v0}, Lokio/i1;->b()Lokio/i1;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, p1, Lokio/l;->a:Lokio/i1;

    .line 78
    .line 79
    invoke-static {v0}, Lokio/j1;->d(Lokio/i1;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method
