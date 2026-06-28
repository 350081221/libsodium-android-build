.class public final Lcom/efs/sdk/base/core/util/a/c;
.super Lcom/efs/sdk/base/core/util/concurrent/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/efs/sdk/base/core/util/concurrent/d<",
        "Lcom/efs/sdk/base/http/HttpResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lcom/efs/sdk/base/core/util/a/b;


# direct methods
.method constructor <init>(Lcom/efs/sdk/base/core/util/a/b;)V
    .locals 0
    .param p1    # Lcom/efs/sdk/base/core/util/a/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/efs/sdk/base/core/util/concurrent/d;-><init>(Lcom/efs/sdk/base/core/util/concurrent/c;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/efs/sdk/base/core/util/a/c;->a:Lcom/efs/sdk/base/core/util/a/b;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final b()Lcom/efs/sdk/base/http/HttpResponse;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/core/util/a/c;->a:Lcom/efs/sdk/base/core/util/a/b;

    .line 2
    .line 3
    const-string v1, "post"

    .line 4
    .line 5
    iput-object v1, v0, Lcom/efs/sdk/base/core/util/a/b;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/efs/sdk/base/core/util/concurrent/d;->a()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/efs/sdk/base/http/HttpResponse;

    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
