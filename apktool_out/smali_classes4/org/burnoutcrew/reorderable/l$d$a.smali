.class final Lorg/burnoutcrew/reorderable/l$d$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/burnoutcrew/reorderable/l$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Long;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "",
        "it",
        "Lkotlin/r2;",
        "invoke",
        "(J)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $scroll:Lkotlin/jvm/internal/k1$e;

.field final synthetic $start:Lkotlin/jvm/internal/k1$g;

.field final synthetic this$0:Lorg/burnoutcrew/reorderable/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/burnoutcrew/reorderable/l<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$e;Lorg/burnoutcrew/reorderable/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$g;",
            "Lkotlin/jvm/internal/k1$e;",
            "Lorg/burnoutcrew/reorderable/l<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/burnoutcrew/reorderable/l$d$a;->$start:Lkotlin/jvm/internal/k1$g;

    iput-object p2, p0, Lorg/burnoutcrew/reorderable/l$d$a;->$scroll:Lkotlin/jvm/internal/k1$e;

    iput-object p3, p0, Lorg/burnoutcrew/reorderable/l$d$a;->this$0:Lorg/burnoutcrew/reorderable/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/burnoutcrew/reorderable/l$d$a;->invoke(J)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(J)V
    .locals 5

    .line 2
    iget-object v0, p0, Lorg/burnoutcrew/reorderable/l$d$a;->$start:Lkotlin/jvm/internal/k1$g;

    iget-wide v1, v0, Lkotlin/jvm/internal/k1$g;->element:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    .line 3
    iput-wide p1, v0, Lkotlin/jvm/internal/k1$g;->element:J

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/burnoutcrew/reorderable/l$d$a;->$scroll:Lkotlin/jvm/internal/k1$e;

    iget-object v3, p0, Lorg/burnoutcrew/reorderable/l$d$a;->this$0:Lorg/burnoutcrew/reorderable/l;

    sub-long/2addr p1, v1

    invoke-static {v3}, Lorg/burnoutcrew/reorderable/l;->e(Lorg/burnoutcrew/reorderable/l;)F

    move-result v1

    invoke-static {v3, p1, p2, v1}, Lorg/burnoutcrew/reorderable/l;->a(Lorg/burnoutcrew/reorderable/l;JF)F

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/k1$e;->element:F

    :goto_0
    return-void
.end method
