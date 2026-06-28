.class final Lio/reactivex/rxjava3/internal/operators/observable/n4$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/n4$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lio/reactivex/rxjava3/internal/operators/observable/n4$c;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/observable/n4$c;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/n4$c$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/n4$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/n4$c$a;->a:Lio/reactivex/rxjava3/internal/operators/observable/n4$c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/n4$a;->windowDone()V

    return-void
.end method
