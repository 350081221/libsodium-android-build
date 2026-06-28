.class public final Lorg/burnoutcrew/reorderable/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/burnoutcrew/reorderable/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\t\u001a\u0004\u0008\n\u0010\u000bR#\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000c\u0010\u000e\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0011"
    }
    d2 = {
        "Lorg/burnoutcrew/reorderable/e;",
        "Lorg/burnoutcrew/reorderable/b;",
        "Lorg/burnoutcrew/reorderable/d;",
        "position",
        "Landroidx/compose/ui/geometry/Offset;",
        "offset",
        "Lkotlin/r2;",
        "a",
        "(Lorg/burnoutcrew/reorderable/d;JLkotlin/coroutines/d;)Ljava/lang/Object;",
        "Lorg/burnoutcrew/reorderable/d;",
        "getPosition",
        "()Lorg/burnoutcrew/reorderable/d;",
        "b",
        "J",
        "()J",
        "<init>",
        "()V",
        "reorderable"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final c:I = 0x8


# instance fields
.field private final a:Lorg/burnoutcrew/reorderable/d;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Lorg/burnoutcrew/reorderable/e;->b:J

    .line 11
    .line 12
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
.end method


# virtual methods
.method public a(Lorg/burnoutcrew/reorderable/d;JLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lorg/burnoutcrew/reorderable/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/burnoutcrew/reorderable/d;",
            "J",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lorg/burnoutcrew/reorderable/e;->b:J

    return-wide v0
.end method

.method public getPosition()Lorg/burnoutcrew/reorderable/d;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/e;->a:Lorg/burnoutcrew/reorderable/d;

    return-object v0
.end method
