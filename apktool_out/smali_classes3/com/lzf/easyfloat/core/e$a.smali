.class public final Lcom/lzf/easyfloat/core/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lzf/easyfloat/core/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lzf/easyfloat/core/e;->b(Landroid/content/Context;Lcom/lzf/easyfloat/data/FloatConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/lzf/easyfloat/core/e$a",
        "Lcom/lzf/easyfloat/core/d$a;",
        "",
        "success",
        "Lkotlin/r2;",
        "a",
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
.field final synthetic a:Lcom/lzf/easyfloat/data/FloatConfig;

.field final synthetic b:Lcom/lzf/easyfloat/core/d;


# direct methods
.method constructor <init>(Lcom/lzf/easyfloat/data/FloatConfig;Lcom/lzf/easyfloat/core/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lzf/easyfloat/core/e$a;->a:Lcom/lzf/easyfloat/data/FloatConfig;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/lzf/easyfloat/core/e$a;->b:Lcom/lzf/easyfloat/core/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    if-eqz p1, :cond_0

    sget-object p1, Lcom/lzf/easyfloat/core/e;->a:Lcom/lzf/easyfloat/core/e;

    invoke-virtual {p1}, Lcom/lzf/easyfloat/core/e;->g()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/lzf/easyfloat/core/e$a;->a:Lcom/lzf/easyfloat/data/FloatConfig;

    invoke-virtual {v0}, Lcom/lzf/easyfloat/data/FloatConfig;->getFloatTag()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/lzf/easyfloat/core/e$a;->b:Lcom/lzf/easyfloat/core/d;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
