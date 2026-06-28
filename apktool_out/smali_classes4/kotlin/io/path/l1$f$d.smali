.class final Lkotlin/io/path/l1$f$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/io/path/l1$f;->invoke(Lkotlin/io/path/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Ljava/nio/file/Path;",
        "Ljava/io/IOException;",
        "Ljava/nio/file/FileVisitResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "Ljava/nio/file/FileVisitResult;",
        "directory",
        "Ljava/nio/file/Path;",
        "exception",
        "Ljava/io/IOException;",
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
.method constructor <init>(Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/Path;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/q<",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/nio/file/Path;",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "Lkotlin/io/path/u;",
            ">;",
            "Ljava/nio/file/Path;",
            "Ljava/nio/file/Path;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lkotlin/io/path/l1$f$d;->$onError:Lv3/q;

    iput-object p2, p0, Lkotlin/io/path/l1$f$d;->$this_copyToRecursively:Ljava/nio/file/Path;

    iput-object p3, p0, Lkotlin/io/path/l1$f$d;->$target:Ljava/nio/file/Path;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/file/Path;

    check-cast p2, Ljava/io/IOException;

    invoke-virtual {p0, p1, p2}, Lkotlin/io/path/l1$f$d;->invoke(Ljava/nio/file/Path;Ljava/io/IOException;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/nio/file/Path;Ljava/io/IOException;)Ljava/nio/file/FileVisitResult;
    .locals 3
    .param p1    # Ljava/nio/file/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/io/IOException;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "directory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 2
    invoke-static {}, Lkotlin/io/path/d1;->a()Ljava/nio/file/FileVisitResult;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lkotlin/io/path/l1$f$d;->$onError:Lv3/q;

    iget-object v1, p0, Lkotlin/io/path/l1$f$d;->$this_copyToRecursively:Ljava/nio/file/Path;

    iget-object v2, p0, Lkotlin/io/path/l1$f$d;->$target:Ljava/nio/file/Path;

    invoke-static {v0, v1, v2, p1, p2}, Lkotlin/io/path/l1;->I(Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    :goto_0
    return-object p1
.end method
