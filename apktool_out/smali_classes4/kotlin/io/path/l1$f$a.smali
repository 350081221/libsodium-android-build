.class final synthetic Lkotlin/io/path/l1$f$a;
.super Lkotlin/jvm/internal/h0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/io/path/l1$f;->invoke(Lkotlin/io/path/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/h0;",
        "Lv3/p<",
        "Ljava/nio/file/Path;",
        "Ljava/nio/file/attribute/BasicFileAttributes;",
        "Ljava/nio/file/FileVisitResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
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
    .locals 6
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

    iput-object p1, p0, Lkotlin/io/path/l1$f$a;->$copyAction:Lv3/q;

    iput-object p2, p0, Lkotlin/io/path/l1$f$a;->$this_copyToRecursively:Ljava/nio/file/Path;

    iput-object p3, p0, Lkotlin/io/path/l1$f$a;->$target:Ljava/nio/file/Path;

    iput-object p4, p0, Lkotlin/io/path/l1$f$a;->$onError:Lv3/q;

    const/4 v1, 0x2

    const-class v2, Lkotlin/jvm/internal/l0$a;

    const-string v3, "copy"

    const-string v4, "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/h0;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/file/Path;

    check-cast p2, Ljava/nio/file/attribute/BasicFileAttributes;

    invoke-virtual {p0, p1, p2}, Lkotlin/io/path/l1$f$a;->invoke(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 7
    .param p1    # Ljava/nio/file/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/nio/file/attribute/BasicFileAttributes;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lkotlin/io/path/l1$f$a;->$copyAction:Lv3/q;

    iget-object v2, p0, Lkotlin/io/path/l1$f$a;->$this_copyToRecursively:Ljava/nio/file/Path;

    iget-object v3, p0, Lkotlin/io/path/l1$f$a;->$target:Ljava/nio/file/Path;

    iget-object v4, p0, Lkotlin/io/path/l1$f$a;->$onError:Lv3/q;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lkotlin/io/path/l1;->H(Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/Path;Lv3/q;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    return-object p1
.end method
