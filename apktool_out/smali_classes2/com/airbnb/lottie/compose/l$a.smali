.class final Lcom/airbnb/lottie/compose/l$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/l;->e(Ljava/lang/Object;[Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/airbnb/lottie/value/b<",
        "TT;>;TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\u0008\u0000\u0010\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u0002H\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "T",
        "it",
        "Lcom/airbnb/lottie/value/LottieFrameInfo;",
        "invoke",
        "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;"
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
.field final synthetic $callbackState$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lv3/l<",
            "Lcom/airbnb/lottie/value/b<",
            "TT;>;TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/l<",
            "-",
            "Lcom/airbnb/lottie/value/b<",
            "TT;>;+TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/lottie/compose/l$a;->$callbackState$delegate:Landroidx/compose/runtime/State;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lcom/airbnb/lottie/value/b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/b<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/compose/l$a;->$callbackState$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/airbnb/lottie/compose/l;->a(Landroidx/compose/runtime/State;)Lv3/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/airbnb/lottie/value/b;

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/compose/l$a;->invoke(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
