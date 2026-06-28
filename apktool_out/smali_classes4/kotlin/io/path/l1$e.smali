.class final Lkotlin/io/path/l1$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/io/path/l1;->N(Ljava/nio/file/Path;Ljava/nio/file/Path;Lv3/q;ZLv3/q;ILjava/lang/Object;)Ljava/nio/file/Path;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Lkotlin/io/path/a;",
        "Ljava/nio/file/Path;",
        "Ljava/nio/file/Path;",
        "Lkotlin/io/path/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/io/path/CopyActionResult;",
        "Lkotlin/io/path/CopyActionContext;",
        "src",
        "Ljava/nio/file/Path;",
        "dst",
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
.field final synthetic $followLinks:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lkotlin/io/path/l1$e;->$followLinks:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/io/path/a;

    check-cast p2, Ljava/nio/file/Path;

    check-cast p3, Ljava/nio/file/Path;

    invoke-virtual {p0, p1, p2, p3}, Lkotlin/io/path/l1$e;->invoke(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/b;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/b;
    .locals 1
    .param p1    # Lkotlin/io/path/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/nio/file/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/nio/file/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "src"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dst"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lkotlin/io/path/l1$e;->$followLinks:Z

    invoke-interface {p1, p2, p3, v0}, Lkotlin/io/path/a;->a(Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Lkotlin/io/path/b;

    move-result-object p1

    return-object p1
.end method
