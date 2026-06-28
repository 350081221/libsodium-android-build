.class public final synthetic Lcom/lzf/easyfloat/core/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/lzf/easyfloat/core/d$a;

.field public final synthetic b:Lcom/lzf/easyfloat/core/d;


# direct methods
.method public synthetic constructor <init>(Lcom/lzf/easyfloat/core/d$a;Lcom/lzf/easyfloat/core/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/lzf/easyfloat/core/b;->a:Lcom/lzf/easyfloat/core/d$a;

    iput-object p2, p0, Lcom/lzf/easyfloat/core/b;->b:Lcom/lzf/easyfloat/core/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/lzf/easyfloat/core/b;->a:Lcom/lzf/easyfloat/core/d$a;

    iget-object v1, p0, Lcom/lzf/easyfloat/core/b;->b:Lcom/lzf/easyfloat/core/d;

    invoke-static {v0, v1}, Lcom/lzf/easyfloat/core/d;->b(Lcom/lzf/easyfloat/core/d$a;Lcom/lzf/easyfloat/core/d;)V

    return-void
.end method
