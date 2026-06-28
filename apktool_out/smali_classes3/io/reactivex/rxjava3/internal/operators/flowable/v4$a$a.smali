.class final Lio/reactivex/rxjava3/internal/operators/flowable/v4$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/v4$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lio/reactivex/rxjava3/internal/operators/flowable/v4$a;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/v4$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v4$a$a;->a:Lio/reactivex/rxjava3/internal/operators/flowable/v4$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/v4$a$a;->a:Lio/reactivex/rxjava3/internal/operators/flowable/v4$a;

    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/flowable/v4$a;->upstream:Lorg/reactivestreams/q;

    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    return-void
.end method
