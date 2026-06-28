.class final Lkotlin/jvm/internal/w1$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/jvm/internal/w1;->p(Z)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lkotlin/reflect/u;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lkotlin/reflect/KTypeProjection;",
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
.field final synthetic this$0:Lkotlin/jvm/internal/w1;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/w1;)V
    .locals 0

    iput-object p1, p0, Lkotlin/jvm/internal/w1$c;->this$0:Lkotlin/jvm/internal/w1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/reflect/u;)Ljava/lang/CharSequence;
    .locals 1
    .param p1    # Lkotlin/reflect/u;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/w1$c;->this$0:Lkotlin/jvm/internal/w1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/w1;->d(Lkotlin/jvm/internal/w1;Lkotlin/reflect/u;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lkotlin/reflect/u;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/w1$c;->invoke(Lkotlin/reflect/u;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
