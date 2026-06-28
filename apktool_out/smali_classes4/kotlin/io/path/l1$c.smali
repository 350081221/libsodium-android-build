.class final Lkotlin/io/path/l1$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/io/path/l1;->L(Ljava/nio/file/Path;Ljava/nio/file/Path;Lv3/q;ZZ)Ljava/nio/file/Path;
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

    iput-boolean p1, p0, Lkotlin/io/path/l1$c;->$followLinks:Z

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

    invoke-virtual {p0, p1, p2, p3}, Lkotlin/io/path/l1$c;->invoke(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/b;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/b;
    .locals 4
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

    const-string v0, "$this$copyToRecursively"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "src"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dst"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object p1, Lkotlin/io/path/t;->a:Lkotlin/io/path/t;

    iget-boolean v0, p0, Lkotlin/io/path/l1$c;->$followLinks:Z

    invoke-virtual {p1, v0}, Lkotlin/io/path/t;->a(Z)[Ljava/nio/file/LinkOption;

    move-result-object p1

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/nio/file/LinkOption;

    const/4 v2, 0x0

    .line 3
    invoke-static {}, Lkotlin/io/path/d;->a()Ljava/nio/file/LinkOption;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/file/LinkOption;

    invoke-static {p3, v0}, Lkotlin/io/path/c;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v0

    .line 4
    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/LinkOption;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/nio/file/LinkOption;

    invoke-static {p2, v1}, Lkotlin/io/path/c;->a(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_2

    :cond_0
    if-eqz v0, :cond_1

    .line 5
    invoke-static {p3}, Lkotlin/io/path/l1;->R(Ljava/nio/file/Path;)V

    .line 6
    :cond_1
    new-instance v0, Lkotlin/jvm/internal/s1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/s1;-><init>(I)V

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/s1;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/yuanqi/master/addapp/b;->a()Ljava/nio/file/StandardCopyOption;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/s1;->a(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/s1;->c()I

    move-result p1

    new-array p1, p1, [Ljava/nio/file/CopyOption;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/s1;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/CopyOption;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/CopyOption;

    invoke-static {p2, p3, p1}, Lkotlin/io/path/e;->a(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    move-result-object p1

    const-string p2, "copy(this, target, *options)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    :cond_2
    sget-object p1, Lkotlin/io/path/b;->CONTINUE:Lkotlin/io/path/b;

    return-object p1
.end method
