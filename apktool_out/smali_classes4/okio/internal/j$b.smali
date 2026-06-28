.class final Lokio/internal/j$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokio/internal/j;-><init>(Ljava/lang/ClassLoader;ZLokio/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Ljava/util/List<",
        "+",
        "Lkotlin/u0<",
        "+",
        "Lokio/u;",
        "+",
        "Lokio/d1;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlin/Pair;",
        "Lokio/FileSystem;",
        "Lokio/Path;",
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
.field final synthetic this$0:Lokio/internal/j;


# direct methods
.method constructor <init>(Lokio/internal/j;)V
    .locals 0

    iput-object p1, p0, Lokio/internal/j$b;->this$0:Lokio/internal/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokio/internal/j$b;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/u0<",
            "Lokio/u;",
            "Lokio/d1;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Lokio/internal/j$b;->this$0:Lokio/internal/j;

    invoke-static {v0}, Lokio/internal/j;->N(Lokio/internal/j;)Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Lokio/internal/j;->Q(Lokio/internal/j;Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
