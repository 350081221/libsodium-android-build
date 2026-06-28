.class public final synthetic Lcom/lzf/easyfloat/core/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/lzf/easyfloat/core/d;

.field public final synthetic b:Lcom/lzf/easyfloat/widget/ParentFrameLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/lzf/easyfloat/core/d;Lcom/lzf/easyfloat/widget/ParentFrameLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/lzf/easyfloat/core/c;->a:Lcom/lzf/easyfloat/core/d;

    iput-object p2, p0, Lcom/lzf/easyfloat/core/c;->b:Lcom/lzf/easyfloat/widget/ParentFrameLayout;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/lzf/easyfloat/core/c;->a:Lcom/lzf/easyfloat/core/d;

    iget-object v1, p0, Lcom/lzf/easyfloat/core/c;->b:Lcom/lzf/easyfloat/widget/ParentFrameLayout;

    invoke-static {v0, v1}, Lcom/lzf/easyfloat/core/d;->c(Lcom/lzf/easyfloat/core/d;Lcom/lzf/easyfloat/widget/ParentFrameLayout;)V

    return-void
.end method
