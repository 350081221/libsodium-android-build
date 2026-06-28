.class final Lcom/airbnb/lottie/compose/b$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/b;->C(ILkotlin/coroutines/d;)Ljava/lang/Object;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "frameNanos",
        "",
        "invoke",
        "(J)Ljava/lang/Boolean;"
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
.field final synthetic $iterations:I

.field final synthetic this$0:Lcom/airbnb/lottie/compose/b;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/compose/b;I)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/lottie/compose/b$c;->this$0:Lcom/airbnb/lottie/compose/b;

    iput p2, p0, Lcom/airbnb/lottie/compose/b$c;->$iterations:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(J)Ljava/lang/Boolean;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/airbnb/lottie/compose/b$c;->this$0:Lcom/airbnb/lottie/compose/b;

    iget v1, p0, Lcom/airbnb/lottie/compose/b$c;->$iterations:I

    invoke-static {v0, v1, p1, p2}, Lcom/airbnb/lottie/compose/b;->r(Lcom/airbnb/lottie/compose/b;IJ)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/airbnb/lottie/compose/b$c;->invoke(J)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
