.class public final Lcom/lzf/easyfloat/interfaces/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lzf/easyfloat/interfaces/a$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0007\u001a\u00020\u00042\u001b\u0010\u0006\u001a\u0017\u0012\u0008\u0012\u00060\u0003R\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\u0008\u0005R&\u0010\u0006\u001a\u00060\u0003R\u00020\u00008\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/lzf/easyfloat/interfaces/a;",
        "",
        "Lkotlin/Function1;",
        "Lcom/lzf/easyfloat/interfaces/a$a;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "builder",
        "b",
        "a",
        "Lcom/lzf/easyfloat/interfaces/a$a;",
        "()Lcom/lzf/easyfloat/interfaces/a$a;",
        "c",
        "(Lcom/lzf/easyfloat/interfaces/a$a;)V",
        "<init>",
        "()V",
        "easyfloat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field public a:Lcom/lzf/easyfloat/interfaces/a$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/lzf/easyfloat/interfaces/a$a;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/lzf/easyfloat/interfaces/a;->a:Lcom/lzf/easyfloat/interfaces/a$a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "builder"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Lv3/l;)V
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Lcom/lzf/easyfloat/interfaces/a$a;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/lzf/easyfloat/interfaces/a$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/lzf/easyfloat/interfaces/a$a;-><init>(Lcom/lzf/easyfloat/interfaces/a;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/lzf/easyfloat/interfaces/a;->c(Lcom/lzf/easyfloat/interfaces/a$a;)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method public final c(Lcom/lzf/easyfloat/interfaces/a$a;)V
    .locals 1
    .param p1    # Lcom/lzf/easyfloat/interfaces/a$a;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lzf/easyfloat/interfaces/a;->a:Lcom/lzf/easyfloat/interfaces/a$a;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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
.end method
