.class Lkotlin/sequences/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010(\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aM\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u0002H\n0\t\"\u0004\u0008\u0000\u0010\n2/\u0008\u0001\u0010\u000b\u001a)\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000c\u00a2\u0006\u0002\u0008\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u001aM\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u0002H\n0\u0014\"\u0004\u0008\u0000\u0010\n2/\u0008\u0001\u0010\u000b\u001a)\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000c\u00a2\u0006\u0002\u0008\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0012\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0012\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0012\u0010\u0007\u001a\u00060\u0001j\u0002`\u0002X\u0082T\u00a2\u0006\u0002\n\u0000*\u000c\u0008\u0002\u0010\u0016\"\u00020\u00012\u00020\u0001\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "State_Done",
        "",
        "Lkotlin/sequences/State;",
        "State_Failed",
        "State_ManyNotReady",
        "State_ManyReady",
        "State_NotReady",
        "State_Ready",
        "iterator",
        "",
        "T",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/sequences/SequenceScope;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;",
        "sequence",
        "Lkotlin/sequences/Sequence;",
        "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;",
        "State",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x31
    xs = "kotlin/sequences/SequencesKt"
.end annotation


# static fields
.field private static final a:I = 0x0

.field private static final b:I = 0x1

.field private static final c:I = 0x2

.field private static final d:I = 0x3

.field private static final e:I = 0x4

.field private static final f:I = 0x5


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lv3/p;)Ljava/util/Iterator;
    .locals 1
    .param p0    # Lv3/p;
        .annotation build Lkotlin/b;
        .end annotation

        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/p<",
            "-",
            "Lkotlin/sequences/o<",
            "-TT;>;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/sequences/n;

    .line 7
    .line 8
    invoke-direct {v0}, Lkotlin/sequences/n;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0, v0}, Lkotlin/coroutines/intrinsics/b;->c(Lv3/p;Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0}, Lkotlin/sequences/n;->p(Lkotlin/coroutines/d;)V

    .line 16
    .line 17
    .line 18
    return-object v0
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
.end method

.method public static b(Lv3/p;)Lkotlin/sequences/m;
    .locals 1
    .param p0    # Lv3/p;
        .annotation build Lkotlin/b;
        .end annotation

        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/p<",
            "-",
            "Lkotlin/sequences/o<",
            "-TT;>;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlin/sequences/m<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/sequences/q$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lkotlin/sequences/q$a;-><init>(Lv3/p;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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
.end method
