.class final Lcom/airbnb/lottie/compose/b$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Float;"
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
.field final synthetic this$0:Lcom/airbnb/lottie/compose/b;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/compose/b;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/lottie/compose/b$e;->this$0:Lcom/airbnb/lottie/compose/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Float;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/airbnb/lottie/compose/b$e;->this$0:Lcom/airbnb/lottie/compose/b;

    invoke-virtual {v0}, Lcom/airbnb/lottie/compose/b;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/airbnb/lottie/compose/b$e;->this$0:Lcom/airbnb/lottie/compose/b;

    invoke-virtual {v0}, Lcom/airbnb/lottie/compose/b;->n()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/airbnb/lottie/compose/b$e;->this$0:Lcom/airbnb/lottie/compose/b;

    invoke-virtual {v0}, Lcom/airbnb/lottie/compose/b;->m()F

    move-result v0

    neg-float v0, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/compose/b$e;->this$0:Lcom/airbnb/lottie/compose/b;

    invoke-virtual {v0}, Lcom/airbnb/lottie/compose/b;->m()F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/compose/b$e;->invoke()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
