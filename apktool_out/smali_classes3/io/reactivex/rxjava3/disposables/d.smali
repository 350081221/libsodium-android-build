.class public final synthetic Lio/reactivex/rxjava3/disposables/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic a:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/rxjava3/disposables/d;->a:Lio/reactivex/rxjava3/disposables/e;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/disposables/d;->a:Lio/reactivex/rxjava3/disposables/e;

    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    return-void
.end method
