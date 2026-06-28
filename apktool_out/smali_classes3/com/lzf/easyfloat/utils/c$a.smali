.class final Lcom/lzf/easyfloat/utils/c$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lzf/easyfloat/utils/c;->t(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/lzf/easyfloat/interfaces/a$a;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n"
    }
    d2 = {
        "Lcom/lzf/easyfloat/interfaces/a$a;",
        "Lcom/lzf/easyfloat/interfaces/a;",
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/lzf/easyfloat/utils/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lzf/easyfloat/utils/c$a;

    invoke-direct {v0}, Lcom/lzf/easyfloat/utils/c$a;-><init>()V

    sput-object v0, Lcom/lzf/easyfloat/utils/c$a;->INSTANCE:Lcom/lzf/easyfloat/utils/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/lzf/easyfloat/interfaces/a$a;

    invoke-virtual {p0, p1}, Lcom/lzf/easyfloat/utils/c$a;->invoke(Lcom/lzf/easyfloat/interfaces/a$a;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/lzf/easyfloat/interfaces/a$a;)V
    .locals 1
    .param p1    # Lcom/lzf/easyfloat/interfaces/a$a;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "$this$registerCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/lzf/easyfloat/utils/c$a$a;->INSTANCE:Lcom/lzf/easyfloat/utils/c$a$a;

    invoke-virtual {p1, v0}, Lcom/lzf/easyfloat/interfaces/a$a;->a(Lv3/q;)V

    .line 3
    sget-object v0, Lcom/lzf/easyfloat/utils/c$a$b;->INSTANCE:Lcom/lzf/easyfloat/utils/c$a$b;

    invoke-virtual {p1, v0}, Lcom/lzf/easyfloat/interfaces/a$a;->b(Lv3/a;)V

    return-void
.end method
