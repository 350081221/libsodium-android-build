.class final Lkotlin/io/path/l1$f;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/io/path/l1;->K(Ljava/nio/file/Path;Ljava/nio/file/Path;Lv3/q;ZLv3/q;)Ljava/nio/file/Path;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lkotlin/io/path/p;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlin/io/path/FileVisitorBuilder;",
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
.field final synthetic $copyAction:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Lkotlin/io/path/a;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "Lkotlin/io/path/b;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onError:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "Ljava/lang/Exception;",
            "Lkotlin/io/path/u;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $target:Ljava/nio/file/Path;

.field final synthetic $this_copyToRecursively:Ljava/nio/file/Path;


# direct methods
.method constructor <init>(Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/Path;Lv3/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/q<",
            "-",
            "Lkotlin/io/path/a;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "+",
            "Lkotlin/io/path/b;",
            ">;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            "Lv3/q<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "Lkotlin/io/path/u;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlin/io/path/l1$f;->$copyAction:Lv3/q;

    iput-object p2, p0, Lkotlin/io/path/l1$f;->$this_copyToRecursively:Ljava/nio/file/Path;

    iput-object p3, p0, Lkotlin/io/path/l1$f;->$target:Ljava/nio/file/Path;

    iput-object p4, p0, Lkotlin/io/path/l1$f;->$onError:Lv3/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/io/path/p;

    invoke-virtual {p0, p1}, Lkotlin/io/path/l1$f;->invoke(Lkotlin/io/path/p;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lkotlin/io/path/p;)V
    .locals 5
    .param p1    # Lkotlin/io/path/p;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "$this$visitFileTree"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lkotlin/io/path/l1$f$a;

    iget-object v1, p0, Lkotlin/io/path/l1$f;->$copyAction:Lv3/q;

    iget-object v2, p0, Lkotlin/io/path/l1$f;->$this_copyToRecursively:Ljava/nio/file/Path;

    iget-object v3, p0, Lkotlin/io/path/l1$f;->$target:Ljava/nio/file/Path;

    iget-object v4, p0, Lkotlin/io/path/l1$f;->$onError:Lv3/q;

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/io/path/l1$f$a;-><init>(Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/Path;Lv3/q;)V

    invoke-interface {p1, v0}, Lkotlin/io/path/p;->d(Lv3/p;)V

    .line 3
    new-instance v0, Lkotlin/io/path/l1$f$b;

    iget-object v1, p0, Lkotlin/io/path/l1$f;->$copyAction:Lv3/q;

    iget-object v2, p0, Lkotlin/io/path/l1$f;->$this_copyToRecursively:Ljava/nio/file/Path;

    iget-object v3, p0, Lkotlin/io/path/l1$f;->$target:Ljava/nio/file/Path;

    iget-object v4, p0, Lkotlin/io/path/l1$f;->$onError:Lv3/q;

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/io/path/l1$f$b;-><init>(Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/Path;Lv3/q;)V

    invoke-interface {p1, v0}, Lkotlin/io/path/p;->a(Lv3/p;)V

    .line 4
    new-instance v0, Lkotlin/io/path/l1$f$c;

    iget-object v1, p0, Lkotlin/io/path/l1$f;->$onError:Lv3/q;

    iget-object v2, p0, Lkotlin/io/path/l1$f;->$this_copyToRecursively:Ljava/nio/file/Path;

    iget-object v3, p0, Lkotlin/io/path/l1$f;->$target:Ljava/nio/file/Path;

    invoke-direct {v0, v1, v2, v3}, Lkotlin/io/path/l1$f$c;-><init>(Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    invoke-interface {p1, v0}, Lkotlin/io/path/p;->c(Lv3/p;)V

    .line 5
    new-instance v0, Lkotlin/io/path/l1$f$d;

    iget-object v1, p0, Lkotlin/io/path/l1$f;->$onError:Lv3/q;

    iget-object v2, p0, Lkotlin/io/path/l1$f;->$this_copyToRecursively:Ljava/nio/file/Path;

    iget-object v3, p0, Lkotlin/io/path/l1$f;->$target:Ljava/nio/file/Path;

    invoke-direct {v0, v1, v2, v3}, Lkotlin/io/path/l1$f$d;-><init>(Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    invoke-interface {p1, v0}, Lkotlin/io/path/p;->b(Lv3/p;)V

    return-void
.end method
