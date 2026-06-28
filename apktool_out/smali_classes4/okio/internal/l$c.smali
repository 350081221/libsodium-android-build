.class final Lokio/internal/l$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokio/internal/l;->f(Lokio/BufferedSource;)Lokio/internal/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Long;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "headerId",
        "",
        "dataSize",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $compressedSize:Lkotlin/jvm/internal/k1$g;

.field final synthetic $hasZip64Extra:Lkotlin/jvm/internal/k1$a;

.field final synthetic $offset:Lkotlin/jvm/internal/k1$g;

.field final synthetic $requiredZip64ExtraSize:J

.field final synthetic $size:Lkotlin/jvm/internal/k1$g;

.field final synthetic $this_readEntry:Lokio/BufferedSource;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$a;JLkotlin/jvm/internal/k1$g;Lokio/BufferedSource;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;)V
    .locals 0

    iput-object p1, p0, Lokio/internal/l$c;->$hasZip64Extra:Lkotlin/jvm/internal/k1$a;

    iput-wide p2, p0, Lokio/internal/l$c;->$requiredZip64ExtraSize:J

    iput-object p4, p0, Lokio/internal/l$c;->$size:Lkotlin/jvm/internal/k1$g;

    iput-object p5, p0, Lokio/internal/l$c;->$this_readEntry:Lokio/BufferedSource;

    iput-object p6, p0, Lokio/internal/l$c;->$compressedSize:Lkotlin/jvm/internal/k1$g;

    iput-object p7, p0, Lokio/internal/l$c;->$offset:Lkotlin/jvm/internal/k1$g;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lokio/internal/l$c;->invoke(IJ)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(IJ)V
    .locals 4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_5

    .line 2
    iget-object p1, p0, Lokio/internal/l$c;->$hasZip64Extra:Lkotlin/jvm/internal/k1$a;

    iget-boolean v1, p1, Lkotlin/jvm/internal/k1$a;->element:Z

    if-nez v1, :cond_4

    .line 3
    iput-boolean v0, p1, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 4
    iget-wide v0, p0, Lokio/internal/l$c;->$requiredZip64ExtraSize:J

    cmp-long p1, p2, v0

    if-ltz p1, :cond_3

    .line 5
    iget-object p1, p0, Lokio/internal/l$c;->$size:Lkotlin/jvm/internal/k1$g;

    iget-wide p2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    const-wide v0, 0xffffffffL

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    iget-object p2, p0, Lokio/internal/l$c;->$this_readEntry:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->R()J

    move-result-wide p2

    :cond_0
    iput-wide p2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 6
    iget-object p1, p0, Lokio/internal/l$c;->$compressedSize:Lkotlin/jvm/internal/k1$g;

    iget-wide p2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    cmp-long p2, p2, v0

    const-wide/16 v2, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, Lokio/internal/l$c;->$this_readEntry:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->R()J

    move-result-wide p2

    goto :goto_0

    :cond_1
    move-wide p2, v2

    :goto_0
    iput-wide p2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 7
    iget-object p1, p0, Lokio/internal/l$c;->$offset:Lkotlin/jvm/internal/k1$g;

    iget-wide p2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    cmp-long p2, p2, v0

    if-nez p2, :cond_2

    iget-object p2, p0, Lokio/internal/l$c;->$this_readEntry:Lokio/BufferedSource;

    invoke-interface {p2}, Lokio/BufferedSource;->R()J

    move-result-wide v2

    :cond_2
    iput-wide v2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    goto :goto_1

    .line 8
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra too short"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra repeated"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    return-void
.end method
