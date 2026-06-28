.class public final synthetic Landroidx/room/rxjava3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/v0;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/rxjava3/f;->a:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/rxjava3/core/t0;)V
    .locals 1

    iget-object v0, p0, Landroidx/room/rxjava3/f;->a:Ljava/util/concurrent/Callable;

    invoke-static {v0, p1}, Landroidx/room/rxjava3/RxRoom;->d(Ljava/util/concurrent/Callable;Lio/reactivex/rxjava3/core/t0;)V

    return-void
.end method
